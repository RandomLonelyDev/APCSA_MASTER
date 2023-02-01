package APCSA.TestResults;

import org.jetbrains.annotations.NotNull;

public class AnswerKey extends AnswerSheet {
    private int defValue = 0;
    public AnswerKey(String... answers) {
        super(answers);
        defValue = answers.length;
    }

    @Override
    public double score(AnswerKey key) throws ScoreException {
        if(key.equals(this)) return defValue; else throw new ScoreException("Keys cannot score eachother");
    }
}
