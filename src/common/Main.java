/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import model.Element;


public class Main {
    public static void main(String[] args) {
//        Library l = new Library();
//        Element e = new Element();
//        e.setSize_array(l.getInt("Enter number of array: ", 1, 100));
//        e.setArray(l.createArray(e.size_array));
        String title = " Menu";
        String s[]=  new String[]{"bubble sort", "quick sort","exit"};
       SortProgramming p = new SortProgramming(title, s);
       p.run();
    }
}
