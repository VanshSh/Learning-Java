class OuterClass {
    int x = 6;

    // private class InnerClass {
    // int y = 10;
    // }
    class InnerClass {
        int y = 10;
    }

    static class InnerClass2 {
        int z = 5;
    }
}

public class Inner_Class {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        // Can be accessed directly without creating the object of the outer class
        OuterClass.InnerClass2 myInnerClass2 = new OuterClass.InnerClass2();
        System.out.println(myOuter.x + myInner.y);
        System.out.println(" U_U L-23 in Inner_Class.java => " + myInnerClass2.z);
    }
}
