package jason.CookingOrganizer;

public class RecipeBook {
	@SuppressWarnings("unused")
	private String bookName;
	private java.util.ArrayList<CookingRecipe> BookList = new java.util.ArrayList<CookingRecipe>();

	public RecipeBook(String bookName) {
		this.bookName = bookName;
	}

	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
		for (int i = 0; i < BookList.size(); i++) {
			if (name.equals(BookList.get(i).getName())) {
				return null;
			}
		}
		CookingRecipe updateCooking = new CookingRecipe(name);
		for (int i = 0; i < ingredients.length; i++) {
			updateCooking.addtoList(ingredients[i]);
		}
		BookList.add(updateCooking);
		return updateCooking;
	}
}
