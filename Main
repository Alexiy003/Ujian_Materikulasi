import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Mahasiswa
        System.out.println("Masukkan Nama Mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();
        System.out.println("Masukkan NPM Mahasiswa: ");
        String npmMahasiswa = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(namaMahasiswa, npmMahasiswa);

        // Input for Dosen
        System.out.println("Masukkan Nama Dosen: ");
        String namaDosen = scanner.nextLine();
        System.out.println("Masukkan NIDN Dosen: ");
        String nidnDosen = scanner.nextLine();
        Dosen dosen = new Dosen(namaDosen, nidnDosen);

        // Input for MataKuliah
        System.out.println("Masukkan Nama Mata Kuliah: ");
        String namaMataKuliah = scanner.nextLine();
        System.out.println("Masukkan Kode Mata Kuliah: ");
        String kodeMataKuliah = scanner.nextLine();
        MataKuliah mataKuliah = new MataKuliah(namaMataKuliah, kodeMataKuliah);

        // Output
        System.out.println("\nData Mahasiswa: ");
        System.out.println(mahasiswa);

        System.out.println("\nData Dosen: ");
        System.out.println(dosen);

        System.out.println("\nData Mata Kuliah: ");
        System.out.println(mataKuliah);
    }
}
