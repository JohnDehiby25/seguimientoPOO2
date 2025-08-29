public class AreaCalculator {
    
    public double sum(Object[] shapes){
        double totalArea = 0;
        for(Object shape:shapes){
            if(shape instanceof Rectangle){
                Rectangle rectangle= (Rectangle) shape;
                totalArea+=rectangle.getWidht()* rectangle.getHeight();
            }
            if(shape instanceof Circle){
                Circle circle = (Circle) shape;
                totalArea += Math.PI * circle.getRadius()*circle.getRadius();
            }
        }
        return totalArea;
    }
    
}
