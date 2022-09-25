package de.telran.d220920;

public class Testing {

    String products = "";

    public static void main(String[] args) {
        Testing test = new Testing();
        test = test.withApple(test).withMilk(test).withEggs(test).withEggs(test).withEggs(test);
//        test = test.withApple(test); //вызываем и память заканчивается
        System.out.println(test.products);
    }

    private Testing withApple(Testing test) {
        test.products += "apple\n";
        return test;
//        return test.withMilk(test); //так рекурсия бесконечная
    }

    private Testing withMilk(Testing test) {
        test.products += "milk\n";
        return test;
//        return test.withMeat(test);
    }

    private Testing withMeat(Testing test) {
        test.products += "meat\n";
        return test;
//        return test.withEggs(test);
    }

    private Testing withEggs(Testing test) {
        test.products += "egg\n";
        return test;
//        return test.withApple(test);
    }
}
