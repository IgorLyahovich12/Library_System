package ua.edu.kneu.library_system.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.edu.kneu.library_system.entity.Reader;
import ua.edu.kneu.library_system.service.ReaderService;

@RestController
@RequestMapping("/readers")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class ReaderController {

    private final ReaderService readerService;

    @GetMapping("/list")
    public Flux<Reader> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count) {
        return readerService.list(start, count);
    }


    @PostMapping("/new")
    public Mono<Reader> create(@RequestBody Reader reader) {
        return readerService.addOne(reader);
    }

    @GetMapping("/one")
    public Mono<Reader> getById(@PathVariable Long id) {
        return readerService.getById(id);
    }

    // Оновити дані читача
    @PutMapping("/{id}")
    public Mono<Reader> update(@PathVariable Long id, @RequestBody Reader reader) {
        return readerService.updateReader(id, reader);
    }

    // Видалити читача за його ID
    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return readerService.deleteById(id);
    }
}
