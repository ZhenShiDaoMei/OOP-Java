//Jason Wu 114474379
package jason;

public class Time {
	private int seconds;
	private int minutes;
	private int hours;

	public Time() {
		seconds = 0;
		minutes = 0;
		hours = 0;
	}

	public Time(int seconds, int minutes, int hours) {
		this.seconds = seconds;
		this.minutes = minutes;
		this.hours = hours;
	}

	public void Tick() {
		seconds += 1;
		if (seconds == 60) {
			minutes += 1;
			seconds = 0;
		}
		if (minutes == 60) {
			hours += 1;
			minutes = 0;
		}
		if (hours == 24) {
			hours = 0;
		}
	}

	public void add(Time offset) {
		seconds += offset.seconds;
		minutes += offset.minutes;
		hours += offset.hours;
		while (seconds >= 60) {
			seconds -= 60;
			minutes += 1;
		}
		while (minutes >= 60) {
			minutes -= 60;
			hours += 1;
		}
		while (hours >= 24) {
			hours -= 24;
		}
	}

}
