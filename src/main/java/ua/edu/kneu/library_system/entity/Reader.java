package ua.edu.kneu.library_system.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

/**
 * The Reader entity represents a library reader.
 * Stores information about name, surname, email and records of book loans.
 */
@Setter
@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reader")
public final class Reader {
    @Id
    @Column(name = "readerId")
    private Long readerId; // Unique identifier of the reader

    @Column(name = "firstName", nullable = false)
    private String firstName; // Name of the reader

    @Column(name = "lastName", nullable = false)
    private String lastName; // Last name of the reader

    @Column(name = "email", unique = true)
    private String email; // Email for communication with the reader

    @OneToMany(mappedBy = "reader", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<LoanRecord> loanRecords; // Loan records made by this reader
}
