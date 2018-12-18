package keeper.api;


public class Position {
    private int position_id;
    private String position_name;
    private Place type_1; // belongs to kitchen or bar
    private PositionType type_2; // salad/soup/desert etc
    //keeper.api.IngredientList
    private int price;

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    public Place getType_1() {
        return type_1;
    }

    public void setType_1(Place type_1) {
        this.type_1 = type_1;
    }

    public PositionType getType_2() {
        return type_2;
    }

    public void setType_2(PositionType type_2) {
        this.type_2 = type_2;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
