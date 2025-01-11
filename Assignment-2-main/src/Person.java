public class Person implements Payable, Comparable<Person> {
    private static int counter = 0;
    private final int id;
    private String name;
    private String surname;

    public Person() {
        id = ++counter;
    }
    public Person(String name, String surname) {
        id = ++counter;
        this.name = name;
        this.surname = surname;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPosition() {
        return "Student";
    }
    public String toString() {
        return id + ". " + name + " " + surname;
    }
    public double getPaymentAmount() {
        return 0.0;
    }
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
