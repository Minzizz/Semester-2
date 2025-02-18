package W2.Mahasiswa;

public class MahasiswaMain05 {
    public static void main(String[] args) {
        Mahasiswa05 mhs1 = new Mahasiswa05();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2441720171";
        mhs1.kelas = "Si 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa05 mhs2 = new Mahasiswa05("Annisa Nabila", "2141720160", 3.25, "Ti2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa05 mhs05 = new Mahasiswa05("Amin Aziz Sudjud","244107020079",3.81,"TI 1A");
        mhs05.tampilkanInformasi();
    }
}
