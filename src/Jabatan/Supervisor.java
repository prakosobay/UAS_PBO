package Jabatan;

public class Supervisor implements Jabatan{
    private static final int gajiPokok = 10000000;
    private static final int transport = 1000000;
    private static final int lemburPerJam = 10000;
    private static final int tunjanganIstri = 300000;
    private static final int tunjanganAnak = 100000;
    private static final int tunjanganExtraAnak = 200000;
    private static final int jamMasuk = 7;
    private  static final int jamKeluar = 16;
    private static final int potongan = 100000;

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