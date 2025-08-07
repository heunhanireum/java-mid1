package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // format 메서드(+를 사용하지 않고 더할 수 있다)
        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("숫자: %.2f", 10.1234);
        System.out.println(format2);

        // printf 바로 format을 받아서 출력하고 싶을 때 \n을 넣어줘야 줄바꿈
        System.out.printf("숫자: %.2f\n", 10.1234);

        // matches 메서드 - 정규표현식과 일치하는지
        //"Hello, Java!"
        String regex = "Hello, (Java!|World)";
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));
    }
}
