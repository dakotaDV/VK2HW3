public class Mechanic {
    public void checkWhelable(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }

    public void checkEngine(Enginable enginable) {
        enginable.checkEngine();

    }

    public void checkTrailerable(Trailerable trailerable) {
        trailerable.checkTrailerable();

    }
}