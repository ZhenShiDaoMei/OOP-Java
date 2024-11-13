//Jason Wu 114474379
package jason.ClassCreation;

public class Package {
	@SuppressWarnings("unused")
	private String sender;
	@SuppressWarnings("unused")
	private String recipient;
	private int cost = 0;
	private int distance;

	public Package() {
	}

	public Package(String sender, String recipient, int distance) {
		this.sender = sender;
		this.recipient = recipient;
		this.distance = distance;
	}

	public int getDistance() {
		return distance;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	// my stuff v
	public static double shippingCost(Package[] packages, int[] costSchedule) {
		double totalshipcost = 0;
		int[] packagescosts = new int[packages.length];
		for (int i = 0; i < packages.length; i++) {
			// check the distance of the package in spot 'i' of the list, check which
			// shipping cost it falls under
			if (packages[i].getDistance() < 100) {
				packagescosts[i] = costSchedule[0];
				totalshipcost += costSchedule[0];
			} else if (packages[i].getDistance() >= 100 && packages[i].getDistance() < 300) {
				packagescosts[i] = costSchedule[1];
				totalshipcost += costSchedule[1];
			} else if (packages[i].getDistance() >= 300 && packages[i].getDistance() < 500) {
				packagescosts[i] = costSchedule[2];
				totalshipcost += costSchedule[2];
			} else if (packages[i].getDistance() >= 500) {
				packagescosts[i] = costSchedule[0];
				totalshipcost += costSchedule[3];
			}
		}
		return totalshipcost;
	}

	public static void main(String[] args) {
		Package[] packages1 = { new Package("Monmouth", "Appleby", 144),
				new Package("Larkinge", "Ballachulish", 65),
				new Package("Malrton", "Auchtermuchty", 872),
				new Package("Monmouth", "Anghor Thom", 937) };
		int[] costSchedule1 = { 10, 16, 37, 49 };

		System.out.println(shippingCost(packages1, costSchedule1));
	}
}
