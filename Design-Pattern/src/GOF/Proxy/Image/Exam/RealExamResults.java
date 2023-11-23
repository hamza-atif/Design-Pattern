/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Proxy.Image.Exam;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author fa20-bse-018
 */
class RealExamResults implements ExamResults {
    private Map<String, String> answers;

    public RealExamResults() {
        answers = new HashMap<>();
    }

    @Override
    public void addAnswer(String question, String answer) {
        answers.put(question, answer);
    }

    @Override
    public void showResults() {
        for (Map.Entry<String, String> entry : answers.entrySet()) {
            System.out.println("Question: " + entry.getKey() + ", Answer: " + entry.getValue());
        }
    }

    @Override
    public ExamResults clone() {
        RealExamResults clone = new RealExamResults();
        clone.answers.putAll(this.answers);
        return clone;
    }
}
