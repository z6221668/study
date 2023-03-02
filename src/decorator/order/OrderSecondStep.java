package decorator.order;

public class OrderSecondStep extends OrderBase{

    public OrderSecondStep(Order order) {
        super(order);
    }

    @Override
    public void handleOrder() {
        super.handleOrder();
        secondStep();
    }

    public void secondStep(){
        System.out.println("处理订单第二步骤");
    }
}
