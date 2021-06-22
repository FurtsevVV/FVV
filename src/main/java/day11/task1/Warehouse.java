package day11.task1;

public class Warehouse {


    private int countPickedOrders;
    private int countDeliveredOrders;


    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }


    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "На складе" +
                " число собранных заказов= " + countPickedOrders +
                ", число доставленных заказов= " + countDeliveredOrders;
    }
}
