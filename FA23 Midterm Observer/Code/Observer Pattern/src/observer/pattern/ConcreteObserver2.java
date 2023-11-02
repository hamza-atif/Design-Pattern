/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer.pattern;

/**
 *
 * @author Hamza
 */
public class ConcreteObserver2 extends Observer{

   public ConcreteObserver2(CricketMatch1 subject , CricketMatch2 subject2){
      this.subject = subject;
      this.subject.attach(this);
      this.subject2 = subject2;
      this.subject2.attach(this);
   }

   @Override
   public void update() {
     System.out.println( "The Name of team is " + subject.getTeam() ); 
     System.out.println( "The score of team is " +  subject.getScore() ); 
      System.out.println( "The Name of team2 is " + subject2.getTeam1() ); 
     System.out.println( "The score of team2 is " +  subject2.getScore1() ); 
   }
}