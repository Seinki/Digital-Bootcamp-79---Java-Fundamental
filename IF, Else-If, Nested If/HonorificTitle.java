import java.util.Scanner;

public class HonorificTitle {
    public static void main(String[] args) {
        //Variable
        Scanner input = new Scanner(System.in);
        String title, namaDepan, namaBelakang, jenisKelamin;
        int umur;
        //Input from user
        System.out.print("Nama Depan: ");
        namaDepan = input.next();
        System.out.print("Nama Belakang: ");
        namaBelakang = input.next();
        System.out.print("Umur: ");
        umur = input.nextInt();
        System.out.print("Jenis Kelamin (Pria/Wanita): ");
        jenisKelamin = input.next();
        // kondisi tertentu (Nested If)
        if (umur < 20) {
            title = namaDepan;
        } else {
            if (jenisKelamin.equals("Wanita")) {
                System.out.print("Apakah anda sudah menikah? (Y/N): ");
                String status = input.next();

                if (status.equals("Y")) {
                    title = "Mrs. ";
                } else {
                    title = "Ms. ";
                }
            } else {
                title = "Mr. ";
            }
        }
        //Output from system
        System.out.println();
        System.out.println("Hello " + title + namaDepan + " " + namaBelakang);
        System.out.println();
    }
}
