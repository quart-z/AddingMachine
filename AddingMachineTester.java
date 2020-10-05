package cse360assignment02;

public class AddingMachineTester 
{
    public static void main(String[] args) 
    {
        AddingMachine addingMachine = new AddingMachine();
        addingMachine.add(4); // tests add
        addingMachine.subtract(2); // tests subtract
        addingMachine.add(5); // tests add
        addingMachine.subtract(3); // tests subtract
        System.out.println("To String = " + addingMachine.toString()); // Prints all operations in string form
        System.out.println("Total = " + addingMachine.getTotal()); // Gets total of math operations

        addingMachine.clear(); // tests clear
        addingMachine.add(5);
        addingMachine.subtract(2);
        System.out.println("To String = " + addingMachine.toString()); // Prints all operations in string form
        System.out.println("Total = " + addingMachine.getTotal()); // Gets total of math operations

    }
  
}