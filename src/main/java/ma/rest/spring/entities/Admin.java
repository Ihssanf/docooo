package ma.rest.spring.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
@Entity
@Data
public class Admin extends User {
}
