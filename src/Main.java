import lesson13.Author;
import lesson13.Book;

public class Main {
    public static void main(String[] args) {
        Author author1=new Author("Aleksandr", " Pushkin");
        Book book1 = new Book("Ruslan and Lyudmila" , author1,1818 );
        Author author2= new Author("lev", " Tolstoy");
        Book book2= new Book("Anna Karenina ",  author2,1873);
        System.out.println("Автор: " +author1.getName());
        System.out.println("Название книги: "+book1.titleOfTheBook());
        System.out.println("Год выпуска книги: "+book1.getYearOfPublication());
        book1.setyearOfPublication(1823);
        System.out.println("Год перевыпуска книги: "+book1.getYearOfPublication());
        System.out.println("Автор: " +author2.getName());
        System.out.println("Название книги: "+book2.titleOfTheBook());
        System.out.println("Год выпуска книги: "+book2.getYearOfPublication());
        book2.setyearOfPublication(1880);
        System.out.println("Год перевыпуска книги: "+book2.getYearOfPublication());

    }
}