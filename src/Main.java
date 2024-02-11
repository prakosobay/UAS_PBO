import Jabatan.Jabatan;
import Jabatan.Supervisor;
import Jabatan.HRD;
import Jabatan.Teknisi;
import Jabatan.Karyawan;

public class Main {
    public static void main(String[] args) {

        Jabatan supervisor = new Supervisor();
        Jabatan hrd = new HRD();
        Jabatan teknisi = new Teknisi();
        Jabatan karyawan = new Karyawan();

        int waktuStart = 7;
        int waktuStop = 16;
        int jumlahAnak = 2;
        boolean istri = true;

        System.out.println("Total Gaji Supervisor: Rp " + supervisor.hitungGaji(waktuStart, waktuStop, jumlahAnak, istri));
        System.out.println("Total Gaji HRD: Rp " + hrd.hitungGaji(waktuStart, waktuStop, jumlahAnak, istri));
        System.out.println("Total Gaji Teknisi: Rp " + teknisi.hitungGaji(waktuStart, waktuStop, jumlahAnak, istri));
        System.out.println("Total Gaji Karyawan: Rp " + karyawan.hitungGaji(waktuStart, waktuStop, jumlahAnak, istri));
    }
}