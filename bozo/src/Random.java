import java.util.Calendar;

public class Random {
	private long p = 3547435147L;
	private long m = 147786549L;
	private long a = 354879854L;
	private long xi = 4269L; // seed
	
	public String toString() {
		return ""+(xi);
	}
	
	public Random(int k) {
		xi = k;
	}
	
	public Random() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}
		
		xi = Calendar.getInstance().getTimeInMillis() % p;
	}
	
	public void setSemente(int k) {
		xi = k % p;
	}
	
	
	public double getRand() {
		xi = (a + m * xi ) % p;
		double d = xi;
		return d / p;
	}
	
	
	public int getIntRand(int max) {
		double d = max * getRand();
		return (int) d;
	}
	
	public int getIntRand() {
		double d = getRand();
		return (int) d;
	}
	
	
	public int getIntRand(int min, int max) throws IllegalArgumentException {
		if(max <= min) {
			throw new IllegalArgumentException("Erro nos parametros");
		}
		double d = min + getIntRand(max-min);
		return (int) d;
	}
}