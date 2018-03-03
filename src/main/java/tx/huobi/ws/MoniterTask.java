package tx.huobi.ws;

import java.util.TimerTask;

import org.apache.log4j.Logger;

public class MoniterTask  extends TimerTask {

	private Logger log = Logger.getLogger(MoniterTask.class);
	private long startTime = System.currentTimeMillis();
	private int checkTime = 5000;
	private WebSocketBase client = null;

	public void updateTime() {
		// log.info("startTime is update");
		startTime = System.currentTimeMillis();
	}

	public MoniterTask(WebSocketBase client) {
		this.client = client;
		// log.info("TimerTask is starting.... ");
	}

	public void run() {
		if (System.currentTimeMillis() - startTime > checkTime) {
			client.setStatus(false);
			// log.info("Moniter reconnect....... ");
			client.reConnect();
		}
		 
		
	}
}