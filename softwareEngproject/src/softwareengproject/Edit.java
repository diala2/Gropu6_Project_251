
package softwareengproject;
import java.util.Scanner;
public class Edit {
    
Detalis det ;
    BookAppointment app;
    Detalis det2 ;
    String name;
    int id;
    int time;
    int phone_number;
    int card;
    
    public Edit() {
        
    }
    
    public void editDetails(String name,  int id, int time,  int phone_number) {
         Scanner input=new Scanner(System.in);
         System.out.println("The  Appointment details : ");
            
         System.out.println("Name: "+name);

        System.out.println("ID number: "+id);
  
        System.out.println("phone number: "+phone_number);
    
        System.out.println("Time: "+time);

       
     
       
     

    }

    public void editApp() {
            app=new BookAppointment();
        System.out.println("Please choose your new Appointment: ");
        System.out.println("");
       app.BookAppointmentMethod();
        System.out.println(" ");
        System.out.println("Your appointment has been rescheduled to: ");
     
         
        System.out.println("Date: " + app.getDate());
        

    }
    
     public void CancleApp(String name,  int id, int time,  int phone_number) {
         
        System.out.println("Last Appointment was on : ");
            
          System.out.println("Name: "+name);

        System.out.println("ID number: "+id);
  
        System.out.println("phone number: "+phone_number);
    
        System.out.println("Time: "+time);

        System.out.println("Card number "+card);
       
     
        
        System.out.println("Your appointment has been succsefully deleted: ");
    

    }
    
    
    
    
    
    
    
}