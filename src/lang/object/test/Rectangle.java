package lang.object.test;

import java.util.Objects;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

/*
    //내가만든거
    @Override
    public String toString() {
        return "Rectangle{width=" + this.width + ", height=" + this.height + "}";
    }
*/

    //IDE가 만들어준거
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

/*
    //내가만든거
    @Override
    public boolean equals(Object obj) {
        Rectangle rect = (Rectangle) obj;
        if (this.width == rect.width && this.height == rect.height) {
            return true;
        }
        return false;
    }
*/

    //IDE가 만들어준거
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return width == rectangle.width && height == rectangle.height;
    }
}
