package decorator.order;

public class OrderFirstStep extends OrderBase{
    public OrderFirstStep(Order order) {
        super(order);
    }

    @Override
    public void handleOrder() {
        super.handleOrder();
        firstStep();
    }

    public void firstStep(){
        System.out.println("处理订单第一步");
    }
}
