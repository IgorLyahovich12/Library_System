package ua.edu.kneu.library_system.repository;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.edu.kneu.library_system.entity.BookCopy;

public interface BookCopyRepository extends ReactiveCrudRepository<BookCopy, Long> {
}

