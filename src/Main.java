public class Main {
    public static void main(String[] args) {
        //1
        Author Sapkowski = new Author("Анджей", "Сапковский");
        Book theWitcher = new Book("Ведьмак", 1986);
        System.out.println(theWitcher.getNames() + " " + Sapkowski.getName() + " " + Sapkowski.getLastName() + " " + theWitcher.getYear());
        //2
        Author Glukhovsky = new Author("Дмитрий", "Глуховский");
        Book metro_2033 = new Book("Метро 2033", 2005);
        System.out.println(metro_2033.getNames() + " " + Glukhovsky.getName() + " " + Glukhovsky.getLastName() + " " + metro_2033.getYear());
        metro_2033.setYear(2007);
        System.out.println(metro_2033.getNames() + " " + Glukhovsky.getName() + " " + Glukhovsky.getLastName() + " " + metro_2033.getYear());
    }
}