public class ServiceStation {
    public void checkApparatus(Apparatus apparatus){
        System.out.printf("Обслуживается: [%s]\n", apparatus.getModelName());
        apparatus.check();
    }
}
