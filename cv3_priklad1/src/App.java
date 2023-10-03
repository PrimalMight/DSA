public class App {
    public static void main(String[] args) throws Exception {
        Canvas canvas = new Canvas(800, 800);

        canvas.addObject(new Circle(10, 10, 10));
        canvas.addObject(new Square(10, 10, 10));

        Multiple m = new Multiple(50, 50);
        m.addObject(new Circle(30, 30, 100));
        m.addObject(new Square(30, 30, 100));

        canvas.addObject(m);

        canvas.createCanvas();

    }
}
