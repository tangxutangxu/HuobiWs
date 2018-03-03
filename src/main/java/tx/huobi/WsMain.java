package tx.huobi;

import tx.huobi.ws.IWebSocketService;
import tx.huobi.ws.impl.WebSocketService;
import tx.huobi.ws.impl.WebSoketClient;

public class WsMain {
	public static void main(String[] args) {
		String url = "wss://api.hadax.com/ws";
	
		IWebSocketService service = new WebSocketService();

		WebSoketClient client = new WebSoketClient(url, service);
		client.start();
		client.addSub("market.egccbtc.depth.step0", "client1");
		//client.addSub("market.egccbtc.depth.step0", "client1");
//		client.topicAll("egccbtc");
	}
}
