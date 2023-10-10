public class My_LList{
    private Node head = new Node(0, null);

    public void add(int value){
        head.next = new Node(value, head.next);
    }

    public void remove(int value){
        if (head.next == null){
            return;
        }
        Node current = head.next;
        Node previous = head;
        
        while (current != null){
            if (current.value == value){
                previous.next = current.next;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public boolean contains(int value){
       Node current = head.next;

        while (current != null){
            if (current.value == value){
            return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty(){
        return head.next == null;
    }

    public int size(){
        int count = 0;
        Node current = head.next;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public String toString(){
        String result = "My_LList instance structure:\n";
        Node current = head.next;
        while (current != null){
            result += current.toString() + " " + " ---> " + " ";
            current = current.next;
        }
        result += "\n";
        return result;
    }
}