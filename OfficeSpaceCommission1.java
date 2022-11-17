import java.util.Scanner;

public class OfficeSpaceCommission1 {
  public static void main(String [] args) {
    
    Scanner input; 
   input= new Scanner(System.in);
   
   System.out.println("Office Space Leasing Commission");
   
   System.out.print("Enter Realtor Name:");
   String realtorName = input.nextLine();
   
   System.out.print("Enter width of Office Space in feet:");
   Double widthSpace = input.nextDouble();
   
   System.out.print("Enter length of Office Space in feet:");
   Double lengthSpace = input.nextDouble();
   
   
   Double officeSpace = widthSpace * lengthSpace;
   Double leaseFee = widthSpace * lengthSpace * 25;
   Double leaseAgree = leaseFee * 12;
   Double leaseComm = leaseAgree * 0.05;
   
   
   
   
   System.out.print("\nLeasing Commission Summary:");
   System.out.printf("\n Realtor Name: %s", realtorName);
   System.out.printf("\n Office Space: %.0f", officeSpace);
   System.out.printf("\n Leasing Fee Per Month %.2f", leaseFee);
   System.out.printf("\n Leasing Agreement for one year: %.2f", leaseAgree);
   System.out.printf("\n Leasing Commission for this agreement: %.2f", leaseComm);
   
     
     
     
 
     
     
     
     
     
     
     
  }
}
   