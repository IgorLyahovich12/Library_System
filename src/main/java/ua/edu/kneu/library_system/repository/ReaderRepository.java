package ua.edu.kneu.library_system.repository;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.edu.kneu.library_system.entity.Reader;

public interface ReaderRepository extends ReactiveCrudRepository<Reader, Long> {
}

