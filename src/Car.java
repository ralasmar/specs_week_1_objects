import java.util.Arrays;

//car class that serves as a blueprint for car objects
public class Car {
    //field is private to the class it is defined in. not visible anywhere else
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;


    public Car(String make, double price, int year, String color, String[] parts){
    //this refers to current constructor
        this.make = make;
        this .price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    //copy constructor
    public Car(Car source){
        this.make = source.make; //source is object being passed in
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = source.parts;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    //public getters that return copy of value
    //public setters so values can be changed
    public String getMake() {
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public void drive(){
        System.out.println("\nYou bought the beautiful " + this.year + " " + this.color + " " + this.make + " " + " for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit");
    }
    //toString method
    public String toString(){
        return "Make: " + this.make + ".\n"
                +  "Price: " + this.price + ".\n"
                +  "Year: " + this.year + ".\n"
                +  "Color: " + this.color + ".\n"
                +  "Parts: " + Arrays.toString(parts) + ".\n";
    }
}

//a mutable object is an object with setters
// avoid setting mutable variables equal to each other, or you will have a situation where two variables have the same references
