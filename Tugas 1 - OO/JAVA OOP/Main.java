
import java.util.Scanner;
/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahAnak = 0;
        Caleg caleg1 = new Caleg();

        System.out.println("==Form Data Caleg==");
        System.out.print("Nama: ");
        caleg1.nama = sc.nextLine();
        System.out.print("Gender: ");
        caleg1.gender = sc.nextLine();
        System.out.print("No.HP: ");
        caleg1.noHp = sc.nextLine();
        System.out.print("Date of birth: ");
        caleg1.dob = sc.nextLine();
        System.out.print("Home Address: ");
        caleg1.homeAddress = sc.nextLine();
        System.out.print("Company: ");
        caleg1.companyName = sc.nextLine();
        System.out.print("Company Form: ");
        caleg1.companyForm = sc.nextLine();
        System.out.print("Work Address: ");
        caleg1.workAddress = sc.nextLine();
        System.out.print("Position: ");
        caleg1.posititon = sc.nextLine();
        System.out.print("NPWP: ");
        caleg1.noNpwp = sc.nextLine();
        System.out.print("Nama Partai: ");
        caleg1.partai = sc.nextLine();
        System.out.print("Dapil: ");
        caleg1.dapil = sc.nextLine();
        System.out.print("No Urut: ");
        caleg1.noUrut = sc.nextLine();
        System.out.print("Nama istri: ");
        caleg1.namaIstri = sc.nextLine();
        System.out.print("Jumlah anak: ");
        jumlahAnak = sc.nextInt();
        caleg1.inputJumlahAnak(jumlahAnak);

        System.out.print("\n==RESULT==\n");
        caleg1.identitasPerson();
        caleg1.identitasPekerja();
        caleg1.identitasCaleg(jumlahAnak);
    }
}
