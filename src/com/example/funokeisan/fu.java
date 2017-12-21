package com.example.funokeisan;


import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.ToggleButton;
import android.widget.TextView;

public class fu {
	static int 明の個数=0;
	static int  明と暗の個数=0;
	
	static void 符計算(MainActivity mv) {
		
		int 表示=0;
		int 符=0;
		
		明の個数=0;
		明と暗の個数=0;
		
		シークバーの値を表示(mv);
		
		//単騎待ちかどうか
		if(statement.toggleButton_tanmachi)符+=2;
		
		//ロンかツモ、門前か鳴きか
		if(statement.toggleButton_tsumo)符+=2;
		else{//ロンだったら
			if(!statement.toggleButton_kui)符+=10;
		}
		
		//頭
		if(statement.toggleButton_atama)符+=2;
		
		//明刻
		符+=2*statement.SeekBar_minko_hoka;
		符+=4*statement.SeekBar_minko_zi;
		明の個数+=statement.SeekBar_minko_hoka+statement.SeekBar_minko_zi;
		//暗刻
		符+=4*statement.SeekBar_anko_hoka;
		符+=8*statement.SeekBar_anko_zi;
		明と暗の個数+=statement.SeekBar_anko_hoka+statement.SeekBar_anko_zi;
		//明槓
		符+=8*statement.SeekBar_minka_hoka;
		符+=16*statement.SeekBar_minka_zi;
		明の個数+=statement.SeekBar_minka_hoka+statement.SeekBar_minka_zi;
		
		//暗槓
		符+=16*statement.SeekBar_anka_hoka;
		符+=32*statement.SeekBar_anka_zi;
		明と暗の個数+=statement.SeekBar_anka_hoka+statement.SeekBar_anka_zi;
		
		明と暗の個数+=明の個数;
		
		符=例外処理(符);
				
		//実際に表示させる符の計算
		表示=20+符;
		if(表示!=25&&表示%10!=0)表示=10*((int)(表示/10)+1);
		((EditText)mv.findViewById(R.id.edit_fu)).setHint(Integer.toString(表示));
	

	}
	private static int 例外処理(int ふ){
		int number=ふ;
		//例外
		if(statement.CheckBox204)number=25-20;//七対子は一律25符
		if(statement.CheckBox104&&statement.toggleButton_tsumo)number=20-20;//ツモ平和は20符
		if(statement.CheckBox104&&(!statement.toggleButton_tsumo||statement.toggleButton_kui))number=30-20;//喰い平和は30符
		return number;
	}
	static void 矛盾解消(MainActivity mv){
		//明があれば鳴き、なければ門前となる
		if(明の個数!=0)((ToggleButton)mv.findViewById(R.id.toggleButton_kui)).setChecked(true);
		//else ((ToggleButton)mv.findViewById(R.id.toggleButton_naki)).setChecked(false);
		
		
		全て表示(mv);
		//明と暗が合計4つ以上にならないようにする
		if(明と暗の個数>=4){
			//明刻
			if(statement.SeekBar_minko_hoka==0)
				((SeekBar)mv.findViewById(R.id.SeekBar_minko_hoka)).setVisibility(View.GONE);
			if(statement.SeekBar_minko_zi==0)
				((SeekBar)mv.findViewById(R.id.SeekBar_minko_zi)).setVisibility(View.GONE);
			//暗刻
			if(statement.SeekBar_anko_hoka==0)
				((SeekBar)mv.findViewById(R.id.SeekBar_anko_hoka)).setVisibility(View.GONE);
			if(statement.SeekBar_anko_zi==0)
				((SeekBar)mv.findViewById(R.id.SeekBar_anko_zi)).setVisibility(View.GONE);
			//明槓
			if(statement.SeekBar_minka_hoka==0)
				((SeekBar)mv.findViewById(R.id.SeekBar_minka_hoka)).setVisibility(View.GONE);
			if(statement.SeekBar_minka_zi==0)
				((SeekBar)mv.findViewById(R.id.SeekBar_minka_zi)).setVisibility(View.GONE);
			//暗槓
			if(statement.SeekBar_anka_hoka==0)
				((SeekBar)mv.findViewById(R.id.SeekBar_anka_hoka)).setVisibility(View.GONE);
			if(statement.SeekBar_anka_zi==0)
				((SeekBar)mv.findViewById(R.id.SeekBar_anka_zi)).setVisibility(View.GONE);
			

		}
		if(false
				||statement.CheckBox101
				||statement.CheckBox105
				||statement.CheckBox106
				||statement.CheckBox107
				||statement.CheckBox203
				||statement.CheckBox205
				||statement.CheckBox206
				||statement.CheckBox302
				||statement.CheckBox303
				||statement.CheckBox304
				||statement.CheckBox601
				)明を消す(mv);
		if(statement.CheckBox103)//タンヤオなら1,9字牌を消す
			一九字牌を消す(mv);
		if(false
				||statement.CheckBox115//チャンタ系なら2~8を消す
				||statement.CheckBox206//チャンタ門前
				||statement.CheckBox212
				||statement.CheckBox213
				||statement.CheckBox302
				||statement.CheckBox303)
			二から八を消す(mv);
		
		if(statement.CheckBox208)//小三元の時、頭は役牌
			((ToggleButton)mv.findViewById(R.id.toggleButton_atama)).setChecked(true);
		
		//満貫以上か七対子かピンフの場合は牌構成の欄自体を非表示
		if(han.飜>=5 || statement.CheckBox204 || statement.CheckBox104)mv.findViewById(R.id.ScrollView_fu).setVisibility(View.GONE);
		else mv.findViewById(R.id.ScrollView_fu).setVisibility(View.VISIBLE);
		
		if(statement.CheckBox204 || statement.CheckBox104)//ピンフかちーといは単騎りゃんめんのボタンを消す
			((ToggleButton)mv.findViewById(R.id.toggleButton_tanmachi)).setVisibility(View.INVISIBLE);			
		else ((ToggleButton)mv.findViewById(R.id.toggleButton_tanmachi)).setVisibility(View.VISIBLE);

		if(!statement.toggleButton_kui&&statement.toggleButton_tsumo)//門前ツモだったら役にチェック
			((CheckBox)mv.findViewById(R.id.CheckBox105)).setChecked(true);
		else ((CheckBox)mv.findViewById(R.id.CheckBox105)).setChecked(false);

	}
	
