package lk.ijse.dep11.relationships.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "batch")
public class Batch implements Serializable {
    @Id
    private int id;
    @Column(nullable = false, name = "commencing_date")
    private Date commencingDate;

    @ManyToOne
    @JoinColumn(name = "program_code", nullable = false, referencedColumnName = "code")
    private Program program;

    @ManyToMany
    @JoinTable(name = "batch_student",
            joinColumns = @JoinColumn(name = "batch_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"))
    private Set<Student> studentSet;
}
