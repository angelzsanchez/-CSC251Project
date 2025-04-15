import java.util.Scanner;

public class Project_Angel_Sanchez
{
   public static void main(String [] args)
   {
      Scanner scanner = new Scanner(System.in);
      //input from user
      System.out.println("Please enter the Policy Number: ");
      String policynum = scanner.nextLine();
      
      System.out.println("\nPlease enter the Provider Name: ");
      String providername = scanner.nextLine();
      
      System.out.println("\nPlease enter the PolicyHolder's First Name: ");
      String pholderFirstName = scanner.nextLine();
      
      System.out.println("\nPlease enter the PolicyHolder's Last Name: ");
      String pholderLastName = scanner.nextLine();
      
      System.out.println("\nPlease enter the PolicyHolder's Age: ");
      int pholderAge = scanner.nextInt();
      
      System.out.println("\nPlease enter the Policyholder's smoking status (smoker/nonsmoker): ");
      String pholderSmokeStatus = scanner.nextLine();
      
      System.out.println("\nPlease enter the Policyholder's Height (in inches): ");
      double pholderHeight = scanner.nextDouble();
      
      System.out.println("\nPlease enter the Policyholder's Weight (in pounds): ");
      double pholderWeight = scanner.nextDouble();
      
      //Single Instance of Policy Class
      Policy p = new Policy (String num, String prName, String firstName, String lastName, int age, 
   double height, double weight, String smokeStatus);
    // constructors that accepts arguments
      System.out.println("\nPolicy Number: " + num);
      System.out.println("\nProvider Name: " + prName);
      System.out.println("\nPolicy Holder's First Name: " + firstName);
      System.out.println("\nPolicy Holder's Last Name: " + lastName);
      System.out.println("\nPolicy Holder's Age: " + age);
      System.out.println("\nPolicy Holder's Smoking Status: " + smokeStatus);
      System.out.println("\nPolicy Holder's Height: %.1f inches " + height);
      System.out.println("\nPolicy Holder's Weight: %.1f inches " + weight);
      //calc
      System.out.println("\nPolicy Holder's BMI: %.2f pounds " + getBMI());
      System.out.println("\nPolicy Price: %.2f pounds " + getPolicyPrice());
      
      scanner.close();
    }
    
}










      
 

      