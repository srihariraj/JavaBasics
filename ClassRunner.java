public class ClassRunner extends ClassChild {
    public static void main(String[] args) {
       
        Childtest(); 
       // System.out.println(c);
        ClassRunner X = new ClassRunner(); 
        X.update();
        X.printer(); 
        X.Childtest(); 
        X.superCprint();
        X.c = 887.9;
        System.out.println(X.c);       
    }

    public void superCprint(){
        System.out.println(super.c);
    }

    public void printer() {
        
        System.out.println(super.c); 
    }
    public void update(){
      
        System.out.println(c);
    }
}