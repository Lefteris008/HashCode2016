/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlehashcode2016;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lefteris Paraskevas
 */
public class GoogleHashCode2016 {
    
    private static int rows;
    private static int columns;
    private static int drones;
    private static int turns;
    private static int maxPayload;
    private static int numberOfProductTypes;
    private static int numberOfWarehouses;
    private static ArrayList<Integer> productWeights = new ArrayList<>();
    private static ArrayList<Warehouse> warehouses = new ArrayList<>();

    public static final void readFile(String filename) {
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int index = 0;
            int warehouseIndex = -1;
            String[] data;
            for(String line; (line = br.readLine()) != null; ) {
                data = line.split(" ");
                if(index == 0) {
                    rows = Integer.parseInt(data[0]);
                    columns = Integer.parseInt(data[1]);
                    drones = Integer.parseInt(data[2]);
                    turns = Integer.parseInt(data[3]);
                    maxPayload = Integer.parseInt(data[4]);
                } else if(index == 1) {
                    numberOfProductTypes = Integer.parseInt(data[0]);
                } else if(index == 2) {
                    for(int i = 0; i < numberOfProductTypes; i++) {
                        productWeights.add(Integer.parseInt(data[i]));
                    }
                } else if(index == 3) {
                    numberOfWarehouses = Integer.parseInt(data[0]);
                } else if(index > 3 && (index <= numberOfWarehouses * 2 + 3)) {
                    if(index % numberOfWarehouses == 0) {
                        Warehouse war = new Warehouse();
                        war.setRow(Integer.parseInt(data[0]));
                        war.setColumn(Integer.parseInt(data[1]));
                        warehouses.add(war);
                        warehouseIndex++;
                    } else {
                        warehouses.get(warehouseIndex).
                    }
                }
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(GoogleHashCode2016.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(GoogleHashCode2016.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
