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
public class Warehouse {
    private int column;
    private int row;
    private int numberOfStoredProductItems;
    private ArrayList<Item> itemsStored;

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

    public int getNumberOfStoredProductItems() {
        return numberOfStoredProductItems;
    }

    public void setNumberOfStoredProductItems(int numberOfStoredProductItems) {
        this.numberOfStoredProductItems = numberOfStoredProductItems;
    }

    public ArrayList<Item> getItemsStored() {
        return itemsStored;
    }

    public void setItemsStored(ArrayList<Item> itemsStored) {
        this.itemsStored = itemsStored;
    }
   
}
