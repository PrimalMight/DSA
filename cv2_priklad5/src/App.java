import java.util.HashSet;
import java.util.Scanner;

public class App {
    

    public static void main(String[] args) throws Exception {
        HraciPole pole = new HraciPole();
        HraciPole pole2 = new HraciPole();
        Scanner in = new Scanner(System.in);


        HashSet<HraciPole> mnozina = new HashSet<HraciPole>();
        mnozina.add(pole);
        mnozina.add(pole2);

        System.out.println(pole.hashCode());
        System.out.println(pole2.hashCode());
        System.out.println(pole.equals(pole2));
        System.out.println(pole2.equals(pole));

        while(pole.isSolved()){
            System.out.println("Current state: ");
            pole.printPole();

            System.out.println("Enter command (8-Up | 2-Down | 4-Left | 6-Right): ");
            int command = in.nextInt();


            switch(command){
                case 8:
                    pole.moveUp();
                    break;
                case 2:
                    pole.moveDown();
                    break;
                case 4:
                    pole.moveLeft();
                    break;
                case 6:
                    pole.moveRight();
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }

        in.close();
    }
}
