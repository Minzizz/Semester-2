package W2.Mahasiswa;

public class Mahasiswa05 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa05(){
        
    }

    public Mahasiswa05(String nm, String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkanInformasi(){
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("IPK: "+ipk);
        System.out.println("Kelas: "+kelas);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIPK(double ipkBaru){
            ipk = ipkBaru;
    }

    String nilaiKinerja(double ipk){
        if(ipk>=3.5){
            return "Kinerja sangat baik";
        }else if (ipk >= 3.0){
            return "Kinerja baik";
        }else if (ipk >= 2.0){
            return "Kinerja cukup";
        }else {
            return "kinerja kurang";
        }
    }
}