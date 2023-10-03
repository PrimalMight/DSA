public class App {
    public static void main(String[] args) throws Exception {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        Node node6 = new Node();

        node1.addNeighbor(node6);
        node1.addNeighbor(node2);
        node1.addNeighbor(node4);

        node2.addNeighbor(node1);
        node2.addNeighbor(node3);
        node2.addNeighbor(node5);

        node5.addNeighbor(node4);

        node2.printNeighbors();
    }
}
