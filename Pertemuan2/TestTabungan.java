import java.util.Scanner;

public class TestTabungan{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Tabungan nasabah1 = new Tabungan();
        // ini ku dokumentasikan karena dilakukan deklarasi tipe data yang di private
        // nasabah1.nama = "nasabah1";
        // nasabah1.saldo = 2000;
        //  --->> lalu bagaimana mengatur agar dapat meng sett value dari variabel tersebut dengan cara seperti ini
        nasabah1.setNama("Joko");
        nasabah1.setSaldo(2000);

        // dengan menggenukan methode kita dapat menggunakan set dan get untuk memberikan value dan mendapatkan value dari variabel yang akan kita masukan
        nasabah1.tampil();
        
        // ini nanti akan menambahkan saldo sebanyak parameter
        nasabah1.setor(500);
        nasabah1.tampil();
        // ini akan mengurangi salo sebanyak parameter
        nasabah1.tarik(100);
        nasabah1.tampil();

//  =====================================================================================
        
        Tabungan nasabah2 = new Tabungan("Alif",3000);
        nasabah2.tampil();
        // ini nanti akan input menambahkan saldo sebanyak parameter
        System.out.println("Jumlah disetor nasabah= ");
        int jmlSetor = scanner.nextInt();
        nasabah2.setor(jmlSetor);
        nasabah2.tampil();
        // ini akan mengurangi salo sebanyak parameter
        nasabah2.tarik(100);
        nasabah2.tampil();
        
    }
}