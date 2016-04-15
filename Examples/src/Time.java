
public class Time {
	int hour;
	int minute;
	int second;
	
	void hour(int h){
		hour = ((h >= 0 && h < 240 ? h : 0));
	};
	void minute(int m){
		minute = ((m >= 0 && m < 60) ? m : 0);
	};
	void second(int s){
		second = ((s >= 0 && s < 60) ? s : 0);
	}
	
	public int getHour(){
		return hour;
	};
	public int getMinute(){
		return minute;
	};
	public int getSecond(){
		return second;
	};
	
	public void set(int h, int m, int s){
		hour(h);
		minute(m);
		second(s);
	}
	
	public String military(){
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	public String getNormal(){
		int h = getHour();
		String tOD;
		
		if(h > 12){
			h -=12;
			tOD = "PM";
		} else{
			tOD = "AM";
		}
		
		if(h == 0){
			h = 12;
		}
		
		return String.format("%d: %02d: %02d \t" + tOD, h, getMinute(), getSecond());
	}
	
}
