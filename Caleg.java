/**
 *
 * @author ANDI DWI SAPUTRO
 */
import java.util.Scanner;
public class Caleg extends Pekerja {
    public String partai, dapil, namaIstri, noUrut;
    public String namaAnak[];
    
    public Caleg() {
        
    }
    
    public void identitasCaleg(int jumlahAnak) {
        System.out.println("Nama Partai: "+this.partai);
        System.out.println("Dapil: "+this.dapil);
        System.out.println("No Urut: "+this.noUrut);
        System.out.println("Nama Istri: "+this.namaIstri);
        System.out.println("Jumlah Anak: "+jumlahAnak);
        this.printAnak(jumlahAnak-1);
    }
    
    public void inputJumlahAnak(int n){
        this.namaAnak = new String[n];
        for (int i=0;i<this.namaAnak.length;i++){
            Scanner s = new Scanner(System.in);
            int count=i+1;
            System.out.println("Anak ke-"+count+": ");
            this.namaAnak[i]=s.nextLine();
        }
    }
    
    public void printAnak(int n){
        for (int i=0;i<this.namaAnak.length;i++){
            int count=i+1;
            System.out.println("Anak ke-"+count+": "+this.namaAnak[i]);
        }
    }
}
