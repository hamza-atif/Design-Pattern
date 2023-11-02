/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer.pattern;

/**
 *
 * @author Hamza
 */

public abstract class Observer {
   protected CricketMatch1 subject;
   protected CricketMatch2 subject2;
   public abstract void update();
}