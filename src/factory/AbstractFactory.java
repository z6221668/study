package factory;

/**
 * 类似于定义接口，强实现。不在工厂类里定义太多东西，所有结果由子类产生
 * 个人理解为：
 * 在选择类的这一阶段，简单工厂由类里解决返回，而抽象工厂，则更多的人为控制一些。
 * 如果添加类，不需要再在工厂类里进行代码相关的修改。（甚至我认为新起一个类都没问题）
 */
public class AbstractFactory {
    public static void main(String[] args) {
        String res = new FirstFactory().getName("test 1");
        System.out.println(res);
    }
}

abstract class Factory{
    public abstract String getName(String name);
}

class FirstFactory extends Factory{
    @Override
    public String getName(String name) {
        return "first factory: " + name;
    }
}

class SecondFactory extends Factory{
    @Override
    public String getName(String name) {
        return "second factory" + name;
    }
}