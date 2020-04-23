package modul4_kel15_tugas;

import java.util.Scanner;

public class Modul4_Kel15_Tugas {
        static void panggilcase2() {
            System.out.println();
            System.out.println("---------------------------------");
            System.out.println("Kopi jenis Arabika adalah kopi yang ditanam di dataran tinggi");
            System.out.println("Kopi jenis Arabika memiliki keunggulan pada rasanya yang lebih kuat dibanding Robusta");
            System.out.println("Kami merekomendasikan Arabika untuk pelanggan yang ingin menikmati rasa kopi yang kuat");
            System.out.println();
            System.out.println("Kopi jenis Robusta adalah kopi yang ditanam di dataran rendah");
            System.out.println("Kami merekomendasikan Robusta unrtuk pelanggan yang ingin menikmati rasa kopi yang lebih ringan");
            System.out.println("---------------------------------");
            System.out.println("[1] Arabika");
            System.out.println("[2] Robusta");
        }   
        static void penutup() {
            System.out.println("Terima kasih telah berkunjung!");
            System.out.println("TOKO KOPI ACEH 123");
            System.out.println("##########");
            System.out.println();
            System.out.println();
        }
        
        
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nyatakankopi1, nyatakankopi2,hargakopi1, hargakopi2;
        int i, angka, pilihankopi;
        nyatakankopi1 = "Arabika";
        nyatakankopi2 = "Robusta";
        hargakopi1="Rp300.000";
        hargakopi2="Rp200.000";
        pendefinisi objek = new pendefinisi();
        objek.identitas();   
        System.out.println("Selamat datang di aplikasi toko kopi Aceh!");
        System.out.print("Silahkan masukkan nama anda : ");
        nama=sc.nextLine();
        System.out.println();
        do {
        System.out.println("Apakah anda sudah mengetahui perbedaan tentang kopi Arabika dengan kopi Robusta?");
        System.out.println("[1] Sudah Tahu");
        System.out.println("[2] Belum Tahu");
        System.out.print("Pilih angka 1 atau 2 (1/2) : ");
        angka=sc.nextInt();
        } while (angka!=1 & angka!=2);
                
        switch (angka) {
            case (1):
                System.out.println();
                System.out.println("[1] Arabika");
                System.out.println("[2] Robusta");
                System.out.print("Apa pilihan kopi anda? (1/2) : "); 
                pilihankopi=sc.nextInt();
                System.out.println();
                if (pilihankopi==1){
                    System.out.println("##########");
                    System.out.println("STRUK PEMESANAN");
                    System.out.println("Pemesan : " +nama);
                    System.out.println("Pilihan kopi : " +nyatakankopi1);
                    System.out.println("Harga : " +hargakopi1);
                }
                else if (pilihankopi==2) {
                    System.out.println("##########");
                    System.out.println("STRUK PEMESANAN");
                    System.out.println("Pemesan : " +nama);
                    System.out.println("Pilihan kopi : " +nyatakankopi2);
                    System.out.println("Harga : " +hargakopi2);
                }
                    else {
                    System.out.println("Input yang anda masukkan tidak sesuai!");
                    break;
                }
        
            case (2):
                panggilcase2();
                System.out.print("Apa pilihan kopi anda? (1/2) : ");
                pilihankopi=sc.nextInt();
                System.out.println();
                if (pilihankopi==1){
                    System.out.println("##########");
                    System.out.println("STRUK PEMESANAN");
                    System.out.println("Pemesan : " +nama);
                    System.out.println("Pilihan kopi : " +nyatakankopi1);
                    System.out.println("Harga : " +hargakopi1);
                }
                else if (pilihankopi==2) {
                    System.out.println("##########");
                    System.out.println("STRUK PEMESANAN");
                    System.out.println("Pemesan : " +nama);
                    System.out.println("Pilihan kopi : " +nyatakankopi2);
                    System.out.println("Harga : " +hargakopi2);
                }
                else { 
                    System.out.println("Input yang anda masukkan tidak sesuai!");
                }

            default:
                System.out.println("");
                System.out.println("Input yang anda masukkan tidak sesuai!");
                break;
        
        }    
        penutup();
    
    }
}