import java.util.Scanner;

public class porseniAssigment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List cabang olahraga
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"};

        // Menyiapkan array untuk menyimpan data atlet
        String[][] daftarAtlet = new String[cabangOlahraga.length][5];

        // Memasukkan data atlet dari setiap cabang olahraga
        for (int i = 0; i < daftarAtlet.length; i++) {
            System.out.println("Masukkan data atlet untuk " + cabangOlahraga[i]);
            for (int j = 0; j < daftarAtlet[i].length; j++) {
                System.out.print("Masukkan nama atlet ke-" + (j + 1) + ": ");
                daftarAtlet[i][j] = scanner.nextLine();
            }
            System.out.println();
        }

        // Mengurutkan atlet berdasarkan nama secara ascending
        for (int i = 0; i < daftarAtlet.length; i++) {
            for (int j = 0; j < daftarAtlet[i].length - 1; j++) {
                for (int k = j + 1; k < daftarAtlet[i].length; k++) {
                    if (daftarAtlet[i][j].compareTo(daftarAtlet[i][k]) > 0) {
                        // Menukar posisi atlet jika diperlukan
                        String temp = daftarAtlet[i][j];
                        daftarAtlet[i][j] = daftarAtlet[i][k];
                        daftarAtlet[i][k] = temp;
                    }
                }
            }
        }

        // Menampilkan informasi atlet
        System.out.println("Daftar Atlet Porseni 2024:");
        for (int i = 0; i < daftarAtlet.length; i++) {
            System.out.println("Cabang Olahraga " + cabangOlahraga[i] + ":");
            for (int j = 0; j < daftarAtlet[i].length; j++) {
                System.out.println("Nama atlet ke-" + (j + 1) + ": " + daftarAtlet[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}