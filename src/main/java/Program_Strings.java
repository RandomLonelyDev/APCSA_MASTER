import java.util.Scanner;

public class Program_Strings {
    /*public static void main(String[] args) {
        Scanner scanline = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String firstWord = scanline.nextLine();
        System.out.print("Enter a second word: ");
        String secondWord = scanline.nextLine();
        if (firstWord.compareToIgnoreCase(secondWord) == 0) {
            System.out.println("The words are equal!");
        } else if(firstWord.compareToIgnoreCase(secondWord) < 0){
            System.out.format("The words in alphabetical order:\n\t%s\n\t%s",firstWord,secondWord);
        } else {
            System.out.format("The words in alphabetical order:\n\t%s\n\t%s",secondWord,firstWord);
        }
    }*/
    /*public static void main(String[] args) {
        Scanner scanline = new Scanner(System.in);
        System.out.print("Enter your name, incuding title(s): ");
        String name = scanline.next();
        if(name.startsWith("Mr.")){
            System.out.print("\nHello, sir.");
        } else if(name.startsWith("Ms.") || name.startsWith("Miss") || name.startsWith("Mrs.")){
            System.out.print("\nHello, ma,am.");
        } else {
            System.out.format("\nHello, %s.",name);
        }
    }*/
    /*public static void main(String[] args) {
        Scanner scanline = new Scanner(System.in);
        System.out.print("Enter a sentance: ");
        String sentance = scanline.nextLine();
        System.out.print("Enter a string: ");
        System.out.format(sentance.replaceAll(scanline.nextLine()+" ",""));
    }*/
    /*public static void main(String[] args) {
        Scanner scanline = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanline.nextLine().toLowerCase();
        int vowels = 0;
        for (int i = 0; i < text.length(); i++) {
            vowels = text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'?vowels+1:vowels;
        }
        System.out.format("The number of vowels in the text is %d",vowels);
    }*/
    public static void main(String[] args) {
        Scanner scanline = new Scanner(System.in);
        final int MAX_GUESSES = 3;
        final String PASSWORD = "thisisverysecure=D";
        int guesses = 0;
        do{
            System.out.print("Enter the password: ");
            if(scanline.nextLine().equals(PASSWORD)){
                break;
            }
            guesses++;
            System.out.format("\nINCORRECT PASSWORD. GUESSES REMAINING: %d\n",3-guesses);
        }while(guesses < MAX_GUESSES);
        System.out.print(guesses == MAX_GUESSES ?"ACCESS DENIED":"Welcome");
    }
}
