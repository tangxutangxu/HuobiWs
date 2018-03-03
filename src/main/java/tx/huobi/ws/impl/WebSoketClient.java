package tx.huobi.ws.impl;

import tx.huobi.ws.IWebSocketService;
import tx.huobi.ws.WebSocketBase;

public class WebSoketClient extends WebSocketBase{
	public WebSoketClient(String url,IWebSocketService service){
		super(url,service);
	}
	
}
