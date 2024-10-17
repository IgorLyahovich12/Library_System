package ua.edu.kneu.library_system.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;
import lombok.*;

/**
 * The BookCopy entity represents a specific copy of a book in the library.
 * It stores information about the book to which it belongs and its availability status.
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book_copy")
public final class BookCopy {

    @Id
    @Column("copy_id")
    private Long copyId; // Unique identifier of the copy of the book

    @Column("book_id")
    private Long bookId; // The ID of the book to which this copy belongs

    @Column("availability_status")
    private String availabilityStatus; // Copy availability status (e.g., "Available", "Checked Out", "In Reading Room")
}
