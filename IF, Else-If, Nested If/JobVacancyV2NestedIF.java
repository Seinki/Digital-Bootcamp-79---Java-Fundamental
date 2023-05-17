import java.util.Scanner;

public class JobVacancyV2NestedIF {
    public static void main(String[] args) {
        //Variable
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin, posisi, hasil;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2, reqAdmin3, reqSpv1, reqSpv2;
        boolean isPassing;

        Scanner input = new Scanner(System.in);

        //Input data dari user
        System.out.println("Silahkan masukkan data anda");
        System.out.print("Nama: ");
        nama = input.next();
        System.out.print("Umur: ");
        umur = input.nextInt();
        System.out.print("Jenis Kelamin: ");
        jenisKelamin = input.next();
        System.out.print("Lulusan (SMK/D3/S1): ");
        lulusan = input.next();
        System.out.print("Pengalaman (tahun): ");
        pengalaman = input.nextInt();
        System.out.print("Penampilan (1-10): ");
        penampilan = input.nextDouble();
        System.out.println("Posisi yang di inginkan (Koordinator, Admin, SPV): ");
        posisi = input.next();

        //Nested If statement
        if (posisi.equalsIgnoreCase("Koordinator")) {
            //membuat kondisi untuk setiap kondisi kriteria koordinator
            //persyaratan koordinator 1
            reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3") && pengalaman >= 2;
            //persyaratan koordinator 2
            reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;

            //kondisi if untuk menentukan hasil kelulusan posisi koordinator
            if (reqKoor1 || reqKoor2) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke tahap selanjutnya.";
            } else {
                hasil = "Maaf, " + nama + ".\nAnda tidak memenuhi syarat sebagai " + posisi + ". Dan akan tidak masuk ke tahap selanjutnya.";
            }
        } else if (posisi.equalsIgnoreCase("Admin")) {
            //membuat kondisi untuk setiap kondisi kriteria admin
            //persyaratan admin 1
            reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 && pengalaman >= 1);
            //persyaratan admin 2
            reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >= 3;
            reqAdmin3 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 20 && umur <= 30&& penampilan >= 8.5  && lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1") && pengalaman >= 2;

            //kondisi if untuk menentukan hasil kelulusan posisi koordinator
            if (reqAdmin1 || reqAdmin2 || reqAdmin3) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke tahap selanjutnya.";
            } else {
                hasil = "Maaf, " + nama + ".\nAnda tidak memenuhi syarat sebagai " + posisi + ". Dan akan tidak masuk ke tahap selanjutnya.";
            }
        } else if (posisi.equalsIgnoreCase("SPV")) {
            reqSpv1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 1;
            reqSpv2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman >= 4;

            if (reqSpv1 || reqSpv2) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke tahap selanjutnya.";
            } else {
                hasil = "Maaf, " + nama + ".\nAnda tidak memenuhi syarat sebagai " + posisi + ". Dan akan tidak masuk ke tahap selanjutnya.";
            }
        } else {
            //hasil ketika posisi yang dimasukkan tidak tersedia
            hasil = "Maaf, posisi yang anda cari tidak tersedia.";
        }

        System.out.println();
        System.out.println(nama + ", Terimakasih telah mengisi lowongan kerja dari PT. Secret Semut 79.");
        System.out.println("Berikut adalah hasil dari rekrutmen untuk posisi " + posisi + " :");
        System.out.println(hasil);
    }
}