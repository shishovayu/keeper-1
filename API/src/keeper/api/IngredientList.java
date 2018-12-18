package keeper.api;

public class IngredientList {
    private Ingredient ingredientID;
    private int amount;

    public Ingredient getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(Ingredient ingredientID) {
        this.ingredientID = ingredientID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

