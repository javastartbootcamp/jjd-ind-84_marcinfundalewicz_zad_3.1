package pl.javastart.task;

public class HeadPhonesTest {
    public static void main(String[] args) {
        HeadPhones headPhones1 = new HeadPhones("Lenovo", "Black", "Small");
        HeadPhones headPhones2 = new HeadPhones("Apple", "White", "Small");
        headPhones1.showInfo();
        headPhones2.showInfo();
    }
}
