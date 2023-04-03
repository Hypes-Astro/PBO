package arrayList;

public class Mhs {
    private String nama, nim;
    private float ipk;

    // constraktor
    public Mhs(String nama, String nim, float ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    public void printInfo() {
        System.out.println("nama : " + getNama());
        System.out.println("nim : " + getNim());
        System.out.println("ipk : " + getIpk());
        System.out.println("-----");
    }

}
