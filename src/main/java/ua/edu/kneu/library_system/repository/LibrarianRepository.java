package ua.edu.kneu.library_system.repository;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.edu.kneu.library_system.entity.Librarian;

public interface LibrarianRepository extends ReactiveCrudRepository<Librarian, Long> {
}

