package Jabatan;

public class Karyawan implements Jabatan{

    private static final int gajiPokok = 1500000;
    private static final int transport = 250000;
    private static final int lemburPerJam = 5000;
    private static final int tunjanganIstri = 200000;
    private static final int tunjanganAnak = 60000;
    private static final int tunjanganExtraAnak = 130000;
    private static final int jamMasuk = 7;
    private  static final int jamKeluar = 16;
    private static final int potongan = 100000;

    @Override
    public int hitungGaji(int start, int stop, int jumlahAnak, boolean istri) {
        int totalGaji;

        totalGaji = gajiPokok + transport;

        if (istri) {
            totalGaji += tunjanganIstri;
        }

        if (jumlahAnak == 1) {
            totalGaji += tunjanganAnak;
        } else if (jumlahAnak > 1) {
            totalGaji += tunjanganExtraAnak;
        }

        if (start > jamMasuk) {
            int telat = start - jamMasuk;
            int potonganGaji = telat * potongan;
            totalGaji -= potonganGaji;
        }

        if (stop < jamKeluar) {
            int telat = jamKeluar - stop;
            int potonganGaji = telat * potongan;
            totalGaji -= potonganGaji;
        } else if (stop > jamKeluar) {
            int lembur = stop - jamKeluar;
            int upahLembur = lembur * lemburPerJam;
            totalGaji += upahLembur;
        }

        return totalGaji;
    }
}
