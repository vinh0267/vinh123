package rikkei.academy;

import Bai2.rikkei.academy.Shape;
import Bai2.rikkei.academy.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Shape[] shapes = new Shape[]{square, circle, rectangle};
        for (Shape s : shapes) {
            if (s instanceof Square) {
                ((Square) s).howToColor();
            } else {
                System.out.println("Area = " + s.getArea());
            }
        }
    }
}
