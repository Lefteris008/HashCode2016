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
    private static int numberOfOrders;
    private static ArrayList<Integer> productWeights = new ArrayList<>();
    private static ArrayList<Warehouse> warehouses = new ArrayList<>();
    private static ArrayList<Order> orders = new ArrayList<>();

    public static final void readFile(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
           
            String[] data;
            String line = br.readLine();
            data = line.split(" ");
            rows = Integer.parseInt(data[0]);
            columns = Integer.parseInt(data[1]);
            drones = Integer.parseInt(data[2]);
            turns = Integer.parseInt(data[3]);
            maxPayload = Integer.parseInt(data[4]);
            line = br.readLine();
            numberOfProductTypes = Integer.parseInt(line);
            line = br.readLine();
            data = line.split(" ");
            for (int i = 0; i < numberOfProductTypes; i++) {
                productWeights.add(Integer.parseInt(data[i]));
            }
            line = br.readLine();
            numberOfWarehouses = Integer.parseInt(line);
            for (int j = 0; j < numberOfWarehouses; j++) {
                line = br.readLine();
                data = line.split(" ");
                Warehouse war = new Warehouse();
                war.setRow(Integer.parseInt(data[0]));
                war.setColumn(Integer.parseInt(data[1]));
                
                line = br.readLine();
                data = line.split(" ");
                for (int i = 0; i < data.length; i++) {
                    Item item = new Item(i, Integer.parseInt(data[i]));
                    war.getItemsStored().add(item);
                }
                warehouses.add(war);
            }
            line = br.readLine();
            numberOfOrders = Integer.parseInt(line);
            for (int j = 0; j < numberOfOrders; j++) {
                Order order = new Order();
                line = br.readLine();
                data = line.split(" ");
                order.setRow(Integer.parseInt(data[0]));
                order.setColumn(Integer.parseInt(data[1]));

                line = br.readLine();
                order.setNumberOfOrderedProductItems(Integer.parseInt(line));
                line = br.readLine();
                data = line.split(" ");
                for (int i = 0; i < data.length; i++) {
                    Item item = new Item(i, Integer.parseInt(data[i]));
                    order.getItemsOrdered().add(item);
                }
                orders.add(order);
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String filename = "C:\\redundancy.in";
        readFile(filename);
        System.out.println("");
    }

}
