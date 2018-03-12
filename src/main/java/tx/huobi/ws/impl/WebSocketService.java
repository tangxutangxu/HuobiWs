package tx.huobi.ws.impl;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import tx.huobi.ws.IWebSocketService;

public class WebSocketService implements IWebSocketService{
	private Logger log = Logger.getLogger(WebSocketService.class);

	public void onReceive(JSONObject json) {
		log.info("receive:" + json.toJSONString());
		
	}
	
	public void onReset(){
		
	}
}
