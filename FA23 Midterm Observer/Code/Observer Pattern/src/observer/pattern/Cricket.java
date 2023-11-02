/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer.pattern;

/**
 *
 * @author Hamza
 */
public class Cricket {
   public static void main(String[] args) {
      CricketMatch1 subject = new CricketMatch1();
      CricketMatch2 subject2 = new CricketMatch2();

      ConcreteObserver1 ob =new ConcreteObserver1(subject,subject2);
      
      ConcreteObserver2 ob1 =new ConcreteObserver2(subject,subject2);
      
      //subject.detach(ob); 
//      System.out.println("Cricket Match 1 ");
//      System.out.println("Score of Match 1 is:");	
      subject.setScore(150);
      subject.setTeam("Pakistan");
      subject2.setScore1(200);
      subject2.setTeam1("India");

   }
}
