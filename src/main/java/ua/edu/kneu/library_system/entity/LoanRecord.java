package ua.edu.kneu.library_system.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
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
@ToString
public final class LoanRecord {

    @Id
    private Long loan_id; // Unique ID of the loan record

    private Long reader_id; // Store the ID of the reader (instead of a Reader object)

    private Long copy_id; // Store the ID of the book copy (instead of a BookCopy object)

    private LocalDate loan_date; // The date when the book was borrowed

    private LocalDate return_date; // The date when the book is expected to be returned
}
