public class GeneralDoctor implements ConsultationStrategy {

    @Override
    public void consult(Patient patient) {
        System.out.println("Konsultasi Dokter Umum untuk " + patient.getName());
    }

    @Override
    public double getPrice() {
        return 50000;
    }
}