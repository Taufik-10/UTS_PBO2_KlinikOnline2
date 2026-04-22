import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== KLINIK ONLINE ===");

        System.out.print("Nama pasien: ");
        String nama = input.nextLine();

        System.out.println("Pilih layanan:");
        System.out.println("1. Dokter Umum");
        System.out.println("2. Dokter Gigi");
        System.out.println("3. Psikolog");
        System.out.print("Pilihan: ");
        String pilihan = input.nextLine();

        ConsultationStrategy strategy = ConsultationFactory.create(pilihan);

        if (strategy != null) {
            Patient patient = new Patient(nama);
            ClinicService service = new ClinicService(strategy);
            service.process(patient);
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }
}