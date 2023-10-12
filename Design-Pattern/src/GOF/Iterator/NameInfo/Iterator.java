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

public interface Iterator {
    boolean hasNext();
    Object next();
    Object previous();
    void moveToLast();
    void moveToFirst();
}
