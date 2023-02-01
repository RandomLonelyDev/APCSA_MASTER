package APCSA.TestResults;

import java.util.Arrays;

public class Scorer {
    public static void main(String[] args) {
        StudentAnswerSheet s1 = new StudentAnswerSheet("Bob", Arrays.asList("A", "B", "?", "C"));
        StudentAnswerSheet s2 = new StudentAnswerSheet("Ted", Arrays.asList("A", "D", "C", "B"));
        AnswerKey k1 = new AnswerKey("A", "B", "C", "D");
        TestResults p1 = new TestResults(Arrays.asList(s1, s2));
        System.out.print("KEY -"); k1.getAnswerList().forEach(c -> System.out.print(" " + c));
        System.out.format("\n%s -", s1.getName()); s1.getAnswerList().forEach(c -> System.out.print(" " + c));
        System.out.format("\n%s's score - %.2f", s1.getName(), s1.score(k1));
        System.out.format("\n%s - %s", s2.getName(), s2.getAnswerList());
        System.out.format("\n%s's score - %.2f", s2.getName(), s2.score(k1));
        System.out.format("\n%s has the highest score!", p1.highestScoringStudent(k1));

        System.out.println("\nMap of 1.5 to system of 9: ");
    }


    private static double map(double startMin, double startMax, double endMin, double endMax, double val) {
        return (val - startMin) * (endMax - endMin) / (startMax - startMin) + endMin;
    }
}
