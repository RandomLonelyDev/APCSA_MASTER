package APCSA.Overflower;

public class Overflower {
    public static void main(String[] args){
        int count = 0;
        do{
            count++;
        }while(count >= 0);
        System.out.format("Ints can be between %d and %d.",count,count-1);
    }
}
