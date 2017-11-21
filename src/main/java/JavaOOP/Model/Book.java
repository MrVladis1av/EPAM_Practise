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
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", quantityOfPages=" + quantityOfPages +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 17 * result + ((author == null) ? 0 : author.hashCode());
        result = 17 * result + ((name == null) ? 0 : name.hashCode());
        long temp = Double.doubleToLongBits(price);
        result = 17 * result + (int) (temp ^ (temp >>> 32));
        result = 17 * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
        result = 17 * result + quantityOfPages;
        result = 17 * result + yearOfPublishing;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        if (!name.equals(((Book) obj).name)) return false;
        if (!author.equals(((Book) obj).author)) return false;
        if (!publishingHouse.equals(((Book) obj).publishingHouse)) return false;
        if (yearOfPublishing != ((Book) obj).yearOfPublishing) return false;
        if (quantityOfPages != ((Book) obj).quantityOfPages) return false;
        if (price != ((Book) obj).price) return false;
        return true;
    }
}
