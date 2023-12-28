/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABFINAL.AdmissionSystemExample;

/**
 *
 * @author Hamza
 */
class AdmissionQuotaDecorator implements Quota {
    public boolean checkQuotaAvailability() {
        // Quota Availability logic
        return true;
    }
}