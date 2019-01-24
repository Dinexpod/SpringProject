package mate.academy.springdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;
    private Name skillName;
    private Degree skillDegree;

    public enum Name {
        JAVA,
        RUBY,
        JS,
        PHYTON
    }

    public enum Degree {
        JUNIOR,
        MIDDLE,
        SENIOR
    }
}
