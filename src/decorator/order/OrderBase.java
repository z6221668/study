package decorator.order;

public class OrderBase implements Order{
    Order order;
    public OrderBase(Order order){
        this.order = order;
    }

    @Override
    public void handleOrder() {
        order.handleOrder();
    }
}
