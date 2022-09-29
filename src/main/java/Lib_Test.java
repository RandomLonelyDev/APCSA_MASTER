import libs.MathExtended;

import java.util.Random;

public class Lib_Test {
    public static void main(String[] args){
        Random random = new Random();
        for(var i = 0; i < 20; i++){
            System.out.println(MathExtended.misc.randomInt(0,7));
        }
    }
}
