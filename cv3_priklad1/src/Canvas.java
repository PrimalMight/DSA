import java.util.ArrayList;

public class Canvas {
    private int width;
    private int height;
    private ArrayList<GrObject> objects = new ArrayList<GrObject>();

    public Canvas(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void addObject(GrObject object){
        this.objects.add(object);
    }

    public void createCanvas(){
        System.out.println("Canvas created");
    }
    
}
