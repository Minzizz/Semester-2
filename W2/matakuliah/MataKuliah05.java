package W2.matakuliah;

public class MataKuliah05 {
    String kodeMK; //kode untuk mata kuliah
    String nama; //nama matkul
    int sks;
    int jumlahJam; //total jam pertemuan per minggu

    public MataKuliah05(){

    }
    public MataKuliah05(String kode, String nama, int sks, int jml){
        kodeMK = kode;
        this.nama = nama;
        this.sks = sks;
        jumlahJam = jml;
    }
    void tampilinformasi(){
        System.out.println("Kode Mata Kuliah: "+kodeMK);
        System.out.println("Mata Kuliah: "+nama);
        System.out.println("SKS: "+sks);
        System.out.println("Jumlah jam per minggu: "+jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jam){
        jumlahJam+=jam;
    }

    void kurangiJam(int jam){
        if (jumlahJam>jam) {
            jumlahJam-=jam;
        }else{
            System.out.println("Jumlah jam tidak bisa dikurang.");
        }
        
    }
}