	static void 符の構成初期化(MainActivity mv){
		((ToggleButton)mv.findViewById(R.id.toggleButton_atama)).setChecked(false);
		((SeekBar)mv.findViewById(R.id.SeekBar_minko_zi)).setProgress(0);
		((SeekBar)mv.findViewById(R.id.SeekBar_minko_hoka)).setProgress(0);
		((SeekBar)mv.findViewById(R.id.SeekBar_anko_zi)).setProgress(0);
		((SeekBar)mv.findViewById(R.id.SeekBar_anko_hoka)).setProgress(0);
		((SeekBar)mv.findViewById(R.id.SeekBar_minka_zi)).setProgress(0);
		((SeekBar)mv.findViewById(R.id.SeekBar_minka_hoka)).setProgress(0);
		((SeekBar)mv.findViewById(R.id.SeekBar_anka_zi)).setProgress(0);
		((SeekBar)mv.findViewById(R.id.SeekBar_anka_hoka)).setProgress(0);
	}
	private static void 全て表示(MainActivity mv){
		((SeekBar)mv.findViewById(R.id.SeekBar_minko_hoka)).setVisibility(View.VISIBLE);
		((SeekBar)mv.findViewById(R.id.SeekBar_minko_zi)).setVisibility(View.VISIBLE);
		((SeekBar)mv.findViewById(R.id.SeekBar_anko_hoka)).setVisibility(View.VISIBLE);
		((SeekBar)mv.findViewById(R.id.SeekBar_anko_zi)).setVisibility(View.VISIBLE);
		((SeekBar)mv.findViewById(R.id.SeekBar_minka_hoka)).setVisibility(View.VISIBLE);
		((SeekBar)mv.findViewById(R.id.SeekBar_minka_zi)).setVisibility(View.VISIBLE);
		((SeekBar)mv.findViewById(R.id.SeekBar_anka_hoka)).setVisibility(View.VISIBLE);
		((SeekBar)mv.findViewById(R.id.SeekBar_anka_zi)).setVisibility(View.VISIBLE);	
	}
	private static void 全て消す(MainActivity mv){
		((SeekBar)mv.findViewById(R.id.SeekBar_minko_hoka)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_minko_zi)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_anko_hoka)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_anko_zi)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_minka_hoka)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_minka_zi)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_anka_hoka)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_anka_zi)).setVisibility(View.GONE);	
	}
	private static void 明を消す(MainActivity mv){
		((SeekBar)mv.findViewById(R.id.SeekBar_minko_hoka)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_minko_zi)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_minka_hoka)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_minka_zi)).setVisibility(View.GONE);
	}
