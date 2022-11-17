import java.util.Scanner;

public class OfficeSpaceCommission2 {
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
   
   
   
   
   
    if(officeSpace >= 1501 && officeSpace <= 2000) {
     leaseFee = leaseFee + 60;
   }
   
    
    if(officeSpace >= 2001 && officeSpace <= 2500) {  
      leaseFee = leaseFee + 80; 
   }
    
    if(officeSpace >= 2501) {  
      leaseFee = leaseFee + 100; 
   }
    
    
  if(officeSpace >= 1501 && officeSpace <= 2000) {
     leaseAgree = leaseAgree + 60 * 12;
   }
   
    
    if(officeSpace >= 2001 && officeSpace <= 2500) {  
      leaseAgree = leaseAgree + 80 * 12; 
   }
    
    if(officeSpace >= 2501) {  
      leaseAgree = leaseAgree + 100 * 12; 
   }  
    
    
    
    if(officeSpace >= 1501 && officeSpace <= 2000) {
     leaseComm = leaseAgree * 0.05;
   }
   
    
    if(officeSpace >= 2001 && officeSpace <= 2500) {  
      leaseComm = leaseAgree * 0.05; 
   }
    
    if(officeSpace >= 2501) {  
      leaseComm = leaseAgree * 0.05; 
   }  
    
    
    
    
    
    
    
   
   System.out.print("\nLeasing Commission Summary:");
   System.out.printf("\n Realtor Name: %s", realtorName);
   System.out.printf("\n Office Space: %.0f", officeSpace);
   System.out.printf("\n Leasing Fee Per Month %.2f", leaseFee);
   System.out.printf("\n Leasing Agreement for one year: %.2f", leaseAgree);
   System.out.printf("\n Leasing Commission for this agreement: %.2f", leaseComm);
    
    
    
    
    

    
  }
}