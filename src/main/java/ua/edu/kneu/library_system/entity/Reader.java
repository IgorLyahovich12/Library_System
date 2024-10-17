package ua.edu.kneu.library_system.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import lombok.*;

import java.util.Set;

/**
 * The Reader entity represents a library reader.
 * Stores information about name, surname, email and records of book loans.
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reader") // R2DBC annotation
public final class Reader {
    @Id
    private Long readerId; // Unique identifier of the reader

    private String firstName; // Name of the reader
    private String lastName; // Last name of the reader
    private String email; // Email for communication with the reader
    private Set<LoanRecord> loanRecords; // Loan records made by this reader
}

