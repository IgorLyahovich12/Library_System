package ua.edu.kneu.library_system.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@Table("messages")
public class Message {

    @Id
    private Long id;
    private String data;

    public Message(String data) {
        this.data = data;
    }
}
