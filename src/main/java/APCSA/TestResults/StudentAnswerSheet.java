package APCSA.TestResults;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentAnswerSheet extends AnswerSheet {
    private String name;
    private Optional<Double> score;
    public StudentAnswerSheet(String name, List<String> answers) {
        super(answers);
        this.name = name;
    }

    @Override
    public double score(AnswerKey key) {
        double total = 0;
        for(int i = 0; i < key.getAnswerList().size(); i++) {
            try {
                String correct = key.getAnswerList().get(i), sAnswer = getAnswerList().get(i);
                total += sAnswer.equals(correct) ? 1 : sAnswer.equals("?") ? 0 : -0.25;
            } catch(IndexOutOfBoundsException e) {
                System.out.println("IOBE");
                total -= 0.25;
            }
        }
        score = Optional.of(total);
        return total;
    }

    public Optional<Double> getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
