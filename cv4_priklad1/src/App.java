public class App {
    public static void main(String[] args) throws Exception {
        My_LList list = new My_LList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(2);

        System.out.println("size: " + list.size());
        System.out.println(list.toString());

        System.out.println("has 1?:" + list.contains(1));
        System.out.println("has 2?:" + list.contains(2));

        System.out.println("empty?:" + list.isEmpty());

        list.reverse();
        System.out.println(list.toString());
        System.out.println("head: " + list.getHead());
        System.out.println("head.next: " + list.getHead().next);
        list.add(100);
        System.out.println(list.toString());
        System.out.println("tail: " + list.getTail());
    }
}
