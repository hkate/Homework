package Exercises.ford_escort;


import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Exercises.ford_escort.CSVReader csvReader = new CSVReader();
        //csvReader.printCars();

        int year = 1997;
        //csvReader.Byyear(year);

        int first = 30;
        int second = 50;
        //csvReader.Range(first,second);

        int price = 6000;
        csvReader.Price(price);

    }

}
