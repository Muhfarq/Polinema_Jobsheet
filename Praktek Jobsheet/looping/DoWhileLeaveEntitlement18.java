import java.util.Scanner;
/**
 * DoWhileLeaveEntitlement18
 */
public class DoWhileLeaveEntitlement18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jatahCuti, JumlahHari;
        String konfirmasi;

        System.out.print("jatah cuti : ");
        jatahCuti = input.nextInt();

        do{
            System.out.print( "Apakah anda ingin ambil cuti (y/t?) ");
            konfirmasi = input.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("jumlah hari : ");
                JumlahHari = input.nextInt();
                
                if (JumlahHari <= jatahCuti) {
                    jatahCuti -= JumlahHari;
                    System.out.println("sisa jatah cuti : " + jatahCuti);
                    
                }else{
                    System.out.println("sisa jatah cuti tidak mencukupi");
                    break;
                    
                }
                
            }
        } while (jatahCuti > 0);
    }
}