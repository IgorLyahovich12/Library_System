package ua.edu.kneu.library_system.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.edu.kneu.library_system.entity.Message;


public interface MessageRepository extends ReactiveCrudRepository<Message, Long> {
}
