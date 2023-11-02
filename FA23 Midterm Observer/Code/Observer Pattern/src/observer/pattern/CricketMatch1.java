/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer.pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;

public class CricketMatch1 {
	
   private List<Observer> observers = new ArrayList<Observer>();
   private int score;
   private String team;

   public int getScore() {
      return score;
   }

   public void setScore(int score) {
      this.score = score;
      notifyAllObservers();
   }
   public String getTeam() {
      return team;
   }

   public void setTeam(String team) {
      this.team = team;
      notifyAllObservers();
   }
   public void attach(Observer observer){
      observers.add(observer);		
   }
   public void detach(Observer observer){
       observers.remove(observer);
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}
