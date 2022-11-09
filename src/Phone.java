public abstract class Phone implements Printable{
    private String name;
    private String founder;
    private int year;

    public Phone(String name, String founder, int year) {
        this.name = name;
        this.founder = founder;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getFounder() {
        return founder;
    }
}
