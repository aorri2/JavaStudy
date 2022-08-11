package equals;

import java.util.Objects;

public class Equals {

    public static void main(String[] args) {
        Equals thisObject = new Equals();
        thisObject.equalMethod(); // dto1 and dto2 is not same가 출력된다.
        thisObject.equalMethod2();
    }

    public void equalMethod() {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO();

        if (dto1 == dto2) {
            System.out.println("dto1 and dto2 is same");
        }
        System.out.println("dto1 and dto2 is not same");
    }

    public void equalMethod2() {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO();

        if (dto1.equals(dto2)) {
            System.out.println("dto1 and dto2 is same");
        } else {
            System.out.println("dto1 and dto2 is not same");
        }
    }

    static class MemberDTO {
        public String name;
        public String email;
        public String phoneNumber;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true; //주소가 같으니까 당연히 true
            if (o == null || getClass() != o.getClass()) return false; // obj가 null이므로 당연히 false, 클래스의 종류가 다르므로 false
            MemberDTO memberDTO = (MemberDTO) o; //같은 클래스 이므로 형 변환 실행
            return Objects.equals(name, memberDTO.name) && Objects.equals(email, memberDTO.email) && Objects.equals(phoneNumber, memberDTO.phoneNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, email, phoneNumber);
        }
    }
}
