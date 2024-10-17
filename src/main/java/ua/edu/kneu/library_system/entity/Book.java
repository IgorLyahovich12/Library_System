package ua.edu.kneu.library_system.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;
import lombok.*;
import java.util.Set;

/**
 * The Book entity represents a book in the library.
 * It stores information about the book's title, author, ISBN, and the collection of its copies.
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book")
public final class Book {

    @Id
    @Column("book_id")
    private Long bookId; // The unique identifier of the book

    @Column("title")
    private String title; // Title of the book

    @Column("author")
    private String author; // The author of the book

    @Column("isbn")
    private String isbn; // International Standard Book Number (ISBN)

}
