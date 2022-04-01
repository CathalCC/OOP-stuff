package assignment6;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.*;

public class AirPollutionSensor {
	
	//Data Members
	public String street;
	List<Measurement> measurements = Arrays.asList();
	
	//Setter to be used in setting values in a list which holds a series of Measurement instances
	public void setMeasurement(List<Measurement> measurements) {
		this.measurements = measurements;
	}
	
	public int maxCO2(int startTime, int endTime){
		//Creating a stream with the measurements list acting as its source
		Stream<Measurement> filterMeasurements = measurements
				.stream()
				//Use of lambda expressions in filtering
				.filter(m->m.getTime()>=startTime)
				.filter(m->m.getTime()<=endTime);
		
		//Getting the max ppm in the given range
		Measurement maxMeasurement = filterMeasurements	
				.max(Comparator.comparing(Measurement::getPPM))
				.orElseThrow(NoSuchElementException::new);
		
		return maxMeasurement.getPPM();
	}
	
	
			
}
