package ma.rest.spring.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // Using TABLE_PER_CLASS inheritance strategy
@Table(name = "app_user") // Table renamed to avoid conflict with reserved keywords
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // AUTO recommended for TABLE_PER_CLASS
    private long id;

    private String nom;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) // Correct field name 'user' in Document
    private List<Document> documents;
}
