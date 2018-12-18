package keeper.api;

public class  OrderList {
    int orderID;
    String positionID;
    int amount;
    int price;
    boolean readinessStatus;
    boolean delivery_status;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getPositionID() {
        return positionID;
    }

    public void setPositionID(String positionID) {
        this.positionID = positionID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isReadinessStatus() {
        return readinessStatus;
    }

    public void setReadinessStatus(boolean readinessStatus) {
        this.readinessStatus = readinessStatus;
    }

    public boolean isDelivery_status() {
        return delivery_status;
    }

    public void setDelivery_status(boolean delivery_status) {
        this.delivery_status = delivery_status;
    }
}
