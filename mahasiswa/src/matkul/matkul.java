package matkul;

import java.util.Scanner;

public class matkul 
{
     public static void data_matkul ()
    {
        int total = 0;
        System.out.println("\t----------------------------");
        System.out.println("\t| MASUKKAN NILAI MAHASISWA | ");
        System.out.println("\t----------------------------");
        System.out.println("");
        System.out.print("Nama Mahasiswa  : ");
        Scanner nama = new Scanner(System.in);
        String namamhs = nama.nextLine();
        System.out.print("NIM \t\t: ");
        Scanner nim = new Scanner(System.in);
        String nimmhs = nim.nextLine();
        System.out.print("Masukkan jumlah mata kuliah yang diikuti : ");
        Scanner jumlah = new Scanner(System.in);
        int jml = jumlah.nextInt();
        for(int i = 0; i < jml; i++ )
        {
            System.out.print("Nama Mata Kuliah : ");
            Scanner namamatkul = new Scanner(System.in);
            String matkul = namamatkul.nextLine();
            System.out.print("Nilai \t\t: ");
            Scanner nil = new Scanner(System.in);
            int nilai = nil.nextInt();
            total = total + nilai;
        }
        rata rata = new rata();
        System.out.println("Nilai Rata - Rata = "+rata.rata(total,jml));
    }
}
