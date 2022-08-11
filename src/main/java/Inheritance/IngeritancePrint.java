package Inheritance;

public class IngeritancePrint {

    public static void main(String[] args) {
        ChildArg child = new ChildArg();
        child.printName();
    }

    static class ParentArg {
        public ParentArg(String name) {
            System.out.println("ParentArg("+name+" Constructor");

        }

        public void printName() {
            System.out.println("Parent printName()");
        }
    }

    static class ChildArg extends ParentArg {
        public ChildArg() {
            super("wook");
            System.out.println("Child Constructor");
        }


    }
}
