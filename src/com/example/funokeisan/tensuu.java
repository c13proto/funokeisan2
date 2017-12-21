package com.example.funokeisan;

import android.widget.EditText;
import android.widget.TextView;

public class tensuu {

    static void 点数計算(MainActivity mv){
    	int 基本点=0;
    	int 親点数=0;
    	int 子点数=0;
    	int 親支払=0;
    	int 子支払=0;
    	int 親ツモ支払=0;
    	
    	String 飜=statement.edit_han;
    	String 飜_ヒント=((EditText)mv.findViewById(R.id.edit_han)).getHint().toString();
    	String 符=statement.edit_fu;
    	String 符_ヒント=((EditText)mv.findViewById(R.id.edit_fu)).getHint().toString();
			    	飜=飜.replaceAll("[ 　]","");飜_ヒント=飜_ヒント.replaceAll("[ 　]","");
			    	符=符.replaceAll("[ 　]","");符_ヒント=符_ヒント.replaceAll("[ 　]","");
			    	
		((TextView)mv.findViewById(R.id.TextView101)).setText("");//初期化
		((TextView)mv.findViewById(R.id.textView2)).setText("");//初期化
			    	
    	if(点数計算可能(mv,飜,符)!=0){//ヒントじゃない方
    		if(点数計算可能(mv,飜,符)>=5){//満願以上
    			int 倍数;
    			if(Integer.parseInt(飜)>=13)倍数=8;//役満
    			else if(Integer.parseInt(飜)>=11)倍数=6;//3倍満
    			else if(Integer.parseInt(飜)>=8)倍数=4;//倍満
    			else if(Integer.parseInt(飜)>=6)倍数=3;//跳満
    			else 倍数=2;//満貫
				親点数=6000*倍数;
				子点数=4000*倍数;
				親支払=2000*倍数;
				子支払=1000*倍数;
				親ツモ支払=2000*倍数;
    		}
    		else{
    			基本点=(int) (Integer.parseInt(符)*Math.pow(2,Integer.parseInt(飜)+2));
    			親点数=基本点*6;
    			子点数=基本点*4;
    			親支払=基本点*2;
    			子支払=基本点;
    			親ツモ支払=基本点*2;
    			if(親点数%100!=0)親点数=(int)(親点数/100+1)*100;//切り上げ
    			if(子点数%100!=0)子点数=(int)(子点数/100+1)*100;
    			if(親支払%100!=0)親支払=(int)(親支払/100+1)*100;//切り上げ
    			if(子支払%100!=0)子支払=(int)(子支払/100+1)*100;
    			if(親ツモ支払%100!=0)親ツモ支払=(int)(親ツモ支払/100+1)*100;
    			
    			//割り切れるように計算
    			if(親点数%300!=0){
    				if(親点数%300==100)親ツモ支払=(親点数+200)/3;
    				else 親ツモ支払=(親点数+100)/3;
    			}
    			if(子点数%200!=0){
    				親支払=(子点数+100)/2;
    				if(親支払%200!=0)子支払=(親支払+100)/2;
    			}
    			
    		}
    		
    		if(statement.toggleButton_oya){
    			//親の点数
    			((TextView)mv.findViewById(R.id.TextView101)).setText(Integer.toString((int)親点数));
    			if(statement.toggleButton_tsumo){
    				((TextView)mv.findViewById(R.id.textView2)).setText(Integer.toString((int)親ツモ支払)+"オール");
    			}
    			else((TextView)mv.findViewById(R.id.textView2)).setText("-----");
    		}
    		else{
    			//子の点数
    			((TextView)mv.findViewById(R.id.TextView101)).setText(Integer.toString((int)子点数));
    			if(statement.toggleButton_tsumo){
    				((TextView)mv.findViewById(R.id.textView2)).setText(Integer.toString((int)親支払)+","+Integer.toString((int)子支払));
    			}
    			else((TextView)mv.findViewById(R.id.textView2)).setText("-----");
    		}
    	}
    	else if(点数計算可能(mv,飜_ヒント,符_ヒント)!=0){//ヒントの方
    		if(点数計算可能(mv,飜_ヒント,符_ヒント)>=5){//満願以上
    			int 倍数;
    			if(Integer.parseInt(飜_ヒント)>=13)倍数=8;//役満
    			else if(Integer.parseInt(飜_ヒント)>=11)倍数=6;//3倍満
    			else if(Integer.parseInt(飜_ヒント)>=8)倍数=4;//倍満
    			else if(Integer.parseInt(飜_ヒント)>=6)倍数=3;//跳満
    			else 倍数=2;//満貫
				親点数=6000*倍数;
				子点数=4000*倍数;
				親支払=2000*倍数;
				子支払=1000*倍数;
				親ツモ支払=2000*倍数;
    		}
    		else{
    			基本点=(int) (Integer.parseInt(符_ヒント)*Math.pow(2,Integer.parseInt(飜_ヒント)+2));
    			親点数=基本点*6;
    			子点数=基本点*4;
    			親支払=基本点*2;
    			子支払=基本点;
    			親ツモ支払=基本点*2;
    			if(親点数%100!=0)親点数=(int)(親点数/100+1)*100;//切り上げ
    			if(子点数%100!=0)子点数=(int)(子点数/100+1)*100;
    			if(親支払%100!=0)親支払=(int)(親支払/100+1)*100;//切り上げ
    			if(子支払%100!=0)子支払=(int)(子支払/100+1)*100;
    			if(親ツモ支払%100!=0)親ツモ支払=(int)(親ツモ支払/100+1)*100;
    			
    			//割り切れるように計算
    			if(親点数%300!=0){
    				if(親点数%300==100)親ツモ支払=(親点数+200)/3;
    				else 親ツモ支払=(親点数+100)/3;
    			}
    			if(子点数%200!=0){
    				親支払=(子点数+100)/2;
    				if(親支払%200!=0)子支払=(親支払+100)/2;
    			}
    			
    		}
    		
    		if(statement.toggleButton_oya){
    			//親の点数
    			((TextView)mv.findViewById(R.id.TextView101)).setHint(Integer.toString((int)親点数));
    			if(statement.toggleButton_tsumo){
    				((TextView)mv.findViewById(R.id.textView2)).setHint(Integer.toString((int)親ツモ支払)+"オール");
    			}
    			else((TextView)mv.findViewById(R.id.textView2)).setHint("-----");
    		}
    		else{
    			//子の点数
    			((TextView)mv.findViewById(R.id.TextView101)).setHint(Integer.toString((int)子点数));
    			if(statement.toggleButton_tsumo){
    				((TextView)mv.findViewById(R.id.textView2)).setHint(Integer.toString((int)親支払)+","+Integer.toString((int)子支払));
    			}
    			else((TextView)mv.findViewById(R.id.textView2)).setHint("-----");
    		}
    	}
    	else{
        	((TextView)mv.findViewById(R.id.TextView101)).setHint("-----");
        	((TextView)mv.findViewById(R.id.textView2)).setHint("-----");
    	}

			    	
    }
    
    private static int 点数計算可能(MainActivity mv,String はん,String ふ){
    	//満貫以上は5以上の数字（はん）を返す．不可の場合0，それ以外は1
    	if(MainActivity.数値化可能(はん)){
    		if(Integer.parseInt(はん)>=5)return Integer.parseInt(はん);
	    	if(MainActivity.数値化可能(ふ)){//数値化可能は通過
	    		if((Integer.parseInt(ふ)%10==0 || Integer.parseInt(ふ)==25) && Integer.parseInt(ふ)>=20 && Integer.parseInt(ふ)<=110){//20符以上、10の倍数か25でなければerr
	    			if(Integer.parseInt(ふ)>=40 && Integer.parseInt(はん)==4)return 5;//4はんでも満貫
	    			else return 1;
	    		}
	    	}
    	}
    	return 0;
    }
}
