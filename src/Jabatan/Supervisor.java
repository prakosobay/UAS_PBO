package Jabatan;

public class Supervisor implements Jabatan{
    private static final int gajiPokok = 10000000;
    private static final int transport = 1000000;
    private static final int lemburPerJam = 10000;
    private static final int tunjanganIstri = 300000;
    private static final int tunjanganAnak = 100000;
    private static final int tunjanganExtraAnak = 200000;

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
        
        return totalGaji;
    }
}