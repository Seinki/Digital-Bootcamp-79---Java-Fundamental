import java.util.Scanner;

public class jobVacancy {
    public static void main(String[] args) {
        //declarasi variable yang dibutuhkan
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
        boolean isPassingKoor, isPassingAdmin;
        Scanner input = new Scanner(System.in);

        //buat output yang dibutuhkan
        System.out.println("Selamat datang di PT> Scret Semut 79.");
        System.out.println("=========================================\n");
        System.out.println("Silahkan masukkan data anda.");

        System.out.println("Nama: ");
        nama = input.next();

        System.out.println("Umur: ");
        umur = input.nextInt();

        System.out.println("Jenis Kelamin: ");
        jenisKelamin = input.next();

        System.out.println("Lulusan (SMK/D3/S1): ");
        lulusan = input.next();

        System.out.println("Pengalaman: ");
        pengalaman = input.nextInt();

        System.out.println("Penampilan: ");
        penampilan = input.nextDouble();

        //boolean expression
        //persyaratan koordinator 1
        reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3") && pengalaman >= 2;
        //persyaratan koordinator 2
        reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;

        //hasil untuk koordinator
        isPassingKoor = reqKoor1 || reqKoor2;

        //persyaratan admin 1
        reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && penampilan >= 8.5 && pengalaman >= 1;
        //persyaratan admin 2
        reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >= 3;

        //hasil untuk Admin
        isPassingAdmin = reqAdmin1 || reqAdmin2;

        //membuat output text hasil
        System.out.println();
        System.out.println(nama+ " Terima kasih telah mengikuti lowongan kerja di PT. Sceret Semut 79.");
        System.out.println("Berikut adalah hasil dari rekrutmen untuk KOordinator dan Admin: ");
        System.out.println("Hasil kelulusan untuk Koordinator: " + isPassingKoor);
        System.out.println("Hasil kelulusan untuk Admin: " + isPassingAdmin);
    }
}