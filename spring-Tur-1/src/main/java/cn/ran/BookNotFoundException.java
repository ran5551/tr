package cn.ran;

public class BookNotFoundException extends RuntimeException {
        public BookNotFoundException() {
            super("Book not found");
        }

        public BookNotFoundException(String message) {
            super(message);
        }

        public BookNotFoundException(String message, Throwable cause) {
            super(message, cause);
        }

        public BookNotFoundException(Throwable cause) {
            super(cause);
        }
    }



