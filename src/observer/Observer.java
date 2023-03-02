package observer;

import java.util.ArrayList;
import java.util.List;

public interface Observer {
    public void update(String message);
}

class ConsumerObserver implements Observer {
    private String name;

    public ConsumerObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + ": " + message);
    }
}

class Consumer2Observer implements Observer {
    private String name;

    public Consumer2Observer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("这里是二号消费者,叫作："+name);
        System.out.println("---获取到的消息---" + message);
    }
}

interface Subject {
    //增加订阅者
    public void attach(Observer observer);

    //减少订阅者
    public void detach(Observer observer);

    public void notify(String message);
}

class ConcreteSubject implements Subject {
    public List<Observer> list = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : list) {
            observer.update(message);
        }
    }
}

