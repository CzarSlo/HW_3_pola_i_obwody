public class ShapeCalculator {

    double squareArea(Square square) {
        double area = square.flank * 2;
        return area;
    }
    double squarePerimeter(Square square) {
        double perimeter = square.flank * 4;
        return perimeter;
    }
    double rectArea(Rectangle rectangle) {
        double area = rectangle.longerFlank * rectangle.shorterFlank;
        return area;

    double rectPerimeter(Rectangle rectangle) {
        double perimeter = 2 * (rectangle.longerFlank + rectangle.shorterFlank);
        return perimeter;
    }

    double circleArea(Circle circle) {
        double area = (circle.radius)^2 * 3.14;
        return area;
    }
    double circlePerimeter(Circle circle) {
        double perimeter = 2 * 3.14 * (circle.radius);
        return perimeter;
        }

        double triangleArea(Triangle triangle) {
            double area = (triangle.basis * triangle.height)/2;
            return area;
        }

    double trianglePerimeter(Triangle triangle) {
        double perimeter = triangle.basis + triangle.secondFlank + triangle.thirdFlank;
        return perimeter;
        }
}
