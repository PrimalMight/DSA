import java.util.Random;

public class Packet {
    private String data;
    private Packet next;

    public Packet getNext() {
        return next;
    }

    public void setNext(Packet next) {
        this.next = next;
    }

   public Packet() {
       this.data = getSaltString();
   }

    public String getData() {
         return this.data;
    }

    public void setData(String data) {
        this.data = data;
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
