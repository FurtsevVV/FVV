package day11.task1;

public class Picker implements Worker {
    private int salary = 0;
    private boolean isPayed = false;
    private Warehouse warehouse;
    private static int counterPicker = 0;

    public Picker(int salary, boolean isPayed, Warehouse warehouse) {
        this.warehouse = warehouse;
        this.salary = salary;
        this.isPayed = isPayed;
        counterPicker++;
    }

    public int getCounterPicker() {
        return counterPicker;
    }

    public void doWork() {
        salary = salary + 80;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
    }

    public void bonus() {
        if (warehouse.getCountPickedOrders() >= 10000) {
            salary = salary + 70000 / counterPicker; //здесь можно усложнить логику чтобы бонус выплачивался пропорционально исполненным заказам каждого сотрудника
            isPayed = true;
        }
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        }
        if (warehouse.getCountPickedOrders() >= 10000 && isPayed) {
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
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

}