//	private static void 明を表示(MainActivity mv){
//		((SeekBar)mv.findViewById(R.id.SeekBar_minko_hoka)).setVisibility(View.VISIBLE);
//		((SeekBar)mv.findViewById(R.id.SeekBar_minko_zi)).setVisibility(View.VISIBLE);
//		((SeekBar)mv.findViewById(R.id.SeekBar_minka_hoka)).setVisibility(View.VISIBLE);
//		((SeekBar)mv.findViewById(R.id.SeekBar_minka_zi)).setVisibility(View.VISIBLE);
//	}
//	private static void 一九字牌を表示(MainActivity mv){
//		((SeekBar)mv.findViewById(R.id.SeekBar_minko_zi)).setVisibility(View.VISIBLE);
//		((SeekBar)mv.findViewById(R.id.SeekBar_anko_zi)).setVisibility(View.VISIBLE);
//		((SeekBar)mv.findViewById(R.id.SeekBar_minka_zi)).setVisibility(View.VISIBLE);
//		((SeekBar)mv.findViewById(R.id.SeekBar_anka_zi)).setVisibility(View.VISIBLE);
//	}
//	private static void 二から八を表示(MainActivity mv){
//		((SeekBar)mv.findViewById(R.id.SeekBar_minko_hoka)).setVisibility(View.VISIBLE);
//		((SeekBar)mv.findViewById(R.id.SeekBar_anko_hoka)).setVisibility(View.VISIBLE);
//		((SeekBar)mv.findViewById(R.id.SeekBar_minka_hoka)).setVisibility(View.VISIBLE);
//		((SeekBar)mv.findViewById(R.id.SeekBar_anka_hoka)).setVisibility(View.VISIBLE);
//	}
	private static void 一九字牌を消す(MainActivity mv){
		((SeekBar)mv.findViewById(R.id.SeekBar_minko_zi)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_anko_zi)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_minka_zi)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_anka_zi)).setVisibility(View.GONE);
	}
	private static void 二から八を消す(MainActivity mv){
		((SeekBar)mv.findViewById(R.id.SeekBar_minko_hoka)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_anko_hoka)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_minka_hoka)).setVisibility(View.GONE);
		((SeekBar)mv.findViewById(R.id.SeekBar_anka_hoka)).setVisibility(View.GONE);
	}
	private static void シークバーの値を表示(MainActivity mv){
		((TextView)mv.findViewById(R.id.TextView_minko_hoka)).
			setText("2~8(2符) × "+Integer.toString(statement.SeekBar_minko_hoka));
		((TextView)mv.findViewById(R.id.TextView_minko_zi)).
			setText("1,9,字牌(4符) × "+Integer.toString(statement.SeekBar_minko_zi));
		((TextView)mv.findViewById(R.id.TextView_anko_hoka)).
			setText("2~8(4符) × "+Integer.toString(statement.SeekBar_anko_hoka));
		((TextView)mv.findViewById(R.id.TextView_anko_zi)).
			setText("1,9,字牌(8符) × "+Integer.toString(statement.SeekBar_anko_zi));
		((TextView)mv.findViewById(R.id.TextView_minka_hoka)).
			setText("2~8(8符) × "+Integer.toString(statement.SeekBar_minka_hoka));
		((TextView)mv.findViewById(R.id.TextView_minka_zi)).
			setText("1,9,字牌(16符) × "+Integer.toString(statement.SeekBar_minka_zi));
		((TextView)mv.findViewById(R.id.TextView_anka_hoka)).
			setText("2~8(16符) × "+Integer.toString(statement.SeekBar_anka_hoka));
		((TextView)mv.findViewById(R.id.TextView_anka_zi)).
			setText("1,9,字牌(32符) × "+Integer.toString(statement.SeekBar_anka_zi));
	}
}
