import java.util.Scanner;

public class JobVacancyV2Function {
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
            //pemanggilan dan penggunaan function
            isPassing = validateKoordinator(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        } else if (posisi.equalsIgnoreCase("Admin")){
            //pemanggilan dan penggunaan function
            isPassing = validateAdmin(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        } else if (posisi.equalsIgnoreCase("SPV")) {
            //pemanggilan dan penggunaan function
            isPassing = validateSPV(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        } else {
            //Hasil ketika posisi tidak sesuai atau tidak ada.
            isPassing = false;
        }

        //membuat kondisi if untuk menentukan hasil output text
        if (isPassing) {
            hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke tahap selanjutnya.";
        } else {
            hasil = "Maaf, " + nama + ".\nAnda memenuhi tidak syarat sebagai " + posisi + ". Dan tidak akan masuk ke tahap selanjutnya.";
        }

        //Hasil Output
        printResult(nama, hasil, posisi);
    }

    //membuat function untuk validasi posisi koordinator
    //method return value berupa boolean 
    public static boolean validateKoordinator(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan) {
        //deklarasi variable lokal
        boolean reqKoor1, reqKoor2, result;

        //membuat kondisi setiap kriteria koordinator
        reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2; 
        reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;
        if (reqKoor1 || reqKoor2) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    //membuat function untuk validasi posisi admin
    //method return value berupa boolean 
    public static boolean validateAdmin(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan) {
        //deklarasi variable lokal
        boolean reqAdmin1, reqAdmin2, reqAdmin3, result;

        //membuat kondisi setiap kriteria admin
        reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && penampilan >= 8.5 || pengalaman >= 1;
            reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 || pengalaman >= 3;
            reqAdmin3 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 20 && umur <= 30 && lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 || pengalaman >= 2;
        if (reqAdmin1 || reqAdmin2 || reqAdmin3) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    //membuat function untuk validasi posisi SPV
    //method return value berupa boolean 
    public static boolean validateSPV(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan) {
        //deklarasi variable lokal
        boolean reqSPV1, reqSPV2, result;

        //membuat kondisi setiap kriteria admin
        reqSPV1 = umur >= 23 && umur <=30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 1;
        reqSPV2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman >= 4;
        if (reqSPV1 || reqSPV2) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    //membuat function untuk menampilkan hasil rekruitmen
    //method atau function berupa void
    public static void printResult(String nama, String hasil, String posisi) {
        System.out.println("");
        System.out.println(nama + ", Terimakasih telah mengikuti lowongan kerja di PT. Secret Semut 79.\n");
        System.out.println("Berikut adalah hasil dari rekrutmen untuk posisi " + posisi + " berdasarkan data yang anda input:\n");
        System.out.println(hasil + "\n");
    }
}