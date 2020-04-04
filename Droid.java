//Defining a class
public class Droid{
  int batteryLevel;
  String name;

//Creating a constructor
public Droid(String droidName){
  name = droidName;
  batteryLevel=100;
}

//Defining a toString() method
public String toString(){
  return "Hello, I'm the droid: "+name;
}

//Defining a new method
public void performTask(String task){
  System.out.println(name+ " is performing task: "+ task);
  batteryLevel = 100 - 10;
}

//Defining another method
public void energyReport(){
  System.out.println("The battery level is " + batteryLevel);
}

public void energyTransfer(){
  batteryLevel = batteryLevel - 10;
  System.out.println("The battery level is reduced to "+ batteryLevel);
}
//Creating a Main()
public static void main(String [] args){
  Droid Codey = new Droid ("Codey");
  System.out.println(Codey);
  Codey.performTask("dancing"); 
  Codey.energyReport(); 
  Codey.energyTransfer();
}
}
