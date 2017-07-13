package com.example.wb.y2;

import android.util.Log;

public class Logs  {
	private final static boolean DEBUG = true;
	public static void e(String tag,String msg){
		if(DEBUG){
			Log.e(tag,msg);
		}
	}
	public static void e(String tag,String msg,Exception e){
		if(DEBUG){
			Log.e(tag,msg,e);
		}
	}
	public static void d(String tag,String msg){
		if(DEBUG){
			Log.d(tag,msg);
		}
	}
	public static void i(String tag,String msg){
		if(DEBUG){
			Log.i(tag,msg);
		}
	}
	public static void v(String tag,String msg){
		if(DEBUG){
			Log.v(tag,msg);
		}
	}
	public static void w(String tag,String msg, Throwable throwable){
		if(DEBUG){
			Log.w(tag,msg,throwable);
		}
	}
	public static void w(String tag,String msg, Exception re){
		if(DEBUG){
			Log.w(tag,msg,re);
		}
	}
	public static void w(String tag,String msg){
		if(DEBUG){
			Log.w(tag,msg);
		}
	}
}
