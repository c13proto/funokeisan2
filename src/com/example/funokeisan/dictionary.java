package com.example.funokeisan;


import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;


public class dictionary{
	static SharedPreferences SP;
	private static String 辞書内容="";
	//ドラ
	//static Set<String> ドラ1 = new HashSet<String>();
	static String ドラ1="ドラ1,";
	static String ドラ2="ドラ2,ドラドラ,";
	static String ドラ3="ドラ3,";
	static String ドラ4="ドラ4,";
	static String ドラ5="ドラ5,";
	static String ドラ6="ドラ6,";
	static String ドラ7="ドラ7,";
	static String ドラ8="ドラ8,";
	static String ドラ9="ドラ9,";
	static String ドラ10="ドラ10,";
	//1飜
	static String 立直="リーチ,";
	static String 役牌1="一役,1役,";
	static String 断ヤオ九="タンヤオ,";
	static String 平和="ピンフ,";
	static String 門前自摸="";
	static String 一発="一発,";
	static String 一盃口="";
	static String ハイテイロン="";
	static String ハイテイツモ="";
	static String 嶺上開花="";
	static String ダブルリーチ="";
	static String チャンカン="";
	static String 三色同順_喰い="三食,";
	static String 一気通貫_喰い="";
	static String 混全帯ヤオ九_喰い="";
	
	//2飜
	static String 役牌2="二役,2役,";
	static String 対々和="トイトイ,";
	static String 三色同順_門前 ="";
	static String 七対子="";
	static String 一気通貫_門前="";
	static String 混全帯ヤオ九_門前="";
	static String 三暗刻="さんあんこう,";
	static String 小三元="";
	static String 混老頭="";
	static String 三色同刻="";
	static String 三槓子="";
	static String ホンイツ_喰い="";
	static String 清全帯ヤオ九_喰い="";
	
	//3飜
	static String 役牌3="3役,";
	static String ホンイツ_門前="";
	static String 清全帯ヤオ九_門前 ="";
	static String 二盃口="";
	
	//4飜
	static String 役牌4="4役,";

	//5飜
	static String 清一色_喰い="";

	//6飜
	static String 清一色_門前="";
	
	//13飜
	static String 四暗刻="";
	static String 国士無双 ="";
	static String 大三元="";
	static String 四喜和="";
	static String 字一色="";
	static String 清老頭="";
	static String 地和="";
	static String 緑一色="緑一色,";
	static String 九蓮宝燈="";
	static String 四槓子="";
	static String 天和="";

