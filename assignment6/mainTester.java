package assignment6;

import java.util.Arrays;
import java.util.List;

public class mainTester {

	public static void main(String[] args) {
		 
		AirPollutionSensor a = new AirPollutionSensor();
		AirPollutionSensor b = new AirPollutionSensor();
		AirPollutionSensor c = new AirPollutionSensor();
		
		//Creating a set of measurements from which the maxCO2 method will receive the highest PPM in the given range
		Measurement m1 = new Measurement(1,50);
		Measurement m2 = new Measurement(4,7);
		Measurement m3 = new Measurement(10,54);
		Measurement m4 = new Measurement(13,34);
		Measurement m5 = new Measurement(14,95);
		Measurement m6 = new Measurement(23,57);
		Measurement m7 = new Measurement(12,555);
		Measurement m8 = new Measurement(99,110);
		Measurement m9 = new Measurement(100,565);
		Measurement m10 = new Measurement(123,543);
		
		List<Measurement> newList = Arrays.asList(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10);
		
		//Setting the values for each AirPollutionSensor instance and printing maxCO2 with start and end times chosen to display different outcomes
		a.setMeasurement(newList);
		b.setMeasurement(newList);
		c.setMeasurement(newList);
		
		System.out.println(a.maxCO2(1,341));
		System.out.println(b.maxCO2(32,99));
		System.out.println(c.maxCO2(13,42));
		
		

	}

}
