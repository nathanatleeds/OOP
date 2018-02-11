class Rectangle{
    
    private double width;
    private double height;
    
    public Rectangle(){
        this(1.0, 1.0);
    }
    
    public Rectangle(double w, double h){
        setWidth(w);
        setHeight(h);
    }
    
    public void setWidth(double w){
        width = w;
    } 
    
    public void setHeight(double h){
        height = h;
    } 
            
    public double getWidth(){
        return width;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getArea(){
        return width * height;
    }
    
    public double getPerimeter(){
        return 2 * (width + height);
    } 
}

public class Ex6 {
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3.5, 12);
        
        System.out.println("r1 width: " + r1.getWidth());
        System.out.println("r1 height: " + r1.getHeight());
        System.out.println("r1 area: " + r1.getArea());
        System.out.println("r1 perimeter: " + r1.getPerimeter());
        
        System.out.println("r2 width: " + r2.getWidth());
        System.out.println("r2 height: " + r2.getHeight());
        System.out.println("r2 area: " + r2.getArea());
        System.out.println("r2 perimeter: " + r2.getPerimeter());
    }
}
