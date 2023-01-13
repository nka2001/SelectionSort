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

    private List<T> items = new LinkedList<>();
    private int n;

    public SelectionSortALG() {
        this.n = 0;
    }

    public void addData(T Data) {

        items.add(Data);

    }

    @Override
    public String toString() {
        return items.toString();
    }

    public void sort() {
        
        if(items.get(0).compareTo(items.get(1)) < 0){
            T temp = items.get(0);
            items.set(0, items.get(1));
            items.set(1, temp);
            System.out.println("tue");
        }

    }

}
