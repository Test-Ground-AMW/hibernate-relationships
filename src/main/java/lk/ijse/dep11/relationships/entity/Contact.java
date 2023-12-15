package lk.ijse.dep11.relationships.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contact")
public class Contact implements Serializable {
    @Id
    private String phone;
    @ManyToOne
    @JoinColumn(nullable = false, name = "student_id", referencedColumnName = "id")
    private Student student;


}
