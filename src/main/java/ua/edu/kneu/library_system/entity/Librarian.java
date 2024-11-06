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
public final class Librarian {

    @Id
    private Long librarian_id; // Unique identifier of the librarian

    private String first_name; // First name of the librarian

    private String last_name; // Last name of the librarian

    private String email; // Librarian's email address, used for contact
}
