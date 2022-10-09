package Exercises.ford_escort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVReader {

    public void printCars() throws FileNotFoundException {
        List<Car> carList = readCarsFromCSV();

        for(Car car: carList) {
            System.out.println(car);
        }
    }

    private List<Car> readCarsFromCSV() throws FileNotFoundException {
        List<Car> result = new ArrayList<>();
        File file = new File("/Users/halaszkata/git/Homework/src/Exercises/ford_escort/ford_escort.csv");
        Scanner scanner = new Scanner(file);

        scanner.useDelimiter("\n");
        if(scanner.hasNext()){
            scanner.nextLine();
        }

        while(scanner.hasNext()) {
            result.add(convertToCar(scanner.nextLine()));
        }

        return result;
    }


    private Car convertToCar(String line) {
        String[] fields = line.split(",\\s+");
        Car car = new Car();
        car.setYear(Integer.parseInt(fields[0]));
        car.setMileage(Integer.parseInt(fields[1]));
        car.setPrice(Integer.parseInt(fields[2]));
        return car;
    }
}

