package javap;

public class mountainBike implements bicycle {
	
	        private int seatheight;
	        private int gear;
	        private int speed;

	public mountainBike(int startheight,int startSpeed, int startGear) {
		seatheight=startheight;
		gear=startSpeed;
		speed=startGear;
		
	}
	public 	void setheight(int newValue) {
		seatheight=newValue;
	}
	public void applyBrake(int decrement) {
		speed=+decrement;
	}
	public void speedUp(int increment) {
		speed=+increment;
		
	}
	public int getSeatheight() {
		return seatheight;
	}
	public void setSeatheight(int seatheight) {
		this.seatheight = seatheight;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
	

