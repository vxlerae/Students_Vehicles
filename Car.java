//Child class of vehicle parent class. represents cars which are vehicles
//Date: 26/09/2023

public class Car extends Vehicle{
/*A car object that inherits from a Vehicle object. A Car object has the following additional
attributes: seating capacity and weight.
**/
   private int capacity;
   private double weight;
   
   //Constructors
   public Car(int cylinders, String manufacturer, Student owner, int capacity, double weight){
   //Create a new car object.
      super(cylinders, manufacturer, owner);
      this.capacity = capacity;
      this.weight = weight;
   }
   
   public Car(Car C){
   // Copy constructor
      super(C.cylinders, C.manufacturer, C.owner);
      }
      
   //Methods
   //@Override
   public String toString(){
   //print a string representation of the Car object information.
      return "The car is a " + capacity + "-seater weighing " + weight + " kg";
      }}
