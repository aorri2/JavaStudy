package interfaceExam;

public interface Animal {
    void sound();
}


class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    public void bow() {
        System.out.println("크르릉 와뢀!");
    }
}

class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("미야옹~");
    }

    public void scatter() {
        System.out.println("할퀴기!");
    }
}

class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();

        ((Dog) dog).bow();
        ((Cat) cat).scatter();



    }
}
/*
> Task :AnimalMain.main()
        멍멍
        미야옹~
        크르릉 와뢀!
        할퀴기!
        */
