package enumeration.test;

import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        AuthGrade[] grades = AuthGrade.values();
        Menu[] menuLst = Menu.values();
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요" + Arrays.toString(grades) + ": ");

        String input = sc.nextLine();
        AuthGrade grade = AuthGrade.valueOf(input.toUpperCase()); //toUpperCase 써서 대소문자 구분없이 받을 수 있도록
        System.out.println("당신의 등급은 " + grade.getDescription() + "입니다.");
        System.out.println("==메뉴 목록==");
        for (Menu menu : menuLst) {
            if (menu.getLevel() <= grade.getLevel()) {
                System.out.println("- " + menu.getDescription());
            }
        }
    }
}
