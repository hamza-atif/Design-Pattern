/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABFINAL.AdmissionSystemExample;

/**
 *
 * @author Hamza
 */
import java.util.*;

public class AdmissionSystemMain {
    public static void main(String[] args) {
        // Usage example based on the Admission System
        AdmissionHandler handler1 = new DMCMarksHandler();
;

        // Setting the chain of responsibility
        handler1.setSuccessor(handler1);

        // Other code to interact with the admission system components
    }
}
