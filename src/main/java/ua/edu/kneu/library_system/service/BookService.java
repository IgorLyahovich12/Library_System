package ua.edu.kneu.library_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.edu.kneu.library_system.entity.Book;
import ua.edu.kneu.library_system.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Отримати список всіх книг
    public Flux<Book> listAllBooks() {
        return bookRepository.findAll();
    }

    // Отримати книгу за назвою
    public Mono<Book> getBookByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    // Додати книгу
    public Mono<Book> addBook(Book book) {
        return bookRepository.save(book);
    }

    // Видалити книгу
    public Mono<Void> deleteBook(Long bookId) {
        return bookRepository.deleteById(bookId);
    }
}