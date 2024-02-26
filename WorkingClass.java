public class WorkingClass {
    public static void main(String[] args) {
        
        WorkingClass W = new WorkingClass();
        W.InterfaceTesting();
    }

    public void InterfaceTesting(){
        SampleInterface s = new SampleInterface() {public void samplecode() {System.out.println("SampleCode Meaning");}};
        System.out.println(s.x);
        s.samplecode();
    }
}
