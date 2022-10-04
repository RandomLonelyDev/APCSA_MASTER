import java.util.*;
public class Program_Loops_1 {
    /*public static void main(String[] args){
        for(int i = 0; i < 11; i++){
            System.out.println(i);
        }
    }*/
    /*public static void main(String[] args){
        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }
    }*/
    /*public static void main(String[] args){
        for (int i = 10; i < 22; i+=2) {
            System.out.format("%d ",i);
        }
    }*/
    /*public static void main(String[] args){
        for(int i = 11; i < 23; i+=2){
            System.out.println(i);
        }
    }*/
    /*public static void main(String[] args){
        String out = "";
        for(int i = 30; i > -1; i -= 6){
            out += String.format("%d, ",i);
        }
        System.out.print(out.substring(0,out.length()-2));
    }*/
    /*public static void main(String[] args){
        for(int i = 12; i < 34; i+=3){
            System.out.print(i);
        }
    }*/
    /*public static void main(String[] args){
        for(int i = 0; i < 1000001; i++){
            System.out.println(i);
        }
    }*/
    /*public static void main(String[] args){
        int out = 0;
        for(int i = 0; i < 6; i++){
            out += i;
        }
        System.out.print(out);
    }*/
    /*public static void main(String[] args){
        int out = 0;
        for(int i = 0, a = 1; i < 27; i++,a+=2){
            out += a;
        }
        System.out.print(out);
    }*/
    /*public static void main(String[] args){
        int out = 0;
        for(int i = 0; i < 6; i++){
            out += Math.pow(i,2);
        }
        System.out.print(out);
    }*/
    /*public static void main(String[] args){
        Scanner scanline = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("What is your name? ");
                String name = scanline.nextLine();
                System.out.format("How many times do you want your name printed %s? ", name);
                int times = scanline.nextInt();
                for (int i = 0; i < times; i++) {
                    System.out.format("%s\n", name);
                }
            } catch(InputMismatchException e){
                System.out.print("\nError.  Please enter a valid value.  Press 'Enter' to continue.");
                scanline.nextLine();
                scanline.nextLine();
            }
        }
    }*/
    public static void main(String[] args){
        Scanner scanline = new Scanner(System.in);
        while(true){
            try{

            } catch(InputMismatchException e){
                System.out.print("\nError.  Please enter a valid number.  Press'Enter' to coninue.");
                scanline.nextLine();
                scanline.nextLine();
            }
        }
    }
}
