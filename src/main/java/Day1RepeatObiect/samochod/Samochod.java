package Day1RepeatObiect.samochod;

public class Samochod {
    String brand;
    int mileage;
    final int toReview = 150000;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getToReview() {
        return toReview;
    }


    public Samochod(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;

    }


    void info() {
        System.out.println("Brand's car is " + brand + ". Mileage car's is: " + mileage + " km.");
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", toReview=" + toReview +
                '}';
    }

    void zwiekszPrzebieg(int distance) {

        mileage += distance;

    }

    public void ToCarInspection() {
        System.out.println("The inspection should be in: " + (toReview - mileage) + " km.");
    }
}