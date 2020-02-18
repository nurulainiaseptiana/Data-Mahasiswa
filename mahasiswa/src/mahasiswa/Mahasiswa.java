package mahasiswa;

import java.util.Scanner;

public class Mahasiswa 
{
    public static void data_mahasiswa ()
    {
        System.out.println("\t---------------------------");
        System.out.println("\t | MASUKKAN DATA MAHASISWA | ");
        System.out.println("\t---------------------------");
        System.out.println("");
        System.out.print("Masukkan Nama     : ");
        Scanner nama = new Scanner(System.in);
        String namamhs = nama.nextLine();
        System.out.print("Masukkan NIM      : ");
        Scanner nim = new Scanner(System.in);
        String nimmhs = nim.nextLine();
        System.out.print("Masukkan Jurusan  : ");
        Scanner jrs = new Scanner(System.in);
        String jur = jrs.nextLine();
        System.out.print("Masukkan Alamat   : ");
        Scanner alamat = new Scanner(System.in);
        String alamatmhs = alamat.nextLine();
        System.out.print("Masukkan Telepon  : ");
        Scanner tel = new Scanner(System.in);
        String tlp = tel.nextLine();
        
    }
    
}
