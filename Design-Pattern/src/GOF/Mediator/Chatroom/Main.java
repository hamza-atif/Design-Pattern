/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Mediator.Chatroom;

/**
 *
 * @author fa20-bse-018
 */
public class Main {
   public static void main(String[] args) {
      User hamza = new User("Hamza");
      User atif = new User("Atif");

      hamza.sendMessage("Hi! Hamza!");
      atif.sendMessage("Hello! Atif!");
   }
}
