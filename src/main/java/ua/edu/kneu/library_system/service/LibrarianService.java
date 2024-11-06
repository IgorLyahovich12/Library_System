package ua.edu.kneu.library_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.edu.kneu.library_system.entity.Librarian;
import ua.edu.kneu.library_system.repository.LibrarianRepository;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Service
public class LibrarianService {

    private final LibrarianRepository librarianRepository;

    @Autowired
    public LibrarianService(LibrarianRepository librarianRepository) {
        this.librarianRepository = librarianRepository;
    }

    // List all librarians
    public Flux<Librarian> getAllLibrarians() {
        return librarianRepository.findAll();
    }

    // Add a new librarian
    public Mono<Librarian> addLibrarian(Librarian librarian) {
        return librarianRepository.save(librarian);
    }

    // Delete a librarian by ID
    public Mono<Void> deleteLibrarian(Long librarianId) {
        return librarianRepository.deleteById(librarianId);
    }
}

