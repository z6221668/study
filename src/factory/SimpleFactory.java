package factory;

/**
 * 简单工厂类似于专门拿一个类进行if else判断
 */
public class SimpleFactory {
    public static String simpleFactory(String type){
        String res = "";
        switch (type){
            case "1": res = "type one"; break;
            case "2": res = "type two"; break;
            default:res = "";
        }
        return  res;
    }
}
