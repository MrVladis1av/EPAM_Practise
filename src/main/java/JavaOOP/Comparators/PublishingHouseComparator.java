package JavaOOP.Comparators;

import JavaOOP.Model.Book;

import java.util.Comparator;

public class PublishingHouseComparator implements Comparator<Book> {
    public int compare(Book o1, Book o2) {
        return o1.getPublishingHouse().compareTo(o2.getPublishingHouse());
    }
}
