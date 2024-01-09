package pl.javastart.task;

public class HeadPhonesTest {

    public static void main(String[] args) {
        HeadPhones headPhones1 = new HeadPhones();
        HeadPhones headPhones2 = new HeadPhones();

        headPhones1.brandName = "Lenovo";
        headPhones1.colour = "Black";
        headPhones1.size = "Small";

        headPhones2.brandName = "Apple";
        headPhones2.colour = "White";
        headPhones2.size = "Small";

        System.out.println("Brand: " + headPhones1.brandName + " Colour: " + headPhones1.colour
        + " Size: " + headPhones1.size);

        System.out.println("Brand: " + headPhones2.brandName + " Colour: " + headPhones2.colour
                + " Size: " + headPhones2.size);
    }
}
