import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HraciPole implements Comparable<HraciPole>{
    private int rows = 3;
    private int cols = 3;
    private int[][] pole = new int[rows][cols];
    private int[] key = generateKey(9);

    private void InitPole(){
        int k = 0;
        for(int[] row : pole)
        {
            for(int i = 0; i < row.length; i++){
                if(key[k] != 9){
                    row[i] = key[k];
                    k++;
                }
                else{
                    row[i] = 0; // 0 is empty space
                    k++;
                }

            }   
        }
            
    }

    @Override
    public int hashCode(){
        int hash = 0;
        int k = 0;
        for(int[] row : pole){
            for(int i : row){
                hash += i * Math.pow(10, k);
                k++;
            }
        }
        return hash;
    }

    @Override
    public int compareTo(HraciPole o) {
        int hash1 = this.hashCode();
        int hash2 = o.hashCode();
        if(hash1 > hash2){
            return 1;
        }
        else if(hash1 < hash2){
            return -1;
        }
        else{
            return 0;
        }
    }
   

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(!(o instanceof HraciPole)){
            return false;
        }
        int hash1 = this.hashCode();
        int hash2 = o.hashCode();
        if(hash1 != hash2){
            return false;
        }
        return true;
    }

    private int[] generateKey(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    private int[] locateZero(){
        int[] coordinates = new int[2];

        for(int i = 0; i < pole.length; i++){
            for(int j = 0; j < pole[i].length; j++){
                if(pole[i][j] == 0){
                    coordinates[0] = i;
                    coordinates[1] = j;
                    return coordinates;
                }
            }
        }

        return null;
    }

    public void printPole(){
        for(int[] row : pole){
            for(int i : row){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public HraciPole(){
        InitPole();
        
    }

    public void moveUp(){
        int[] coordinates = locateZero();
        if(coordinates[0] == 0){
            System.out.println("Can't move up");
        }
        else{
            pole[coordinates[0]][coordinates[1]] = pole[coordinates[0]-1][coordinates[1]];
            pole[coordinates[0]-1][coordinates[1]] = 0;
        }
    }

    public void moveDown(){
        int[] coordinates = locateZero();
        if(coordinates[0] == 2){
            System.out.println("Can't move down");
        }
        else{
            pole[coordinates[0]][coordinates[1]] = pole[coordinates[0]+1][coordinates[1]];
            pole[coordinates[0]+1][coordinates[1]] = 0;
        }
    }

    public void moveLeft(){
        int[] coordinates = locateZero();
        if(coordinates[1] == 0){
            System.out.println("Can't move left");
        }
        else{
            pole[coordinates[0]][coordinates[1]] = pole[coordinates[0]][coordinates[1]-1];
            pole[coordinates[0]][coordinates[1]-1] = 0;
        }   
    }

    public void moveRight(){
        int[] coordinates = locateZero();
        if(coordinates[1] == 2){
            System.out.println("Can't move right");
        }
        else{
            pole[coordinates[0]][coordinates[1]] = pole[coordinates[0]][coordinates[1]+1];
            pole[coordinates[0]][coordinates[1]+1] = 0;
        }
    }

    public Boolean isSolved(){
        return true;
    }

}
