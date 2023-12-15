package lk.ijse.dep11.relationships.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student implements Serializable {
    @Id
    private String id;
    @Column(nullable = false)
    private String name;
    private String address;

    @Setter(AccessLevel.NONE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "student")
    private Set<Contact> contactSet;

    public Student(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
