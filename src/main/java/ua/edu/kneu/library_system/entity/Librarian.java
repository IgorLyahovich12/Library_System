package ua.edu.kneu.library_system.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

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
    private String firstName; // Name of librarian

    @Column(name = "lastName", nullable = false)
    private String lastName; // Last name of the librarian

    @Column(name = "email", unique = true)
    private String email; // Librarian's email
}
