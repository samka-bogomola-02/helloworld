public class Truck extends Apparatus {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void check(){
        super.check();
        checkEngine();
        checkTrailer();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
