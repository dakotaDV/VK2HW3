public class Truck extends Transport implements Enginable {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }


    public void checkTrailer() {
        System.out.println("Проверяем прицеп у грузовика");
    }


    @Override
    public void checkEngine() {

    }
}
