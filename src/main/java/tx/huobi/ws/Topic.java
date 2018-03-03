package tx.huobi.ws;

public class Topic {
	public static String KLINE_SUB = "market.%s.kline.%s";
	
	public static String DEPTH_SUB = "market.%s.depth.step0";
	
	public static String TRADE_SUB = "market.%s.trade.detail";
	
	public static String[] PERIOD = {"1min","5min","15min","30min","60min","1day","1mon","1week","1year"};
}
