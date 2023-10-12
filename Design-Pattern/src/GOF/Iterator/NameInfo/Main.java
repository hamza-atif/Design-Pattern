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


        String startingValue = "Muhammad"; 
        printStudentsWithNameStartingFrom(iter, startingValue);


        iter.moveToLast();
        printAllStudents(iter);
    }

    public static void printStudentsWithNameStartingFrom(Iterator iterator, String startingValue) {
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.getName().startsWith(startingValue)) {
                System.out.println("Name: " + student.getName());
            }
        }
    }

    public static void printAllStudents(Iterator iterator) {
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println("RegNo: " + student.getRegNo());
            System.out.println("Name: " + student.getName());
            System.out.println("Gender: " + student.getGender());
            System.out.println("Phone Number: " + student.getPhoneNumber());
            System.out.println();
        }
    }
}