class HawaiianPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("Cross");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Mild");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Ham + Pineapple");
    }
}