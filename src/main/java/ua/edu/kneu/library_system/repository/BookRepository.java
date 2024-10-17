package ua.edu.kneu.library_system.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.edu.kneu.library_system.entity.Book;

public interface BookRepository extends ReactiveCrudRepository<Book, Long> {
}

