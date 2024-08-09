public abstract class Apparatus {
    protected final String modelName;
    protected final int wheelsCount;

    public Apparatus(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void check(){
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
