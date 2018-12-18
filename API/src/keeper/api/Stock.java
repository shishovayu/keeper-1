package keeper.api;

import java.util.Date;

public class Stock {
    private Ingredient ingredientID;
    private int amount;
    private Date updateIng;

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

    public Date getUpdateIng() {
        return updateIng;
    }

    public void setUpdateIng(Date updateIng) {
        this.updateIng = updateIng;
    }
}
