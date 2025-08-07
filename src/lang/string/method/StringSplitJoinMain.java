package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        String joinStr = "";
    /*
        join을 사용하지 않을 경우
        for (String string : splitStr) {
            joinStr += string + "-";
        }
        joinStr = Apple-Banana-Orange-

        // Orange- 뒤에 있는 - 빼려면
        for (int i = 0; i < splitStr.length; i++) {
            String string = splitStr[i];
            joinStr += string;
            if (i != splitStr.length-1) {
                joinStr += "-";
            }
        }
        System.out.println("joinStr = " + joinStr);
    */
        // join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
