/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlehashcode2016;

import java.util.ArrayList;

/**
 *
 * @author Lefteris Paraskevas
 */
public class Order {
    private int column;
    private int row;
    private int numberOfOrderedProductItems;
    private ArrayList<Item> itemsOrdered;

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getNumberOfOrderedProductItems() {
        return numberOfOrderedProductItems;
    }

    public void setNumberOfOrderedProductItems(int numberOfOrderedProductItems) {
        this.numberOfOrderedProductItems = numberOfOrderedProductItems;
    }

    public ArrayList<Item> getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(ArrayList<Item> itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }
   
}
