public abstract class GrObject {
    private int x;
    private int y;

    public GrObject(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void drawObject(){
        System.out.println("Object drawn");
    }
    
}
