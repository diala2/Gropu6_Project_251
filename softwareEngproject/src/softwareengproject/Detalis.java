
package softwareengproject;
public class Detalis {

    public Detalis() {
    }
   
   String name;
   int id;
   int time;
   int phone_number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  
     public Detalis(String name, int id, int time, int phone_number) {
        this.name = name;
        this.id = id;
        this.time = time;
        this.phone_number = phone_number;
     
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

  

   

    @Override
    public String toString() {
        return "Detalis{" + "name=" + this.name + ", id=" + id + ", time=" + time + ", phone_number=" + phone_number+  '}';
    }
  
     
    
   
   
    
   
 


}
