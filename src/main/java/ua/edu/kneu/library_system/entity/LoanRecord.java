package ua.edu.kneu.library_system.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.UUID;

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
    private Reader reader; // A reader who borrows a book


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "copyId")
    private BookCopy bookCopy; // A copy of the book that is borrowed

    @Column(name = "loanDate")
    private LocalDate loanDate; // Book loan date

    @Column(name = "returnDate")
    private LocalDate returnDate; // Book return date
}
