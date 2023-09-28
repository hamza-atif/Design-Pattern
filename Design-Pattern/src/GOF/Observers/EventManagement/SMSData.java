/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Observers.EventManagement;

 
import GOF.Observers.EventManagement.Editor;

import java.io.File;
import java.io.*;
import java.util.*;

public class SMSData {
    private String message;
    private String phoneNumber;
    
    public SMSData(String message, String phonenumber) {
        this.message = message;
        this.phoneNumber = phonenumber;
    }


    public String getMessage() {
        return message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
