import java.util.Random;

public class ALv1_Test {
    public static void main(String[] args){
        Random random = new Random();
        for(var i = 0; i < 20; i++){
            System.out.println(random.ints(1,7).findFirst().getAsInt());
        }
    }
}
