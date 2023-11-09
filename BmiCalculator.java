import java.util.Scanner;

public class BmiCalculator{
    public static void main(String[] args){
        System.out.println("BMI Calculator");
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter your weight in kilograms:");
        double weight=ob.nextDouble();
        System.out.println("Enter your height in meters:");
        double height=ob.nextDouble();
        double bmi = weight/(height*height);
        System.out.printf("Your BMI is: %2.2f\n",bmi);
        if(bmi<18.5){
            System.out.println("Unterweight");

        }
        else if(bmi>=18.5 && bmi<= 24.9){
            System.out.println("Normal weight");

        }
        else if(bmi>=25.0 && bmi<=29.9 ){
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
        ob.close(); 

    }
}