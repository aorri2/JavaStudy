package reference;

class MemberDto {
    String name;
    private static MemberDto memberDto;

    private MemberDto() {

    }

    static MemberDto getInstance() {
        if (memberDto == null) {
            memberDto = new MemberDto();
        }
        return memberDto;
    }

    public MemberDto(String name) {
        this.name = name;
    }

    public static MemberDto forName(String name) {
        return new MemberDto(name);
    }


}
