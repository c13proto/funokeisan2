package com.example.funokeisan;



import java.util.ArrayList;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class mRecognitionListner implements RecognitionListener {
	static String 音声コマンド="";
	static String 以前の音声コマンド="";
	static boolean already_startVR=false;
	static boolean コマンドとして認識=false;
	@Override
	public void onBeginningOfSpeech() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onBufferReceived(byte[] buffer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onEndOfSpeech() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onError(int error) {
		// TODO Auto-generated method stub
		switch(error){
		case SpeechRecognizer.ERROR_NETWORK:
    		startVR();
    		Log.e("mRecognitionListner","ネットワークエラー");
    		break;
		case SpeechRecognizer.ERROR_NETWORK_TIMEOUT:
    		startVR();
    		Log.e("mRecognitionListner","ネットワークTimeoutエラー");
    		break;	
		case SpeechRecognizer.ERROR_NO_MATCH:
    		startVR();
    		Log.e("mRecognitionListner","no match");
    		break;
		case SpeechRecognizer.ERROR_SPEECH_TIMEOUT:
    		startVR();
    		Log.e("mRecognitionListner","スピーチタイムアウト");
    		break;
    	default:
	
		}
	}

	@Override
	public void onEvent(int eventType, Bundle params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPartialResults(Bundle partialResults) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onReadyForSpeech(Bundle params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onResults(Bundle results) {
		// TODO Auto-generated method stub
        ArrayList<String> recData = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
        String str="";
        String コマンド="";
        コマンドとして認識=false;
        for(String s:recData){
        	
        	s=s.trim();
        	s=s.replaceAll("[ 　]","");
        	str+=s+",";
        	//while(dictionary.ドラ1.iterator().hasNext())if(dictionary.ドラ1.iterator().next().matches(".*"+s+".*"))コマンド+="ドラ1,";        	
        	//if(dictionary.ドラ1.matches(".*"+s+".*"))コマンド+="ドラ1,";
        	for(int i=0;i<dictionary.ドラ1.split(",", 0).length;i++)if(dictionary.ドラ1.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.ドラ1.split(",", 0)[i]+".*"))コマンド+="ドラ1,";
        	for(int i=0;i<dictionary.ドラ2.split(",", 0).length;i++)if(dictionary.ドラ2.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.ドラ2.split(",", 0)[i]+".*"))コマンド+="ドラ2,";
        	for(int i=0;i<dictionary.ドラ3.split(",", 0).length;i++)if(dictionary.ドラ3.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.ドラ3.split(",", 0)[i]+".*"))コマンド+="ドラ3,";
        	for(int i=0;i<dictionary.ドラ4.split(",", 0).length;i++)if(dictionary.ドラ4.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.ドラ4.split(",", 0)[i]+".*"))コマンド+="ドラ4,";
        	for(int i=0;i<dictionary.ドラ5.split(",", 0).length;i++)if(dictionary.ドラ5.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.ドラ5.split(",", 0)[i]+".*"))コマンド+="ドラ5,";
        	for(int i=0;i<dictionary.ドラ6.split(",", 0).length;i++)if(dictionary.ドラ6.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.ドラ6.split(",", 0)[i]+".*"))コマンド+="ドラ6,";
        	for(int i=0;i<dictionary.ドラ7.split(",", 0).length;i++)if(dictionary.ドラ7.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.ドラ7.split(",", 0)[i]+".*"))コマンド+="ドラ7,";
        	for(int i=0;i<dictionary.ドラ8.split(",", 0).length;i++)if(dictionary.ドラ8.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.ドラ8.split(",", 0)[i]+".*"))コマンド+="ドラ8,";
        	for(int i=0;i<dictionary.ドラ9.split(",", 0).length;i++)if(dictionary.ドラ9.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.ドラ9.split(",", 0)[i]+".*"))コマンド+="ドラ9,";
        	for(int i=0;i<dictionary.ドラ10.split(",", 0).length;i++)if(dictionary.ドラ10.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.ドラ10.split(",", 0)[i]+".*"))コマンド+="ドラ10,";
        	
        	for(int i=0;i<dictionary.立直.split(",", 0).length;i++)if(dictionary.立直.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.立直.split(",", 0)[i]+".*"))コマンド+="立直,";
        	for(int i=0;i<dictionary.役牌1.split(",", 0).length;i++)if(dictionary.役牌1.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.役牌1.split(",", 0)[i]+".*"))コマンド+="役牌1,";
        	for(int i=0;i<dictionary.断ヤオ九.split(",", 0).length;i++)if(dictionary.断ヤオ九.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.断ヤオ九.split(",", 0)[i]+".*"))コマンド+="断ヤオ九,";
        	for(int i=0;i<dictionary.平和.split(",", 0).length;i++)if(dictionary.平和.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.平和.split(",", 0)[i]+".*"))コマンド+="平和,";
        	for(int i=0;i<dictionary.門前自摸.split(",", 0).length;i++)if(dictionary.門前自摸.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.門前自摸.split(",", 0)[i]+".*"))コマンド+="門前自摸,";
        	for(int i=0;i<dictionary.一発.split(",", 0).length;i++)if(dictionary.一発.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.一発.split(",", 0)[i]+".*"))コマンド+="一発,";
        	for(int i=0;i<dictionary.一盃口.split(",", 0).length;i++)if(dictionary.一盃口.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.一盃口.split(",", 0)[i]+".*"))コマンド+="一盃口,";
        	for(int i=0;i<dictionary.ハイテイロン.split(",", 0).length;i++)if(dictionary.ハイテイロン.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.ハイテイロン.split(",", 0)[i]+".*"))コマンド+="ハイテイロン,";
        	for(int i=0;i<dictionary.ハイテイツモ.split(",", 0).length;i++)if(dictionary.ハイテイツモ.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.ハイテイツモ.split(",", 0)[i]+".*"))コマンド+="ハイテイツモ,";
        	for(int i=0;i<dictionary.嶺上開花.split(",", 0).length;i++)if(dictionary.嶺上開花.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.嶺上開花.split(",", 0)[i]+".*"))コマンド+="嶺上開花,";
        	for(int i=0;i<dictionary.ダブルリーチ.split(",", 0).length;i++)if(dictionary.ダブルリーチ.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.ダブルリーチ.split(",", 0)[i]+".*"))コマンド+="ダブルリーチ,";
        	for(int i=0;i<dictionary.チャンカン.split(",", 0).length;i++)if(dictionary.チャンカン.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.チャンカン.split(",", 0)[i]+".*"))コマンド+="チャンカン,";
        	for(int i=0;i<dictionary.三色同順_喰い.split(",", 0).length;i++)if(dictionary.三色同順_喰い.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.三色同順_喰い.split(",", 0)[i]+".*"))コマンド+="三色同順_喰い,";
        	for(int i=0;i<dictionary.一気通貫_喰い.split(",", 0).length;i++)if(dictionary.一気通貫_喰い.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.一気通貫_喰い.split(",", 0)[i]+".*"))コマンド+="一気通貫_喰い,";
        	for(int i=0;i<dictionary.混全帯ヤオ九_喰い.split(",", 0).length;i++)if(dictionary.混全帯ヤオ九_喰い.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.混全帯ヤオ九_喰い.split(",", 0)[i]+".*"))コマンド+="混全帯ヤオ九_喰い,";
        	        	
        	for(int i=0;i<dictionary.役牌2.split(",", 0).length;i++)if(dictionary.役牌2.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.役牌2.split(",", 0)[i]+".*"))コマンド+="役牌2,";
        	for(int i=0;i<dictionary.対々和.split(",", 0).length;i++)if(dictionary.対々和.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.対々和.split(",", 0)[i]+".*"))コマンド+="対々和,";
        	for(int i=0;i<dictionary.三色同順_門前.split(",", 0).length;i++)if(dictionary.三色同順_門前.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.三色同順_門前.split(",", 0)[i]+".*"))コマンド+="三色同順_門前,";
        	for(int i=0;i<dictionary.七対子.split(",", 0).length;i++)if(dictionary.七対子.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.七対子.split(",", 0)[i]+".*"))コマンド+="七対子,";
        	for(int i=0;i<dictionary.一気通貫_門前.split(",", 0).length;i++)if(dictionary.一気通貫_門前.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.一気通貫_門前.split(",", 0)[i]+".*"))コマンド+="一気通貫_門前,";
        	for(int i=0;i<dictionary.混全帯ヤオ九_門前.split(",", 0).length;i++)if(dictionary.混全帯ヤオ九_門前.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.混全帯ヤオ九_門前.split(",", 0)[i]+".*"))コマンド+="混全帯ヤオ九_門前,";
        	for(int i=0;i<dictionary.三暗刻.split(",", 0).length;i++)if(dictionary.三暗刻.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.三暗刻.split(",", 0)[i]+".*"))コマンド+="三暗刻,";
        	for(int i=0;i<dictionary.小三元.split(",", 0).length;i++)if(dictionary.小三元.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.小三元.split(",", 0)[i]+".*"))コマンド+="小三元,";
        	for(int i=0;i<dictionary.混老頭.split(",", 0).length;i++)if(dictionary.混老頭.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.混老頭.split(",", 0)[i]+".*"))コマンド+="混老頭,";
        	for(int i=0;i<dictionary.三色同刻.split(",", 0).length;i++)if(dictionary.三色同刻.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.三色同刻.split(",", 0)[i]+".*"))コマンド+="三色同刻,";
        	for(int i=0;i<dictionary.三槓子.split(",", 0).length;i++)if(dictionary.三槓子.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.三槓子.split(",", 0)[i]+".*"))コマンド+="三槓子,";
        	for(int i=0;i<dictionary.ホンイツ_喰い.split(",", 0).length;i++)if(dictionary.ホンイツ_喰い.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.ホンイツ_喰い.split(",", 0)[i]+".*"))コマンド+="ホンイツ_喰い,";
        	for(int i=0;i<dictionary.清全帯ヤオ九_喰い.split(",", 0).length;i++)if(dictionary.清全帯ヤオ九_喰い.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.清全帯ヤオ九_喰い.split(",", 0)[i]+".*"))コマンド+="清全帯ヤオ九_喰い,";

        	for(int i=0;i<dictionary.役牌3.split(",", 0).length;i++)if(dictionary.役牌3.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.役牌3.split(",", 0)[i]+".*"))コマンド+="役牌3,";
        	for(int i=0;i<dictionary.ホンイツ_門前.split(",", 0).length;i++)if(dictionary.ホンイツ_門前.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.ホンイツ_門前.split(",", 0)[i]+".*"))コマンド+="ホンイツ_門前,";
        	for(int i=0;i<dictionary.清全帯ヤオ九_門前.split(",", 0).length;i++)if(dictionary.清全帯ヤオ九_門前.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.清全帯ヤオ九_門前.split(",", 0)[i]+".*"))コマンド+="清全帯ヤオ九_門前,";
        	for(int i=0;i<dictionary.二盃口.split(",", 0).length;i++)if(dictionary.二盃口.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.二盃口.split(",", 0)[i]+".*"))コマンド+="二盃口,";
        	
        	for(int i=0;i<dictionary.役牌4.split(",", 0).length;i++)if(dictionary.役牌4.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.役牌4.split(",", 0)[i]+".*"))コマンド+="役牌4,";
        	
        	for(int i=0;i<dictionary.清一色_喰い.split(",", 0).length;i++)if(dictionary.清一色_喰い.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.清一色_喰い.split(",", 0)[i]+".*"))コマンド+="清一色_喰い,";
        	
        	for(int i=0;i<dictionary.清一色_門前.split(",", 0).length;i++)if(dictionary.清一色_門前.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.清一色_門前.split(",", 0)[i]+".*"))コマンド+="清一色_門前,";
        	
        	for(int i=0;i<dictionary.四暗刻.split(",", 0).length;i++)if(dictionary.四暗刻.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.四暗刻.split(",", 0)[i]+".*"))コマンド+="四暗刻,";
        	for(int i=0;i<dictionary.国士無双.split(",", 0).length;i++)if(dictionary.国士無双.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.国士無双.split(",", 0)[i]+".*"))コマンド+="国士無双,";
        	for(int i=0;i<dictionary.大三元.split(",", 0).length;i++)if(dictionary.大三元.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.大三元.split(",", 0)[i]+".*"))コマンド+="大三元,";
        	for(int i=0;i<dictionary.四喜和.split(",", 0).length;i++)if(dictionary.四喜和.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.四喜和.split(",", 0)[i]+".*"))コマンド+="四喜和,";
        	for(int i=0;i<dictionary.字一色.split(",", 0).length;i++)if(dictionary.字一色.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.字一色.split(",", 0)[i]+".*"))コマンド+="字一色,";
        	for(int i=0;i<dictionary.清老頭.split(",", 0).length;i++)if(dictionary.清老頭.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.清老頭.split(",", 0)[i]+".*"))コマンド+="清老頭,";
        	for(int i=0;i<dictionary.地和.split(",", 0).length;i++)if(dictionary.地和.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.地和.split(",", 0)[i]+".*"))コマンド+="地和,";
        	for(int i=0;i<dictionary.緑一色.split(",", 0).length;i++)if(dictionary.緑一色.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.緑一色.split(",", 0)[i]+".*"))コマンド+="緑一色,";
        	for(int i=0;i<dictionary.九蓮宝燈.split(",", 0).length;i++)if(dictionary.九蓮宝燈.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.九蓮宝燈.split(",", 0)[i]+".*"))コマンド+="九蓮宝燈,";
        	for(int i=0;i<dictionary.四槓子.split(",", 0).length;i++)if(dictionary.四槓子.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.四槓子.split(",", 0)[i]+".*"))コマンド+="四槓子,";
        	for(int i=0;i<dictionary.天和.split(",", 0).length;i++)if(dictionary.天和.split(",", 0)[i].length()>0 && s.matches(".*"+dictionary.天和.split(",", 0)[i]+".*"))コマンド+="天和,";
        }
        if(コマンド=="")音声コマンド=str;
        else {
        	音声コマンド=コマンド;
        	コマンドとして認識=true;
        }
        startVR();//音声認識再開
	}

	@Override
	public void onRmsChanged(float rmsdB) {
		// TODO Auto-generated method stub

	}
    static void startVR(){//音声認識開始
    	if(MainActivity.RecEnable){
	    	Log.e("startVR","startVR開始!");
	    	try {
	            // インテント作成
	            // 入力した音声を解析する。
	            Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH); 
	            // free-form speech recognition.
	            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
	            // 表示させる文字列
	            intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, "calling_package");
	            intent.putExtra(RecognizerIntent.EXTRA_SUPPORTED_LANGUAGES,"en-US");
	            // インテント開始
	            MainActivity.mSpeechRecognizer.startListening(intent);
	        }
	    	catch (ActivityNotFoundException e) {
	            // アクティビティが見つからなかった
	    		Log.e("startVR",e.getMessage());
	    	} 
    	}
    }

	static void voice_command_operation(MainActivity mv) {
		// TODO Auto-generated method stub
		if(音声コマンド!=以前の音声コマンド && 音声コマンド!=""){
			String トースト表示="";
			if(コマンドとして認識)MainActivity.sound_effect.play(MainActivity.command_changed_id, 1.0F, 1.0F, 0, 0, 1.0F);
			for(int i=0;i<音声コマンド.split(",", 0).length;i++){
				
				if(!トースト表示.matches(".*"+"["+音声コマンド.split(",", 0)[i]+"]"+".*"))トースト表示+="["+音声コマンド.split(",", 0)[i]+"]";
				
				if(音声コマンド.split(",", 0)[i].equals("ドラ1"))((EditText)mv.findViewById(R.id.edit_dora)).setText(Integer.toString(1));
				if(音声コマンド.split(",", 0)[i].equals("ドラ2"))((EditText)mv.findViewById(R.id.edit_dora)).setText(Integer.toString(2));
				if(音声コマンド.split(",", 0)[i].equals("ドラ3"))((EditText)mv.findViewById(R.id.edit_dora)).setText(Integer.toString(3));
				if(音声コマンド.split(",", 0)[i].equals("ドラ4"))((EditText)mv.findViewById(R.id.edit_dora)).setText(Integer.toString(4));
				if(音声コマンド.split(",", 0)[i].equals("ドラ5"))((EditText)mv.findViewById(R.id.edit_dora)).setText(Integer.toString(5));
				if(音声コマンド.split(",", 0)[i].equals("ドラ6"))((EditText)mv.findViewById(R.id.edit_dora)).setText(Integer.toString(6));
				if(音声コマンド.split(",", 0)[i].equals("ドラ7"))((EditText)mv.findViewById(R.id.edit_dora)).setText(Integer.toString(7));
				if(音声コマンド.split(",", 0)[i].equals("ドラ8"))((EditText)mv.findViewById(R.id.edit_dora)).setText(Integer.toString(8));
				if(音声コマンド.split(",", 0)[i].equals("ドラ9"))((EditText)mv.findViewById(R.id.edit_dora)).setText(Integer.toString(9));
				if(音声コマンド.split(",", 0)[i].equals("ドラ10"))((EditText)mv.findViewById(R.id.edit_dora)).setText(Integer.toString(10));
				
				if(音声コマンド.split(",", 0)[i].equals("立直"))((CheckBox)mv.findViewById(R.id.CheckBox101)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("役牌1"))((CheckBox)mv.findViewById(R.id.CheckBox102)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("断ヤオ九"))((CheckBox)mv.findViewById(R.id.CheckBox103)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("平和"))((CheckBox)mv.findViewById(R.id.CheckBox104)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("門前自摸"))((CheckBox)mv.findViewById(R.id.CheckBox105)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("一発"))((CheckBox)mv.findViewById(R.id.CheckBox106)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("一盃口"))((CheckBox)mv.findViewById(R.id.CheckBox107)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("ハイテイロン"))((CheckBox)mv.findViewById(R.id.CheckBox108)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("ハイテイツモ"))((CheckBox)mv.findViewById(R.id.CheckBox109)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("嶺上開花"))((CheckBox)mv.findViewById(R.id.CheckBox110)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("ダブルリーチ"))((CheckBox)mv.findViewById(R.id.CheckBox111)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("チャンカン"))((CheckBox)mv.findViewById(R.id.CheckBox112)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("三色同順_喰い"))((CheckBox)mv.findViewById(R.id.CheckBox113)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("一気通貫_喰い"))((CheckBox)mv.findViewById(R.id.CheckBox114)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("混全帯ヤオ九_喰い"))((CheckBox)mv.findViewById(R.id.CheckBox115)).setChecked(true);
				
				if(音声コマンド.split(",", 0)[i].equals("役牌2"))((CheckBox)mv.findViewById(R.id.CheckBox201)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("対々和"))((CheckBox)mv.findViewById(R.id.CheckBox202)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("三色同順_門前"))((CheckBox)mv.findViewById(R.id.CheckBox203)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("七対子"))((CheckBox)mv.findViewById(R.id.CheckBox204)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("一気通貫_門前"))((CheckBox)mv.findViewById(R.id.CheckBox205)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("混全帯ヤオ九_門前"))((CheckBox)mv.findViewById(R.id.CheckBox206)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("三暗刻"))((CheckBox)mv.findViewById(R.id.CheckBox207)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("小三元"))((CheckBox)mv.findViewById(R.id.CheckBox208)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("混老頭"))((CheckBox)mv.findViewById(R.id.CheckBox209)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("三色同刻"))((CheckBox)mv.findViewById(R.id.CheckBox210)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("三槓子"))((CheckBox)mv.findViewById(R.id.CheckBox211)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("ホンイツ_喰い"))((CheckBox)mv.findViewById(R.id.CheckBox212)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("清全帯ヤオ九_喰い"))((CheckBox)mv.findViewById(R.id.CheckBox213)).setChecked(true);
				
				if(音声コマンド.split(",", 0)[i].equals("役牌3"))((CheckBox)mv.findViewById(R.id.CheckBox301)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("ホンイツ_門前"))((CheckBox)mv.findViewById(R.id.CheckBox302)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("清全帯ヤオ九_門前"))((CheckBox)mv.findViewById(R.id.CheckBox303)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("二盃口"))((CheckBox)mv.findViewById(R.id.CheckBox304)).setChecked(true);
				
				if(音声コマンド.split(",", 0)[i].equals("役牌4"))((CheckBox)mv.findViewById(R.id.CheckBox401)).setChecked(true);
				
				if(音声コマンド.split(",", 0)[i].equals("清一色_喰い"))((CheckBox)mv.findViewById(R.id.CheckBox501)).setChecked(true);
				
				if(音声コマンド.split(",", 0)[i].equals("清一色_門前"))((CheckBox)mv.findViewById(R.id.CheckBox601)).setChecked(true);
				
				if(音声コマンド.split(",", 0)[i].equals("四暗刻"))((CheckBox)mv.findViewById(R.id.CheckBox1301)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("国士無双"))((CheckBox)mv.findViewById(R.id.CheckBox1302)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("大三元"))((CheckBox)mv.findViewById(R.id.CheckBox1303)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("四喜和"))((CheckBox)mv.findViewById(R.id.CheckBox1304)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("字一色"))((CheckBox)mv.findViewById(R.id.CheckBox1305)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("清老頭"))((CheckBox)mv.findViewById(R.id.CheckBox1306)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("地和"))((CheckBox)mv.findViewById(R.id.CheckBox1307)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("緑一色"))((CheckBox)mv.findViewById(R.id.CheckBox1308)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("九蓮宝燈"))((CheckBox)mv.findViewById(R.id.CheckBox1309)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("四槓子"))((CheckBox)mv.findViewById(R.id.CheckBox1310)).setChecked(true);
				if(音声コマンド.split(",", 0)[i].equals("天和"))((CheckBox)mv.findViewById(R.id.CheckBox1311)).setChecked(true);
			
			}
			
			if(!コマンドとして認識)トースト表示=音声コマンド;
			Toast.makeText(mv, トースト表示, Toast.LENGTH_LONG).show();
		}
		
		以前の音声コマンド=音声コマンド;
	}

}
