package Chap07.c_p323_Driver;

public class c_DriverExample {

	public static void main(String[] args) {
		// 이것이 자바다 p.323
		ca_Driver driver = new ca_Driver();
		
		caa_Vehicle vehicle = new caa_Vehicle();
		cb_Bus bus = new cb_Bus();
		cc_Taxi taxi = new cc_Taxi();
		
		driver.drive(vehicle);
		driver.drive(bus);
		driver.drive(taxi);

	}

}
