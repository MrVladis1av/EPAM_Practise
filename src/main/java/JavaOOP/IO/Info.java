package JavaOOP.IO;

import JavaOOP.Model.Book;

public interface Info {
    Book[] library = {
            new Book("Calumet K", "Ayn Rand", "Pearson", 1946, 400, 100),
            new Book("Victory", "Joseph Conrad", "RELX group", 1915, 300, 150),
            new Book("The Wind in the Willows", "Kenneth Grahame", "Pearson", 1908, 340, 125),
            new Book("The Kite Runner", "Khaled Hosseini", "Scholastic", 2003, 372, 200),
            new Book("Alice's Adventures in Wonderland", "Lewis Carroll", "Hachette Livre", 1865, 126, 300),
            new Book("Requiem for a Dream", "Hubert Selby Jr", "RELX Group", 1978, 288, 230),
            new Book("The Great Gatsby", "F Scott Fitzgerald", "Hachette Livre", 1925, 185, 200),
    };
}
