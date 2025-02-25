package W3.Dosen;

public class DataDosen05 {
    String kode;

    public static void dataSemuaDosen(Dosen05[] arrayOfDosen){
        int penomoran=1;
        for (Dosen05 dosen05 : arrayOfDosen) {
            System.out.println("Data dosen ke-"+penomoran);
            System.out.println("Kode: "+dosen05.kode);
            System.out.println("Nama: "+dosen05.nama);
            System.out.println("Jenis kelamin: "+dosen05.kelamin());
            System.out.println("Usia: "+dosen05.usia);
            System.out.println("=================================");
            penomoran++;
        }
    }
    public static void jumlahDosenPerJenisKelamin(Dosen05[] arrayOfDosen){
        int jmlPria=0;
        int jmlWanita=0;
        for (Dosen05 dosen05 : arrayOfDosen) {
            if (dosen05.kelamin().equalsIgnoreCase("pria")) {
                jmlPria++;
            }else{
                jmlWanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : "+jmlPria);
        System.out.println("Jumlah Dosen Wanita : "+jmlWanita);
        System.out.println("=================================");
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen05[] arrayOfDosen) {
        double rerataPria=0,rerataWanita=0;
        int totalWanita=0,totalPria=0;
        int jmlPria=0;
        int jmlWanita=0;
        for (Dosen05 dosen05 : arrayOfDosen) {
            if (dosen05.kelamin().equalsIgnoreCase("pria")) {
                jmlPria++;
            }else{
                jmlWanita++;
            }
        }
        for (Dosen05 dosen05 : arrayOfDosen) {
            if (dosen05.kelamin().equalsIgnoreCase("pria")) {
                totalPria+=dosen05.usia;
            }else{
                totalWanita+=dosen05.usia;
            }
        }
        rerataPria=(double)totalPria/jmlPria;
        rerataWanita=(double)totalWanita/jmlWanita;
        System.out.println("Rata-rata usia dosen pria   : "+rerataPria);
        System.out.println("Rata-rata usia dosen Wanita : "+rerataWanita);
        System.out.println("=================================");
    }
    public static void infoDosenPalingTua(Dosen05[] arrayOfDosen){
        int palingTua=arrayOfDosen[0].usia;
        String siTua="";
        for (Dosen05 dosen05 : arrayOfDosen) {
            if (dosen05.usia>=palingTua) {
                siTua = dosen05.nama;
            }
        }
        System.out.println("Dosen yang paling tua adalah : "+siTua);
        System.out.println("=================================");
    }
    public static void infoDosenPalingMuda(Dosen05[] arrayOfDosen){
        int palingMuda=arrayOfDosen[0].usia;
        String siMuda="";
        for (Dosen05 dosen05 : arrayOfDosen) {
            if (dosen05.usia<=palingMuda) {
                siMuda = dosen05.nama;
            }
        }
        System.out.println("Dosen yang paling muda adalah : "+siMuda);
        System.out.println("=================================");
    }
}
