public class Main {
    public static void main(String[] args) {

        Book dostoevsky = new Book(new Author("Фёдор", "Достоевский"), "Весна", 1955);
        Book frankl = new Book(new Author("Виктор", "Франкл"), "Ювента", 1996);

        dostoevsky.setYear(1956);
        frankl.setYear(1997);

        System.out.println(dostoevsky.getAuthor().getName() + " " + dostoevsky.getAuthor().getSoname() + ". Издание: " + dostoevsky.getPublisher() +". "+dostoevsky.getYearPublishing() + "г.");
        System.out.println(frankl.getAuthor().getName() + " " + frankl.getAuthor().getSoname() + ". Издание: " + frankl.getPublisher() +". "+frankl.getYearPublishing() + "г.");    }
}