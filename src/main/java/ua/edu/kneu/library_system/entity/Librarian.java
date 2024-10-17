package ua.edu.kneu.library_system.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * The Librarian entity represents a librarian in the library system.
 * It stores essential information about the librarian, including their ID, name, and contact email.
 */
@Setter
@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "librarian")
public final class Librarian {

    @Id
    @Column(name = "librarianId")
    private Long librarianId; // Unique identifier of the librarian

    @Column(name = "firstName", nullable = false)
    private String firstName; // First name of the librarian

    @Column(name = "lastName", nullable = false)
    private String lastName; // Last name of the librarian

    @Column(name = "email", unique = true)
    private String email; // Librarian's email address, used for contact
}
