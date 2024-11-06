package ua.edu.kneu.library_system.repository;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import ua.edu.kneu.library_system.entity.LoanRecord;

import java.time.LocalDate;

@Repository
public interface LoanRecordRepository extends ReactiveCrudRepository<LoanRecord, Long> {
}

