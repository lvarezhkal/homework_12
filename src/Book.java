public class Book {
    private String name;
    private Author author;
    private int year;
    public Book (String name, int year){
        this.name = name;
        this.year = year;
    }

    public String  getNames () {
        return this.name;
    }

    public int  getYear() {
        return this.year;
    }

    public void setYear (int year) {
        this.year = year;
    }
}
