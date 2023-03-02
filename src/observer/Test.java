package observer;

/**
 * 观察者模式
 *
 * 一个接口定义方法（收到消息之后该做什么）， 一个接口定义如何传入方法以及通知各方法执行相关方法。
 * 个人认为视业务情况，直接类就能解决，不需要再定义接口了
 */
public class Test {
    public static void main(String[] args) {
        //定于发布者
        ConcreteSubject concreteSubject = new ConcreteSubject();
        //定义订阅者
        ConsumerObserver consumerObserver = new ConsumerObserver("订阅者1");
        ConsumerObserver consumerObserver1 = new ConsumerObserver("订阅者2");
        Consumer2Observer consumer2Observer = new Consumer2Observer("123");
        //添加
        concreteSubject.attach(consumerObserver);
        concreteSubject.attach(consumerObserver1);
        concreteSubject.attach(consumer2Observer);
        //消费
        concreteSubject.notify("发送消息来");
    }
}
