public class Circle extends GrObject {
    private int radius;

    public Circle(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void drawObject() {
        System.out.println("Circle drawn");
    }
    
}
