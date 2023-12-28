/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABFINAL.AdmissionSystemExample;

/**
 *
 * @author Hamza
 */
class DMCMarksHandler extends AdmissionHandler {
    public void processAdmission(Student student, Discipline discipline) {
        // DMCMarksHandler logic for processing admission
        if (successor != null) {
            successor.processAdmission(student, discipline);
        }
    }
}
