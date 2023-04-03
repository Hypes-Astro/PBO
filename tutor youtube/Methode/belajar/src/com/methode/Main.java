package com.methode;

/**
 * Mahasiswa
 */
class Mahasiswa {
    String nama;
    String NIM;

    Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;

    }

    // memmbuat methode tanpa parameter dan tanpa return.
    void show() {
        System.out.println("Nama : " + this.nama + " Nim: " + this.NIM + "\n");
    }

    // memmbuat methode parameter dan tanpa return.
    void setNama(String UbahNama) {
        this.nama = UbahNama;
    }

    // membuat methode tanpa parameter dengan return.
    String getNama() {
        return this.nama;
    }

    String getNim() {
        return this.NIM;
    }

    // membuat methode dengan parameter dan dengan return.
    String salam(String pesan) {
        return pesan + ", pada mu: " + this.getNama() + " dengan Nim " + this.getNim();
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Alif", "A11.2021.13717");
        // manggil show
        mahasiswa1.show();

        // manggil setNama
        mahasiswa1.setNama("Alok");
        mahasiswa1.show();

        // manggil getNama dan getNim
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNim());

        // manggil salam
        String data = mahasiswa1.salam("Assalamualaikum");
        System.out.println(data);
    }
}
