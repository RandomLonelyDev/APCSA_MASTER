package APCSA.TestResults;

import java.util.*;

public class TestResults {
    private List<StudentAnswerSheet> sheets = new ArrayList<>();

    public TestResults(List<StudentAnswerSheet> sheets) {
        if(sheets.size() > 0) this.sheets = sheets; else throw new IllegalArgumentException("List cannot have zero elements");
    }

    public String highestScoringStudent(AnswerKey key) {
        LinkedHashMap<StudentAnswerSheet, Double> scores = new LinkedHashMap<>();
        for(StudentAnswerSheet s : sheets) scores.put(s, s.score(key));
        List<Map.Entry<StudentAnswerSheet, Double>> scoreList = new LinkedList<>(scores.entrySet());
        scoreList.sort((v1, v2) -> v2.getValue().compareTo(v1.getValue()));
        return scoreList.get(0).getKey().getName();
    }
}
