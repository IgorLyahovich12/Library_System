package ua.edu.kneu.library_system.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import ua.edu.kneu.library_system.entity.Book;
@Repository
public interface BookRepository extends ReactiveCrudRepository<Book, Long> {
    Mono<Book> findByTitle(String title);
}

