package W2.Dosen;

public class Dosen05 {
    String idDosen;
    String nama;
    String bidangKeahlian;
    int tahunBergabung;
    boolean statusAktif;
    String keaktifan="Tidak Aktif";
    int masaKerja;

    public Dosen05(){

    }
    public Dosen05(String id, String nm, String bidang, int thn, boolean status){
        idDosen=id;
        nama=nm;
        bidangKeahlian=bidang;
        tahunBergabung=thn;
        statusAktif=status;
    }

    void tampilinformasi(){
        System.out.println("ID Dosen: "+idDosen);
        System.out.println("Nama Dosen: "+nama);
        System.out.println("Bidang keahlian: "+bidangKeahlian);
        System.out.println("Tahun Bergabung: "+tahunBergabung);
        System.out.println("Masa kerja dosen: "+masaKerja);
        System.out.println("Status aktif: "+keaktifan);
        System.out.println();
    }

    void setStatusAktif(boolean status){
        if (status||statusAktif) {
            keaktifan="Aktif";
        }else{
            keaktifan="Tidak aktif";
        }
    }

    int hitungMasaKerja(int thnSkrg){
        
        return masaKerja=(thnSkrg-tahunBergabung);
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian=bidang;
    }
}
