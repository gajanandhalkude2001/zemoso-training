package corejava_assignments.assignment7;

// Interface 1
interface Interface1 {
    void method1a();
    void method1b();
}

// Interface 2
interface Interface2 {
    void method2a();
    void method2b();
}

// Interface 3
interface Interface3 {
    void method3a();
    void method3b();
}

// Combined Interface
interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}

// Concrete Class
class MyClass {
    void method4(Interface1 i1) {
        System.out.println("Called method4 with Interface1");
    }

    void method4(Interface2 i2) {
        System.out.println("Called method4 with Interface2");
    }

    void method4(Interface3 i3) {
        System.out.println("Called method4 with Interface3");
    }

    void method4(CombinedInterface ci) {
        System.out.println("Called method4 with CombinedInterface");
    }
}

// Class implementing CombinedInterface and inheriting MyClass
class MyCombinedClass extends MyClass implements CombinedInterface {
    public void method1a() {}
    public void method1b() {}
    public void method2a() {}
    public void method2b() {}
    public void method3a() {}
    public void method3b() {}
    public void newMethod() {}
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        MyCombinedClass obj = new MyCombinedClass();

        // Pass object to each method
        obj.method4(obj);
        obj.method4((Interface1) obj);
        obj.method4((Interface2) obj);
        obj.method4((Interface3) obj);
    }
}

