package com.zsk.traffic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.zsk.util.Traffic;

public class MotorCar extends Traffic{
	SimpleDateFormat simpleDateFormat;
	public MotorCar() {
		// TODO Auto-generated constructor stub
		way="动车";
		simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm");
		try {
			startTime="2018-10-21 10:30";
			goToDestinationTime="2018-10-21 17:30";
			retToDestinationTime="2018-10-21 17:15";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		getTicketTime=25;//取票时间25分钟
		chekTime=3;//安检时间3分钟
		waitTime=22;//等待时间是32分钟
		price=(float) 0.42;//单价是0.75/公里
	}
	@Override
	public float globleTime() {
		// TODO Auto-generated method stub
		long from=0,to=0;
		try {
			from=simpleDateFormat.parse(startTime).getTime();
			to=simpleDateFormat.parse(goToDestinationTime).getTime();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
		
		int days = (int) ((to - from)/(1000 * 60 * 60 * 24));
		//int hours = (int) ((to - from)/(1000 * 60 * 60));
		int hours=0;
		int minutes = (int) ((to - from)/(1000 * 60));
		int othertime=getTicketTime+chekTime+waitTime+minutes;
		for(;othertime>=60;othertime-=60) {
			hours++;
		}
		System.out.println("乘坐飞动车总共花费时间为："+hours+"小时"+othertime+"分钟");
		return 0;
		
	}
	@Override
	public float allPrice() {
		// TODO Auto-generated method stub
		float distansce=1000.5f;
		price*=distansce;
		System.out.println("总共消费"+price);
		return price;
	}

}
