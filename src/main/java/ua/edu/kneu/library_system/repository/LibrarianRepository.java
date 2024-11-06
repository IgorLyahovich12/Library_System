package ua.edu.kneu.library_system.repository;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ua.edu.kneu.library_system.entity.Librarian;
@Repository
public interface LibrarianRepository extends ReactiveCrudRepository<Librarian, Long> {

}

