package Task;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Граф Монте Кристо", "Александр Дюма", 1846));
        library.addBook(new Book("Великий Гэтсби", "Скотт Фицджеральд", 1925));
        library.addBook(new Book("Парфюмер", "Патрика Зюскинда", 1985));

        System.out.println("Сортировка книг по названию:");
        library.sortBooks(null);
        printBooks(library);

        System.out.println("\nСортировка книг по автору:");
        library.sortBooks(new AuthorComparator());
        printBooks(library);

        System.out.println("\nСортировка книг по году издания:");
        library.sortBooks(new YearComparator());
        printBooks(library);
    }

    private static void printBooks(Library library) {
        for (Book book : library) {
            System.out.println(book);
        }
    }
}