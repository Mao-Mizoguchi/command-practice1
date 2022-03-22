import java.util.Scanner;
public class Main{
        public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
			
		System.out.print("Your height");
    		double height = stdIn.nextDouble();
    		System.out.print("Your weight");
    		double weight = stdIn.nextDouble();
				
		double bmi = weight / (height*2);
		System.out.println(bmi);
        }
}
