public class Main {
    public static void main(String[] args) {

        createObject("Samsung");
        createObject("Apple");
        createObject("Xiaomi");

    }

    private static Phone createObject(String ClassName) {
        switch (ClassName) {
            case "Samsung":
                Samsung samsung = new Samsung("Samsung", "Li Ben Chol", 1938, 8900, "South Korea, Seoul");
                samsung.print();
                break;
            case "Apple":
                Apple apple = new Apple("Apple", "Stive Jobs", 1976, 366.7, 389);
                apple.print();
                break;
            case "Xiaomi":
                Xiaomi xiaomi = new Xiaomi("Xiaomi", "Lei Jun", 2010, 16683, "Redmi");
                xiaomi.print();
                break;
        }
        return null;
    }
}