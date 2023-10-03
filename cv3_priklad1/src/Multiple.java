import java.util.ArrayList;

public class Multiple extends GrObject{
    private ArrayList<GrObject> objects = new ArrayList<GrObject>();

    public Multiple(int x, int y) {
        super(x, y);
    }

    public void addObject(GrObject object){
        objects.add(object);
    }
    
}
