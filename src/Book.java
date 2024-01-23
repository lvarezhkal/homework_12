import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;
    public Book (String name, int year){
        this.name = name;
        this.year = year;
    }

    public String  getNames () {
        return name;
    }

    public int  getYear() {
        return year;
    }

    public void setYear (int year) {
        this.year = year;
    }
    public String toString(){
        return name + " " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }
}
