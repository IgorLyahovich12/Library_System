package ua.edu.kneu.library_system.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
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
@ToString
@Table("librarian") // Specify the name of the table in the database
public final class Librarian {

    @Id
    private Long librarianId; // Unique identifier of the librarian

    private String firstName; // First name of the librarian

    private String lastName; // Last name of the librarian

    private String email; // Librarian's email address, used for contact
}
