package ua.edu.kneu.library_system.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;
import java.util.UUID;

@Setter
@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book")
public final class Book {

    @Id
    @Column(name = "bookId")
    private Long  bookId; // The unique identifier of the book

    @Column(name = "title", nullable = false)
    private String title; // Title of the book

    @Column(name = "author", nullable = false)
    private String author; // The author of the book

    @Column(name = "isbn", unique = true)
    private String isbn; // International Standard Book Number (ISBN)

    @OneToMany(mappedBy = "book", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<BookCopy> bookCopies; // Collection of book copies
}

