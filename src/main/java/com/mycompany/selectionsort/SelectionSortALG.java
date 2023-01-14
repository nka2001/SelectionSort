package com.mycompany.selectionsort;

import java.util.LinkedList;
import java.util.List;

/**
 * Selection sort class, this will sort a given generic list
 *
 * @author nicka
 * @param <T>
 */
public class SelectionSortALG<T extends Comparable<T>> {

    private List<T> items = new LinkedList<>();//list of generics
   
    
    /**
     * default constructor, does nothing.
     */
    public SelectionSortALG() {
        //do nothing here
    }

    /**
     * addData method, adds data to the linked list of type T
     * @param Data 
     */
    public void addData(T Data) {

        items.add(Data);//add data to the list

    }
    
    /**
     * toString method, returns the contents of the list
     * @return 
     */
    @Override
    public String toString() {
        return items.toString();//call toString on the linked list to print its contents
    }

    /**
     * sort method, will perform selection sort on the linked list.
     */
    public void sort() {
        
        int n = items.size();//n is the total number of elements 
        
        for(int i = 0; i < n-1; i++){//start at the list and move through the list
            
            int minIndex = i;//set the minimum index (smallest in the list) to whatever i is 
            
            for(int j = i+1; j < n; j++){//now loop through again, to find the absolute smallest in the list
                if(items.get(j).compareTo(items.get(minIndex)) < 0){//if the data at index j is smaller than the minIndex then set j to the minIndex
                    minIndex = j;
                }
            }
            
            //now swap 
            T temp = items.get(minIndex);//set a temp
            items.set(minIndex, items.get(i));//swap minIndex with i
            items.set(i, temp);//then set i with temp
        }

    }

}
