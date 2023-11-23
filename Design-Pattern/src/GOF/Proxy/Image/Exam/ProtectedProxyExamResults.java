/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Proxy.Image.Exam;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hamza
 */
class ProtectedProxyExamResults implements ExamResults {
    private RealExamResults realExamResults;
    private Map<String, String> studentAnswers;
    private boolean isTeacher;

    public ProtectedProxyExamResults(boolean isTeacher) {
        this.isTeacher = isTeacher;
        realExamResults = new RealExamResults();
        studentAnswers = new HashMap<>();
    }

    @Override
    public void addAnswer(String question, String answer) {
        if (!isTeacher) {
            studentAnswers.put(question, answer);
        } else {
            realExamResults.addAnswer(question, answer);
        }
    }

    @Override
    public void showResults() {
        if (!isTeacher) {
            System.out.println("Your Results:");
            for (Map.Entry<String, String> entry : studentAnswers.entrySet()) {
                System.out.println("Question: " + entry.getKey() + ", Answer: " + entry.getValue());
            }
        } else {
            System.out.println("Exam Results:");
            realExamResults.showResults();
        }
    }

    @Override
    public ExamResults clone() {
        ProtectedProxyExamResults clone = new ProtectedProxyExamResults(this.isTeacher);
        if (!isTeacher) {
            clone.studentAnswers.putAll(this.studentAnswers);
        } else {
            clone.realExamResults = (RealExamResults) this.realExamResults.clone();
        }
        return clone;
    }
}