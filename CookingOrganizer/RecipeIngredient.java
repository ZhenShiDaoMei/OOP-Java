package jason.CookingOrganizer;

public class RecipeIngredient extends Ingredient {
	private float quantity;

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float amount) {
		this.quantity = amount;
	}

	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
		super(name, measuringUnit, caloriesPerUnit);
		this.quantity = quantity;
	}

	public boolean equals(Object o) {
		if (o instanceof RecipeIngredient)
			return super.equals((RecipeIngredient) o) && quantity == (((RecipeIngredient) o).quantity);
		return false;
	}

	public String toString() {
		return "RecipeIngredient\nname: " + getName() + "\nmeasuring unit: " + getMeasuringUnit()
				+ "\ncaloriesPerUnit: " + getCaloriesPerUnit() + "\nquantity: " + quantity;
	}

	public static void main(String[] args) {
		RecipeIngredient ScrambledEggs = new RecipeIngredient("Egg", "OneEgg", 60, 3);
		System.out.print(ScrambledEggs.toString());
	}
}
