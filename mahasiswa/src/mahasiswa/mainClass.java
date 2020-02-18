package mahasiswa;

import java.util.Scanner;
import matkul.*;

public class mainClass 
{
    public static void main(String[] args) 
    {
        Scanner kembali = new Scanner(System.in);
        do
        {
            System.out.println("\t============================");
            System.out.println("\t\tDATA MAHASISWA");
            System.out.println("\t============================");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Input Nilai Mahasiswa");
            System.out.print("Masukkan pilihan anda : ");
            Scanner pilih = new Scanner(System.in);
            int pil = pilih.nextInt();
            switch(pil)
            {
                case 1:
                    Mahasiswa data_mahasiswa = new Mahasiswa();
                    Mahasiswa.data_mahasiswa();
                break;
                case 2:
                    matkul data_matkul = new matkul();
                    matkul.data_matkul();
                break;
            }
            System.out.print("Kembali ke menu awal [Y/N] : ");
            String balik = kembali.nextLine();
        }
        while(true);
    }
}
