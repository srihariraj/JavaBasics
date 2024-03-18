// Interface 1
interface Interface1 {
    void method1();
}

// Interface 2
interface Interface2 {
    void method2();
}

// Interface 3
interface Interface3 {
    void method3();
}

// Concrete class implementing all three interfaces
class ConcreteClass implements Interface1, Interface2, Interface3 {
    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }

    @Override
    public void method3() {
        System.out.println("Method 3");
    }

    // Additional methods specific to the concrete class
    public void concreteMethod() {
        System.out.println("Concrete method");
    }
}

public class Program {
    public static void main(String[] args) {
        // Create an object of the concrete class
        ConcreteClass obj = new ConcreteClass();

        // Call methods from interfaces
        obj.method1();
        obj.method2();
        obj.method3();

        // Call method from the concrete class
        obj.concreteMethod();
    }
}
