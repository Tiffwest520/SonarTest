package Review1;

public class Singleton {

    //private constructor
    private Singleton(){}

    // instance of the class
    private static final Singleton instance = new Singleton();

    //access to instance
    public static Singleton getInstance() {
        return instance;
    }
}
