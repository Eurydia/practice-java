/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.ArrayBag;

/**
 *
 * @author bli
 */
public class TestBag {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayBag arrayBag = new ArrayBag();
        ArrayBag arrayBag2 = new ArrayBag();
        arrayBag.add("a", 21);
        arrayBag.add("b", 33);
        arrayBag.add("c", 32);
        arrayBag2.add("a", 42);
        arrayBag2.add("c", 12);
        System.out.println("The union of " + arrayBag + " and " + arrayBag2 + " is " + arrayBag.union(arrayBag2) + ".");
        //System.out.println("The intersection of " + bag + " and " + bag2 + " is " + bag.intersection(bag2) + ".");
        //System.out.println("The difference of " + bag + " and " + bag2 + " is " + bag.difference(bag2) + ".");        
    }
}