public class Main {
    public static void main(String[] args) {
        //1
        Author sapkowski = new Author("Анджей", "Сапковский");
        Book theWitcher = new Book("Ведьмак", 1986);
        System.out.println(sapkowski + " " + theWitcher);
        //2
        Author glukhovsky = new Author("Дмитрий", "Глуховский");
        Book metro2033 = new Book("Метро 2033", 2005);
        System.out.println(glukhovsky + " " + metro2033);
        metro2033.setYear(2007);
        System.out.println(glukhovsky + " " + metro2033);

    }
}