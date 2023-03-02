package decorator;

import decorator.order.OrderFirstStep;
import decorator.order.OrderHandle;
import decorator.order.OrderSecondStep;

/**
 * 装饰器模式更像是一个链式调用，又后一个类来触发上一个类的内容
 * 如果应用到实际，例如订单需要加各种后续的操作，可以采用装饰器模式
 * 如何对当前进行改造？
 * Person类为正常的下单行为， 后续的jacket或者hat类可改为记录用户名称，或者记录用户id这种。
 * 改造代码在当前目录下的order目录中
 */
public class DecoratorTest {
//    public static void main(String[] args) {
//        Person person = new Person();
//        Jacket jacket = new Jacket(person);
//        Hat hat = new Hat(jacket);
//        hat.show();
//    }

    //模拟订单类
    public static void main(String[] args) {
        OrderHandle orderHandle = new OrderHandle();
        OrderFirstStep firstStep = new OrderFirstStep(orderHandle);
        OrderSecondStep secondStep = new OrderSecondStep(firstStep);
        secondStep.handleOrder();
    }
}
