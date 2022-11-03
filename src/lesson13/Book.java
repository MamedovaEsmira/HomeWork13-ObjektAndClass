package lesson13;

import java.util.Objects;

public class Book {
 private String titleOfTheBook;//название книги
 private Author nameAuthor;    //автор
 private int yearOfPublication; //год публикации

 public Book(String titleOfTheBook, Author nameAuthor, int yearOfPublication) {
  this.titleOfTheBook = titleOfTheBook;
  this.nameAuthor = nameAuthor;
  this.yearOfPublication = yearOfPublication;
 }

public String titleOfTheBook(){return titleOfTheBook;}
 public Author getName(){return nameAuthor;}
 public int getYearOfPublication() {return yearOfPublication;}
 public int setyearOfPublication(int yearOfPublication ){  this.yearOfPublication = yearOfPublication;
 return yearOfPublication;}

 @Override
 public String toString() {return titleOfTheBook + " " + nameAuthor + " " + yearOfPublication;}

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;
  Book book = (Book) o;
  return yearOfPublication == book.yearOfPublication && titleOfTheBook.equals(book.titleOfTheBook) && nameAuthor.equals(book.nameAuthor);
 }

 @Override
 public int hashCode() {
  return Objects.hash(titleOfTheBook,nameAuthor,yearOfPublication);
 }
}

