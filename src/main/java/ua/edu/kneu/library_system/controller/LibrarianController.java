package ua.edu.kneu.library_system.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.edu.kneu.library_system.entity.Librarian;
import ua.edu.kneu.library_system.service.LibrarianService;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/librarians")
public class LibrarianController {

    private final LibrarianService librarianService;

    @Autowired
    public LibrarianController(LibrarianService librarianService) {
        this.librarianService = librarianService;
    }

    // Endpoint to get a list of all librarians
    @GetMapping
    public Flux<Librarian> getAllLibrarians() {
        return librarianService.getAllLibrarians();
    }

    // Endpoint to add a new librarian
    @PostMapping
    public Mono<Librarian> addLibrarian(@RequestBody Librarian librarian) {
        return librarianService.addLibrarian(librarian);
    }

    // Endpoint to delete a librarian by ID
    @DeleteMapping("/{id}")
    public Mono<Void> deleteLibrarian(@PathVariable Long id) {
        return librarianService.deleteLibrarian(id);
    }
}
