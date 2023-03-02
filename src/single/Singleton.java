package single;

public class Singleton {

    public static Singleton instance;


    public static synchronized Singleton getInstance() {

        if (null == instance) {
            return new Singleton();
        }
        return instance;
    }
}
