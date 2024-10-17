package ua.edu.kneu.library_system.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

/**
 * The LoanRecord entity represents a record of a book loan transaction.
 * It stores information about the reader, the book copy borrowed, and the dates of the loan and return.
 */
@Setter
@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "loanRecord")
public final class LoanRecord {

    @Id
    @Column(name = "loanId")
    private Long loanId; // Unique ID of the loan record

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "readerId")
    private Reader reader; // The reader who borrows a book

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "copyId")
    private BookCopy bookCopy; // The copy of the book that is borrowed

    @Column(name = "loanDate")
    private LocalDate loanDate; // The date when the book was borrowed

    @Column(name = "returnDate")
    private LocalDate returnDate; // The date when the book is expected to be returned
}
