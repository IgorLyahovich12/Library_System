package ua.edu.kneu.library_system.service;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.edu.kneu.library_system.entity.Reader;
import ua.edu.kneu.library_system.repository.ReaderRepository;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class ReaderService {

    private final ReaderRepository readerRepository;

    // Отримати список читачів з опціональним пагінгом
    public Flux<Reader> list(Long start, Long count) {
        return readerRepository.findAll()
                .skip(start)
                .take(count);
    }

    // Додати нового читача
    public Mono<Reader> addOne(Reader reader) {
        return readerRepository.save(reader);
    }

    // Отримати читача за його ID
    public Mono<Reader> getById(Long id) {
        return readerRepository.findById(id);
    }

    // Оновити дані читача
    public Mono<Reader> updateReader(Long id, Reader readerDetails) {
        return readerRepository.findById(id)
                .flatMap(existingReader -> {
                    existingReader.setFirstName(readerDetails.getFirstName());
                    existingReader.setLastName(readerDetails.getLastName());
                    existingReader.setEmail(readerDetails.getEmail());
                    return readerRepository.save(existingReader);
                });
    }

    // Видалити читача за його ID
    public Mono<Void> deleteById(Long id) {
        return readerRepository.deleteById(id);
    }
}

