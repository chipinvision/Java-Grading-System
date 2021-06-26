// Grading system is a simple Java Program which lets user to know what grade they have secured
// This program uses a very simple logic
// Topics of Java that you need to go for this project are:
//     - for loop
//     - arrays
//     - if..else if..else ladder
//     - Input in Java (Scanner Class) 
import java.util.Scanner;

class Grade{
    public static void main(String args[]){
        // Declaring variables 
        int marks[]= new int[5];
        int i;
        double total=0, avg;

        // Taking input
        Scanner input= new Scanner(System.in);

        // For loop
        for (i=0; i<5; i++){
            System.out.println("Enter the marks of Subject"+(i+1)+":");
            marks[i]=input.nextInt();
            total = total+marks[i];
        }
        input.close();
 
        // Getting average
        avg = total/5;

        // Calculating the Grade
        System.out.println("The Grade of the Student is:");
        if (avg>=80){
            System.out.println("A");
        }
        else if (avg>=60 && avg<80){
            System.out.println("B");
        }
        else if (avg>=40 && avg<60){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
    }
}