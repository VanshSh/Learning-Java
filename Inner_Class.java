class OuterClass {
    int x = 6;

    class InnerClass {
        int y = 10;
    }
}
public class Inner_Class {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myOuter.x + myInner.y);
    }
}
