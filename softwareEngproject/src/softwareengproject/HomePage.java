
package softwareengproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class HomePage{
public static void main(String[] args) throws FileNotFoundException {
    
        //======================================================================
           String name = null;
           int id = 0 ;
           int phone_number = 0;
           int time = 0;
           int card = 0;
           int clientIndex= 0;
           
           File f = new File("report.txt");
           PrintWriter report = new PrintWriter(f);
           
        //======================================================================
        
      ArrayList<Detalis> myDetails=new ArrayList();
      Scanner input=new Scanner(System.in);
      String choice="";
      
      
      while(!(choice=="Exit")){
            DisplayMainMenu();
            System.out.print("Please enter your choice ");
            choice=input.next();
            switch(choice){
                case "Book":   
                    //=========================================================
                    BookAppointment bA = new BookAppointment();
                    System.out.print(""); 
                    //=========================================================
                    report.println(" ");
                    report.println("___________________________________________");
                    report.println("-----------Your Booking Details-------------");
                    bA.BookAppointmentMethod();
                    report.println("____________________________________________");
                    report.println("Date: "+bA.getDate());
                    report.println(" ");
                    //==========================================================
                    System.out.println("________________________________________________");
                    System.out.println("---------- Patient Information Input------------" );
                    System.out.println("________________________________________________");
                    //==========================================================
                    System.out.println("Enter your First name:  ");
                    name = input.next();
                    System.out.println("Enter the ID number: ");
                    id = input.nextInt();
                    System.out.println("Enter the Time: ");
                    time = input.nextInt();
                    System.out.println("Enter the phone number: ");
                    phone_number = input.nextInt();
                    
                    myDetails.add(new Detalis(name, id,time, phone_number));
                    System.out.print("");
                    report.println("___________________________________________");
                    report.println("---------- Patient Information ------------" );
                    report.println("___________________________________________");
                    report.println(" First name: "+name);
                    report.println(" ID number: "+id);
                    report.println(" Time: "+time);
                    report.println(" phone number: "+phone_number);
                    report.println("___________________________________________");
                    report.println();
                    break;            
                    //=========================================================
                 case "Edit":

                    Edit ed = new Edit();
                    System.out.println("In order to help us better serve you, please take a moment to choose: ");
                    System.out.println("");
                    System.out.println("Press 1: to edit your personal information details");
                    System.out.println("Press 2: to change the appointment Date");
                    System.out.println("Press 3: to cancle your appointment");
                    System.out.println("");
                    Scanner S = new Scanner(System.in);
                    int ans = S.nextInt();
                    if (ans == 1) {
                        ed.editDetails(name, id, time, phone_number);
                        System.out.println("which one you want to edit:");
                        String answer = input.next();
                        System.out.println("edit the infromation:");
                   
                     if(answer.equalsIgnoreCase("name")){
                         
                         String editing=input.next();
                         name=editing;
                         myDetails.add(new Detalis(editing, id,time, phone_number));
                         System.out.println();
                         System.out.println("---------------------------------------------");
                         System.out.println("your details have been updated successfully to: ");
                         System.out.println();
                         ed.editDetails(editing,id,time, phone_number);

                         
                     }else if(answer.equalsIgnoreCase("id")){
                         
                          int id_editing=input.nextInt();
                          id = id_editing;
                          myDetails.add(new Detalis(name, id_editing,time, phone_number));
                          System.out.println("your details have been updated successfully to: ");
                          ed.editDetails(name, id_editing,time, phone_number);

                          
                     }else if(answer.equalsIgnoreCase("time")){
                           int time_editing=input.nextInt();
                           time =time_editing;
                           myDetails.add(new Detalis(name, id,time_editing,phone_number));
                           System.out.println("your details have been updated successfully to: ");
                           ed.editDetails(name, id,time_editing,phone_number);

                          
                          
                      }else if(answer.equalsIgnoreCase("phone")){
                          int PhoneNumber_editing=input.nextInt();
                          phone_number =PhoneNumber_editing;
                          myDetails.add(new Detalis(name, id,time,PhoneNumber_editing));
                          System.out.println("your details have been updated successfully to: ");
                          ed.editDetails(name, id,time,PhoneNumber_editing);   

                    }
                        report.println("___________________________________________________________");
                        report.println("---------- Patient Information (After editing)------------");
                        report.println("___________________________________________________________");
                        report.println();
                        report.println(" First name: " + name);
                        report.println(" ID number: " + id);
                        report.println(" Time: " + time);
                        report.println(" phone number: " + phone_number);
                        report.println("___________________________________________");
                        report.println();


                    }else if (ans == 2){
                  
                    ed.editApp();
                    BookAppointment getthedate = new BookAppointment();
                
                   
                    }else if(ans == 3){  
                        ed.CancleApp(name,id,time, phone_number);
                         myDetails.removeAll(myDetails);
                         
                    report.println("___________________________________________");
                    report.println("            CANCELED APPOINTMENT           ");
                    report.println("___________________________________________");
                    report.println();
                    }
                    
                    break;
                    //==========================================================
                    
                case "VacCard":
                    VacCard vc = new  VacCard();
                    //==========================================================
                    System.out.println("Please enter your selection number :  (Passport(1) , Vac(2) ): ");
                    card = input.nextInt();
                    //==========================================================
                    if(card == 1){         
                      System.out.println();
                      vc.VacCardWithPassDisplay(name,phone_number);
                      vc.ReportPCard(report);
              
      
                    }
                    else{
                       System.out.println();
                       vc.VacCardWithVCDisplay(name,phone_number);
                       vc.ReportVCard(report);
                    }
                    break;
                case "Exit":
                    //==========================================================
                    System.out.println("Thank you.");
                     report.close();
                     report.flush();
                     System.exit(0);
           
            }
           
         
         
      }
}
    
   
     public static void DisplayMainMenu() {
         System.out.println("");
         System.out.println("----------------------------------------------------------------");
         System.out.println("              Welcome to the VAC Card System ");
         System.out.println("----------------------------------------------------------------");
         System.out.println("Enter \"Book\" to book a new appointment");
        
         System.out.println("Enter \"Edit\" to Edit ");
         System.out.println("Enter \"VacCard\" to Vac Crad ");
         System.out.println("Enter \"Exit\" to exit the program");
         System.out.println("");
    }
    
   

 
} 
     
     
    
      
      
      
      
      
      
      
      
      
      
      
      
      
      



     
     
     
 
      
      
         
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      

      
      
      
      
      
      



    

