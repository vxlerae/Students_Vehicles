//Main for students and the cars they own
//Date: 1/10/2023
import java.util.Scanner;

public class mainClass{

   public static void main(String[] args){
      //prompt use for input
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the vehicle manufacturer:");
      String carName = input.nextLine();
      
      System.out.println("Enter the name of the vehicle owner:");
      String carOwner = input.nextLine();
      
      System.out.println("Enter the owner's gender:");
      String gender = input.nextLine();
      
      System.out.println("Enter the owner's programme of study:");
      String program = input.nextLine();
      
      System.out.println("Enter the owner's Institution name:");
      String institution = input.nextLine();
      
      System.out.println("Enter the owner's hobbies:");
      String hobbies = input.nextLine();
      
      System.out.println("Enter the owner's age:");
      int age = input.nextInt();
      
      System.out.println("Enter the number of cylinders in the engine:");
      int cylinders = input.nextInt();
      
      System.out.println("Enter the car seating capacity:");
      int capacity = input.nextInt();
      
      System.out.println("Enter the weight of the car:");
      double weight = input.nextDouble();
      
      Student owner = new Student(institution, 1000, hobbies, program, carOwner, age, gender);
      Vehicle vehicle = new Vehicle(cylinders, carName, owner);
      Car car = new Car(cylinders, carName, owner, capacity, weight);
      //print out a string representation of the user's input
      System.out.println(vehicle.toString() + ", owned by " + carOwner + "," + " a " + age + "-year old " + gender + " studying " + program + " at " + institution + ". " + carOwner + " likes " + hobbies + ".");
      System.out.println(car.toString());
      }
      
}
      
