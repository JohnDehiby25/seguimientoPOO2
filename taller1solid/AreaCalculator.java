public class AreaCalculator {
    
    public double sum(Object[] shapes){
        double totalArea = 0;
        for(Object shape:shapes){
            if(shape instanceof Rectangle){
                Rectangle rectangle= (Rectangle) shape;
                totalArea+=rectangle.getArea();
            }
            if(shape instanceof Circle){
                Circle circle = (Circle) shape;
                totalArea += circle.getArea();
            }
        }
        return totalArea;
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Rectangle rectangle1 = new Rectangle(20, 5);

        Circle circle1= new Circle(10);

        Object[] shapes ={rectangle1,circle1};

        double getArea = calculator.sum(shapes);

        System.out.println("El área total es: " + getArea);
    }
    
}
