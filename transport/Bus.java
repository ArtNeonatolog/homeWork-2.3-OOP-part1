package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maximumSpeed) {
        super(brand, model, productionYear, productionCountry, color, maximumSpeed);
    }

    public void informationOfTheBus() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + ", " + getProductionYear() + " год выпуска" + ", сборка - " + getProductionCountry() + ", цвет кузова - " + getColor() + ", максимальная скорость - " + getMaximumSpeed() + " км/ч");
    }
}
