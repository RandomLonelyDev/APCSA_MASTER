package APCSA;

public class Program_Loops {
    public static void main(String[] args){
        Loop_1.runWhile();
        Loop_1.runFor();
        Loop_2.runWhile();
        Loop_2.runFor();
        Loop_3.runWhile();
        Loop_3.runFor();
        Loop_4.runWhile();
        Loop_4.runFor();
        Loop_5.runWhile();
        Loop_5.runFor();
        Loop_6.runWhile();
        Loop_6.runFor();
    }
}
class Loop_1 {
    public static void runWhile(){
        int val = 1;
        System.out.println("Program 1 while:");
        while(val < 7) {
            System.out.println(val++);
        }
    }
    public static void runFor(){
        System.out.println("Program 1 for:");
        for(int i = 1; i < 7; i++){
            System.out.println(i);
        }
    }
}
class Loop_2 {
    public static void runWhile(){
        int val = 3;
        System.out.println("Program 2 while:");
        while(val < 10) {
            System.out.format("%d Avon\n",val++);
        }
    }
    public static void runFor(){
        System.out.println("Program 2 for:");
        for(int i = 3; i < 10; i++){
            System.out.format("%d Avon\n",i);
        }
    }
}
class Loop_3 {
    public static void runWhile(){
        int val = 4;
        System.out.println("Program 3 while:");
        while(val < 9) {
            System.out.format("%d ",val++);
        }
        System.out.println("\n");
    }
    public static void runFor(){
        System.out.println("Program 3 for:");
        for(int i = 4; i < 9; i++){
            System.out.format("%d ",i);
        }
        System.out.println("\n");
    }
}
class Loop_4 {
    public static void runWhile(){
        int val = 3;
        System.out.println("Program 4 while:");
        while(val < 15) {
            System.out.format("%d Loop\n",val+=3);
        }
        System.out.print("\n");
    }
    public static void runFor(){
        System.out.println("Program 4 for:");
        for(int i = 3; i < 15; i+=3){
            System.out.format("%d Loop\n",i);
        }
        System.out.print("\n");
    }
}
class Loop_5 {
    public static void runWhile() {
        int val = 6;
        System.out.println("Program 5 while:");
        while (val > 1) {
            System.out.format("%d\n", val--);
        }
        System.out.print("\n");
    }
    public static void runFor(){
        System.out.println("Program 5 for:");
        for(int i = 6; i > 1; i--){
            System.out.format("%d\n",i);
        }
        System.out.print("\n");
    }
}
class Loop_6 {
    public static void runWhile(){
        int val = 20;
        System.out.println("Program 6 while:");
        while(val > -1) {
            System.out.format("%d ",val);
            val -=5;
        }
        System.out.print("\n");
    }
    public static void runFor(){
        System.out.println("Program 6 for:");
        for(int i = 20; i > -1; i-=5){
            System.out.format("%d ",i);
        }
    }
}