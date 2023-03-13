public class Truck extends Transport implements Enginable, Trailerable {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовика");
    }
    @Override
    public void checkTrailerable() {
        System.out.println("Проверяем прицеп у грузовика");
    }
}
