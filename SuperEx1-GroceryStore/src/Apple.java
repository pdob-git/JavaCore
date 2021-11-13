public class Apple extends Fruit {
    public static final String TYPE = "jabłkowaty";
    private String variety;

    public Apple(int weight, String variety) {
        super(weight, TYPE);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", odmiana: " + variety;
    }
}
