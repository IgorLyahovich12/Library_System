package ua.edu.kneu.library_system.repository;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ua.edu.kneu.library_system.entity.BookCopy;
@Repository
public interface BookCopyRepository extends ReactiveCrudRepository<BookCopy, Long> {
}

