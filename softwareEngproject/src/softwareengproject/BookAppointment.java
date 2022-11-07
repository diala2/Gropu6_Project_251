
package softwareengproject;



import java.util.Scanner;

public class BookAppointment {
int passport_number;
      int vac ;
      int Date;
      String month;

    public String getMonth() {
        return month;
    }
      
    public BookAppointment() {
 
        
    }
       public BookAppointment(int passport_number, int vac, int Date,String month) {
          this.Date=Date;
          this.passport_number=passport_number;
          this.vac=vac;
          this.month=month;
 
        
    }

      public void BookAppointmentMethod() {
           Scanner input=new Scanner(System.in);
            System.out.println("Enter the month name ");
             month = input.next();
            System.out.println("---------------"+month+"--------------------");
            System.out.println("1  2  3  4  5  6");
            System.out.println("6  7  8  9  10  11");
            System.out.println("12  13  14  15  16  17");
            System.out.println("18  19  20  21 22  23");
            System.out.println("24  25  26  27 28  29");
            System.out.println("30");
            System.out.println("Choose day ");
            Date=input.nextInt();
            System.out.println("----------------------------------------");

        
    }
    public String getDate() {
        return month +" / "+ Date;
    }
    
    
    public int getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(int passport_number) {
        this.passport_number = passport_number;
    }

    public int getVac() {
        return vac;
    }

    public void setVac(int vac) {
        this.vac = vac;
    }

    @Override
    public String toString() {
        return "BookAppointment{" + "Date=" + Date + '}';
    }

  
      
   
      
    

}
