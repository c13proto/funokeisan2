package com.example.funokeisan;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.ToggleButton;

public class statement {
	
	static boolean 状態変化あり=false;
	static String 状態変化したやつ="";
	
	static String edit_han="",edit_han_="";
	static String edit_fu="",edit_fu_="";
	static String edit_dora="",edit_dora_="";
	
	static boolean toggleButton_oya=false,toggleButton_oya_=false;
	static boolean toggleButton_tanmachi=false,toggleButton_tanmachi_=false;
	static boolean toggleButton_tsumo=false,toggleButton_tsumo_=false;
	static boolean toggleButton_kui=false,toggleButton_kui_=false;
	static boolean toggleButton_atama=false,toggleButton_atama_=false;
	
	static boolean CheckBox101=false,CheckBox101_=false;
	static boolean CheckBox102=false,CheckBox102_=false;
	static boolean CheckBox103=false,CheckBox103_=false;
	static boolean CheckBox104=false,CheckBox104_=false;
	static boolean CheckBox105=false,CheckBox105_=false;
	static boolean CheckBox106=false,CheckBox106_=false;
	static boolean CheckBox107=false,CheckBox107_=false;
	static boolean CheckBox108=false,CheckBox108_=false;
	static boolean CheckBox109=false,CheckBox109_=false;
	static boolean CheckBox110=false,CheckBox110_=false;
	static boolean CheckBox111=false,CheckBox111_=false;
	static boolean CheckBox112=false,CheckBox112_=false;
	static boolean CheckBox113=false,CheckBox113_=false;
	static boolean CheckBox114=false,CheckBox114_=false;
	static boolean CheckBox115=false,CheckBox115_=false;
	
	static boolean CheckBox201=false,CheckBox201_=false;
	static boolean CheckBox202=false,CheckBox202_=false;
	static boolean CheckBox203=false,CheckBox203_=false;
	static boolean CheckBox204=false,CheckBox204_=false;
	static boolean CheckBox205=false,CheckBox205_=false;
	static boolean CheckBox206=false,CheckBox206_=false;
	static boolean CheckBox207=false,CheckBox207_=false;
	static boolean CheckBox208=false,CheckBox208_=false;
	static boolean CheckBox209=false,CheckBox209_=false;
	static boolean CheckBox210=false,CheckBox210_=false;
	static boolean CheckBox211=false,CheckBox211_=false;
	static boolean CheckBox212=false,CheckBox212_=false;
	static boolean CheckBox213=false,CheckBox213_=false;
	
	static boolean CheckBox301=false,CheckBox301_=false;
	static boolean CheckBox302=false,CheckBox302_=false;
	static boolean CheckBox303=false,CheckBox303_=false;
	static boolean CheckBox304=false,CheckBox304_=false;
	
	static boolean CheckBox401=false,CheckBox401_=false;
	
	static boolean CheckBox501=false,CheckBox501_=false;
	
	static boolean CheckBox601=false,CheckBox601_=false;
	
	static boolean CheckBox1301=false,CheckBox1301_=false;
	static boolean CheckBox1302=false,CheckBox1302_=false;
	static boolean CheckBox1303=false,CheckBox1303_=false;
	static boolean CheckBox1304=false,CheckBox1304_=false;
	static boolean CheckBox1305=false,CheckBox1305_=false;
	static boolean CheckBox1306=false,CheckBox1306_=false;
	static boolean CheckBox1307=false,CheckBox1307_=false;
	static boolean CheckBox1308=false,CheckBox1308_=false;
	static boolean CheckBox1309=false,CheckBox1309_=false;
	static boolean CheckBox1310=false,CheckBox1310_=false;
	static boolean CheckBox1311=false,CheckBox1311_=false;
	
	static int SeekBar_minko_hoka=0,SeekBar_minko_hoka_=0;
	static int SeekBar_minko_zi=0,SeekBar_minko_zi_=0;
	static int SeekBar_anko_hoka=0,SeekBar_anko_hoka_=0;
	static int SeekBar_anko_zi=0,SeekBar_anko_zi_=0;
	static int SeekBar_minka_hoka=0,SeekBar_minka_hoka_=0;
	static int SeekBar_minka_zi=0,SeekBar_minka_zi_=0;
	static int SeekBar_anka_hoka=0,SeekBar_anka_hoka_=0;
	static int SeekBar_anka_zi=0,SeekBar_anka_zi_=0;
	
