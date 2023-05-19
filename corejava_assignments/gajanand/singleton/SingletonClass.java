package gajanand.singleton;

public class SingletonClass {
    private String str;
    private static SingletonClass instance = null;

    private SingletonClass() {}

    public static SingletonClass getInstance(String s) {
        if(instance == null) {
            instance = new SingletonClass();
            instance.str = s;
        }
        return instance;
    }

    public void printString() {
        System.out.println(str);
    }
}
