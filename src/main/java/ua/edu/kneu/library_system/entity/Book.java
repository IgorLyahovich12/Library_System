package ua.edu.kneu.library_system.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import lombok.*;

/**
 * The Book entity represents a book in the library.
 * It stores information about the book's title, author, ISBN, and the collection of its copies.
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table("book") // Specify the name of the table in the database
public final class Book {

    @Id
    private Long bookId; // The unique identifier of the book

    private String title; // Title of the book

    private String author; // The author of the book

    private String isbn; // International Standard Book Number (ISBN)
}
