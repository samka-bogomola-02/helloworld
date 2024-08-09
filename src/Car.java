public class Car extends Apparatus {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void check(){
        super.check();
        checkEngine();
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
