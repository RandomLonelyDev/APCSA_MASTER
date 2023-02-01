package APCSA.TestResults;


public interface Scoreable<Key> {
    public double score(Key key) throws AnswerSheet.ScoreException;
    public boolean isPassing(double score, double max, double threshold);
}
