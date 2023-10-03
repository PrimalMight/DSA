import java.util.ArrayList;
import java.util.Random;

public class Node {
    private ArrayList<Node> neighbors = new ArrayList<Node>();
    private String id;

    public Node() {
        this.id = getSaltString();
    }

    public void addNeighbor(Node neighbor) {
        neighbors.add(neighbor);
    }

    public Node getNeighbor(int index) {
        return neighbors.get(index);
    }

    public void printNeighbors() {
        for (Node neighbor : neighbors) {
            System.out.println(neighbor);
        }
    }

    public String toString() {
        return "Node id:   " + id + "\n";
    }

    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}
