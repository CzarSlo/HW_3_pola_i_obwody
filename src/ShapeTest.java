public class ShapeTest {
    public static void main(String[] args) {

        Square squ = new Square(2.4);
        Rectangle rec = new Rectangle(4.1, 3.5);
        Circle cir = new Circle(3.5);
        Triangle tri = new Triangle(6.2, 5.1, 3.2, 3.0);

        ShapeCalculator obl = new ShapeCalculator();

        double wyn1 = obl.squareArea(squ);
        System.out.println("Pole trójkąta: " + wyn1);
        double wyn2 = obl.squarePerimeter(squ);
        System.out.println("Obwód trójkąta: " + wyn2);

        double wyn3 = obl.rectArea(rec);
        System.out.println("Pole prostokąta wynosi: " + wyn3);
        double wyn4 = obl.rectPerimeter(rec);
        System.out.println("Obwód prostokąta wynosi: " + wyn4);

        double wyn5 = obl.circleArea(cir);
        System.out.println("Pole okręgu wynosi: " + wyn5);
        double wyn6 = obl.circlePerimeter(cir);
        System.out.println("Obwód okręgu wynosi: " + wyn6);

        double wyn7 = obl.triangleArea(tri);
        System.out.println("Pole trójkąta wynosi: " + wyn7);
        double wyn8 = obl.trianglePerimeter(tri);
        System.out.println("Obwód trójkąta wynosi: " + wyn8);











    }
}
