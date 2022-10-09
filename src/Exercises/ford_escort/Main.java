package Exercises.ford_escort;


import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Exercises.ford_escort.CSVReader csvReader = new CSVReader();
        csvReader.printCars();
    }
}
