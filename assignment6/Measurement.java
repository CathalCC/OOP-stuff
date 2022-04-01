package assignment6;

public class Measurement {
	
	private int time;
	private int ppm;
	
	public Measurement(int time, int ppm) {
		this.time = time;
		this.ppm = ppm;
	}
	
	public int getPPM() {
		return ppm;
	}
	
	public int getTime() {
		return time;
	}

}
