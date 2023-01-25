package Polimorpisme;

public class MainPol {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();
        Shape s3 = new Shape();

        s1.draw();
        s2.draw();
        s3.draw();
    }
}
