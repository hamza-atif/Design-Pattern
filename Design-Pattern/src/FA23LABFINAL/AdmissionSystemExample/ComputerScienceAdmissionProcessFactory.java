/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABFINAL.AdmissionSystemExample;

/**
 *
 * @author Hamza
 */
class ComputerScienceAdmissionProcessFactory implements AdmissionProcessFactory {
    public AdmissionTest createAdmissionTest() {
        // Computer Science Admission Test creation logic
        return new AdmissionTest();
    }

    public Interview createInterview() {
        // Computer Science Interview creation logic
        return new Interview();
    }
}