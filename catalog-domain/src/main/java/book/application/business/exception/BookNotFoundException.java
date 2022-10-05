package book.application.business.exception;

@SuppressWarnings("serial")
public class BookNotFoundException extends RuntimeException {

    private final String isbn;

    public BookNotFoundException(String message, String isbn) {
        super(message);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
}
