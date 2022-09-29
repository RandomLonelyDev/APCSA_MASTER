public class Paws {
    public static void main(String[] args){
        int x = 2;
        int y = 3;
        int temp;
        System.out.format("x = %d\ny = %d\n",x,y);
        temp = x;
        x = y;
        y = temp;
        System.out.format("x = %d\ny = %d\n",x,y);
    }
}
