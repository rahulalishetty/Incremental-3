class Outer{
    int outerVar=100;
    class Inner{
        Inner(int InnerVar){
            System.out.println(outerVar+" before chaned");
            outerVar=InnerVar;
            System.out.println(outerVar+" after changed");
        }
    }
}

class SecondOuter{
    static class SecondInner extends Outer.Inner{

        SecondInner(Outer outer) {
            outer.super(200);
            System.out.println("value changed");
        }
    }
}

public class Incremental35 {
    public static void main(String[] args){
        Outer outer=new Outer();
        SecondOuter.SecondInner secondInner=new SecondOuter.SecondInner(outer);
    }
}
