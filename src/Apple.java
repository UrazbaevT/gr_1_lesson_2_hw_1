public class Apple extends Phone {
    private double turnoverPerYear;
    private int numberOfCompanies;

    public Apple(String name, String founder, int year, double turnoverPerYear, int numberOfCompanies) {
        super(name, founder, year);
        this.turnoverPerYear = turnoverPerYear;
        this.numberOfCompanies = numberOfCompanies;
    }

    @Override
    public void print() {
        System.out.println("Company name: " + getName() +
                "\nFounder: " + getFounder() +
                "\nYear: " + getYear() +
                "\nTurnover Per Year: " + turnoverPerYear + " billion $" +
                "\nNumber of companies: " + numberOfCompanies +
                "\n-----------------------------------");
    }
}
