/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.selectionsort;

/**
 *
 * @author nicka
 */
public class SelectionSort {

    public static void main(String[] args) {
       SelectionSortALG s = new SelectionSortALG();
       s.addData("A");
       s.addData("B");
       s.addData("final test");
       
       s.sort();
        System.out.println(s.toString());
    }
}
