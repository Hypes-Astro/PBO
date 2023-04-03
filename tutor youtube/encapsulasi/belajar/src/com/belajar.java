package com;

//  Fungsi enkapsulasi

/*
 *  Enkapsulasi adalah salah satu konsep dasar dalam pemrograman berorientasi objek (OOP) yang memungkinkan pembuat kelas untuk menyembunyikan rincian implementasi dan memberikan akses terkontrol ke data dan perilaku objek.
 */

/**
 * Data
 */
class Data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    // private hanya dapat diakses dialam kelas nya saja.
    public Data() {
        this.intPublic = 0;
        this.intPrivate = 0;
    }

    // methode untuk mengakses private.
    public int getterIntPrivate() {
        return this.intPrivate;
    }

    public void setterDoublePrivate(double value) {
        this.doublePrivate = value;
    }

    // all show
    public void display() {
        System.out.println("Public int: " + this.intPublic);
        System.out.println("Private int: " + this.intPrivate);
        System.out.println("Private db: " + this.doublePrivate);
        System.out.println("--------------------------------------");
    }

}

/**
 * Lingkaran
 */
class Lingkaran {

    private double diameter;

    Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    // set diamater dari jari jar yang diberikan.
    public void setDiameter(double jari) {
        this.diameter = jari * 2;
    }

    // lalu ambil dari diameter yang telah di assign sebelumnya.
    public double getDiameter() {
        return this.diameter;
    }

    public double getLuas() {
        return 3.14 * diameter;
    }

}

public class belajar {

    public static void main(String[] args) {
        Data obj1Data = new Data();

        obj1Data.intPublic = 10; // assignment
        int data = obj1Data.intPublic; // singkat

        System.err.println(data); // read

        // kita tidak dapat mengakses secara langsung object obj1data dengan intprivate.
        // akan tetapi kita dapat melakukan alternatif lain seperti menggunakan getter
        // dan setter.

        // read only;
        System.out.println("private getter: " + obj1Data.getterIntPrivate());

        // write only
        obj1Data.setterDoublePrivate(0.5);

        obj1Data.display();

    }
}
