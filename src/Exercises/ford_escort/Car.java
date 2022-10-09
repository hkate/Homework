package Exercises.ford_escort;

public class Car {

    private int year;
    private int mileage;
    private int price;

    public Car() {
    }

    public Car(int year, int mileage, int price) {
        this.year = year;
        this.mileage = mileage;
        this.price = price;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "year='" + year  +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }

}

