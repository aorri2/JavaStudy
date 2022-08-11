package finalizeTest;

public class FinalizeTest {

    public static void main(String[] args)
    {
        FinalizeTest test = new FinalizeTest();
        test = null; //test 객체의 참조를 없앰.
        System.gc(); //test 객체를 파괴하기 위해 gc를 호출
        System.out.println("참조되지 않은 객체 ex가 성공적으로 파괴되었습니다!");

    }

    @Override
    protected void finalize()
    {
        System.out.println("==finalize 메소드 내부==");
        System.out.println("객체를 파괴하기 전에 정리를 수행 합니다.");
        System.out.println("연결을 해제하고 닫습니다.");

    }
}
