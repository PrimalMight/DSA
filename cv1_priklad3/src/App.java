import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Packet> packets = new ArrayList<Packet>();

        for(int i= 0; i < 10; i++) {
            packets.add(new Packet(i));
            if(i != 0) {
                packets.get(i-1).next = packets.get(i);
            }
        }

        Rtp rtp = new Rtp(packets);
        rtp.stream();
        
    }
}
