public class ConsultationFactory {

    public static ConsultationStrategy create(String pilihan) {

        switch (pilihan) {
            case "1":
                return new GeneralDoctor();
            case "2":
                return new Dentist();
            case "3":
                return new Psychologist();
            default:
                return null;
        }
    }
}