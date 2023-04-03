
// tanpa construktor
class Polos {
    String dataString;
    int dataInteger;
}

// class dengan construktor
/**
 * Mahasiswa dengan construktor
 */
class Mahasiswa {
    String nama, NIM, jurusan;

    // bentuk construktor.
    // Mahasiswa() {
    // System.out.println("Ini adalah construktor");
    // }

    // membuat parameter agar lebih dinamis.
    Mahasiswa(String InputNama, String InputNim, String InputJurusan) {
        nama = InputNama;
        NIM = InputNim;
        jurusan = InputJurusan;

        System.out.println("Nama: " + nama + " Nim: " + NIM + " jurusan: " + jurusan);
    }
}

public class Main {
    public static void main(String[] args) {
        // Mahasiswa1 sebagai object, penggunaan this. itu sama saja dengan pengambilan
        // object.parameter
        Mahasiswa mahasiswa1 = new Mahasiswa("Alif", "A11.2021.123717", "Teknik Informartika ");
    }
}

// kosntruktor adalah instruksi yang pertana kali dipanggil ketika object
// dipanggil.