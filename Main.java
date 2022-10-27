import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    private static void task3() {
        System.out.println();
        System.out.println("Задание 3");
        Train train1 = new Train ("Ласточка", "B-901", 2011, "Россия", "", 301,
                3500, "", "Белорусский вокзал", "Минск-Пассажирский", 11);
        train1.informationOfTheTrain();
        System.out.println();

        Train train2 = new Train("Ленинград", "D-125", 2019, "Россия", "", 270,
                1700, "", "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        train2.informationOfTheTrain();
    }
    private static void task2() {
        System.out.println();
        System.out.println("Задание 2");
        Bus bus1 = new Bus("Камаз", "B67", 2015, "Россия", "красный", 120);
        bus1.informationOfTheBus();

        Bus bus2 = new Bus("ПАЗ", "2356FD", 2010, "Россия", "", 0);
        bus2.informationOfTheBus();

        Bus bus3 = new Bus("Икарус", "X43C", 1987, "Венгрия", "черный", 90);
        bus3.informationOfTheBus();
    }
    private static void task1() {
        System.out.println();
        System.out.println("Задание 1");
        Car car1 = new Car ("Audi", "A8 50 L TDI quattro", 2005, "Германия", "черный", 250, 1.8f,
                "автомат", "седан", "x567уч", 5, true);
        car1.informationOfTheCar();
    }
}
