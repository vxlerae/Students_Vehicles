//Parent class representing vehicles
//Date: 26/09/2023

public class Vehicle{
   /*A vehicle object that has the following attributes: number of cylinders, name of the
   manufacturer and the owner (type Student).
   **/
   protected int cylinders;
   protected String manufacturer;
   protected Student owner;
   
   //Constructors
   public Vehicle(Vehicle v){
   // Copy constructor
      super( );
      }
   public Vehicle (int cylinders, String manufacturer, Student owner){
   // create a new Vehicle object.
   // The vehicle owner is a Student
      this.cylinders = cylinders;
      this.manufacturer = manufacturer;
      this.owner = owner;
      }
   
   //Methods
   public String toString(){
      //print a string representation of the Vehicle object information.
      return manufacturer + ", " + cylinders + " cylinders";}}
