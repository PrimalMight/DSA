import java.util.List;

public class Rtp {
    public List<Packet> stream;

    public Rtp(List<Packet> packets) {
        this.stream = packets;
    }
    
    public void stream(){
        for(Packet packet : this.stream) {
            if(packet.next != null) {
                System.out.println(packet.id + " -> " + packet.next.id);
            } else {
                System.out.println(packet.id + " -> null");
            }
        }
    }
}
