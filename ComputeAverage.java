import java.util.Scanner;
public class ComputeAverage{
    public static void main(String[] args){
        Scanner say = new Scanner(System.in);  
        System.out.print("Enter three numbers: ");
        double num1, num2, num3, average;
        
        num1 =say.nextDouble();
        num2 =say.nextDouble();
        num3 =say.nextDouble();
        average = (num1+num2+num3)/3;
        
        System.out.println("The average of "+ num1 + " " +num2+" "+num3+" is "+average);
    }
}
