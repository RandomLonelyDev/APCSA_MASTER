package APCSA.TestResults;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AnswerSheet implements Scoreable<AnswerKey> {
    private List<String> answers = new ArrayList<>();

    protected AnswerSheet(List<String> answers) {
        this.answers = answers;
    }

    protected AnswerSheet(String... answers) {
        this.answers = Arrays.asList(answers);
    }

    protected static class ScoreException extends Exception{
        ScoreException(String msg) {
            super(msg);
        }

        ScoreException() {
            super();
        }
    }

    @Override
    public boolean isPassing(double score, double max, double threshold) {
        return (score/max) >= threshold;
    }
    public List<String> getAnswerList() {
        return  answers;
    }
}