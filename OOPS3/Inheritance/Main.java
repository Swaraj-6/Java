package Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box obj = new Box();
//        System.out.println(obj.l + " " + obj.w + " " + obj.h);
//
        BoxDepth obj2 = new BoxDepth();
        System.out.println(obj2.l + " " + obj2.w + " " + obj2.h);

        BoxDepth obj3 = new BoxDepth(4,4,3,7);
        System.out.println(obj3.l + " " + obj3.w + " " + obj3.h + " " + obj3.depth);

        Box obj4 = new BoxDepth(1,2,3,4);
        // This line is allowed because it involves upcasting.
        // You are creating an object of the BoxDepth class, and then you are assigning it
        // to a variable of type Box, which is its superclass. This is acceptable because a
        // subclass object can be treated as an instance of its superclass.


//        BoxDepth obj5 = new Box(1, 2, 3);
       // This line is not allowed because you are trying to assign an object of
        // the superclass Box to a variable of the subclass BoxDepth. This is downcasting,
        // and it's not allowed by default in Java. The reason is that the Box class may not have
        // the additional attributes or methods that are defined in the BoxDepth subclass.
        // Java wants to avoid situations where you may be trying to access something that doesn't exist in the superclass.
    }
}