	static void 状態チェック(MainActivity mv){//チェックボックスなどの状態に変更があった時に状態変化ありにtrueを代入
		
		状態変化あり=false;
		状態変化したやつ="";
		
		edit_han=((EditText)mv.findViewById(R.id.edit_han)).getText().toString();
		edit_fu=((EditText)mv.findViewById(R.id.edit_fu)).getText().toString();
		edit_dora=((EditText)mv.findViewById(R.id.edit_dora)).getText().toString();
		
		toggleButton_oya=((ToggleButton)mv.findViewById(R.id.toggleButton_oya)).isChecked();
		toggleButton_tanmachi=((ToggleButton)mv.findViewById(R.id.toggleButton_tanmachi)).isChecked();
		toggleButton_tsumo=((ToggleButton)mv.findViewById(R.id.toggleButton_tsumo)).isChecked();
		toggleButton_kui=((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).isChecked();
		toggleButton_atama=((ToggleButton)mv.findViewById(R.id.toggleButton_atama)).isChecked();

		CheckBox101=((CheckBox)mv.findViewById(R.id.CheckBox101)).isChecked();
		CheckBox102=((CheckBox)mv.findViewById(R.id.CheckBox102)).isChecked();
		CheckBox103=((CheckBox)mv.findViewById(R.id.CheckBox103)).isChecked();
		CheckBox104=((CheckBox)mv.findViewById(R.id.CheckBox104)).isChecked();
		CheckBox105=((CheckBox)mv.findViewById(R.id.CheckBox105)).isChecked();
		CheckBox106=((CheckBox)mv.findViewById(R.id.CheckBox106)).isChecked();
		CheckBox107=((CheckBox)mv.findViewById(R.id.CheckBox107)).isChecked();
		CheckBox108=((CheckBox)mv.findViewById(R.id.CheckBox108)).isChecked();
		CheckBox109=((CheckBox)mv.findViewById(R.id.CheckBox109)).isChecked();
		CheckBox110=((CheckBox)mv.findViewById(R.id.CheckBox110)).isChecked();
		CheckBox111=((CheckBox)mv.findViewById(R.id.CheckBox111)).isChecked();
		CheckBox112=((CheckBox)mv.findViewById(R.id.CheckBox112)).isChecked();
		CheckBox113=((CheckBox)mv.findViewById(R.id.CheckBox113)).isChecked();
		CheckBox114=((CheckBox)mv.findViewById(R.id.CheckBox114)).isChecked();
		CheckBox115=((CheckBox)mv.findViewById(R.id.CheckBox115)).isChecked();
		
		CheckBox201=((CheckBox)mv.findViewById(R.id.CheckBox201)).isChecked();
		CheckBox202=((CheckBox)mv.findViewById(R.id.CheckBox202)).isChecked();
		CheckBox203=((CheckBox)mv.findViewById(R.id.CheckBox203)).isChecked();
		CheckBox204=((CheckBox)mv.findViewById(R.id.CheckBox204)).isChecked();
		CheckBox205=((CheckBox)mv.findViewById(R.id.CheckBox205)).isChecked();
		CheckBox206=((CheckBox)mv.findViewById(R.id.CheckBox206)).isChecked();
		CheckBox207=((CheckBox)mv.findViewById(R.id.CheckBox207)).isChecked();
		CheckBox208=((CheckBox)mv.findViewById(R.id.CheckBox208)).isChecked();
		CheckBox209=((CheckBox)mv.findViewById(R.id.CheckBox209)).isChecked();
		CheckBox210=((CheckBox)mv.findViewById(R.id.CheckBox210)).isChecked();
		CheckBox211=((CheckBox)mv.findViewById(R.id.CheckBox211)).isChecked();
		CheckBox212=((CheckBox)mv.findViewById(R.id.CheckBox212)).isChecked();
		CheckBox213=((CheckBox)mv.findViewById(R.id.CheckBox213)).isChecked();
		
		CheckBox301=((CheckBox)mv.findViewById(R.id.CheckBox301)).isChecked();
		CheckBox302=((CheckBox)mv.findViewById(R.id.CheckBox302)).isChecked();
		CheckBox303=((CheckBox)mv.findViewById(R.id.CheckBox303)).isChecked();
		CheckBox304=((CheckBox)mv.findViewById(R.id.CheckBox304)).isChecked();
		
		CheckBox401=((CheckBox)mv.findViewById(R.id.CheckBox401)).isChecked();
		
		CheckBox501=((CheckBox)mv.findViewById(R.id.CheckBox501)).isChecked();
		
		CheckBox601=((CheckBox)mv.findViewById(R.id.CheckBox601)).isChecked();
		
		CheckBox1301=((CheckBox)mv.findViewById(R.id.CheckBox1301)).isChecked();
		CheckBox1302=((CheckBox)mv.findViewById(R.id.CheckBox1302)).isChecked();
		CheckBox1303=((CheckBox)mv.findViewById(R.id.CheckBox1303)).isChecked();
		CheckBox1304=((CheckBox)mv.findViewById(R.id.CheckBox1304)).isChecked();
		CheckBox1305=((CheckBox)mv.findViewById(R.id.CheckBox1305)).isChecked();
		CheckBox1306=((CheckBox)mv.findViewById(R.id.CheckBox1306)).isChecked();
		CheckBox1307=((CheckBox)mv.findViewById(R.id.CheckBox1307)).isChecked();
		CheckBox1308=((CheckBox)mv.findViewById(R.id.CheckBox1308)).isChecked();
		CheckBox1309=((CheckBox)mv.findViewById(R.id.CheckBox1309)).isChecked();
		CheckBox1310=((CheckBox)mv.findViewById(R.id.CheckBox1310)).isChecked();
		CheckBox1311=((CheckBox)mv.findViewById(R.id.CheckBox1311)).isChecked();
		
		SeekBar_minko_hoka=((SeekBar)mv.findViewById(R.id.SeekBar_minko_hoka)).getProgress();
		SeekBar_minko_zi=((SeekBar)mv.findViewById(R.id.SeekBar_minko_zi)).getProgress();
		SeekBar_anko_hoka=((SeekBar)mv.findViewById(R.id.SeekBar_anko_hoka)).getProgress();
		SeekBar_anko_zi=((SeekBar)mv.findViewById(R.id.SeekBar_anko_zi)).getProgress();
		SeekBar_minka_hoka=((SeekBar)mv.findViewById(R.id.SeekBar_minka_hoka)).getProgress();
		SeekBar_minka_zi=((SeekBar)mv.findViewById(R.id.SeekBar_minka_zi)).getProgress();
		SeekBar_anka_hoka=((SeekBar)mv.findViewById(R.id.SeekBar_anka_hoka)).getProgress();
		SeekBar_anka_zi=((SeekBar)mv.findViewById(R.id.SeekBar_anka_zi)).getProgress();
		
		if(edit_han_.equals(edit_han)==false)	{状態変化あり=true;状態変化したやつ+="edit_han,";}
		if(edit_fu_.equals(edit_fu)==false)		{状態変化あり=true;状態変化したやつ+="edit_fu,";}
		if(edit_dora_.equals(edit_dora)==false)	{状態変化あり=true;状態変化したやつ+="edit_dora,";}
		
		if(toggleButton_oya_!=toggleButton_oya)				{状態変化あり=true;状態変化したやつ+="toggleButton_oya,";}
		if(toggleButton_tanmachi_!=toggleButton_tanmachi)	{状態変化あり=true;状態変化したやつ+="toggleButton_tanmachi,";}
		if(toggleButton_tsumo_!=toggleButton_tsumo)			{状態変化あり=true;状態変化したやつ+="toggleButton_tsumo,";}
		if(toggleButton_kui_!=toggleButton_kui)				{状態変化あり=true;状態変化したやつ+="toggleButton_kui,";}
		if(toggleButton_atama_!=toggleButton_atama)			{状態変化あり=true;状態変化したやつ+="toggleButton_atama,";}
		
		if(CheckBox101_!=CheckBox101){状態変化あり=true;状態変化したやつ+="CheckBox101,";}
		if(CheckBox102_!=CheckBox102){状態変化あり=true;状態変化したやつ+="CheckBox102,";}
		if(CheckBox103_!=CheckBox103){状態変化あり=true;状態変化したやつ+="CheckBox103,";}
		if(CheckBox104_!=CheckBox104){状態変化あり=true;状態変化したやつ+="CheckBox104,";}
		if(CheckBox105_!=CheckBox105){状態変化あり=true;状態変化したやつ+="CheckBox105,";}
		if(CheckBox106_!=CheckBox106){状態変化あり=true;状態変化したやつ+="CheckBox106,";}
		if(CheckBox107_!=CheckBox107){状態変化あり=true;状態変化したやつ+="CheckBox107,";}
		if(CheckBox108_!=CheckBox108){状態変化あり=true;状態変化したやつ+="CheckBox108,";}
		if(CheckBox109_!=CheckBox109){状態変化あり=true;状態変化したやつ+="CheckBox109,";}
		if(CheckBox110_!=CheckBox110){状態変化あり=true;状態変化したやつ+="CheckBox110,";}
		if(CheckBox111_!=CheckBox111){状態変化あり=true;状態変化したやつ+="CheckBox111,";}
		if(CheckBox112_!=CheckBox112){状態変化あり=true;状態変化したやつ+="CheckBox112,";}
		if(CheckBox113_!=CheckBox113){状態変化あり=true;状態変化したやつ+="CheckBox113,";}
		if(CheckBox114_!=CheckBox114){状態変化あり=true;状態変化したやつ+="CheckBox114,";}
		if(CheckBox115_!=CheckBox115){状態変化あり=true;状態変化したやつ+="CheckBox115,";}
		
		if(CheckBox201_!=CheckBox201){状態変化あり=true;状態変化したやつ+="CheckBox201,";}
		if(CheckBox202_!=CheckBox202){状態変化あり=true;状態変化したやつ+="CheckBox202,";}
		if(CheckBox203_!=CheckBox203){状態変化あり=true;状態変化したやつ+="CheckBox203,";}
		if(CheckBox204_!=CheckBox204){状態変化あり=true;状態変化したやつ+="CheckBox204,";}
		if(CheckBox205_!=CheckBox205){状態変化あり=true;状態変化したやつ+="CheckBox205,";}
		if(CheckBox206_!=CheckBox206){状態変化あり=true;状態変化したやつ+="CheckBox206,";}
		if(CheckBox207_!=CheckBox207){状態変化あり=true;状態変化したやつ+="CheckBox207,";}
		if(CheckBox208_!=CheckBox208){状態変化あり=true;状態変化したやつ+="CheckBox208,";}
		if(CheckBox209_!=CheckBox209){状態変化あり=true;状態変化したやつ+="CheckBox209,";}
		if(CheckBox210_!=CheckBox210){状態変化あり=true;状態変化したやつ+="CheckBox210,";}
		if(CheckBox211_!=CheckBox211){状態変化あり=true;状態変化したやつ+="CheckBox211,";}
		if(CheckBox212_!=CheckBox212){状態変化あり=true;状態変化したやつ+="CheckBox212,";}
		if(CheckBox213_!=CheckBox213){状態変化あり=true;状態変化したやつ+="CheckBox213,";}
		
		if(CheckBox301_!=CheckBox301){状態変化あり=true;状態変化したやつ+="CheckBox301,";}
		if(CheckBox302_!=CheckBox302){状態変化あり=true;状態変化したやつ+="CheckBox302,";}
		if(CheckBox303_!=CheckBox303){状態変化あり=true;状態変化したやつ+="CheckBox303,";}
		if(CheckBox304_!=CheckBox304){状態変化あり=true;状態変化したやつ+="CheckBox304,";}
		
		if(CheckBox401_!=CheckBox401){状態変化あり=true;状態変化したやつ+="CheckBox401,";}
		
		if(CheckBox501_!=CheckBox501){状態変化あり=true;状態変化したやつ+="CheckBox501,";}
		
		if(CheckBox601_!=CheckBox601){状態変化あり=true;状態変化したやつ+="CheckBox601,";}
		
		if(CheckBox1301_!=CheckBox1301){状態変化あり=true;状態変化したやつ+="CheckBox1301,";}
		if(CheckBox1302_!=CheckBox1302){状態変化あり=true;状態変化したやつ+="CheckBox1302,";}
		if(CheckBox1303_!=CheckBox1303){状態変化あり=true;状態変化したやつ+="CheckBox1303,";}
		if(CheckBox1304_!=CheckBox1304){状態変化あり=true;状態変化したやつ+="CheckBox1304,";}
		if(CheckBox1305_!=CheckBox1305){状態変化あり=true;状態変化したやつ+="CheckBox1305,";}
		if(CheckBox1306_!=CheckBox1306){状態変化あり=true;状態変化したやつ+="CheckBox1306,";}
		if(CheckBox1307_!=CheckBox1307){状態変化あり=true;状態変化したやつ+="CheckBox1307,";}
		if(CheckBox1308_!=CheckBox1308){状態変化あり=true;状態変化したやつ+="CheckBox1308,";}
		if(CheckBox1309_!=CheckBox1309){状態変化あり=true;状態変化したやつ+="CheckBox1309,";}
		if(CheckBox1310_!=CheckBox1310){状態変化あり=true;状態変化したやつ+="CheckBox1310,";}
		if(CheckBox1311_!=CheckBox1311){状態変化あり=true;状態変化したやつ+="CheckBox1311,";}
		
		if(SeekBar_minko_hoka_!=SeekBar_minko_hoka)	{状態変化あり=true;状態変化したやつ+="SeekBar_minko_hoka,";}
		if(SeekBar_minko_zi_!=SeekBar_minko_zi)		{状態変化あり=true;状態変化したやつ+="SeekBar_minko_zi,";}
		if(SeekBar_anko_hoka_!=SeekBar_anko_hoka)	{状態変化あり=true;状態変化したやつ+="SeekBar_anko_hoka,";}
		if(SeekBar_anko_zi_!=SeekBar_anko_zi)		{状態変化あり=true;状態変化したやつ+="SeekBar_anko_zi,";}
		if(SeekBar_minka_hoka_!=SeekBar_minka_hoka)	{状態変化あり=true;状態変化したやつ+="SeekBar_minka_hoka,";}
		if(SeekBar_minka_zi_!=SeekBar_minka_zi)		{状態変化あり=true;状態変化したやつ+="SeekBar_minka_zi,";}
		if(SeekBar_anka_hoka_!=SeekBar_anka_hoka)	{状態変化あり=true;状態変化したやつ+="SeekBar_anka_hoka,";}
		if(SeekBar_anka_zi_!=SeekBar_anka_zi)		{状態変化あり=true;状態変化したやつ+="SeekBar_anka_zi,";}

		
		//ひとつ前のデータとして保存
		edit_han_=edit_han;
		edit_fu_=edit_fu;
		edit_dora_=edit_dora;
		
		toggleButton_oya_=toggleButton_oya;
		toggleButton_tanmachi_=toggleButton_tanmachi;
		toggleButton_tsumo_=toggleButton_tsumo;
		toggleButton_kui_=toggleButton_kui;
		toggleButton_atama_=toggleButton_atama;
		
		CheckBox101_=CheckBox101;
		CheckBox102_=CheckBox102;
		CheckBox103_=CheckBox103;
		CheckBox104_=CheckBox104;
		CheckBox105_=CheckBox105;
		CheckBox106_=CheckBox106;
		CheckBox107_=CheckBox107;
		CheckBox108_=CheckBox108;
		CheckBox109_=CheckBox109;
		CheckBox110_=CheckBox110;
		CheckBox111_=CheckBox111;
		CheckBox112_=CheckBox112;
		CheckBox113_=CheckBox113;
		CheckBox114_=CheckBox114;
		CheckBox115_=CheckBox115;
		
		CheckBox201_=CheckBox201;
		CheckBox202_=CheckBox202;
		CheckBox203_=CheckBox203;
		CheckBox204_=CheckBox204;
		CheckBox205_=CheckBox205;
		CheckBox206_=CheckBox206;
		CheckBox207_=CheckBox207;
		CheckBox208_=CheckBox208;
		CheckBox209_=CheckBox209;
		CheckBox210_=CheckBox210;
		CheckBox211_=CheckBox211;
		CheckBox212_=CheckBox212;
		CheckBox213_=CheckBox213;
		
		CheckBox301_=CheckBox301;
		CheckBox302_=CheckBox302;
		CheckBox303_=CheckBox303;
		CheckBox304_=CheckBox304;
		
		CheckBox401_=CheckBox401;
		
		CheckBox501_=CheckBox501;
		
		CheckBox601_=CheckBox601;
		
		CheckBox1301_=CheckBox1301;
		CheckBox1302_=CheckBox1302;
		CheckBox1303_=CheckBox1303;
		CheckBox1304_=CheckBox1304;
		CheckBox1305_=CheckBox1305;
		CheckBox1306_=CheckBox1306;
		CheckBox1307_=CheckBox1307;
		CheckBox1308_=CheckBox1308;
		CheckBox1309_=CheckBox1309;
		CheckBox1310_=CheckBox1310;
		CheckBox1311_=CheckBox1311;
		
		SeekBar_minko_hoka_=SeekBar_minko_hoka;
		SeekBar_minko_zi_=SeekBar_minko_zi;
		SeekBar_anko_hoka_=SeekBar_anko_hoka;
		SeekBar_anko_zi_=SeekBar_anko_zi;
		SeekBar_minka_hoka_=SeekBar_minka_hoka;
		SeekBar_minka_zi_=SeekBar_minka_zi;
		SeekBar_anka_hoka_=SeekBar_anka_hoka;
		SeekBar_anka_zi_=SeekBar_anka_zi;
	}

}
