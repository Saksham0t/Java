package Class_614;

//Question 2:
//class Vehicle {
//    private String brand;
//    private String model;
//    private int year;
//    public Vehicle(String brand, String model, int year) {
//        this.brand = brand;
//        this.model = model;
//        this.year = year;
//    }
//    public void displayInfo() {
//        System.out.println("Brand: " + brand);
//        System.out.println("Model: " + model);
//        System.out.println("Year: " + year);
//    }
//}
//class Car extends Vehicle {
//    private int numOfDoors;
//    public Car(String brand, String model, int year, int numOfDoors) {
//        super(brand, model, year);
//        this.numOfDoors = numOfDoors;
//    }
//    public void displayCarInfo() {
//        displayInfo();
//        System.out.println("Number of doors: " + numOfDoors);
//    }
//}
//public class Intermediate_9 {
//    public static void main(String[] args) {
//        Car myCar = new Car("Toyota", "Camry", 2022, 4);
//        myCar.displayCarInfo();
//    }
//}

//Question 4
//public class Intermediate_9 {
//    public int add(int a, int b) {
//        return a + b;
//    }
//    public int add(int a, int b, int c) {
//        return a + b + c;
//    }
//    public double add(double a, double b) {
//        return a + b;
//    }
//    public int multiply(int a, int b) {
//        return a * b;
//    }
//    public int multiply(int a, int b, int c) {
//        return a * b * c;
//    }
//    public double multiply(double a, double b) {
//        return a * b;
//    }
//    public static void main(String[] args) {
//        Intermediate_9 math = new Intermediate_9();
//        System.out.println("Addition:");
//        System.out.println("1 + 2 = " + math.add(1, 2));
//        System.out.println("1 + 2 + 3 = " + math.add(1, 2, 3));
//        System.out.println("1.5 + 2.5 = " + math.add(1.5, 2.5));
//        System.out.println("\nMultiplication:");
//        System.out.println("2 * 3 = " + math.multiply(2, 3));
//        System.out.println("2 * 3 * 4 = " + math.multiply(2, 3, 4));
//        System.out.println("1.5 * 2.5 = " + math.multiply(1.5, 2.5));
//    }
//}

//Question 6
//interface Shape {
//    double calculateArea();
//    double calculatePerimeter();
//}
//class Rectangle implements Shape {
//    private double length;
//    private double width;
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//    @Override
//    public double calculateArea() {
//        return length * width;
//    }
//    @Override
//    public double calculatePerimeter() {
//        return 2 * (length + width);
//    }
//}
//public class Intermediate_9 {
//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(5, 3);
//        System.out.println("Rectangle Area: " + rectangle.calculateArea());
//        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
//    }
//}

//Question 7
//import java.util.HashMap;
//import java.util.Map;
//public class Intermediate_9 {
//    public static char findAddedLetter(String s, String t) {
//        Map<Character, Integer> charFrequency = new HashMap<>();
//        for (char c : s.toCharArray()) {
//            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
//        }
//        for (char c : t.toCharArray()) {
//            if (charFrequency.containsKey(c)) {
//                charFrequency.put(c, charFrequency.get(c) - 1);
//            } else {
//                return c;
//            }
//        }
//        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
//            if (entry.getValue() == 1) {
//                return entry.getKey();
//            }
//        }
//        return '\0';
//    }
//    public static void main(String[] args) {
//        String s = "abcd";
//        String t = "abcde";
//        char addedLetter = findAddedLetter(s, t);
//        System.out.println("Added letter: " + addedLetter);
//    }
//}

//Question 8
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
public class Intermediate_9 {
    public static void checkNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number cannot be negative");
        }
        System.out.println("Number is valid: " + number);
    }
    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (NegativeNumberException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}
