/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer.pattern;

/**
 *
 * @author Hamza
 */
import java.util.ArrayList;
import java.util.List;

public class CricketMatch2 {
	
   private List<Observer> observers = new ArrayList<Observer>();
   private int score1;
   private String team1;

   public int getScore1() {
      return score1;
   }

   public void setScore1(int score) {
      this.score1 = score1;
      notifyAllObservers();
   }
   public int getTeam1() {
      return score1;
   }

   public void setTeam1(String team1) {
      this.team1 = team1;
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

