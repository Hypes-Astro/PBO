

public class Tabungan {
    private int saldo;
    private String nama;

    // penerapan dari private methode.
    // fungsi dari penggunaan private adalah cara untuk membatasi akses ke variabel atau metode tertentu hanya ke dalam kelas yang sama di mana mereka dideklarasikan.


    Tabungan(){
    }
    Tabungan(String nama, int saldo){
        this.nama = nama;
        this.saldo = saldo;
    }
    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return nama;
    }

    void setSaldo(int saldo){
        this.saldo = saldo;
    }
    int getSaldo(){
        return saldo;
    }

    void setor(int jml){
        saldo+=jml;
        System.out.println("Berhasil menambahkan saldo, sebanyak : "+jml);
    }

    void tarik(int jml){
        saldo-=jml;
        System.out.println("Berhasil menarik saldo sebanyak "+jml+". saldo akhir adalah = ");
    }
    void tampil() {
        System.out.println("\nNama nasabah = "+nama);
        System.out.println("saldo = "+saldo+"\n");
    }
}