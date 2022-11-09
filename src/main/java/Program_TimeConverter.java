import java.util.*;
public class Program_TimeConverter {
    public static void main(String[] args) {
        System.out.print("TIME CONVERTER\n----------------\n1. Hours to minutes\n2. Days to hours\n3. Minutes to hours\n4. Hours to days\n>>: ");
        switch (new Scanner(System.in).nextInt()) {
            case 1 -> {
                System.out.print("\nEnter the number of hours: ");
                System.out.print(hTM(new Scanner(System.in).nextLong()));
            }
            case 2 -> {
                System.out.print("\nEnter the number of days: ");
                System.out.print(dTH(new Scanner(System.in).nextLong()));
            }
            case 3 -> {
                System.out.print("\nEnter the number of minutes: ");
                System.out.print(mTH(new Scanner(System.in).nextLong()));
            }
            case 4 -> {
                System.out.print("\nEnter the number of hours: ");
                System.out.print(hTD(new Scanner(System.in).nextLong()));
            }
        }
    }
    public static String hTM(long hours){return String.format("There are %.2f minutes in %d hours.",hours*60.00,hours);}
    public static String dTH(long days){return String.format("There are %.2f hours in %d days.",days*24.00,days);}
    public static String mTH(long minutes){return String.format("There are %.2f hours in %d minutes.",minutes/60.0,minutes);}
    public static String hTD(long hours){return String.format("There are %.2f days in %d hours.",hours/24.0,hours);}
}