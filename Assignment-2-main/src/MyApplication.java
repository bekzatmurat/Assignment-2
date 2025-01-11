import java.util.ArrayList;

public static void main() {
    ArrayList<Payable> payables = new ArrayList<>();
    payables.add(new Employee("John", "Lennon", "Manager", 27045.78));
    payables.add(new Employee("George", "Harrison", "Developer", 50000.00));
    payables.add(new Student("Ringo", "Starr", 2.5));
    payables.add(new Student("Paul", "McCartney", 3.8));
    payables.sort((a, b) -> Double.compare(b.getPaymentAmount(), a.getPaymentAmount()));
    printData(payables);
}

public static void printData(Iterable<Payable> payables) {
    for (Payable p : payables) {
        System.out.printf("%s earns %.2f tenge%n", p.toString(), p.getPaymentAmount());
    }
}

