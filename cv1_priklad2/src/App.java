public class App {
    public static void main(String[] args) throws Exception {
        Auto auto1 = new Auto("auticko1", "win1", "SKODA" , 100000, null);
        Auto auto2 = new Auto("auticko2", "win2", "BMW", 200000, auto1);
        Auto auto3 = new Auto("auticko3", "win3", "MERCEDES", 300000, auto2);

        // references
        Auto t1 = auto1;
        Auto t2 = auto2;
        Auto t3 = auto1;
        Auto t4 = auto3;

        System.out.println("auto3 neighboor: " + auto3.vlevo.nazev);
    }
}
