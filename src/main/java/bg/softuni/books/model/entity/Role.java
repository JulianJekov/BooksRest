package bg.softuni.books.model.entity;

import bg.softuni.books.model.enums.UserRole;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole name;

    public Role() {
    }

    public UserRole getName() {
        return name;
    }

    public Role setName(UserRole name) {
        this.name = name;
        return this;
    }
}
