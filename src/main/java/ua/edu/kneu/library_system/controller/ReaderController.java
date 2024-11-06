package ua.edu.kneu.library_system.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.edu.kneu.library_system.entity.Reader;
import ua.edu.kneu.library_system.service.ReaderService;

@RestController
@RequestMapping("/readers")
public class ReaderController {

    private final ReaderService readerService;

    @Autowired
    public ReaderController(ReaderService readerService) {
        this.readerService = readerService;
    }

    // Отримати список всіх читачів
    @GetMapping
    public Flux<Reader> getAllReaders() {
        return readerService.listAllReaders();
    }


    // Додати нового читача
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Reader> addReader(@RequestBody Reader reader) {
        return readerService.addReader(reader);
    }

    // Видалити читача
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deleteReader(@PathVariable Long id) {
        return readerService.deleteReader(id);
    }
}

