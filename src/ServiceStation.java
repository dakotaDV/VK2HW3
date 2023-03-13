public class ServiceStation {
    public void check(Car car) {
        Mechanic mechanic = new Mechanic();
        mechanic.checkWhelable(car);
        mechanic.checkEngine(car);


    }
    public void check(Bicycle bicycle) {
       Mechanic mechanic = new Mechanic();
       mechanic.checkWhelable(bicycle);
    }

    public void check(Truck truck) {
        Mechanic mechanic = new Mechanic();
        mechanic.checkWhelable(truck);
        mechanic.checkEngine(truck);
        mechanic.checkTrailerable(truck);

    }


    private void checkEngine(Enginable enginable){
        enginable.checkEngine();
    }
}