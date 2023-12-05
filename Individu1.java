package Jobsheet13;
import java.util.Scanner;
public class Individu1 {
    public static void main(String[] args) {
        // fungsi input data nilai
        Scanner sc = new Scanner(System.in);
        
        int jumlahMinggu, jumlahMahasiswa;
        System.out.print("Jumlah Minggu: ");
        jumlahMinggu = sc.nextInt();
        System.out.print("Jumlah Mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();
        
        // deklarasi instansiasi array
        int[][] mahasiswa = new int[jumlahMinggu][jumlahMahasiswa];
        System.out.println();

        masukkan(mahasiswa);
        tampilkan(mahasiswa);
        mencari(mahasiswa);
        
        sc.close();
    }

    static void masukkan(int[][] mahasiswa) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== MASUKKAN NILAI ======");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Minggu ke-" + (i+1));
            for (int j = 0; j < mahasiswa[i].length; j++) {
                System.out.print("Mahasiswa ke-" + (j+1) + ": ");
                mahasiswa[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    static void tampilkan(int[][] mahasiswa) {
        // fungsi kedua - menampilkan seluruh nilai
        System.out.println("====== NILAI MAHASISWA ======");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Minggu ke-" + (i+1) + ": ");
            for (int j = 0; j < mahasiswa[i].length; j++) {
                System.out.println("Mahasiswa ke-" + (j+1) + ": " + mahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void mencari(int[][] mahasiswa){ 
        for (int i = 0; i < mahasiswa.length; i++) {
            int nilaiMax = 0;
            for (int j = 0; j < mahasiswa[i].length; j++) {
                if (nilaiMax < mahasiswa[i][j]) {
                    nilaiMax = mahasiswa[i][j];
                }
            }
            System.out.println("Nilai Tertinggi Minggu ke-" + (i+1) + " adalah: " + nilaiMax);
        }
    }
}
