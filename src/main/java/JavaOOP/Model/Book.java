package JavaOOP.Model;

public class Book {
    private String name;
    private String author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int quantityOfPages;
    private int price;

    public Book() {

    }

    public Book(String name, String author, String publishingHouse, int yearOfPublishing, int quantityOfPages, int price) {
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.quantityOfPages = quantityOfPages;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " by " + this.author + " was published by " + publishingHouse + " in " + this.yearOfPublishing + " has " + this.quantityOfPages + " pages and costs " + this.price + "$";
    }
}
