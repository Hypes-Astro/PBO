package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Crud {
    ArrayList<Constructor> listMhs;
    Scanner input = new Scanner(System.in);
    String hasil;
    int index;

    public Crud() {
        listMhs = new ArrayList<>();
    }

    public void tampilkanMhs() {
        int id = 0;
        System.out.println("Daftar Mahasiswa:");
        if (listMhs.size() < 1) {
            System.out.println("Data kosong");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("+-----+------------------+---------------+------------+---------+");
            System.out.println("| No. | Nama             | Jurusan       | NIM        | Semester|");
            System.out.println("+-----+------------------+---------------+------------+---------+");
            for (Constructor mhs : listMhs) {
                id++;
                /*
                 * Format string "|%3d | %-16s | %-13s | %-4s | %-7s |%n" adalah pola yang
                 * digunakan untuk memformat output pada method tampilMhs yang digunakan untuk
                 * menampilkan data mahasiswa dalam tabel.
                 * 
                 * %3d : %d digunakan untuk memformat nilai integer, dan %3d menentukan lebar
                 * kolom untuk nilai integer sebesar 3 karakter. %3d akan menambahkan spasi
                 * kosong di depan nilai integer jika nilai tersebut kurang dari 3 karakter.
                 * %-16s : %s digunakan untuk memformat string, dan %-16s menentukan lebar kolom
                 * untuk string sebesar 16 karakter. Tanda minus - menunjukkan bahwa string akan
                 * dijustifikasi ke kiri.
                 */
                System.out.format("|%3d  | %-16s | %-13s | %10s | %-7s |%n", id, mhs.getNama(), mhs.getJurusan(),
                        mhs.getNim(), mhs.getSemester());
                System.out.println("+-----+------------------+---------------+------------+---------+");
            }
        }
    }

    public void tambahMhs() {

        System.out.print("Nama : ");
        String nama = input.next();

        System.out.print("Nim : ");
        String nim = input.next();

        System.out.print("Jurusan : ");
        String jurusan = input.next();

        System.out.print("Semester : ");
        String semester = input.next();
        int nsemester = Integer.parseInt(semester);

        Constructor mhs = new Constructor(nim, nama, jurusan, nsemester);
        listMhs.add(mhs);
    }

    public String cariMhs(String cnim) {
        System.out.println("Mencari data nim : " + cnim);
        int stop = -1;
        for (Constructor mhs : listMhs) {
            stop++;
            if (mhs.getNim().contains(cnim)) {
                System.out.println("Nim : " + cnim + " ditemukan di " + (stop + 1));
                index = stop;
                hasil = cnim;
                System.out.println("");
                break;
            } else if (!mhs.getNim().contains(cnim) && (stop + 1) == jmlMhs()) {
                System.out.println("Nim : " + cnim + " tidak ditemukan");
                System.out.println("");
            }
        }
        return hasil;
    }

    public int jmlMhs() {
        return listMhs.size();
    }

    public void hapusMhs(String cnim) {
        if (cariMhs(cnim) == cnim) {
            if (jmlMhs() == 1) {
                listMhs.remove(0);
            } else {
                listMhs.remove(index);
            }
        }
        System.out.println("");
    }

    public void hapusData() {
        listMhs.clear();
    }

}
