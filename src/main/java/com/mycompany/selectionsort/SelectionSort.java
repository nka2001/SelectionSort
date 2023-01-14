package com.mycompany.selectionsort;

/**
 * Main class for selection sort, creates two objects and tests selection sort on it 
 * @author nicka
 */
public class SelectionSort {

    public static void main(String[] args) {
        
       //selection sort on strings
       SelectionSortALG<String> s = new SelectionSortALG();
       s.addData("F");
       s.addData("A");
       s.addData("C");
       
       s.sort();
       System.out.println(s.toString());
        
       //selection sort on integers
       SelectionSortALG<Integer> s2 = new SelectionSortALG();
       s2.addData(12);
       s2.addData(2);
       s2.addData(6);
       
       s2.sort();
        System.out.println(s2.toString());
        

       
       
       
    }
}
