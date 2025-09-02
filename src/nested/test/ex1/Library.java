package nested.test.ex1;

import java.util.Arrays;

public class Library {

    private Book[] books;
    private int idx;

    public Library(int num) {
        books = new Book[num];
        idx = 0;
    }

    public void addBook(String title, String author) {
        //검증 로직을 다 처리하고
        if (idx >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        //정상 로직을 처리
        books[idx++] = new Book(title, author);


        /*
        if (idx >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
        } else {
            books[idx++] = new Book(title, author);
        }
        */

    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < idx; i++) {
            // 내부 클래스 필드 private 이어도 접근 가능 - 양방향으로 접근 가능
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }

    // Library 관련 사용해야 한다면 static 빼도 됨
    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
