package com.coolweather.apps.util;

public interface HttpCallbackListener {
	void onFinish(String response);
	
	void onError(Exception e);
}