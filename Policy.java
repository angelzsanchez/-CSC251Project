//Project Part 1
public class Policy
{
   //declare variables
   private String policynum;
   private String providername;
   private String pholderFirstName;
   private String pholderLastName;
   private int pholderAge;
   private double pholderHeight;
   private double pholderWeight;
   private String pholderSmokeStatus;
   // after methods
   private double pholderBMI;
   private double PolicyPrice;
   
   // no-arg constructor that sets variables into empty strings/0s
   public Policy()
   {
       policynum = " ";
       providername = " ";
       pholderFirstName = " ";
       pholderLastName = " ";
       pholderAge = 0;
       pholderHeight = 0;
       pholderWeight = 0;
       pholderSmokeStatus = "Unknown";
       pholderBMI = 0;
       policyPrice = 0;
   }
   
   // Constructor that accepts arguments and initializes variables
   public Policy (String num, String prName, String firstName, String lastName, int age, 
   double height, double weight, String smokeStatus) 
   {
      policynum = num;
      providername = prName;
      pholderFirstName = firstName;
      pholderLastName = lastName;
      pholderAge = age;
      pholderHeight = height;
      pholderWeight = weight;
      pholderSmokeStatus = smokeStatus;
   }
   
   //accessors
   public String getpolicynum()
   {  
      return policynum;
   }
   
   public String getprovidername()
   {
      return providername;
   }
   
   public String getpholderFirstName()
   {
      return pholderFirstName;
   }
   
   public String getpholderLastName()
   {
      return pholderLastName;
   }
   
   public int getpholderAge()
   {
      return pholderAge;
   }
   
   public double getpholderHeight()
   {
      return pholderHeight;
   }
   
   public double getpholderWeight()
   {
      return pholderWeight;
   }
   
   public String getpholderSmokeStatus()
   {
      return pholderSmokeStatus;
   }
   // mutatos
   public void setpolicynum(String num)
   {
      policynum = num;
   }
   
   public void setprovidername(String prName)
   {
      providername = prName;
   }
   
   public void setpholderFirstName(String firstName)
   {
      pholderFirstName = firstName;
   }
   
   public void setpholderLastName(String lastName)
   {
      pholderLastName = lastName;
   }
   
   public void setpholderAge(int age)
   {
      pholderAge = age;
   }
   
   public void setpholderHeight(double height)
   {
      pholderHeight = height;
   }
   
   public void setpholderWeight(double weight)
   {
      pholderWeight = weight;
   }
   
   public void setpholderSmokeStatus(String smokeStatus)
   {
      pholderSmokeStatus = smokeStatus;
   }
   
   // calculate  & return BMI 
   //BMI = (Policyholder’s Weight * 703 ) / (Policyholder’s Height2 )
   public double getBMI()
   {
      final int CALCBMI = 703;
      return (pholderWeight * CALCBMI) / (pholderHeight * pholderHeight) // returns BMI total after calc
   }
   
   // calculate & return price
   public double getPolicyPrice()
   {
      double basefee = 600; //double instead of constant cause value may change
      final int MAXAGE = 50;
      final int SMOKINGFEE = 100;
      final int MAXBMI = 35;
      //loops for conditions
      if(age > MAXAGE)
         basefee += 75;
      if(pholderSmokeStatus.equalsIgnoreCase("smoker"))
         basefee += SMOKINGFEE
      if (getBMI() > MAXBMI)
         basefee += ((getBMI() - MAXBMI) * 20); // formula provided
         
      return basefee // returns price
    }
    
}
   
      
        
   
   