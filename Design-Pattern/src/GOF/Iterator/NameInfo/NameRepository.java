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

public class NameRepository implements Container {
    public Student students[] = {
        new Student("1", "Muhammad Hamza", "Male", "123-456-7890"),
        new Student("2", "Hamza Atif", "Male", "987-654-3210"),
        new Student("3", "Maryam", "Female", "555-555-5555"),
        new Student("4", "Adan", "Female", "777-777-7777")
    };

    @Override
    public Iterator getIterator() {
        return new StudentIterator();
    }

    private class StudentIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return students[index--];
            }
            return null;
        }

        @Override
        public Object previous() {
            if (index < students.length - 1) {
                return students[++index];
            }
            return null;
        }

        @Override
        public void moveToLast() {
            index = students.length - 1;
        }

        @Override
        public void moveToFirst() {
            index = 0;
        }
    }
}