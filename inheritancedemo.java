package javap;

public class inheritancedemo {

	public static void main(String args[])
	{
		
		mountainBike mb=new mountainBike(20,10,1);
		System.out.println("Gear is" + mb.getGear());
		System.out.println("Gear is" + mb.getSeatheight());
		System.out.println("Gear is" + mb.getSpeed());
		mb.applyBrake(6);
		System.out.println("after applying brake"+mb.getSpeed());
		
	}
}
