public class Rectangle {
    
    private final double width;
    private final double height;

    public Rectangle(double width, double height){

        this.width = width;
        this.height = height;
    }

    public double getWidht(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return width*height;
    }

}
