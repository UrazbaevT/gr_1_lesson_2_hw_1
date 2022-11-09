public class Main {
    public static void main(String[] args) {

        createObject(Class.SAMSUNG, "Samsung", "Li Ben Chol", 1938, 8900, "South Korea, Seoul", 0.0, 0, 0, null);
        createObject(Class.APPLE, "Apple", "Stive Jobs", 1976, 0, null, 366.7, 389, 0, null);
        createObject(Class.XIAOMI, "Xiaomi", "Lei Jun", 2010, 0, null, 0.0, 0, 16683, "Redmi");

    }

    private static Phone createObject(Class typeOfClass, String name, String founder, int year, int workersWages, String companyLocation, double turnoverPerYear, int numberOfCompanies, int numberOfWorkers, String performanceOtherPhones) {
        if (Class.SAMSUNG == typeOfClass) {
            Samsung samsung = new Samsung("Samsung", "Li Ben Chol", 1938, 8900, "South Korea, Seoul");
            samsung.print();
            return samsung;
        }else if (Class.APPLE == typeOfClass){
            Apple apple = new Apple("Apple", "Stive Jobs", 1976, 366.7, 389);
            apple.print();
            return apple;
        }else if (Class.XIAOMI == typeOfClass){
            Xiaomi xiaomi = new Xiaomi("Xiaomi", "Lei Jun", 2010, 16683, "Redmi");
            xiaomi.print();
            return xiaomi;
        }else {
            return null;
        }
    }
}