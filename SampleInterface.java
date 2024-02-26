public interface SampleInterface {
    int x = 100;
    String Sample = " Hello World";

    public abstract void samplecode();
    default public void testcode(){
        System.out.println("Sample result" + Sample);
    }
}
