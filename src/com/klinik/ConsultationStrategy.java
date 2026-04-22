public interface ConsultationStrategy {

    void consult(Patient patient);

    double getPrice();
}