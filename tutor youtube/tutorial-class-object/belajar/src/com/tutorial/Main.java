package com.tutorial;

// membuat class sebagai template/loyang.
/**
 * Mahasiswa sebagai kumpulan object
 */
class Mahasiswa {
    String nama;
}

public class Main {
    public static void main(String[] args) {

        Mahasiswa udin = new Mahasiswa();
        udin.nama = "Udin muper";

        System.out.println(udin.nama);
    }
}
