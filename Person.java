//Parent clas representing people
//Date: 26/09/2023

public class Person{
   //instance variables
   private String name;
   private int age;
   private String gender;
   
   //copy constructor
   public Person(Person person){
      name = person.name;
      age = person.age;
      gender = person.gender;
      }
   //constructor
   public Person(String name, int age, String gender){
      this.name = name;
      this.age = age;
      this.gender = gender;
      }
   //accessor   
   public int getAge(){
      return age;
      }
   //accessor   
   public String getGender(){
      return gender;
      }
   //accessor   
   public String getName(){
      return name;
      }
   //mutator   
   public void setAge(int newAge){
      age = newAge;
      }
   //mutator  
   public void setGender(String newGender){
      gender = newGender;
      }
   //mutator   
   public void setName(String newName){
      name = newName;
      }      
 }
      
   
