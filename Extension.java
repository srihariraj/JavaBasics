
interface A {
    public abstract void testA();
}

interface B {
    public abstract void testB();
}

class C implements A, B {

    public void testC() {
        System.out.println("TEST C");
    }

    @Override
    public void testB() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testB'");
    }

    @Override
    public void testA() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testA'");
    }
}

public class Extension {

    public static void main(String[] args) {
        C Obj = new C();

        Obj.testA();
        System.out.println(" " + Obj.hashCode());
        Obj.testB();
        System.out.println(" " + Obj.hashCode());
        Obj.testC();
        System.out.println(" " + Obj.hashCode());

    }
}
