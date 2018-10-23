package com.zsk.util;



public abstract class Traffic {
	public String way="";//乘坐交通工具的方式
	public String startTime;//出发时间
	public String  goToDestinationTime ;//到达目的地得时间点
	public String  retToDestinationTime;//返回时间点
	public int getTicketTime=0;//取票用时min
	public int chekTime=0;//安检时间min
	public int waitTime=0;//等待时间
	public float price=0;//单价

	public abstract float globleTime()  ;
	
	public abstract float allPrice();
	

}
