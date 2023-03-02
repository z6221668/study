package decorator;

public class Person implements IPerson{
    @Override
    public void show() {
        System.out.println("这是一个人");
    }
}
