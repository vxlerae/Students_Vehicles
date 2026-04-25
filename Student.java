//Child class to person parent class. Represents students which are people
//Date: 26/09/2023

public class Student extends Person{
   //instance variables
   private String nameOfInstitution;
   private String programOfStudy;
   private int yearOfStudy;
   private String hobbies;
   
   //Copy construsctor
   public Student(Student student){
      super(student);
      nameOfInstitution = student.nameOfInstitution;
      programOfStudy = student.programOfStudy;
      yearOfStudy = student.yearOfStudy;
      hobbies = student.hobbies;
      }
      
   //constructor
   public Student(String newInstitution, int newYear, String newHobbies, String newProgram, String name, int age, String gender){
      //variables from parent class
      super(name, age, gender);
      setHobbies(newHobbies);
      setNameOfInstitution(newInstitution);
      setYearOfStudy(newYear);
      setProgramOfStudy(newProgram);
      }
   
   //accessor   
   public int getYearOfStudy(){
      return yearOfStudy;
      }
   
   //accessor   
   public String getHobbies(){
      return nameOfInstitution;
      }
   
   //accessor   
   public String getNameOfInstitution(){
      return nameOfInstitution;
      }
   
   //accessor   
   public String getProgramOfStudy(){
      return programOfStudy;
      }
   
   //mutator   
   public void setHobbies(String newHobbies){
      hobbies = newHobbies;
      }
   
   //mutator   
   public void setNameOfInstitution(String newInstitution){
      nameOfInstitution = newInstitution;
      }
   
   //mutator   
   public void setProgramOfStudy(String newProgram){
      programOfStudy = newProgram;
      }
   
   //mutator   
   public void setYearOfStudy(int newYear){
      yearOfStudy = newYear;
      }
      
   }
