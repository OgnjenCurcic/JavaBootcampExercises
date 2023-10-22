package TestExericses;

public class TriangleTypeDeterminer {

    public String determineTypeOfTriangle(int a, int b, int c) {

        if (a == 0 || b == 0 || c == 0) {
            return "Invalid value input";
        }

        if (a == b && a == c && b == c) {
            return "Equilateral triangle";
        } else if (a == b || a == c || b == c) {
            return "Isoscales triangle";
        } else if (a + b > c && a + c > b && b + c > a) {
            return "Scalane triangle";
        } else {
            return "Not a triangle";
        }
    }

    public static void main(String[] args) {

        TriangleTypeDeterminer determiner = new TriangleTypeDeterminer();

        int a = 10;
        int b = 10;
        int c = 10;

        String triangleType = determiner.determineTypeOfTriangle(a, b, c);
        System.out.println("Triangle type: " + triangleType);

    }

}
