package by.bylinay.javatening.timeStruct;


import java.util.Stack;



public class TimeStruct {
	int hours;
	int minutes;
	int seconds;
	static final int HOURS = 24;
	static final int MINUTES = 60;
	static final int SECONDS = 60;
	static final int SECONDS_IN_DAY = 24*60*60;
	static final int SECONDS_IN_HOURS = 60*60;

	public TimeStruct(int hours, int minutes, int seconds) {
		// setHours (hours);
		// setMinutes (minutes);
		// setSeconds (seconds);
		this.hours = check(hours, HOURS);
		this.minutes = check(minutes, MINUTES);
		this.seconds = check(seconds, SECONDS);

	}

	public static void main(String[] arr) {

		TimeStruct time1 = new TimeStruct(0, 0, 0);
		TimeStruct time2 = new TimeStruct(26, 10, 12);
		TimeStruct time3 = new TimeStruct(6, 66, 2);
		TimeStruct time4 = new TimeStruct(2, 10, 182);
		time1.print();
		time2.print();
		time3.print();
		time4.print();
		time1.changeHours(300);
		time1.changeMinutes(8067);
		time1.changeSeconds(-4803);
		time1.print();

	}

	private void print() {
		System.out.println(hours + ":" + minutes + ":" + seconds);

	}

	public int check(int set, final int CS) {
		return set < 0 || set >= CS ? 0 : set;

	}

	public void changeHours(int hours) {
		convertsOverSeconds(hours * MINUTES * SECONDS);
	}

	public void changeMinutes(int minutes) {
		convertsOverSeconds(minutes * SECONDS);
	}

	public void changeSeconds(int seconds) {
		convertsOverSeconds(seconds);
	}

	public void convertsOverSeconds(int seconds) {
		int startSeconds = this.hours * MINUTES * SECONDS + this.minutes * SECONDS + this.seconds;
		int overallSeconds = startSeconds + seconds;
		int secondsInMinute = SECONDS;
		if (overallSeconds >= SECONDS_IN_DAY) {
			overallSeconds %= SECONDS_IN_DAY;
		} else if (overallSeconds < 0) {
			overallSeconds = SECONDS_IN_DAY + overallSeconds % SECONDS_IN_DAY;
		}
		this.hours = overallSeconds / SECONDS_IN_HOURS;
		int difference = overallSeconds % SECONDS_IN_HOURS;
		//difference = overallSeconds - this.hours*SECONDS_IN_HOURS;
		this.minutes = difference / secondsInMinute;
		this.seconds = difference % secondsInMinute;
	}
	
}
