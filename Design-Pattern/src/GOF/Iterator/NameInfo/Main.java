/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Iterator.NameInfo;

/**
 *
 * @author fa20-bse-018
 */
public class Main {
	
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        Iterator iter = namesRepository.getIterator();
        while (iter.hasNext()) {
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }
        
        // Move to last
        iter.moveToLast();
        System.out.println("Last Name in list is: " + iter.next());
        
        // Move to first
        iter.moveToFirst();
        System.out.println("First Name in list is: " + iter.next());
    }
}