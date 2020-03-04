
import java.util.Scanner;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Person {
    public String nama, noHp, homeAddress, gender, dob; 
    
    public Person(){
        
    }    
    
    public void identitasPerson(){
        System.out.println("Nama: "+this.nama);
        System.out.println("Gender: "+this.gender);
        System.out.println("No.HP: "+this.noHp);
        System.out.println("D.o.B: "+this.dob);
        System.out.println("HomeAddress: "+this.homeAddress);
    }
}
