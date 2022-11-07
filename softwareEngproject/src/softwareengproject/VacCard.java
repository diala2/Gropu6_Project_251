
package softwareengproject;


import java.io.PrintWriter;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;
import java.util.ArrayList;


public class VacCard {
    int num ;
    Scanner input = new Scanner(System.in);

   String Name ="";

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getVcNum() {
        return VcNum;
    }

    public void setVcNum(int VcNum) {
        this.VcNum = VcNum;
    }
   int phone = 0;
   int pass =0;
   int VcNum = VcNumberGenerate();
   
   
    public VacCard() {
      
    }
     public VacCard(int num) {
      this.num=num;
    }
    public void VacCardWithVCDisplay( String name,int pN){
            
               Name = name;
               num = pN;
        
                System.out.println("         PERSONAL VAC CARD  ");
                System.out.println("______________________________________");
                System.out.println("| Name: "+name+"                      ");
                System.out.println("|                                    ");   
                System.out.println("| Vac Number: "+VcNum +"              ");   
                System.out.println("|                                    ");   
                System.out.println("| Phone Number: "+pN+"               ");   
                System.out.println("|                                    ");    
                System.out.println("______________________________________");   
                System.out.println(" ");   
               
           
        }
        
    public void VacCardWithPassDisplay(String name,int pN){   
      
        System.out.println("Please enter your Valid Passport number: ");  
         int passNum = input.nextInt();
         pass= passNum;
         Name = name;
         num = pN;
                System.out.println("         PERSONAL VAC CARD  ");
                System.out.println("______________________________________");
                System.out.println("| Name: "+name+"                     ");
                System.out.println("|                                    ");   
                System.out.println("| Pass Number: "+passNum  +"          ");   
                System.out.println("|                                    ");   
                System.out.println("| Phone Number: "+pN+"               ");   
                System.out.println("|                                    ");    
                System.out.println("______________________________________");   
                System.out.println(" ");
         
        
        
    }
    
    public void ReportPCard(PrintWriter report){
              
            
        
      
                report.println("         PERSONAL VAC CARD  ");
                report.println("______________________________________");
                report.println("| Name: "+Name+"                     ");
                report.println("|                                    ");   
                report.println("| Pass Number: "+pass  +"          ");   
                report.println("|                                    ");   
                report.println("| Phone Number: "+num+"               ");   
                report.println("|                                    ");    
                report.println("______________________________________");   
                report.println(" ");
      
      
      
      
      
      
  }  
  
   public void ReportVCard(PrintWriter report){
            
                report.println("______________________________________");
                report.println("         PERSONAL VAC CARD  ");
                report.println("______________________________________");
                report.println("| Name: "+Name+"                     ");
                report.println("|                                    ");   
                report.println("| Vac Number: "+ VcNum +"          ");   
                report.println("|                                    ");   
                report.println("| Phone Number: "+num+"               ");   
                report.println("|                                    ");    
                report.println("______________________________________");   
                report.println(" ");
       
   }
  
    
    
    
    
    
    
    
    
    
    
  public int VcNumberGenerate(){
      
     return (int)(1+Math.random()*90); 
      
  }
    
 
  
  
  
  
    
}
