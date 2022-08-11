package finalExam;

public class FMethod {
    void printMethod(){
        System.out.println("print Method");
    }
}

class FinalTestMethodClass extends FMethod {
    void printMethod(){
        System.out.println("overriding printMethod");
    }
}

//printMethod()' cannot override 'printMethod()' in 'finalExam.FMethod'; overridden method is final
