public class Xiaomi extends Phone {
    private int numberOfWorkers;
    private String performanceOtherPhones;

    public Xiaomi(String name, String founder, int year, int numberOfWorkers, String performanceOtherPhones) {
        super(name, founder, year);
        this.numberOfWorkers = numberOfWorkers;
        this.performanceOtherPhones = performanceOtherPhones;
    }

    @Override
    public void print() {
        System.out.println("Company name: " + getName() +
                "\nFounder: " + getFounder() +
                "\nYear: " + getYear() +
                "\nNumber Of Workers: " + numberOfWorkers +
                "\nPerformance other than phones: " + performanceOtherPhones +
                "\n-----------------------------------");
    }
}
