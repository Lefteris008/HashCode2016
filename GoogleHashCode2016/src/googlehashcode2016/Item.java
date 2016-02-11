/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlehashcode2016;

/**
 *
 * @author Lefteris Paraskevas
 */
public class Item {
    private int productType;
    private int productQuantity;

    public Item(int productType, int productQuantity) {
        this.productType = productType;
        this.productQuantity = productQuantity;
    }

    
    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}
