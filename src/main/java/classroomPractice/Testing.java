package classroomPractice;

public class Testing {

    public static void main(String[] args) {

        Book book = new Book("123123", "Storyteller", new Author("Dave Grohl", "d.grohl@gmail.com"), 33.15, 4);
        System.out.println(book.toString());

        System.out.println("The author is: " + book.getAuthor());



    }

}
