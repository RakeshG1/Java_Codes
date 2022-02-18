/**
 * Hello
 */

package Java_Codes.Csv_Import_Example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Csv_Import {
    public static void main(String[] args) {
        {
            String current_directory = System.getProperty("user.dir");
            System.out.println("Working Directory = " +current_directory);
            String csv_file_path = current_directory + "/Java_Codes/Sample_Data/Data1.csv";
            System.out.println("Csv File Path = " +csv_file_path);
            String line = "";
            try{
                BufferedReader br = new BufferedReader(new FileReader(csv_file_path));
                while ((line = br.readLine()) != null){
                    System.out.println(br.readLine());
                }   
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }    
    }
}
