package Jabatan;

public class HRD implements  Jabatan {

    private static final int gajiPokok = 5000000;
    private static final int transport = 750000;
    private static final int lemburPerJam = 7500;
    private static final int tunjanganIstri = 250000;
    private static final int tunjanganAnak = 90000;
    private static final int tunjanganExtraAnak = 190000;
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
