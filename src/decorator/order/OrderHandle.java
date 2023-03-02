package decorator.order;

public class OrderHandle implements Order{
    @Override
    public void handleOrder() {
        System.out.println("处理订单相关内容------");
    }
}
