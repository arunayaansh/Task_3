package Task3;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Is Available (true/false): ");
                    boolean isAvailable = scanner.nextBoolean();

                    Book book = new Book(bookID, title, author, isAvailable);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeID = scanner.nextInt();
                    library.removeBook(removeID);
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchID = scanner.nextInt();
                    Book foundBook = library.searchBook(searchID);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
        scanner.close();
    }
}




/* output:
Library Management System
1. Add Book
2. Remove Book
3. Search Book
4. Display Books
5. Exit
Enter your choice: 1
Enter Book ID: 12
Enter Title: Little red hood
Enter Author: harry
Is Available (true/false): true
Book added successfully.

Library Management System
1. Add Book
2. Remove Book
3. Search Book
4. Display Books
5. Exit
Enter your choice: 4
BookID: 12, Title: Little red hood, Author: harry, Available: true

Library Management System
1. Add Book
2. Remove Book
3. Search Book
4. Display Books
5. Exit
Enter your choice: 3
Enter Book ID to search: 12
Book found: BookID: 12, Title: Little red hood, Author: harry, Available: true

Library Management System
1. Add Book
2. Remove Book
3. Search Book
4. Display Books
5. Exit
Enter your choice: 2
Enter Book ID to remove: 12
Book removed successfully.

Library Management System
1. Add Book
2. Remove Book
3. Search Book
4. Display Books
5. Exit
Enter your choice: 5
Exiting the system. Goodbye!

Process finished with exit code 0 */
