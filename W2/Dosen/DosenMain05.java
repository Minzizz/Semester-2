package W2.Dosen;

public class DosenMain05 {
    public static void main(String[] args) {
        Dosen05 dosen1 = new Dosen05();
        dosen1.idDosen="DSN1945";
        dosen1.nama="Ali Akhyar";
        dosen1.bidangKeahlian="AI";
        dosen1.tahunBergabung=1945;
        dosen1.statusAktif=true;

        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(2025);
        dosen1.tampilinformasi();
        dosen1.ubahKeahlian("Movie Producer");
        dosen1.tampilinformasi();

        Dosen05 dosen2=new Dosen05("DOS1999","Reyon Kresek","Designer",1999,false);
        dosen2.setStatusAktif(false);
        dosen2.hitungMasaKerja(2025);
        dosen2.tampilinformasi();
        dosen2.ubahKeahlian(null);
        dosen2.tampilinformasi();
    }
}
