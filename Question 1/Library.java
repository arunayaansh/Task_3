package Task3;

public class Library {
    private Book[] books;
    private int count;

    public Library() {
        this.books = new Book[5]; // Fixed size for simplicity
        this.count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                books[i] = books[count - 1];
                books[count - 1] = null;
                count--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public Book searchBook(int bookID) {
        for (Book book : books) {
            if (book != null && book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
}
