public class Samsung extends Phone {
    private int workersWages;
    private String companyLocation;

    public Samsung(String name, String founder, int year, int workersWages, String companyLocation) {
        super(name, founder, year);
        this.workersWages = workersWages;
        this.companyLocation = companyLocation;
    }

    @Override
    public void print() {
        System.out.println("Company name: " + getName() +
                "\nFounder: " + getFounder() +
                "\nYear: " + getYear() +
                "\nWorker's wages: " + workersWages + "$" +
                "\nCompany location: " + companyLocation +
                "\n-----------------------------------");
    }
}
