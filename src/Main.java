import Jabatan.Jabatan;
import Jabatan.Supervisor;

public class Main {
    public static void main(String[] args) {

        Jabatan supervisor = new Supervisor();

        int waktuStart = 7;
        int waktuStop = 16;
        int jumlahAnak = 1;
        boolean istri = true;
        System.out.println("Total salary for Supervisor: Rp " + supervisor.hitungGaji(waktuStart, waktuStop, jumlahAnak, istri));
    }
}