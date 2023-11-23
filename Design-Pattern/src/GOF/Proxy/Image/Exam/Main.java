/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Proxy.Image.Exam;

/**
 *
 * @author Hamza
 */
public class Main{
    public static void main(String[] args) {
        // Creating a teacher's view of the ExamResults
        ExamResults teacherView = new ProtectedProxyExamResults(true);
        teacherView.addAnswer("Q1", "Teacher's Answer1");
        teacherView.addAnswer("Q2", "Teacher's Answer2");

        // Creating a student's view of the ExamResults
        ExamResults studentView = new ProtectedProxyExamResults(false);
        studentView.addAnswer("Q1", "Student's Answer1");
        studentView.addAnswer("Q3", "Student's Answer3");

        // Teacher views the full ExamResults
        System.out.println("Teacher's View:");
        teacherView.showResults();
        System.out.println("");

        // Student views only their ExamResults
        System.out.println("Student's View:");
        studentView.showResults();
    }
}