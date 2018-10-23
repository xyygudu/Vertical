# 交通工具 #
## 抽象类Traffic ##
> 在这个类中定义了两个抽象方法globleTime——计算从购票到到达目的地的总时间，allPrice——用来计算从出发点到目的地所需要的所有的花费，还定义了许多变量，见变量的注释
```java

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

```
## 实现类Car Motocar Plane ##
>以Car类为例，其他两个类类似，在该类中，只有两个方法就是对Traffic类中的两个抽象方法的实现，构造函数负责初始化抽象类中的变量，安检时间，取票时间都是在构造函数中初始化，没有通过输入实现，直接在构造及函数中赋初值，如下：
```java

	getTicketTime=15;//取票时间25分钟
			chekTime=3;//安检时间3分钟
			waitTime=12;//等待时间是32分钟
			price=(float) 0.32;//单价是0.75/公里
```
抽象方法的实现如下：
```java

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

```
## 主控制类 ##
>在主控制类中，分别开辟了上述三个类的对象，设置起点为荆州，终点为北京，分别计算每种交通工具的用时和花费
```java

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
```
运行结果如下：

![](https://i.imgur.com/FR3L2n5.png)
