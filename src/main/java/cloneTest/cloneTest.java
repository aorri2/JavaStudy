package cloneTest;

public class cloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        People people = new People();
        people.age = 25;
        people.name = "wook";
        System.out.println("People : [" + people.age + ", " + people.name + "]");

        People people2 = people; //할당 연산자( = ) 는 레퍼런스를 복사합니다.
                                 //a2 와 a1 은 이제 같은 오브젝트를 가리킵니다, a2를 수정하면 변경 사항이 a1에도 반영됩니다.
        people2.age= 100;
        System.out.println("People1 : [" + people.age + ", " + people.name + "]");
        System.out.println("People2 : [" + people2.age + ", " + people2.name + "]\n");

        //2번 상황 : clone()메서드를 이용, 레퍼런스 복사 문제를 방지해보자.
        ClonedPeople clonedPeople = new ClonedPeople();
        clonedPeople.age = 24;
        clonedPeople.name = "wook";

        System.out.println("ClonedPeople : [" + clonedPeople.age + ", " + clonedPeople.name + "]\n");

        //clone 메서드는 객체를 복사합니다.
        ClonedPeople clonedPeople2 = clonedPeople.clone();

        //clonePeople과 clonedPeople2는 이제 다른 객체를 가리키고 있습니다.
        //b2를 수정해도 b1에 변경사항이 적용되지 않습니다.
        clonedPeople2.age = 22;
        clonedPeople2.name = "modify";
        System.out.println("ClonedPeople : [" + clonedPeople.age + ", " + clonedPeople.name + "]");
        System.out.println("ClonedPeople2 : [" + clonedPeople2.age + ", " + clonedPeople2.name + "]");

    }

    static class People {
        public int age;
        public String name;
    }

    static class ClonedPeople implements Cloneable {
        public int age;
        public String name;

        @Override
        public ClonedPeople clone() throws CloneNotSupportedException {
            ClonedPeople clonedPeople = (ClonedPeople) super.clone();
            return clonedPeople;
        }
    }
}
