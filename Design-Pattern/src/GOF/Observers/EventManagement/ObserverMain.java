/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Observers.EventManagement;



import GOF.Observers.EventManagement.Editor;
import GOF.Observers.EventManagement.EmailNotificationListener;
import GOF.Observers.EventManagement.LogOpenListener;
import GOF.Observers.EventManagement.SMSSupportListener;


public class ObserverMain {
    public static void main(String [] args){
        Editor editor = new Editor();
        
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        editor.events.subscribe("sms", new SMSSupportListener("03474844425"));
        
        

        try {
            editor.openFile("test.txt");
            editor.saveFile();
            editor.sendSMS("File has been created.","03160227807");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


