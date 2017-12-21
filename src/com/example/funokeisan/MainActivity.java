package com.example.funokeisan;

import java.util.Timer;
import java.util.TimerTask;


import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;
import android.app.Activity;
import android.content.Context;


public class MainActivity extends Activity {
	

	Timer timer;
	//サウンドエフェクトのまとまり
	static SoundPool sound_effect;
	static int command_changed_id;
	
    //音声認識
    static  boolean RecEnable=false;
    static SpeechRecognizer mSpeechRecognizer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        //画面切り替え関係の準備
		option_menu.画面切り替えの準備(this);
        
	    //音声認識
	    mSpeechRecognizer=SpeechRecognizer.createSpeechRecognizer(this);
	    mSpeechRecognizer.setRecognitionListener(new mRecognitionListner());
	    
	    //SPの準備
	    dictionary.SP=getSharedPreferences("dictionary_sp",Context.MODE_PRIVATE);
	    	        	
	}
    @Override
    public void onResume(){
    	super.onResume();
    	
    	//効果音の準備
    	sound_effect=new SoundPool(3,AudioManager.STREAM_MUSIC,0);
    	command_changed_id= sound_effect.load(this, R.raw.command_changed,1);
    	
    	//辞書の準備
    	dictionary.辞書内容をローカルに比較して読み込み(this);
    	dictionary.辞書をコミット(this);

    	startTimer(this);//情報を40msおきに表示させる
    }
    @Override
    public void onPause(){
    	super.onPause();
    	timer.cancel();//タイマー終了
    	sound_effect.release();//サウンドエフェクト終了
    	dictionary.辞書をコミット(this);
    	Log.d("onPause","onPause,");
    	finish();//全タスク終了
    	android.os.Process.killProcess(android.os.Process.myPid());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	option_menu.onCreate(this,menu);
    	return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	option_menu.onSelected(this,item);
        return true;
    }
    public void startTimer(final MainActivity mv){
    	
    	if(timer!=null)timer.cancel();
    	timer=new Timer();
    	final android.os.Handler handler=new android.os.Handler();
    	timer.schedule(new TimerTask(){
    		int timecount=0;//10msおきに数える
    		int loop=0;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				handler.post(new Runnable(){

					public void run() {
						// TODO Auto-generated method stub
						if(timecount==40000)timecount=0;
						else timecount++;
						if(timecount%4==0){
							statement.状態チェック(mv);
							if(statement.状態変化あり){
								loop=3;
								Log.e("状態変化あり","状態変化あり");
							}
							if(loop>=0){
								han.飜計算(mv);
								han.矛盾解消(mv);
								fu.符計算(mv);
								fu.矛盾解消(mv);
								tensuu.点数計算(mv);
								loop--;
							}
							//音声認識コマンド
							if(RecEnable)mRecognitionListner.voice_command_operation(mv);
						}
					}
				});
			}
    	},0,10);//10ms
    }
    
    
    public void 役一覧クリア(View view){//onClick_button
    	han.役のチェック解除(this);
    	((EditText)this.findViewById(R.id.edit_dora)).setText("");
    }
    public void 牌構成クリア(View view){//onClick_button
    	fu.符の構成初期化(this);
    }
    public void 符ボタン(View view){//onClick_button
    	((EditText)this.findViewById(R.id.edit_fu)).setText("");
    }
    public void 飜ボタン(View view){//onClick_button
    	((EditText)this.findViewById(R.id.edit_han)).setText("");
    }
    public void 辞書に追加(View view){//onClick_button
    	dictionary.辞書に追加(this);
    }
    public void 辞書から削除(View view){//onClick_button
    	dictionary.辞書から削除(this);
    }
    public void 役説明1飜(View view){//onClick_button
    	explain.役説明1(this);
    }
    public void 役説明2飜(View view){//onClick_button
    	explain.役説明2(this);
    }
    public void 役説明3飜(View view){//onClick_button
    	explain.役説明3(this);
    }
    public void 役説明6飜(View view){//onClick_button
    	explain.役説明6(this);
    }
    public void 役説明役満(View view){//onClick_button
    	explain.役説明13(this);
    }
    
    public void 音声認識ボタン(View view){
    	Log.e("音声認識ボタン","音声認識ボタン");
    	if(((ToggleButton)findViewById(R.id.ToggleButton_onsei)).isChecked()){
    		RecEnable=true;
    		mRecognitionListner.startVR();
    	}
    	else RecEnable=false;
    }
    
    


    static boolean 数値化可能(String str) {//数値化できるかどうかチェック
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}
