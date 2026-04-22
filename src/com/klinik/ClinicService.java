public class ClinicService {

    private ConsultationStrategy strategy;

    public ClinicService(ConsultationStrategy strategy) {
        this.strategy = strategy;
    }

    public void process(Patient patient) {
        strategy.consult(patient);
        System.out.println("Biaya: Rp " + strategy.getPrice());
    }
}