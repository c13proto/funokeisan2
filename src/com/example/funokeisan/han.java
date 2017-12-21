package com.example.funokeisan;


import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ToggleButton;

public class han {
	static int 飜=0;
	static void 飜計算(MainActivity mv){
			飜=0;
			
	    	//ドラの計算
	    	String ドラ=((EditText)mv.findViewById(R.id.edit_dora)).getText().toString();
	    	ドラ=ドラ.replaceAll("[ 　]","");
	    	if(MainActivity.数値化可能(ドラ))飜+=Integer.parseInt(ドラ);
	    	//1役のやつ
	    	if( statement.CheckBox101)飜+=1;
	    	if( statement.CheckBox102)飜+=1;
	    	if( statement.CheckBox103)飜+=1;
	    	if( statement.CheckBox104)飜+=1;
	    	if( statement.CheckBox105)飜+=1;
	    	if( statement.CheckBox106)飜+=1;
	    	if( statement.CheckBox107)飜+=1;
	    	if( statement.CheckBox108)飜+=1;
	    	if( statement.CheckBox109)飜+=1;
	    	if( statement.CheckBox110)飜+=1;
	    	if( statement.CheckBox111)飜+=1;
	    	if( statement.CheckBox112)飜+=1;
	    	if( statement.CheckBox113)飜+=1;
	    	if( statement.CheckBox114)飜+=1;
	    	if( statement.CheckBox115)飜+=1;
	    	
	    	//2役のやつ
	    	if( statement.CheckBox201)飜+=2;
	    	if( statement.CheckBox202)飜+=2;
	    	if( statement.CheckBox203)飜+=2;
	    	if( statement.CheckBox204)飜+=2;
	    	if( statement.CheckBox205)飜+=2;
	    	if( statement.CheckBox206)飜+=2;
	    	if( statement.CheckBox207)飜+=2;
	    	if( statement.CheckBox208)飜+=2;
	    	if( statement.CheckBox209)飜+=2;
	    	if( statement.CheckBox210)飜+=2;
	    	if( statement.CheckBox211)飜+=2;
	    	if( statement.CheckBox212)飜+=2;
	    	if( statement.CheckBox213)飜+=2;
	    	
	    	//3役のやつ
	    	if( statement.CheckBox301)飜+=3;
	    	if( statement.CheckBox302)飜+=3;
	    	if( statement.CheckBox303)飜+=3;
	    	if( statement.CheckBox304)飜+=3;
	    	
	    	//4役のやつ
	    	if( statement.CheckBox401)飜+=4;
	    	
	    	//5役のやつ
	    	if( statement.CheckBox501)飜+=5;
	    	
	    	//6役のやつ
	    	if( statement.CheckBox601)飜+=6;
	    	
	    	//13役のやつ
	    	if( statement.CheckBox1301)飜+=13;
	    	if( statement.CheckBox1302)飜+=13;
	    	if( statement.CheckBox1303)飜+=13;
	    	if( statement.CheckBox1304)飜+=13;
	    	if( statement.CheckBox1305)飜+=13;
	    	if( statement.CheckBox1306)飜+=13;
	    	if( statement.CheckBox1307)飜+=13;
	    	if( statement.CheckBox1308)飜+=13;
	    	if( statement.CheckBox1309)飜+=13;
	    	if( statement.CheckBox1310)飜+=13;
	    	if( statement.CheckBox1311)飜+=13;
	    	
	    	((EditText)mv.findViewById(R.id.edit_han)).setHint(Integer.toString(飜));
	    	//((TextView)mv.findViewById(R.id.TextView_han)).setText("[役一覧]"+"+"+Integer.toString(飜)+"飜");
	}
	static void 矛盾解消(MainActivity mv){
		if(fu.明と暗の個数>=1||statement.toggleButton_atama||statement.toggleButton_tanmachi){//ピンフは符がない，リャンメンマチ
			((CheckBox)mv.findViewById(R.id.CheckBox104)).setVisibility(View.GONE);
		}
		else{
			((CheckBox)mv.findViewById(R.id.CheckBox104)).setVisibility(View.VISIBLE);
		}
		if(fu.明の個数>=1){//四暗刻と国士無双と天和と地和は明がある時点でアウト
			((CheckBox)mv.findViewById(R.id.CheckBox1301)).setVisibility(View.GONE);
			((CheckBox)mv.findViewById(R.id.CheckBox1302)).setVisibility(View.GONE);
			((CheckBox)mv.findViewById(R.id.CheckBox1307)).setVisibility(View.GONE);
			((CheckBox)mv.findViewById(R.id.CheckBox1309)).setVisibility(View.GONE);
			((CheckBox)mv.findViewById(R.id.CheckBox1311)).setVisibility(View.GONE);
		}
		else{
			((CheckBox)mv.findViewById(R.id.CheckBox1301)).setVisibility(View.VISIBLE);
			((CheckBox)mv.findViewById(R.id.CheckBox1302)).setVisibility(View.VISIBLE);
			((CheckBox)mv.findViewById(R.id.CheckBox1307)).setVisibility(View.VISIBLE);
			((CheckBox)mv.findViewById(R.id.CheckBox1309)).setVisibility(View.VISIBLE);
			((CheckBox)mv.findViewById(R.id.CheckBox1311)).setVisibility(View.VISIBLE);
		}
		if(fu.明の個数>=2){//門前の役を消す
			((CheckBox)mv.findViewById(R.id.CheckBox101)).setVisibility(View.GONE);
			((CheckBox)mv.findViewById(R.id.CheckBox105)).setVisibility(View.GONE);
			((CheckBox)mv.findViewById(R.id.CheckBox106)).setVisibility(View.GONE);
			((CheckBox)mv.findViewById(R.id.CheckBox107)).setVisibility(View.GONE);
			((CheckBox)mv.findViewById(R.id.CheckBox111)).setVisibility(View.GONE);
			((CheckBox)mv.findViewById(R.id.CheckBox203)).setVisibility(View.GONE);
			((CheckBox)mv.findViewById(R.id.CheckBox205)).setVisibility(View.GONE);
			((CheckBox)mv.findViewById(R.id.CheckBox206)).setVisibility(View.GONE);
			((CheckBox)mv.findViewById(R.id.CheckBox302)).setVisibility(View.GONE);
			((CheckBox)mv.findViewById(R.id.CheckBox303)).setVisibility(View.GONE);
			((CheckBox)mv.findViewById(R.id.CheckBox304)).setVisibility(View.GONE);
			((CheckBox)mv.findViewById(R.id.CheckBox601)).setVisibility(View.GONE);
		}
		else{
			((CheckBox)mv.findViewById(R.id.CheckBox101)).setVisibility(View.VISIBLE);
			((CheckBox)mv.findViewById(R.id.CheckBox105)).setVisibility(View.VISIBLE);
			((CheckBox)mv.findViewById(R.id.CheckBox106)).setVisibility(View.VISIBLE);
			((CheckBox)mv.findViewById(R.id.CheckBox107)).setVisibility(View.VISIBLE);
			((CheckBox)mv.findViewById(R.id.CheckBox111)).setVisibility(View.VISIBLE);
			((CheckBox)mv.findViewById(R.id.CheckBox203)).setVisibility(View.VISIBLE);
			((CheckBox)mv.findViewById(R.id.CheckBox205)).setVisibility(View.VISIBLE);
			((CheckBox)mv.findViewById(R.id.CheckBox206)).setVisibility(View.VISIBLE);
			((CheckBox)mv.findViewById(R.id.CheckBox302)).setVisibility(View.VISIBLE);
			((CheckBox)mv.findViewById(R.id.CheckBox303)).setVisibility(View.VISIBLE);
			((CheckBox)mv.findViewById(R.id.CheckBox304)).setVisibility(View.VISIBLE);
			((CheckBox)mv.findViewById(R.id.CheckBox601)).setVisibility(View.VISIBLE);
		}
		
		if( statement.CheckBox101){//立直の時は門前
			((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(false);
		}
		if( statement.CheckBox105){//門前ツモ
			for(int i=0;i<statement.状態変化したやつ.split(",",0).length;i++)
				if(statement.状態変化したやつ.split(",",0)[i].equals("CheckBox105")){
					((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(false);
					((ToggleButton)mv.findViewById(R.id.toggleButton_tsumo)).setChecked(true);
					statement.toggleButton_kui=false;
					statement.toggleButton_tsumo=true;
				}
		}
		else //門前ツモのチェックがはずされたら
		{	
			for(int i=0;i<statement.状態変化したやつ.split(",",0).length;i++)
				if(statement.状態変化したやつ.split(",",0)[i].equals("CheckBox105")){
						((ToggleButton)mv.findViewById(R.id.toggleButton_tsumo)).setChecked(false);
						statement.toggleButton_tsumo=false;
				}
		}
		if( statement.CheckBox106){//一発
			((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(false);
			((CheckBox)mv.findViewById(R.id.CheckBox101)).setChecked(true);
		}
		if( ((CheckBox)mv.findViewById(R.id.CheckBox107)).isChecked()){//一盃口
			((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(false);
		}
		if( statement.CheckBox108){//ハイテイロン
			((ToggleButton)mv.findViewById(R.id.toggleButton_tsumo)).setChecked(false);
		}
		if( statement.CheckBox109){//ハイテイツモ
			((ToggleButton)mv.findViewById(R.id.toggleButton_tsumo)).setChecked(true);
		}
		if( statement.CheckBox111){//ダブル立直
			((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(false);
			((CheckBox)mv.findViewById(R.id.CheckBox101)).setChecked(true);
		}
	   	if( statement.CheckBox113)
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(true);
    	if( statement.CheckBox114)//二盃口
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(true);
    	if( statement.CheckBox115)
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(true);
    	
    	if( statement.CheckBox203)
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(false);
    	if( statement.CheckBox205)
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(false);
    	if( statement.CheckBox208)//小三元の時は頭は字牌
    		((ToggleButton)mv.findViewById(R.id.toggleButton_atama)).setChecked(false);
    	if( statement.CheckBox206)
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(false);
    	if( statement.CheckBox212)
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(true);
    	if( statement.CheckBox213)
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(true);
    	
    	if( statement.CheckBox302)
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(false);
    	if( statement.CheckBox303)
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(false);
    	if( statement.CheckBox304)
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(false);
    	
    	if( statement.CheckBox501)
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(true);
    	
    	if( statement.CheckBox601)
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(false);
    	
    	if( statement.CheckBox1301){
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(false);
    	}
    	if( statement.CheckBox1307){
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(false);
    		((ToggleButton)mv.findViewById(R.id.toggleButton_oya)).setChecked(false);
    		((ToggleButton)mv.findViewById(R.id.toggleButton_tsumo)).setChecked(true);
    	}
    	if( statement.CheckBox1311){
    		((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(false);
    		((ToggleButton)mv.findViewById(R.id.toggleButton_oya)).setChecked(true);
    	}
	}
	static void 役のチェック解除(MainActivity mv){
		((CheckBox)mv.findViewById(R.id.CheckBox101)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox102)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox103)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox104)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox105)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox106)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox107)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox108)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox109)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox110)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox111)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox112)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox113)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox114)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox115)).setChecked(false);
		
		((CheckBox)mv.findViewById(R.id.CheckBox201)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox202)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox203)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox204)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox205)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox206)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox207)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox208)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox209)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox210)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox211)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox212)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox213)).setChecked(false);
		
		((CheckBox)mv.findViewById(R.id.CheckBox301)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox302)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox303)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox304)).setChecked(false);

		((CheckBox)mv.findViewById(R.id.CheckBox401)).setChecked(false);

		((CheckBox)mv.findViewById(R.id.CheckBox501)).setChecked(false);
		
		((CheckBox)mv.findViewById(R.id.CheckBox601)).setChecked(false);

		((CheckBox)mv.findViewById(R.id.CheckBox1301)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox1302)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox1303)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox1304)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox1305)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox1306)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox1307)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox1308)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox1309)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox1310)).setChecked(false);
		((CheckBox)mv.findViewById(R.id.CheckBox1311)).setChecked(false);
	}

}
