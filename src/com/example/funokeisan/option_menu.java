package com.example.funokeisan;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;


public class option_menu {

	static private boolean 辞書画面表示=false;
	static private boolean 役説明画面表示=false;
	
	static MenuItem	辞書画面の表示;
	static MenuItem	メイン画面の表示;
	static MenuItem	役説明の表示;
	static private View 辞書画面;
	static private View 説明画面;
	
	static void onCreate(MainActivity mv,Menu menu){
    	辞書画面の表示=menu.add("辞書画面の表示");
    	メイン画面の表示=menu.add("メイン画面の表示");
    	役説明の表示=menu.add("役説明の表示");
    	
    	メイン画面の表示.setVisible(false);
	}
	static void 画面切り替えの準備(MainActivity mv){
		辞書画面=mv.getLayoutInflater().inflate(R.layout.dictionary,null);
        mv.addContentView(辞書画面, new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT));
        辞書画面.setVisibility(View.INVISIBLE);
        
        説明画面=mv.getLayoutInflater().inflate(R.layout.explain,null);
        mv.addContentView(説明画面, new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT));
        説明画面.setVisibility(View.INVISIBLE);
	}
	static void onSelected(MainActivity mv,MenuItem item){
	      if (item == 辞書画面の表示){
	    	  辞書画面表示=true;
	    	  役説明画面表示=false;
	      }
	      if (item == 役説明の表示){
	    	  辞書画面表示=false;
	    	  役説明画面表示=true;
	    	  //if(((TextView)mv.findViewById(R.id.TextView_ex101t)).getText().toString().equals("---"))explain.テキストをセット(mv);
	      }
	      if (item == メイン画面の表示){
	    	  辞書画面表示=false;
	    	  役説明画面表示=false;
	      }
	      
	      if(辞書画面表示){//辞書画面表示がタップされたら
	      	辞書画面の表示.setVisible(false);
	      	役説明の表示.setVisible(true);
	      	メイン画面の表示.setVisible(true);
	      	
	      	dictionary.辞書内容表示の更新(mv);
	      	辞書画面.setVisibility(View.VISIBLE);
	      	説明画面.setVisibility(View.INVISIBLE);
	      	mv.findViewById(R.id.main_display).setVisibility(View.INVISIBLE);
	      	
	      }
	      else if(役説明画面表示){
	        	辞書画面の表示.setVisible(true);
	        	役説明の表示.setVisible(false);
	          	メイン画面の表示.setVisible(true);
	          	
		      	辞書画面.setVisibility(View.INVISIBLE);
		      	説明画面.setVisibility(View.VISIBLE);
		      	mv.findViewById(R.id.main_display).setVisibility(View.INVISIBLE);
	      }
	      else{
	    	  辞書画面の表示.setVisible(true);
	    	  役説明の表示.setVisible(true);
	    	  メイン画面の表示.setVisible(false);
	    	  
	    	  辞書画面.setVisibility(View.INVISIBLE);
	    	  説明画面.setVisibility(View.INVISIBLE);
	    	  mv.findViewById(R.id.main_display).setVisibility(View.VISIBLE);
	      }
	}

}
