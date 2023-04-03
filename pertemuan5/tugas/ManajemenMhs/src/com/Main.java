package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Crud mhs = new Crud();

            while (true) {
                System.out.println("");
                System.out.println("Jumlah MHS : " + mhs.jmlMhs());
                System.out.println("Silakan pilih opsi:");
                System.out.println("1. Tambah Mahasiswa");
                System.out.println("2. Tampilkan Mahasiswa");
                System.out.println("3. Cari Nim Mahasiswa");
                System.out.println("4. Hapus Nim Mahasiswa");
                System.out.println("5. Hapus semua");
                System.out.println("6. Keluar");

                int pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        mhs.tambahMhs();
                        break;
                    case 2:
                        mhs.tampilkanMhs();
                        break;
                    case 3:
                        String cnim;
                        System.out.print("Masukan nim: ");
                        cnim = input.next();
                        mhs.cariMhs(cnim);
                        break;
                    case 4:
                        System.out.print("Masukan nim: ");
                        cnim = input.next();
                        mhs.hapusMhs(cnim);
                        break;
                    case 5:
                        mhs.hapusData();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opsi yang Anda pilih tidak valid.");
                        break;
                }
            }

        }

    }

}
