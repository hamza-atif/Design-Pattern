/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABFINAL.AdmissionSystemExample;

/**
 *
 * @author Hamza
 */
class OtherDisciplinesAdmissionProcessFactory implements AdmissionProcessFactory {
    public AdmissionTest createAdmissionTest() {
        // Other Disciplines Admission Test creation logic
        return new AdmissionTest();
    }

    public Interview createInterview() {
        // Other Disciplines Interview creation logic
        return new Interview();
    }
}