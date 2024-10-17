package ua.edu.kneu.library_system.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;
import lombok.*;

import java.time.LocalDate;

/**
 * The LoanRecord entity represents a record of a book loan transaction.
 * It stores information about the reader, the book copy borrowed, and the dates of the loan and return.
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "loan_record")
public final class LoanRecord {

    @Id
    @Column("loan_id")
    private Long loanId; // Unique ID of the loan record

    // You can use reactive repositories to manage relationships when needed.
    @Column("reader_id")
    private Long readerId; // Store the ID of the reader (instead of a Reader object)

    @Column("copy_id")
    private Long copyId; // Store the ID of the book copy (instead of a BookCopy object)

    @Column("loan_date")
    private LocalDate loanDate; // The date when the book was borrowed

    @Column("return_date")
    private LocalDate returnDate; // The date when the book is expected to be returned
}
