package jason.CookingOrganizer;

public class CookingRecipe {
	private String name;
	private java.util.ArrayList<RecipeIngredient> list = new java.util.ArrayList<RecipeIngredient>();

	public CookingRecipe() {
	}

	public CookingRecipe(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public java.util.ArrayList<RecipeIngredient> getList() {
		return list;
	}

	public java.util.ArrayList<RecipeIngredient> addtoList(RecipeIngredient ingredients) {
		list.add(ingredients);
		return list;
	}

	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
		RecipeIngredient updateRecipe = new RecipeIngredient(ingredient.getName(), ingredient.getMeasuringUnit(),
				ingredient.getCaloriesPerUnit(), quantity);
		for (int i = 0; i < list.size(); i++) {
			if (ingredient.equals(list.get(i))) {
				float newquantity = list.get(i).getQuantity() + quantity;
				list.get(i).setQuantity(newquantity);
				return;
			}
		}
		list.add(updateRecipe);
	}

	public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
		for (int i = 0; i < list.size(); i++) {
			if (ingredient.equals(list.get(i))) {
				return list.get(i);
			}
		}
		return null;
	}

	public RecipeIngredient getRecipeIngredient(String ingredientName) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(ingredientName)) {
				return list.get(i);
			}
		}
		return null;
	}

	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
		for (int i = 0; i < list.size(); i++) {
			if (ingredient.equals(list.get(i))) {
				RecipeIngredient copyplace = list.get(i);
				list.remove(list.get(i));
				return copyplace;
			}
		}
		return null;
	}

	public RecipeIngredient removeRecipeIngredient(String ingredientName) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(ingredientName)) {
				RecipeIngredient copyplace1 = list.get(i);
				list.remove(list.get(i));
				return copyplace1;
			}
		}
		return null;
	}

	public float calculateCalories() {
		float totalcalories = 0;
		for (int i = 0; i < list.size(); i++) {
			totalcalories += (list.get(i).getCaloriesPerUnit() * list.get(i).getQuantity());
		}
		return totalcalories;

	}

	public int getNumberOfIngredients() {
		return list.size();
	}

	public boolean equals(Object o) {
		if (o instanceof CookingRecipe)
			return list.equals(((CookingRecipe) o).list) && name.equals(((CookingRecipe) o).name);
		return false;
	}

	public String toString() {
		String CookingRecipeContains = "CookingRecipe\nname: " + name;
		for (int i = 0; i < list.size(); i++)
			CookingRecipeContains += "\nRecipeIngredient\nname: " + list.get(i).getName() + "\nmeasuring unit: "
					+ list.get(i).getMeasuringUnit() + "\ncaloriesPerUnit: " + list.get(i).getCaloriesPerUnit()
					+ "\nquantity: " + list.get(i).getQuantity();
		return CookingRecipeContains;
	}

	public static void main(String[] args) {
		CookingRecipe omelet = new CookingRecipe("swished eggs");
		Ingredient carrot = new Ingredient("carrot", "one pound", 100);
		omelet.addOrUpdateRecipeIngredient(carrot, 2);
		Ingredient Egg = new Ingredient("Egg", "OneEgg", 60);
		omelet.addOrUpdateRecipeIngredient(Egg, 2);
		omelet.removeRecipeIngredient("E");
		System.out.print(omelet.toString());
		System.out.print("\n" + omelet.calculateCalories());
		System.out.print("\n" + omelet.getRecipeIngredient(Egg));
	}
}
