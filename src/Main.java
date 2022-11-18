import lesson13.Author;
import lesson13.Book;
import lesson13.Library;

public class Main {
    public static void main(String[] args) {
        Author author1=new Author("Aleksandr", " Pushkin");
        Book book1 = new Book("Ruslan and Lyudmila" , author1,1818 );
        Author author2 = new Author("Фёдор", "Достоевский");
        Book  book2= new Book("Преступление и наказание", author2, 1865);
        book2.setYear(1866);
        Author author3 = new Author("Александр", "Пушкин");
        Book  book3= new Book("Евгений  Онегин", author3, 1865);
        Author author4= new Author("lev", " Tolstoy");
        Book book4= new Book("Anna Karenina ",  author4,1873);
        Author author5 = new Author("Лев", " Толстой");
        Book book5 = new Book("Война и мир", author4, 1865);
        Author author6 = new Author("Михаил", "Лермонтов");
        Book book6 = new Book("Герой нашего времени", author5, 1839);
        Author author7 = new Author("Александр", "Грибоедов");
        Book book7 = new Book("Горе от ума", author6, 1825);
        Author author8 = new Author("Николай", "Гоголь");
        Book book8 = new Book("Мертвые души", author7, 1842);



        System.out.println("Автор: " +author1.getFirstName());
        System.out.println("Название книги: "+book1.getName());
        System.out.println("Год выпуска книги: "+book1.getYear());
        book1.setYear(1823);
        System.out.println("Год перевыпуска книги: "+book1.getYear());
        System.out.println("Автор: " +author2.getFirstName());
        System.out.println("Название книги: "+book2.getName());
        System.out.println("Год выпуска книги: "+book2.getYear());
        book2.setYear(1880);
        System.out.println("Год перевыпуска книги: "+book2.getYear());

        System.out.println("======");
        Library library = new Library(10);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        library.printBookInformationByName("ВОЙна и МиР");
        library.setYear("Герой нашего времени", 1840);
        library.printBooks();

    }
    }