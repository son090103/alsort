/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;
import view.Menu;

/**
 *
 * @author son
 */
public class SortProgramming extends Menu{
    ALgorithm a = new ALgorithm();
    Library l  = new Library();
    public SortProgramming(String title, String s[]){
        super(title, s);
    }
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number in Arrays: ");
                int n= sc.nextInt();
                int[] array=  l.createArray(n);
                a.display(array);
                a.buddleSort(array);
                a.display(array);
                break;
            }
            case 2: 
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number in Arrays: ");
                int n= sc.nextInt();
                int[] array=  l.createArray(n);
                a.display(array);
                a.quickSort(array, 0, array.length-1);
                a.display(array);
                break;
            }
             
            default:
            {
                System.out.println("Just only enter 1 or 2!");
            }
        }
    }
   
    
}
