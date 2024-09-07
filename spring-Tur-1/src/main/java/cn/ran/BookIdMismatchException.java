package cn.ran;

public class BookIdMismatchException extends RuntimeException {

    public BookIdMismatchException() {
        super("Book ID in the request body does not match the ID in the URL");
    }

    public BookIdMismatchException(String message) {
        super(message);
    }

    public BookIdMismatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookIdMismatchException(Throwable cause) {
        super(cause);
    }
}
