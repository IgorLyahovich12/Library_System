package ua.edu.kneu.library_system.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * The BookCopy entity represents a specific copy of a book in the library.
 * It stores information about the book to which it belongs and its availability status.
 */
@Setter
@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bookCopy")
public final class BookCopy {

    @Id
    @Column(name = "copyId")
    private Long copyId; // Unique identifier of the copy of the book

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "bookId")
    private Book book; // Book to which this copy belongs

    @Column(name = "availabilityStatus")
    private String availabilityStatus; // Copy availability status (e.g., "Available", "Checked Out", "In Reading Room")
}
