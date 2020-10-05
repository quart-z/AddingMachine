/*
CSE360 Assignment2
Basic Adding Machine to assist with familiarity of github
*/


package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0"; // Prints all operations in string form, starts with initial 0
  }
  
  public int getTotal () { 
    return total; // gets total int value of operations
  }
  
  public void add (int value) {
    total += value; // adds value to total
    history += " + " + value; // commits to total history
  }

  public void subtract (int value) {
    total -= value; // subtracts value from total
    history += " - " + value; // commits to total history
  }

  public String toString () { // Prints all operations in string form
    return history;
  }

  public void clear() {
    history = "0"; // sets to default value
    total = 0; // sets to default value
    System.out.println("Memory cleared");
  }
}