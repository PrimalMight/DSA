public class Square extends GrObject {
    private int side;

    public Square(int x, int y, int side){
        super(x, y);
        this.side = side;
    }

    @Override
    public void drawObject() {
        System.out.println("Square drawn");
    }
}
