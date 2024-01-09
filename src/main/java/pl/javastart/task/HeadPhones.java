package pl.javastart.task;

public class HeadPhones {
    String brandName;
    String colour;
    String size;
    HeadPhones(String brandName, String colour, String size) {
        this.brandName = brandName;
        this.colour = colour;
        this.size = size;
    }
    void showInfo() {
        System.out.println("Brand: " + brandName + " Colour: " + colour + " Size: " + size);
    }
}
