public class Psychologist implements ConsultationStrategy {

    @Override
    public void consult(Patient patient) {
        System.out.println("Konsultasi Psikolog untuk " + patient.getName());
    }

    @Override
    public double getPrice() {
        return 100000;
    }
}