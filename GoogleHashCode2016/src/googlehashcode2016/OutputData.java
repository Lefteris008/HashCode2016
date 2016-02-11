/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlehashcode2016;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Lefteris Paraskevas
 */
public class OutputData {

    public void output(ArrayList<ResultCommandLine> results) {
        BufferedWriter writer = null;
        try {

            File outFile = new File("");

            writer = new BufferedWriter(new FileWriter(outFile));
            writer.write(results.size());
            for (int i = 0; i < results.size(); i++) {
                ResultCommandLine line = results.get(i);

                writer.newLine();
                writer.write(String.valueOf(line.getDroneId()).concat(" "));
                writer.write(String.valueOf(line.getCommand()).concat(" "));
                writer.write(String.valueOf(line.getProductType()).concat(" "));
                writer.write(String.valueOf(line.getWarehouseType()).concat(" "));
                writer.write(String.valueOf(line.getNumOfItems()));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }
    }

}
