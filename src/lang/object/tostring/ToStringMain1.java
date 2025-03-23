package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 반환값 출력
        System.out.println(string);
        //출력하면 java.lang.Object@34a245ab 라고 나오는데,
        //java.lang.Object : 클래스에 대한 정보
        //@34a245ab : 참조값

        //object 직접 출력: string 출력할때랑 똑같이 출력됨
        System.out.println(object);
        System.out.println(object);
    }
}
