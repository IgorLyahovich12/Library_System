package ua.edu.kneu.library_system.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.edu.kneu.library_system.entity.Reader;
import ua.edu.kneu.library_system.repository.ReaderRepository;

@Service
public class ReaderService {

    private final ReaderRepository readerRepository;

    @Autowired
    public ReaderService(ReaderRepository readerRepository) {
        this.readerRepository = readerRepository;
    }

    // Отримати список всіх читачів
    public Flux<Reader> listAllReaders() {
        return readerRepository.findAll();
    }
    // Додати нового читача
    public Mono<Reader> addReader(Reader reader) {
        return readerRepository.save(reader);
    }

    // Видалити читача за ID
    public Mono<Void> deleteReader(Long id) {
        return readerRepository.deleteById(id);
    }
}

