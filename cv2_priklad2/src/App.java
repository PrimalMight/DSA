public class App {
    public static void main(String[] args) throws Exception {
        Packet p1 = new Packet();
        Packet p2 = new Packet();
        Packet p3 = new Packet();
        Packet p4 = new Packet();


        p1.setNext(p2);
        p2.setNext(p3);
        p3.setNext(p4);
    }
}
