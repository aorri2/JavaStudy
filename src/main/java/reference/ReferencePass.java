package reference;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass reference = new ReferencePass();
        reference.callByReference();
    }

    class MemberDto {
        String name;

        public MemberDto(String name) {
            this.name = name;
        }
    }

    private void callByReference() {
        MemberDto member = new MemberDto("Sangmin");
        System.out.println("before callByReference");
        System.out.println("member.name=" + member.name);
        passByReference(member);
        System.out.println("after callByReference");
        System.out.println("member.name = " + member.name);
    }
    private void passByReference(MemberDto member){
        member.name="SungChoon";
        System.out.println("in passByReference");
        System.out.println("member.name = " + member.name);

    }

    private void callPassByValue() {
        int a = 10;
        String b = "b";
        System.out.println("before passByValue");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        passByvalue(a, b);
        System.out.println("after passByValue");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    private void passByvalue(int a, String b) {
        a = 20;
        b = "z";
        System.out.println("in passByvalue");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
