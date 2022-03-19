package com.example.csvparser;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CSVParser {
    public static void main(String args[]) throws IOException, CsvException{
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        File csvfilepath  = Paths.get(".", "resources", "Students.csv").normalize().toFile();
        System.out.println("CSV Filepath = " + csvfilepath);
        try(CSVReader reader = new CSVReader(new FileReader(csvfilepath))){
            List<String[]> r = reader.readAll();
            r.forEach(x -> System.out.println(Arrays.toString(x)));
        }
    }
}
