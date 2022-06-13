package classroomPractice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class Book {

   public String isbn;
    public String name;
    Author author;
    @Setter
    public double price;
    @Setter
    public int qty = 0;


    public String getAuthor() {
        return author.getName();
    }

    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

}
