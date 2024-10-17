package ua.edu.kneu.library_system.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;
import lombok.*;

/**
 * The Librarian entity represents a librarian in the library system.
 * It stores essential information about the librarian, including their ID, name, and contact email.
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "librarian")
public final class Librarian {

    @Id
    @Column("librarian_id")
    private Long librarianId; // Unique identifier of the librarian

    @Column("first_name")
    private String firstName; // First name of the librarian

    @Column("last_name")
    private String lastName; // Last name of the librarian

    @Column("email")
    private String email; // Librarian's email address, used for contact
}
