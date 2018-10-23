package com.zsk.main;

import com.zsk.traffic.Car;
import com.zsk.traffic.MotorCar;
import com.zsk.traffic.Plane;

public class MainCtrl {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("从荆州到北京1000公里");
		Plane plane=new Plane();
		MotorCar motorCar=new MotorCar();
		Car car=new Car();
		plane.globleTime();
		plane.allPrice();
		motorCar.globleTime();
		motorCar.allPrice();
		car.globleTime();
		car.allPrice();	
	}

}
