package jason.CookingOrganizer;

public class Ingredient {
	private String name;
	private String measuringUnit;
	private int caloriesPerUnit;

	public String getName() {
		return name;
	}

	public String getMeasuringUnit() {
		return measuringUnit;
	}

	public int getCaloriesPerUnit() {
		return caloriesPerUnit;
	}

	public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
		this.name = name;
		this.measuringUnit = measuringUnit;
		this.caloriesPerUnit = caloriesPerUnit;
	}

	public boolean equals(Object o) {
		if (o instanceof Ingredient)
			return name.equals(((Ingredient) o).name) && measuringUnit.equals(((Ingredient) o).measuringUnit)
					&& caloriesPerUnit == (((Ingredient) o).caloriesPerUnit);
		return false;
	}

	public String toString() {
		return "Ingredient\nname: " + name + "\nmeasuring unit: " + measuringUnit + "\ncaloriesPerUnit: "
				+ caloriesPerUnit;
	}

	public static void main(String[] args) {
		Ingredient carrot = new Ingredient("carrot", "one pound", 100);
		System.out.print(carrot.toString());
	}
}
