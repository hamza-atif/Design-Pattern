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
    public String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }

        @Override
        public Object previous() {
            if (index > 0) {
                return names[--index];
            }
            return null;
        }

        @Override
        public void moveToLast() {
            index = names.length - 1;
        }

        @Override
        public void moveToFirst() {
            index = 0;
        }
    }
}