/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABFINAL.AdmissionSystemExample;

/**
 *
 * @author Hamza
 */
abstract class AdmissionHandler {
    protected AdmissionHandler successor;

    public void setSuccessor(AdmissionHandler successor) {
        this.successor = successor;
    }

    public abstract void processAdmission(Student student, Discipline discipline);
}
