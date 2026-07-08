package hard1;

public class Rectangle implements Shape{
    private double width;
    private double height;

    public Rectangle (double width, double height){
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea(){
        return height * width;
    }
}
