package Overriding;

public class InheritanceOverriding {
    public static void main(String[] args) {
        ChildOverriding child = new ChildOverriding();
        child.printName();
    }

}


class ParentOverriding{
    public ParentOverriding(){
        System.out.println("ParentOverriding Constructor");
    }
    public void printName(){
        System.out.println("ParentOverriding printName()");
    }
}
class ChildOverriding extends ParentOverriding{
    public ChildOverriding(){
        System.out.println("ChildOverriding Constructor");
    }
    public void printName(){
        System.out.println("ChildOverriding printName()");
    }
}