public class ClassParent {
    // Use encapsulation to make fields private and provide public getter/setter methods
    private static int a = 100;
    private static String x = "Test";

    // Getter method for the 'a' field
    public static int getA()
    {
        return a;
    }

    // Setter method for the 'a' field
    public static void setA(int a)
   {
        ClassParent.a = a;
    }

    // Getter method for the 'x' field
    public static String getX()
   {
        return x;
    }

    // Setter method for the 'x' field
    public static void setX(String x)
   {
        ClassParent.x = x;
    }
}