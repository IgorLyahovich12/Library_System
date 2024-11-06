package ua.edu.kneu.library_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.edu.kneu.library_system.entity.Book;
import ua.edu.kneu.library_system.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Отримати список всіх книг
    @GetMapping
    public Flux<Book> getAllBooks() {
        return bookService.listAllBooks();
    }

    // Отримати книгу за назвою
    @GetMapping("/title/{title}")
    public Mono<Book> getBookByTitle(@PathVariable String title) {
        return bookService.getBookByTitle(title);
    }

    // Додати книгу
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Book> addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    // Видалити книгу
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deleteBook(@PathVariable Long id) {
        return bookService.deleteBook(id);
    }
}