	static void 辞書に追加(MainActivity mv){
		//ドラ
		//if(!((EditText)mv.findViewById(R.id.EditText_dora1)).getText().toString().equals(""))ドラ1.add(""+((EditText)mv.findViewById(R.id.EditText_dora1)).getText().toString()+"");
		if(!((EditText)mv.findViewById(R.id.EditText_dora1)).getText().toString().equals(""))ドラ1+=((EditText)mv.findViewById(R.id.EditText_dora1)).getText().toString()+",";
		if(!((EditText)mv.findViewById(R.id.EditText_dora2)).getText().toString().equals(""))ドラ2+=((EditText)mv.findViewById(R.id.EditText_dora2)).getText().toString()+",";
		if(!((EditText)mv.findViewById(R.id.EditText_dora3)).getText().toString().equals(""))ドラ3+=((EditText)mv.findViewById(R.id.EditText_dora3)).getText().toString()+",";
		if(!((EditText)mv.findViewById(R.id.EditText_dora4)).getText().toString().equals(""))ドラ4+=((EditText)mv.findViewById(R.id.EditText_dora4)).getText().toString()+",";
		if(!((EditText)mv.findViewById(R.id.EditText_dora5)).getText().toString().equals(""))ドラ5+=((EditText)mv.findViewById(R.id.EditText_dora5)).getText().toString()+",";
		if(!((EditText)mv.findViewById(R.id.EditText_dora6)).getText().toString().equals(""))ドラ6+=((EditText)mv.findViewById(R.id.EditText_dora6)).getText().toString()+",";
		if(!((EditText)mv.findViewById(R.id.EditText_dora7)).getText().toString().equals(""))ドラ7+=((EditText)mv.findViewById(R.id.EditText_dora7)).getText().toString()+",";
		if(!((EditText)mv.findViewById(R.id.EditText_dora8)).getText().toString().equals(""))ドラ8+=((EditText)mv.findViewById(R.id.EditText_dora8)).getText().toString()+",";
		if(!((EditText)mv.findViewById(R.id.EditText_dora9)).getText().toString().equals(""))ドラ9+=((EditText)mv.findViewById(R.id.EditText_dora9)).getText().toString()+",";
		if(!((EditText)mv.findViewById(R.id.EditText_dora10)).getText().toString().equals(""))ドラ10+=((EditText)mv.findViewById(R.id.EditText_dora10)).getText().toString()+",";
		((EditText)mv.findViewById(R.id.EditText_dora1)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora2)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora3)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora4)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora5)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora6)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora7)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora8)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora9)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora10)).setText("");
		//1飜
        if(!((EditText)mv.findViewById(R.id.EditText101)).getText().toString().equals(""))立直+=((EditText)mv.findViewById(R.id.EditText101)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText102)).getText().toString().equals(""))役牌1+=((EditText)mv.findViewById(R.id.EditText102)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText103)).getText().toString().equals(""))断ヤオ九+=((EditText)mv.findViewById(R.id.EditText103)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText104)).getText().toString().equals(""))平和+=((EditText)mv.findViewById(R.id.EditText104)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText105)).getText().toString().equals(""))門前自摸+=((EditText)mv.findViewById(R.id.EditText105)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText106)).getText().toString().equals(""))一発+=((EditText)mv.findViewById(R.id.EditText106)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText107)).getText().toString().equals(""))一盃口+=((EditText)mv.findViewById(R.id.EditText107)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText108)).getText().toString().equals(""))ハイテイロン+=((EditText)mv.findViewById(R.id.EditText108)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText109)).getText().toString().equals(""))ハイテイツモ+=((EditText)mv.findViewById(R.id.EditText109)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText110)).getText().toString().equals(""))嶺上開花+=((EditText)mv.findViewById(R.id.EditText110)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText111)).getText().toString().equals(""))ダブルリーチ+=((EditText)mv.findViewById(R.id.EditText111)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText112)).getText().toString().equals(""))チャンカン+=((EditText)mv.findViewById(R.id.EditText112)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText113)).getText().toString().equals(""))三色同順_喰い+=((EditText)mv.findViewById(R.id.EditText113)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText114)).getText().toString().equals(""))一気通貫_喰い+=((EditText)mv.findViewById(R.id.EditText114)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText115)).getText().toString().equals(""))混全帯ヤオ九_喰い+=((EditText)mv.findViewById(R.id.EditText115)).getText().toString()+",";
        ((EditText)mv.findViewById(R.id.EditText101)).setText("");
        ((EditText)mv.findViewById(R.id.EditText102)).setText("");
        ((EditText)mv.findViewById(R.id.EditText103)).setText("");
        ((EditText)mv.findViewById(R.id.EditText104)).setText("");
        ((EditText)mv.findViewById(R.id.EditText105)).setText("");
        ((EditText)mv.findViewById(R.id.EditText106)).setText("");
        ((EditText)mv.findViewById(R.id.EditText107)).setText("");
        ((EditText)mv.findViewById(R.id.EditText108)).setText("");
        ((EditText)mv.findViewById(R.id.EditText109)).setText("");
        ((EditText)mv.findViewById(R.id.EditText110)).setText("");
        ((EditText)mv.findViewById(R.id.EditText111)).setText("");
        ((EditText)mv.findViewById(R.id.EditText112)).setText("");
        ((EditText)mv.findViewById(R.id.EditText113)).setText("");
        ((EditText)mv.findViewById(R.id.EditText114)).setText("");
        ((EditText)mv.findViewById(R.id.EditText115)).setText("");
        //2飜
        if(!((EditText)mv.findViewById(R.id.EditText201)).getText().toString().equals(""))役牌2+=((EditText)mv.findViewById(R.id.EditText201)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText202)).getText().toString().equals(""))対々和+=((EditText)mv.findViewById(R.id.EditText202)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText203)).getText().toString().equals(""))三色同順_門前+=((EditText)mv.findViewById(R.id.EditText203)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText204)).getText().toString().equals(""))七対子+=((EditText)mv.findViewById(R.id.EditText204)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText205)).getText().toString().equals(""))一気通貫_門前+=((EditText)mv.findViewById(R.id.EditText205)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText206)).getText().toString().equals(""))混全帯ヤオ九_門前+=((EditText)mv.findViewById(R.id.EditText206)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText207)).getText().toString().equals(""))三暗刻+=((EditText)mv.findViewById(R.id.EditText207)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText208)).getText().toString().equals(""))小三元+=((EditText)mv.findViewById(R.id.EditText208)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText209)).getText().toString().equals(""))混老頭+=((EditText)mv.findViewById(R.id.EditText209)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText210)).getText().toString().equals(""))三色同刻+=((EditText)mv.findViewById(R.id.EditText210)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText211)).getText().toString().equals(""))三槓子+=((EditText)mv.findViewById(R.id.EditText211)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText212)).getText().toString().equals(""))ホンイツ_喰い+=((EditText)mv.findViewById(R.id.EditText212)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText213)).getText().toString().equals(""))清全帯ヤオ九_喰い+=((EditText)mv.findViewById(R.id.EditText213)).getText().toString()+",";
        ((EditText)mv.findViewById(R.id.EditText201)).setText("");
        ((EditText)mv.findViewById(R.id.EditText202)).setText("");
        ((EditText)mv.findViewById(R.id.EditText203)).setText("");
        ((EditText)mv.findViewById(R.id.EditText204)).setText("");
        ((EditText)mv.findViewById(R.id.EditText205)).setText("");
        ((EditText)mv.findViewById(R.id.EditText206)).setText("");
        ((EditText)mv.findViewById(R.id.EditText207)).setText("");
        ((EditText)mv.findViewById(R.id.EditText208)).setText("");
        ((EditText)mv.findViewById(R.id.EditText209)).setText("");
        ((EditText)mv.findViewById(R.id.EditText210)).setText("");
        ((EditText)mv.findViewById(R.id.EditText211)).setText("");
        ((EditText)mv.findViewById(R.id.EditText212)).setText("");
        ((EditText)mv.findViewById(R.id.EditText213)).setText("");
        //3飜
        if(!((EditText)mv.findViewById(R.id.EditText301)).getText().toString().equals(""))役牌3+=((EditText)mv.findViewById(R.id.EditText301)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText302)).getText().toString().equals(""))ホンイツ_門前+=((EditText)mv.findViewById(R.id.EditText302)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText303)).getText().toString().equals(""))清全帯ヤオ九_門前+=((EditText)mv.findViewById(R.id.EditText303)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText304)).getText().toString().equals(""))二盃口+=((EditText)mv.findViewById(R.id.EditText304)).getText().toString()+",";
        ((EditText)mv.findViewById(R.id.EditText301)).setText("");
        ((EditText)mv.findViewById(R.id.EditText302)).setText("");
        ((EditText)mv.findViewById(R.id.EditText303)).setText("");
        ((EditText)mv.findViewById(R.id.EditText304)).setText("");
        //4飜
        if(!((EditText)mv.findViewById(R.id.EditText401)).getText().toString().equals(""))役牌4+=((EditText)mv.findViewById(R.id.EditText401)).getText().toString()+",";
        ((EditText)mv.findViewById(R.id.EditText401)).setText("");
        //5飜
        if(!((EditText)mv.findViewById(R.id.EditText501)).getText().toString().equals(""))清一色_喰い+=((EditText)mv.findViewById(R.id.EditText501)).getText().toString()+",";
        ((EditText)mv.findViewById(R.id.EditText501)).setText("");
        //6飜
        if(!((EditText)mv.findViewById(R.id.EditText601)).getText().toString().equals(""))清一色_門前+=((EditText)mv.findViewById(R.id.EditText601)).getText().toString()+",";
        ((EditText)mv.findViewById(R.id.EditText601)).setText(""); 
        //13飜
        if(!((EditText)mv.findViewById(R.id.EditText1301)).getText().toString().equals(""))四暗刻+=((EditText)mv.findViewById(R.id.EditText1301)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText1302)).getText().toString().equals(""))国士無双+=((EditText)mv.findViewById(R.id.EditText1302)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText1303)).getText().toString().equals(""))大三元+=((EditText)mv.findViewById(R.id.EditText1303)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText1304)).getText().toString().equals(""))四喜和+=((EditText)mv.findViewById(R.id.EditText1304)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText1305)).getText().toString().equals(""))字一色+=((EditText)mv.findViewById(R.id.EditText1305)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText1306)).getText().toString().equals(""))清老頭+=((EditText)mv.findViewById(R.id.EditText1306)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText1307)).getText().toString().equals(""))地和+=((EditText)mv.findViewById(R.id.EditText1307)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText1308)).getText().toString().equals(""))緑一色+=((EditText)mv.findViewById(R.id.EditText1308)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText1309)).getText().toString().equals(""))九蓮宝燈+=((EditText)mv.findViewById(R.id.EditText1309)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText1310)).getText().toString().equals(""))四槓子+=((EditText)mv.findViewById(R.id.EditText1310)).getText().toString()+",";
        if(!((EditText)mv.findViewById(R.id.EditText1311)).getText().toString().equals(""))天和+=((EditText)mv.findViewById(R.id.EditText1311)).getText().toString()+",";
        ((EditText)mv.findViewById(R.id.EditText1301)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1302)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1303)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1304)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1305)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1306)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1307)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1308)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1309)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1310)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1311)).setText("");
		        
        辞書をコミット(mv);
        辞書内容表示の更新(mv);
	}
	static void 辞書から削除(MainActivity mv){
		//ドラ
		//if(!((EditText)mv.findViewById(R.id.EditText_dora1)).getText().toString().equals(""))ドラ1.remove(""+((EditText)mv.findViewById(R.id.EditText_dora1)).getText().toString()+"");
		if(!((EditText)mv.findViewById(R.id.EditText_dora1)).getText().toString().equals(""))for(int i=0;i<ドラ1.split(",",0).length;i++)if(ドラ1.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText_dora1)).getText().toString()))ドラ1=ドラ1.replaceAll(((EditText)mv.findViewById(R.id.EditText_dora1)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText_dora2)).getText().toString().equals(""))for(int i=0;i<ドラ2.split(",",0).length;i++)if(ドラ2.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText_dora2)).getText().toString()))ドラ2=ドラ2.replaceAll(((EditText)mv.findViewById(R.id.EditText_dora2)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText_dora3)).getText().toString().equals(""))for(int i=0;i<ドラ3.split(",",0).length;i++)if(ドラ3.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText_dora3)).getText().toString()))ドラ3=ドラ3.replaceAll(((EditText)mv.findViewById(R.id.EditText_dora3)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText_dora4)).getText().toString().equals(""))for(int i=0;i<ドラ4.split(",",0).length;i++)if(ドラ4.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText_dora4)).getText().toString()))ドラ4=ドラ4.replaceAll(((EditText)mv.findViewById(R.id.EditText_dora4)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText_dora5)).getText().toString().equals(""))for(int i=0;i<ドラ5.split(",",0).length;i++)if(ドラ5.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText_dora5)).getText().toString()))ドラ5=ドラ5.replaceAll(((EditText)mv.findViewById(R.id.EditText_dora5)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText_dora6)).getText().toString().equals(""))for(int i=0;i<ドラ6.split(",",0).length;i++)if(ドラ6.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText_dora6)).getText().toString()))ドラ6=ドラ6.replaceAll(((EditText)mv.findViewById(R.id.EditText_dora6)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText_dora7)).getText().toString().equals(""))for(int i=0;i<ドラ7.split(",",0).length;i++)if(ドラ7.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText_dora7)).getText().toString()))ドラ7=ドラ7.replaceAll(((EditText)mv.findViewById(R.id.EditText_dora7)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText_dora8)).getText().toString().equals(""))for(int i=0;i<ドラ8.split(",",0).length;i++)if(ドラ8.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText_dora8)).getText().toString()))ドラ8=ドラ8.replaceAll(((EditText)mv.findViewById(R.id.EditText_dora8)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText_dora9)).getText().toString().equals(""))for(int i=0;i<ドラ9.split(",",0).length;i++)if(ドラ9.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText_dora9)).getText().toString()))ドラ9=ドラ9.replaceAll(((EditText)mv.findViewById(R.id.EditText_dora9)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText_dora10)).getText().toString().equals(""))for(int i=0;i<ドラ10.split(",",0).length;i++)if(ドラ10.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText_dora10)).getText().toString()))ドラ10=ドラ10.replaceAll(((EditText)mv.findViewById(R.id.EditText_dora10)).getText().toString()+",","");
		((EditText)mv.findViewById(R.id.EditText_dora1)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora2)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora3)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora4)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora5)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora6)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora7)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora8)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora9)).setText("");
		((EditText)mv.findViewById(R.id.EditText_dora10)).setText("");
        //1飜
		if(!((EditText)mv.findViewById(R.id.EditText101)).getText().toString().equals(""))for(int i=0;i<立直.split(",",0).length;i++)if(立直.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText101)).getText().toString()))立直=立直.replaceAll(((EditText)mv.findViewById(R.id.EditText101)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText102)).getText().toString().equals(""))for(int i=0;i<役牌1.split(",",0).length;i++)if(役牌1.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText102)).getText().toString()))役牌1=役牌1.replaceAll(((EditText)mv.findViewById(R.id.EditText102)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText103)).getText().toString().equals(""))for(int i=0;i<断ヤオ九.split(",",0).length;i++)if(断ヤオ九.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText103)).getText().toString()))断ヤオ九=断ヤオ九.replaceAll(((EditText)mv.findViewById(R.id.EditText103)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText104)).getText().toString().equals(""))for(int i=0;i<平和.split(",",0).length;i++)if(平和.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText104)).getText().toString()))平和=平和.replaceAll(((EditText)mv.findViewById(R.id.EditText104)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText105)).getText().toString().equals(""))for(int i=0;i<門前自摸.split(",",0).length;i++)if(門前自摸.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText105)).getText().toString()))門前自摸=門前自摸.replaceAll(((EditText)mv.findViewById(R.id.EditText105)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText106)).getText().toString().equals(""))for(int i=0;i<一発.split(",",0).length;i++)if(一発.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText106)).getText().toString()))一発=一発.replaceAll(((EditText)mv.findViewById(R.id.EditText106)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText107)).getText().toString().equals(""))for(int i=0;i<一盃口.split(",",0).length;i++)if(一盃口.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText107)).getText().toString()))一盃口=一盃口.replaceAll(((EditText)mv.findViewById(R.id.EditText107)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText108)).getText().toString().equals(""))for(int i=0;i<ハイテイロン.split(",",0).length;i++)if(ハイテイロン.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText108)).getText().toString()))ハイテイロン=ハイテイロン.replaceAll(((EditText)mv.findViewById(R.id.EditText108)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText109)).getText().toString().equals(""))for(int i=0;i<ハイテイツモ.split(",",0).length;i++)if(ハイテイツモ.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText109)).getText().toString()))ハイテイツモ=ハイテイツモ.replaceAll(((EditText)mv.findViewById(R.id.EditText109)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText110)).getText().toString().equals(""))for(int i=0;i<嶺上開花.split(",",0).length;i++)if(嶺上開花.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText110)).getText().toString()))嶺上開花=嶺上開花.replaceAll(((EditText)mv.findViewById(R.id.EditText110)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText111)).getText().toString().equals(""))for(int i=0;i<ダブルリーチ.split(",",0).length;i++)if(ダブルリーチ.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText111)).getText().toString()))ダブルリーチ=ダブルリーチ.replaceAll(((EditText)mv.findViewById(R.id.EditText111)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText112)).getText().toString().equals(""))for(int i=0;i<チャンカン.split(",",0).length;i++)if(チャンカン.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText112)).getText().toString()))チャンカン=チャンカン.replaceAll(((EditText)mv.findViewById(R.id.EditText112)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText113)).getText().toString().equals(""))for(int i=0;i<三色同順_喰い.split(",",0).length;i++)if(三色同順_喰い.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText113)).getText().toString()))三色同順_喰い=三色同順_喰い.replaceAll(((EditText)mv.findViewById(R.id.EditText113)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText114)).getText().toString().equals(""))for(int i=0;i<一気通貫_喰い.split(",",0).length;i++)if(一気通貫_喰い.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText114)).getText().toString()))一気通貫_喰い=一気通貫_喰い.replaceAll(((EditText)mv.findViewById(R.id.EditText114)).getText().toString()+",","");
		if(!((EditText)mv.findViewById(R.id.EditText115)).getText().toString().equals(""))for(int i=0;i<混全帯ヤオ九_喰い.split(",",0).length;i++)if(混全帯ヤオ九_喰い.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText115)).getText().toString()))混全帯ヤオ九_喰い=混全帯ヤオ九_喰い.replaceAll(((EditText)mv.findViewById(R.id.EditText115)).getText().toString()+",","");
        ((EditText)mv.findViewById(R.id.EditText101)).setText("");
        ((EditText)mv.findViewById(R.id.EditText102)).setText("");
        ((EditText)mv.findViewById(R.id.EditText103)).setText("");
        ((EditText)mv.findViewById(R.id.EditText104)).setText("");
        ((EditText)mv.findViewById(R.id.EditText105)).setText("");
        ((EditText)mv.findViewById(R.id.EditText106)).setText("");
        ((EditText)mv.findViewById(R.id.EditText107)).setText("");
        ((EditText)mv.findViewById(R.id.EditText108)).setText("");
        ((EditText)mv.findViewById(R.id.EditText109)).setText("");
        ((EditText)mv.findViewById(R.id.EditText110)).setText("");
        ((EditText)mv.findViewById(R.id.EditText111)).setText("");
        ((EditText)mv.findViewById(R.id.EditText112)).setText("");
        ((EditText)mv.findViewById(R.id.EditText113)).setText("");
        ((EditText)mv.findViewById(R.id.EditText114)).setText("");
        ((EditText)mv.findViewById(R.id.EditText115)).setText("");
        //2飜
        if(!((EditText)mv.findViewById(R.id.EditText201)).getText().toString().equals(""))for(int i=0;i<役牌2.split(",",0).length;i++)if(役牌2.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText201)).getText().toString()))役牌2=役牌2.replaceAll(((EditText)mv.findViewById(R.id.EditText201)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText202)).getText().toString().equals(""))for(int i=0;i<対々和.split(",",0).length;i++)if(対々和.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText202)).getText().toString()))対々和=対々和.replaceAll(((EditText)mv.findViewById(R.id.EditText202)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText203)).getText().toString().equals(""))for(int i=0;i<三色同順_門前.split(",",0).length;i++)if(三色同順_門前.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText203)).getText().toString()))三色同順_門前=三色同順_門前.replaceAll(((EditText)mv.findViewById(R.id.EditText203)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText204)).getText().toString().equals(""))for(int i=0;i<七対子.split(",",0).length;i++)if(七対子.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText204)).getText().toString()))七対子=七対子.replaceAll(((EditText)mv.findViewById(R.id.EditText204)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText205)).getText().toString().equals(""))for(int i=0;i<一気通貫_門前.split(",",0).length;i++)if(一気通貫_門前.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText205)).getText().toString()))一気通貫_門前=一気通貫_門前.replaceAll(((EditText)mv.findViewById(R.id.EditText205)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText206)).getText().toString().equals(""))for(int i=0;i<混全帯ヤオ九_門前.split(",",0).length;i++)if(混全帯ヤオ九_門前.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText206)).getText().toString()))混全帯ヤオ九_門前=混全帯ヤオ九_門前.replaceAll(((EditText)mv.findViewById(R.id.EditText206)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText207)).getText().toString().equals(""))for(int i=0;i<三暗刻.split(",",0).length;i++)if(三暗刻.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText207)).getText().toString()))三暗刻=三暗刻.replaceAll(((EditText)mv.findViewById(R.id.EditText207)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText208)).getText().toString().equals(""))for(int i=0;i<小三元.split(",",0).length;i++)if(小三元.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText208)).getText().toString()))小三元=小三元.replaceAll(((EditText)mv.findViewById(R.id.EditText208)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText209)).getText().toString().equals(""))for(int i=0;i<混老頭.split(",",0).length;i++)if(混老頭.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText209)).getText().toString()))混老頭=混老頭.replaceAll(((EditText)mv.findViewById(R.id.EditText209)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText210)).getText().toString().equals(""))for(int i=0;i<三色同刻.split(",",0).length;i++)if(三色同刻.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText210)).getText().toString()))三色同刻=三色同刻.replaceAll(((EditText)mv.findViewById(R.id.EditText210)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText211)).getText().toString().equals(""))for(int i=0;i<三槓子.split(",",0).length;i++)if(三槓子.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText211)).getText().toString()))三槓子=三槓子.replaceAll(((EditText)mv.findViewById(R.id.EditText211)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText212)).getText().toString().equals(""))for(int i=0;i<ホンイツ_喰い.split(",",0).length;i++)if(ホンイツ_喰い.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText212)).getText().toString()))ホンイツ_喰い=ホンイツ_喰い.replaceAll(((EditText)mv.findViewById(R.id.EditText212)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText213)).getText().toString().equals(""))for(int i=0;i<清全帯ヤオ九_喰い.split(",",0).length;i++)if(清全帯ヤオ九_喰い.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText213)).getText().toString()))清全帯ヤオ九_喰い=清全帯ヤオ九_喰い.replaceAll(((EditText)mv.findViewById(R.id.EditText213)).getText().toString()+",","");
        ((EditText)mv.findViewById(R.id.EditText201)).setText("");
        ((EditText)mv.findViewById(R.id.EditText202)).setText("");
        ((EditText)mv.findViewById(R.id.EditText203)).setText("");
        ((EditText)mv.findViewById(R.id.EditText204)).setText("");
        ((EditText)mv.findViewById(R.id.EditText205)).setText("");
        ((EditText)mv.findViewById(R.id.EditText206)).setText("");
        ((EditText)mv.findViewById(R.id.EditText207)).setText("");
        ((EditText)mv.findViewById(R.id.EditText208)).setText("");
        ((EditText)mv.findViewById(R.id.EditText209)).setText("");
        ((EditText)mv.findViewById(R.id.EditText210)).setText("");
        ((EditText)mv.findViewById(R.id.EditText211)).setText("");
        ((EditText)mv.findViewById(R.id.EditText212)).setText("");
        ((EditText)mv.findViewById(R.id.EditText213)).setText("");
        //3飜
        if(!((EditText)mv.findViewById(R.id.EditText301)).getText().toString().equals(""))for(int i=0;i<役牌3.split(",",0).length;i++)if(役牌3.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText301)).getText().toString()))役牌3=役牌3.replaceAll(((EditText)mv.findViewById(R.id.EditText301)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText302)).getText().toString().equals(""))for(int i=0;i<ホンイツ_門前.split(",",0).length;i++)if(ホンイツ_門前.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText302)).getText().toString()))ホンイツ_門前=ホンイツ_門前.replaceAll(((EditText)mv.findViewById(R.id.EditText302)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText303)).getText().toString().equals(""))for(int i=0;i<清全帯ヤオ九_門前.split(",",0).length;i++)if(清全帯ヤオ九_門前.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText303)).getText().toString()))清全帯ヤオ九_門前=清全帯ヤオ九_門前.replaceAll(((EditText)mv.findViewById(R.id.EditText303)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText304)).getText().toString().equals(""))for(int i=0;i<二盃口.split(",",0).length;i++)if(二盃口.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText304)).getText().toString()))二盃口=二盃口.replaceAll(((EditText)mv.findViewById(R.id.EditText304)).getText().toString()+",","");
        ((EditText)mv.findViewById(R.id.EditText301)).setText("");
        ((EditText)mv.findViewById(R.id.EditText302)).setText("");
        ((EditText)mv.findViewById(R.id.EditText303)).setText("");
        ((EditText)mv.findViewById(R.id.EditText304)).setText("");
        //4飜
        if(!((EditText)mv.findViewById(R.id.EditText401)).getText().toString().equals(""))for(int i=0;i<役牌4.split(",",0).length;i++)if(役牌4.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText401)).getText().toString()))役牌4=役牌4.replaceAll(((EditText)mv.findViewById(R.id.EditText401)).getText().toString()+",","");
        ((EditText)mv.findViewById(R.id.EditText401)).setText("");
        //5飜
        if(!((EditText)mv.findViewById(R.id.EditText501)).getText().toString().equals(""))for(int i=0;i<清一色_喰い.split(",",0).length;i++)if(清一色_喰い.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText501)).getText().toString()))清一色_喰い=清一色_喰い.replaceAll(((EditText)mv.findViewById(R.id.EditText501)).getText().toString()+",","");
        ((EditText)mv.findViewById(R.id.EditText501)).setText("");
        //6飜
        if(!((EditText)mv.findViewById(R.id.EditText601)).getText().toString().equals(""))for(int i=0;i<清一色_門前.split(",",0).length;i++)if(清一色_門前.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText601)).getText().toString()))清一色_門前=清一色_門前.replaceAll(((EditText)mv.findViewById(R.id.EditText601)).getText().toString()+",","");
        ((EditText)mv.findViewById(R.id.EditText601)).setText(""); 
        //13飜
        if(!((EditText)mv.findViewById(R.id.EditText1301)).getText().toString().equals(""))for(int i=0;i<四暗刻.split(",",0).length;i++)if(四暗刻.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText1301)).getText().toString()))四暗刻=四暗刻.replaceAll(((EditText)mv.findViewById(R.id.EditText1301)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText1302)).getText().toString().equals(""))for(int i=0;i<国士無双.split(",",0).length;i++)if(国士無双.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText1302)).getText().toString()))国士無双=国士無双.replaceAll(((EditText)mv.findViewById(R.id.EditText1302)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText1303)).getText().toString().equals(""))for(int i=0;i<大三元.split(",",0).length;i++)if(大三元.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText1303)).getText().toString()))大三元=大三元.replaceAll(((EditText)mv.findViewById(R.id.EditText1303)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText1304)).getText().toString().equals(""))for(int i=0;i<四喜和.split(",",0).length;i++)if(四喜和.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText1304)).getText().toString()))四喜和=四喜和.replaceAll(((EditText)mv.findViewById(R.id.EditText1304)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText1305)).getText().toString().equals(""))for(int i=0;i<字一色.split(",",0).length;i++)if(字一色.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText1305)).getText().toString()))字一色=字一色.replaceAll(((EditText)mv.findViewById(R.id.EditText1305)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText1306)).getText().toString().equals(""))for(int i=0;i<清老頭.split(",",0).length;i++)if(清老頭.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText1306)).getText().toString()))清老頭=清老頭.replaceAll(((EditText)mv.findViewById(R.id.EditText1306)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText1307)).getText().toString().equals(""))for(int i=0;i<地和.split(",",0).length;i++)if(地和.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText1307)).getText().toString()))地和=地和.replaceAll(((EditText)mv.findViewById(R.id.EditText1307)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText1308)).getText().toString().equals(""))for(int i=0;i<緑一色.split(",",0).length;i++)if(緑一色.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText1308)).getText().toString()))緑一色=緑一色.replaceAll(((EditText)mv.findViewById(R.id.EditText1308)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText1309)).getText().toString().equals(""))for(int i=0;i<九蓮宝燈.split(",",0).length;i++)if(九蓮宝燈.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText1309)).getText().toString()))九蓮宝燈=九蓮宝燈.replaceAll(((EditText)mv.findViewById(R.id.EditText1309)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText1310)).getText().toString().equals(""))for(int i=0;i<四槓子.split(",",0).length;i++)if(四槓子.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText1310)).getText().toString()))四槓子=四槓子.replaceAll(((EditText)mv.findViewById(R.id.EditText1310)).getText().toString()+",","");
        if(!((EditText)mv.findViewById(R.id.EditText1311)).getText().toString().equals(""))for(int i=0;i<天和.split(",",0).length;i++)if(天和.split(",",0)[i].equals(((EditText)mv.findViewById(R.id.EditText1311)).getText().toString()))天和=天和.replaceAll(((EditText)mv.findViewById(R.id.EditText1311)).getText().toString()+",","");
        ((EditText)mv.findViewById(R.id.EditText1301)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1302)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1303)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1304)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1305)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1306)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1307)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1308)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1309)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1310)).setText("");
        ((EditText)mv.findViewById(R.id.EditText1311)).setText("");
        
        辞書をコミット(mv);
        辞書内容表示の更新(mv);
	}
	@SuppressLint("NewApi")
	static void 辞書をコミット(MainActivity mv){
		//SharedPreferences sp = mv.getSharedPreferences("dictionary_sp",Context.MODE_PRIVATE);
		//SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mv);
		SharedPreferences.Editor editor=SP.edit();
		//editor.putStringSet("ドラ1",ドラ1);
		editor.putString("ドラ1",ドラ1);
		editor.putString("ドラ2",ドラ2);
		editor.putString("ドラ3",ドラ3);
		editor.putString("ドラ4",ドラ4);
		editor.putString("ドラ5",ドラ5);
		editor.putString("ドラ6",ドラ6);
		editor.putString("ドラ7",ドラ7);
		editor.putString("ドラ8",ドラ8);
		editor.putString("ドラ9",ドラ9);
		editor.putString("ドラ10",ドラ10);
		
        editor.putString("立直",立直);
        editor.putString("役牌1",役牌1);
        editor.putString("断ヤオ九",断ヤオ九);
        editor.putString("平和",平和);
        editor.putString("門前自摸",門前自摸);
        editor.putString("一発",一発);
        editor.putString("一盃口",一盃口);
        editor.putString("ハイテイロン",ハイテイロン);
        editor.putString("ハイテイツモ",ハイテイツモ);
        editor.putString("嶺上開花",嶺上開花);
        editor.putString("ダブルリーチ",ダブルリーチ);
        editor.putString("チャンカン",チャンカン);
        editor.putString("三色同順_喰い",三色同順_喰い);
        editor.putString("一気通貫_喰い",一気通貫_喰い);
        editor.putString("混全帯ヤオ九_喰い",混全帯ヤオ九_喰い);
		
		editor.putString("役牌2",役牌2);
        editor.putString("対々和",対々和);
        editor.putString("三色同順_門前",三色同順_門前);
        editor.putString("七対子",七対子);
        editor.putString("一気通貫_門前",一気通貫_門前);
        editor.putString("混全帯ヤオ九_門前",混全帯ヤオ九_門前);
        editor.putString("三暗刻",三暗刻);
        editor.putString("小三元",小三元);
        editor.putString("混老頭",混老頭);
        editor.putString("三色同刻",三色同刻);
        editor.putString("三槓子",三槓子);
        editor.putString("ホンイツ_喰い",ホンイツ_喰い);
        editor.putString("清全帯ヤオ九_喰い",清全帯ヤオ九_喰い);
		
		editor.putString("役牌3",役牌3);
        editor.putString("ホンイツ_門前",ホンイツ_門前);
        editor.putString("清全帯ヤオ九_門前",清全帯ヤオ九_門前);
        editor.putString("二盃口",二盃口);
		
		editor.putString("役牌4",役牌4);
		
		editor.putString("清一色_喰い",清一色_喰い);
		
		editor.putString("清一色_門前",清一色_門前);
		
        editor.putString("四暗刻",四暗刻);
        editor.putString("国士無双",国士無双);
        editor.putString("大三元",大三元);
        editor.putString("四喜和",四喜和);
        editor.putString("字一色",字一色);
        editor.putString("清老頭",清老頭);
        editor.putString("地和",地和);
        editor.putString("緑一色",緑一色);
        editor.putString("九蓮宝燈",九蓮宝燈);
        editor.putString("四槓子",四槓子);
        editor.putString("天和",天和);
        
        editor.apply();
	}

	static void 辞書内容表示の更新(MainActivity mv){
		//SharedPreferences sp = mv.getSharedPreferences("dictionary_sp",Context.MODE_PRIVATE);
		//SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mv);
		辞書内容="";
		//while(sp.getStringSet("ドラ1", ドラ1).iterator().hasNext())辞書内容+=sp.getStringSet("ドラ1", ドラ1).iterator().next();辞書内容+="\n";
//		辞書内容+="[ドラ1] = "+sp.getString("ドラ1", ドラ1)+"\n";//第2引数は存在しなかった時の返り値
//		辞書内容+="[ドラ2] = "+sp.getString("ドラ2", ドラ2)+"\n";
//		辞書内容+="[ドラ3] = "+sp.getString("ドラ3", ドラ3)+"\n";
//		辞書内容+="[ドラ4] = "+sp.getString("ドラ4", ドラ4)+"\n";
//		辞書内容+="[ドラ5] = "+sp.getString("ドラ5", ドラ5)+"\n";
//		辞書内容+="[ドラ6] = "+sp.getString("ドラ6", ドラ6)+"\n";
//		辞書内容+="[ドラ7] = "+sp.getString("ドラ7", ドラ7)+"\n";
//		辞書内容+="[ドラ8] = "+sp.getString("ドラ8", ドラ8)+"\n";
//		辞書内容+="[ドラ9] = "+sp.getString("ドラ9", ドラ9)+"\n";
//		辞書内容+="[ドラ10] = "+sp.getString("ドラ10", ドラ10)+"\n";
//		辞書内容+="[立直] = "+sp.getString("立直", 立直)+"\n";
//		辞書内容+="[役牌1] = "+sp.getString("役牌1", 役牌1)+"\n";
//		辞書内容+="[断ヤオ九] = "+sp.getString("断ヤオ九", 断ヤオ九)+"\n";
//		辞書内容+="[平和] = "+sp.getString("平和", 平和)+"\n";
//		辞書内容+="[門前自摸] = "+sp.getString("門前自摸", 門前自摸)+"\n";
//		辞書内容+="[一発] = "+sp.getString("一発", 一発)+"\n";
//		辞書内容+="[一盃口] = "+sp.getString("一盃口", 一盃口)+"\n";
//		辞書内容+="[ハイテイロン] = "+sp.getString("ハイテイロン", ハイテイロン)+"\n";
//		辞書内容+="[ハイテイツモ] = "+sp.getString("ハイテイツモ", ハイテイツモ)+"\n";
//		辞書内容+="[嶺上開花] = "+sp.getString("嶺上開花", 嶺上開花)+"\n";
//		辞書内容+="[ダブルリーチ] = "+sp.getString("ダブルリーチ", ダブルリーチ)+"\n";
//		辞書内容+="[チャンカン] = "+sp.getString("チャンカン", チャンカン)+"\n";
//		辞書内容+="[三色同順_喰い] = "+sp.getString("三色同順_喰い", 三色同順_喰い)+"\n";
//		辞書内容+="[一気通貫_喰い] = "+sp.getString("一気通貫_喰い", 一気通貫_喰い)+"\n";
//		辞書内容+="[混全帯ヤオ九_喰い] = "+sp.getString("混全帯ヤオ九_喰い", 混全帯ヤオ九_喰い)+"\n";
//		
//		辞書内容+="[役牌2] = "+sp.getString("役牌2", 役牌2)+"\n";
//		辞書内容+="[対々和] = "+sp.getString("対々和", 対々和)+"\n";
//		辞書内容+="[三色同順_門前] = "+sp.getString("三色同順_門前", 三色同順_門前)+"\n";
//		辞書内容+="[七対子] = "+sp.getString("七対子", 七対子)+"\n";
//		辞書内容+="[一気通貫_門前] = "+sp.getString("一気通貫_門前", 一気通貫_門前)+"\n";
//		辞書内容+="[混全帯ヤオ九_門前] = "+sp.getString("混全帯ヤオ九_門前", 混全帯ヤオ九_門前)+"\n";
//		辞書内容+="[三暗刻] = "+sp.getString("三暗刻", 三暗刻)+"\n";
//		辞書内容+="[小三元] = "+sp.getString("小三元", 小三元)+"\n";
//		辞書内容+="[混老頭] = "+sp.getString("混老頭", 混老頭)+"\n";
//		辞書内容+="[三色同刻] = "+sp.getString("三色同刻", 三色同刻)+"\n";
//		辞書内容+="[三槓子] = "+sp.getString("三槓子", 三槓子)+"\n";
//		辞書内容+="[ホンイツ_喰い] = "+sp.getString("ホンイツ_喰い", ホンイツ_喰い)+"\n";
//		辞書内容+="[清全帯ヤオ九_喰い] = "+sp.getString("清全帯ヤオ九_喰い", 清全帯ヤオ九_喰い)+"\n";
//		
//		辞書内容+="[役牌3] = "+sp.getString("役牌3", 役牌3)+"\n";
//		辞書内容+="[ホンイツ_門前] = "+sp.getString("ホンイツ_門前", ホンイツ_門前)+"\n";
//		辞書内容+="[清全帯ヤオ九_門前] = "+sp.getString("清全帯ヤオ九_門前", 清全帯ヤオ九_門前)+"\n";
//		辞書内容+="[二盃口] = "+sp.getString("二盃口", 二盃口)+"\n";
//
//		辞書内容+="[役牌4] = "+sp.getString("役牌4", 役牌4)+"\n";
//		
//		辞書内容+="[清一色_喰い] = "+sp.getString("清一色_喰い", 清一色_喰い)+"\n";
//		
//		辞書内容+="[清一色_門前] = "+sp.getString("清一色_門前", 清一色_門前)+"\n";
//
//		辞書内容+="[四暗刻] = "+sp.getString("四暗刻", 四暗刻)+"\n";
//		辞書内容+="[国士無双] = "+sp.getString("国士無双", 国士無双)+"\n";
//		辞書内容+="[大三元] = "+sp.getString("大三元", 大三元)+"\n";
//		辞書内容+="[四喜和] = "+sp.getString("四喜和", 四喜和)+"\n";
//		辞書内容+="[字一色] = "+sp.getString("字一色", 字一色)+"\n";
//		辞書内容+="[清老頭] = "+sp.getString("清老頭", 清老頭)+"\n";
//		辞書内容+="[地和] = "+sp.getString("地和", 地和)+"\n";
//		辞書内容+="[緑一色] = "+sp.getString("緑一色", 緑一色)+"\n";
//		辞書内容+="[九蓮宝燈] = "+sp.getString("九蓮宝燈", 九蓮宝燈)+"\n";
//		辞書内容+="[四槓子] = "+sp.getString("四槓子", 四槓子)+"\n";
//		辞書内容+="[天和] = "+sp.getString("天和", 天和)+"\n";
		辞書内容+="[ドラ1] = "+ドラ1+"\n";//第2引数は存在しなかった時の返り値
		辞書内容+="[ドラ2] = "+ドラ2+"\n";
		辞書内容+="[ドラ3] = "+ドラ3+"\n";
		辞書内容+="[ドラ4] = "+ドラ4+"\n";
		辞書内容+="[ドラ5] = "+ドラ5+"\n";
		辞書内容+="[ドラ6] = "+ドラ6+"\n";
		辞書内容+="[ドラ7] = "+ドラ7+"\n";
		辞書内容+="[ドラ8] = "+ドラ8+"\n";
		辞書内容+="[ドラ9] = "+ドラ9+"\n";
		辞書内容+="[ドラ10] = "+ドラ10+"\n";
		辞書内容+="[立直] = "+立直+"\n";
		辞書内容+="[役牌1] = "+役牌1+"\n";
		辞書内容+="[断ヤオ九] = "+断ヤオ九+"\n";
		辞書内容+="[平和] = "+平和+"\n";
		辞書内容+="[門前自摸] = "+門前自摸+"\n";
		辞書内容+="[一発] = "+一発+"\n";
		辞書内容+="[一盃口] = "+一盃口+"\n";
		辞書内容+="[ハイテイロン] = "+ハイテイロン+"\n";
		辞書内容+="[ハイテイツモ] = "+ハイテイツモ+"\n";
		辞書内容+="[嶺上開花] = "+嶺上開花+"\n";
		辞書内容+="[ダブルリーチ] = "+ダブルリーチ+"\n";
		辞書内容+="[チャンカン] = "+チャンカン+"\n";
		辞書内容+="[三色同順_喰い] = "+三色同順_喰い+"\n";
		辞書内容+="[一気通貫_喰い] = "+一気通貫_喰い+"\n";
		辞書内容+="[混全帯ヤオ九_喰い] = "+混全帯ヤオ九_喰い+"\n";
		
		辞書内容+="[役牌2] = "+役牌2+"\n";
		辞書内容+="[対々和] = "+対々和+"\n";
		辞書内容+="[三色同順_門前] = "+三色同順_門前+"\n";
		辞書内容+="[七対子] = "+七対子+"\n";
		辞書内容+="[一気通貫_門前] = "+一気通貫_門前+"\n";
		辞書内容+="[混全帯ヤオ九_門前] = "+混全帯ヤオ九_門前+"\n";
		辞書内容+="[三暗刻] = "+三暗刻+"\n";
		辞書内容+="[小三元] = "+小三元+"\n";
		辞書内容+="[混老頭] = "+混老頭+"\n";
		辞書内容+="[三色同刻] = "+三色同刻+"\n";
		辞書内容+="[三槓子] = "+三槓子+"\n";
		辞書内容+="[ホンイツ_喰い] = "+ホンイツ_喰い+"\n";
		辞書内容+="[清全帯ヤオ九_喰い] = "+清全帯ヤオ九_喰い+"\n";
		
		辞書内容+="[役牌3] = "+役牌3+"\n";
		辞書内容+="[ホンイツ_門前] = "+ホンイツ_門前+"\n";
		辞書内容+="[清全帯ヤオ九_門前] = "+清全帯ヤオ九_門前+"\n";
		辞書内容+="[二盃口] = "+二盃口+"\n";

		辞書内容+="[役牌4] = "+役牌4+"\n";
		
		辞書内容+="[清一色_喰い] = "+清一色_喰い+"\n";
		
		辞書内容+="[清一色_門前] = "+清一色_門前+"\n";

		辞書内容+="[四暗刻] = "+四暗刻+"\n";
		辞書内容+="[国士無双] = "+国士無双+"\n";
		辞書内容+="[大三元] = "+大三元+"\n";
		辞書内容+="[四喜和] = "+四喜和+"\n";
		辞書内容+="[字一色] = "+字一色+"\n";
		辞書内容+="[清老頭] = "+清老頭+"\n";
		辞書内容+="[地和] = "+地和+"\n";
		辞書内容+="[緑一色] = "+緑一色+"\n";
		辞書内容+="[九蓮宝燈] = "+九蓮宝燈+"\n";
		辞書内容+="[四槓子] = "+四槓子+"\n";
		辞書内容+="[天和] = "+天和+"\n";		
		((TextView)mv.findViewById(R.id.TextView_show)).setText(辞書内容);
	}
	
	static void 辞書内容をローカルに比較して読み込み(MainActivity mv){
		
		ドラ1=重複回避(mv,"ドラ1",ドラ1);//String型は渡しても参照されないらしい
		ドラ2=重複回避(mv,"ドラ2",ドラ2);
		ドラ3=重複回避(mv,"ドラ3",ドラ3);
		ドラ4=重複回避(mv,"ドラ4",ドラ4);
		ドラ5=重複回避(mv,"ドラ5",ドラ5);
		ドラ6=重複回避(mv,"ドラ6",ドラ6);
		ドラ7=重複回避(mv,"ドラ7",ドラ7);
		ドラ8=重複回避(mv,"ドラ8",ドラ8);
		ドラ9=重複回避(mv,"ドラ9",ドラ9);
		ドラ10=重複回避(mv,"ドラ10",ドラ10);
		
		立直=重複回避(mv,"立直",立直);
		役牌1=重複回避(mv,"役牌1",役牌1);
		断ヤオ九=重複回避(mv,"断ヤオ九",断ヤオ九);
		平和=重複回避(mv,"平和",平和);
		門前自摸=重複回避(mv,"門前自摸",門前自摸);
		一発=重複回避(mv,"一発",一発);
		一盃口=重複回避(mv,"一盃口",一盃口);
		ハイテイロン=重複回避(mv,"ハイテイロン",ハイテイロン);
		ハイテイツモ=重複回避(mv,"ハイテイツモ",ハイテイツモ);
		嶺上開花=重複回避(mv,"嶺上開花",嶺上開花);
		ダブルリーチ=重複回避(mv,"ダブルリーチ",ダブルリーチ);
		チャンカン=重複回避(mv,"チャンカン",チャンカン);
		三色同順_喰い=重複回避(mv,"三色同順_喰い",三色同順_喰い);
		一気通貫_喰い=重複回避(mv,"一気通貫_喰い",一気通貫_喰い);
		混全帯ヤオ九_喰い=重複回避(mv,"混全帯ヤオ九_喰い",混全帯ヤオ九_喰い);
		
		役牌2=重複回避(mv,"役牌2",役牌2);
		対々和=重複回避(mv,"対々和",対々和);
		三色同順_門前=重複回避(mv,"三色同順_門前",三色同順_門前);
		七対子=重複回避(mv,"七対子",七対子);
		一気通貫_門前=重複回避(mv,"一気通貫_門前",一気通貫_門前);
		混全帯ヤオ九_門前=重複回避(mv,"混全帯ヤオ九_門前",混全帯ヤオ九_門前);
		三暗刻=重複回避(mv,"三暗刻",三暗刻);
		小三元=重複回避(mv,"小三元",小三元);
		混老頭=重複回避(mv,"混老頭",混老頭);
		三色同刻=重複回避(mv,"三色同刻",三色同刻);
		三槓子=重複回避(mv,"三槓子",三槓子);
		ホンイツ_喰い=重複回避(mv,"ホンイツ_喰い",ホンイツ_喰い);
		清全帯ヤオ九_喰い=重複回避(mv,"清全帯ヤオ九_喰い",清全帯ヤオ九_喰い);
		
		役牌3=重複回避(mv,"役牌3",役牌3);
		ホンイツ_門前=重複回避(mv,"ホンイツ_門前",ホンイツ_門前);
		清全帯ヤオ九_門前=重複回避(mv,"清全帯ヤオ九_門前",清全帯ヤオ九_門前);
		二盃口=重複回避(mv,"二盃口",二盃口);
		
		役牌4=重複回避(mv,"役牌4",役牌4);
		
		清一色_喰い=重複回避(mv,"清一色_喰い",清一色_喰い);
		
		清一色_門前=重複回避(mv,"清一色_門前",清一色_門前);
		
		四暗刻=重複回避(mv,"四暗刻",四暗刻);
		国士無双=重複回避(mv,"国士無双",国士無双);
		大三元=重複回避(mv,"大三元",大三元);
		四喜和=重複回避(mv,"四喜和",四喜和);
		字一色=重複回避(mv,"字一色",字一色);
		清老頭=重複回避(mv,"清老頭",清老頭);
		地和=重複回避(mv,"地和",地和);
		緑一色=重複回避(mv,"緑一色",緑一色);
		九蓮宝燈=重複回避(mv,"九蓮宝燈",九蓮宝燈);
		四槓子=重複回避(mv,"四槓子",四槓子);
		天和=重複回避(mv,"天和",天和);
		
	}
	private static String 重複回避(MainActivity mv,String 辞書のキー名,String グローバル変数){
		//SharedPreferences sp = mv.getSharedPreferences("dictionary_sp",Context.MODE_PRIVATE);
		//SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mv);
		String 辞書内容=SP.getString(辞書のキー名, グローバル変数);
		String[] 単語ずつ分けた辞書 = 辞書内容.split(",", 0);//カンマ区切りで文字を追加
		String[] 単語ずつ分けたグローバル変数=グローバル変数.split(",",0);
		グローバル変数="";
		for(int i=0;i<単語ずつ分けた辞書.length;i++)グローバル変数+=単語ずつ分けた辞書[i]+",";
		for(int i=0;i<単語ずつ分けたグローバル変数.length;i++){
			if(!グローバル変数.matches(".*"+単語ずつ分けたグローバル変数[i]+".*"))グローバル変数+=単語ずつ分けたグローバル変数[i]+",";		
		}
		if(グローバル変数.indexOf(",")==0)グローバル変数=グローバル変数.substring(2-1);//ナゼか最初にカンマが入ったら二文字目から最後までを取り出す
		Log.d("hash",グローバル変数);
		return グローバル変数;
	}
//	private static void ローカルと辞書を同期(MainActivity mv,String 辞書のキー名,Set<String> グローバル変数){
//		//SharedPreferences sp = mv.getSharedPreferences("dictionary_sp",Context.MODE_PRIVATE);
//		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mv);
//		Set<String> 保存済みの辞書=new HashSet<String>();
//		保存済みの辞書=sp.getStringSet(辞書のキー名,グローバル変数);
//		while(保存済みの辞書.iterator().hasNext())グローバル変数.add(保存済みの辞書.iterator().next());
//		保存済みの辞書.clear();
//	}
//	private static void 辞書の初期値を設定(){
//		ドラ1.add("ドラ1");
//	}
}
