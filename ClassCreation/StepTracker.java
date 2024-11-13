//Jason Wu 114474379
package jason;

public class StepTracker {
	private double days;
	private int activedays;
	private double totalsteps;
	private int activemin;

	public StepTracker() {
	}

	public StepTracker(int activemin) {
		this.activemin = activemin;
		this.days = 0;
		this.totalsteps = 0;
	}

	public void addDailySteps(int steps) {
		totalsteps += steps;
		if (steps >= activemin) {
			activedays += 1;
		}
		days += 1;
	}

	public double averageSteps() {
		double average = totalsteps / days;
		if (average > 0) {
			System.out.println("Average steps: " + average);
		} else {
			System.out.println("Average steps: 0.0");
		}
		return average;
	}

	public double activeDays() {
		System.out.println("Active days: " + activedays);
		return activedays;
	}

	public static void main(String[] args) {
		StepTracker tr = new StepTracker(10000);
		tr.activeDays();
		tr.averageSteps();
		tr.addDailySteps(9000);
		tr.addDailySteps(5000);
		tr.activeDays();
		tr.averageSteps();
		tr.addDailySteps(13000);
		tr.activeDays();
		tr.averageSteps();
		tr.addDailySteps(23000);
		tr.addDailySteps(1111);
		tr.activeDays();
		tr.averageSteps();
	}
}