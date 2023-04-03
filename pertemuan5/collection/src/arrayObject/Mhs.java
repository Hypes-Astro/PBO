package arrayObject;

public class Mhs {
    String nim, nama;
    float ipk;

    public Mhs(String nim, String nama, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    public void printInfo() {
        System.out.println("nama : " + nama);
        System.out.println("nim : " + nim);
        System.out.println("ipk : " + ipk);
        System.out.println("-----");
    }

}

// ketika menggunakan enkapsulasi
// public class Mhs {
// private String nim, nama;
// private float ipk;

// public Mhs(String nim, String nama, float ipk) {
// this.nim = nim;
// this.nama = nama;
// this.ipk = ipk;
// }

// public String getNim() {
// return nim;
// }

// public void setNim(String nim) {
// this.nim = nim;
// }

// public String getNama() {
// return nama;
// }

// public void setNama(String nama) {
// this.nama = nama;
// }

// public float getIpk() {
// return ipk;
// }

// public void setIpk(float ipk) {
// this.ipk = ipk;
// }

// public void printInfo() {
// System.out.println("nama : " + getNama());
// System.out.println("nim : " + getNim());
// System.out.println("ipk : " + getIpk());
// System.out.println("-----");
// }

// }
