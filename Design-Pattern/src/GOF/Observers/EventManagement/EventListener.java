/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Observers.EventManagement;


import java.io.File;

public interface EventListener {
//    void update(String eventType, File file);
    void update(String eventType, Object file);
}
