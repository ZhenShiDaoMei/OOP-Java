//Jason Wu 114474379
package jason.HorseBarnManager;
public class Horse {
	private String name;
	private int weight;
	public Horse (String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	public String toString() {
		return name;
	}
	public boolean equals(Object o) {
		if(o instanceof Horse)
			return name.equals(((Horse)o).name);
		return false;
		
	}
	public static void main(String[] args) {
		Horse rusty = new Horse("Rusty", 1000);
		Horse bob = new Horse ("Bob", 2000);
		System.out.println(rusty);
		System.out.println(bob);
	}

}
