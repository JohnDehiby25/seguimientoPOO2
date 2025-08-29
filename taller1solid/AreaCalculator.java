public class AreaCalculator {
    
    public double sum(Shape[] shapes){
        double totalArea = 0;
        for(Shape s: shapes){
            totalArea += s.getArea();
        }
        return totalArea;
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Rectangle rectangle1 = new Rectangle(5, 2);

        Circle circle1 = new Circle(5);

        Shape [] shapes = {rectangle1,circle1};

        double area = calculator.sum(shapes);

        System.out.printf("El area del rectangulo es: %.2f\n", rectangle1.getArea());
        System.out.printf("El area del circulo es: %.2f\n",circle1.getArea());
        System.out.printf("La suma de areas es: %.2f\n", area );


    }
    
}
