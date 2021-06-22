package day11.task1;

public class Courier implements Worker {
    private int salary = 0;
    private boolean isPayed = false;
    private Warehouse warehouse;
    private static int counterCourier = 0;


    public Courier(int salary, boolean isPayed, Warehouse warehouse) {
        this.warehouse = warehouse;
        this.salary = salary;
        this.isPayed = isPayed;
        counterCourier++;
    }

    public void doWork() {
        salary = salary + 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }

    public static int getCounterCourier() {
        return counterCourier;
    }

    public void bonus() {
        if (warehouse.getCountDeliveredOrders() >= 10000) {
            salary = salary + 50000 / counterCourier;      //здесь можно усложнить логику чтобы бонус выплачивался пропорционально исполненным заказам каждого сотрудника
            isPayed = true;
        }
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        }
        if (warehouse.getCountDeliveredOrders() >= 10000 && isPayed) {
            System.out.println("Бонус уже был выплачен");
        }
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
