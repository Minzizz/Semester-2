package W3.Dosen;

public class Dosen05 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public void dosen(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
        }

    String kelamin(){
        return jenisKelamin ? "Pria" : "Wanita";
    }
        
    
}
