package W2.matakuliah;

public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah05 mk1 = new MataKuliah05();
        mk1.kodeMK = "RTI242003";
        mk1.nama = "Desain Antar Muka";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilinformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(5);
        mk1.tampilinformasi();
        mk1.kurangiJam(10);
        mk1.tampilinformasi();

        MataKuliah05 mk2 = new MataKuliah05("RTI242002","Aljabar Linier",2,4);
        mk2.tampilinformasi();
        mk2.kurangiJam(1);
        mk2.tampilinformasi();
    }
    
}
