package com.example.funokeisan;

import android.view.View;
import android.widget.TextView;

public class explain{
	
	private static boolean 役説明表示1飜=false;
	private static boolean 役説明表示2飜=false;
	private static boolean 役説明表示3飜=false;
	private static boolean 役説明表示6飜=false;
	private static boolean 役説明表示役満=false;
	
	

	static void 役説明1(MainActivity mv){
		役説明表示1飜=!役説明表示1飜;
		if(役説明表示1飜){
			mv.findViewById(R.id.LinerLayout_ex1).setVisibility(View.VISIBLE);
			((TextView)mv.findViewById(R.id.TextView_ex1)).setTextColor(mv.getResources().getColor(R.color.black));
		}
		else{ 
			mv.findViewById(R.id.LinerLayout_ex1).setVisibility(View.GONE);
			((TextView)mv.findViewById(R.id.TextView_ex1)).setTextColor(mv.getResources().getColor(R.color.blue));
		}
	}
	static void 役説明2(MainActivity mv){
		役説明表示2飜=!役説明表示2飜;
		if(役説明表示2飜){
			mv.findViewById(R.id.LinerLayout_ex2).setVisibility(View.VISIBLE);
			((TextView)mv.findViewById(R.id.TextView_ex2)).setTextColor(mv.getResources().getColor(R.color.black));
		}
		else{ 
			mv.findViewById(R.id.LinerLayout_ex2).setVisibility(View.GONE);
			((TextView)mv.findViewById(R.id.TextView_ex2)).setTextColor(mv.getResources().getColor(R.color.blue));
		}
	}
	static void 役説明3(MainActivity mv){
		役説明表示3飜=!役説明表示3飜;
		if(役説明表示3飜){
			mv.findViewById(R.id.LinerLayout_ex3).setVisibility(View.VISIBLE);
			((TextView)mv.findViewById(R.id.TextView_ex3)).setTextColor(mv.getResources().getColor(R.color.black));
		}
		else{
			mv.findViewById(R.id.LinerLayout_ex3).setVisibility(View.GONE);
			((TextView)mv.findViewById(R.id.TextView_ex3)).setTextColor(mv.getResources().getColor(R.color.blue));
		}
	}
	static void 役説明6(MainActivity mv){
		役説明表示6飜=!役説明表示6飜;
		if(役説明表示6飜){
			mv.findViewById(R.id.LinerLayout_ex6).setVisibility(View.VISIBLE);
			((TextView)mv.findViewById(R.id.TextView_ex6)).setTextColor(mv.getResources().getColor(R.color.black));
		}
		else{
			mv.findViewById(R.id.LinerLayout_ex6).setVisibility(View.GONE);
			((TextView)mv.findViewById(R.id.TextView_ex6)).setTextColor(mv.getResources().getColor(R.color.blue));
		}
	}
	static void 役説明13(MainActivity mv){
		役説明表示役満=!役説明表示役満;
		if(役説明表示役満){
			mv.findViewById(R.id.LinerLayout_ex13).setVisibility(View.VISIBLE);
			((TextView)mv.findViewById(R.id.TextView_ex13)).setTextColor(mv.getResources().getColor(R.color.black));
		}
		else{
			mv.findViewById(R.id.LinerLayout_ex13).setVisibility(View.GONE);
			((TextView)mv.findViewById(R.id.TextView_ex13)).setTextColor(mv.getResources().getColor(R.color.blue));
		}
	}
}
