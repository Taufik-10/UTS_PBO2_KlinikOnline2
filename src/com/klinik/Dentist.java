public class Dentist implements ConsultationStrategy {

    @Override
    public void consult(Patient patient) {
        System.out.println("Konsultasi Dokter Gigi untuk " + patient.getName());
    }

    @Override
    public double getPrice() {
        return 75000;
    }
}