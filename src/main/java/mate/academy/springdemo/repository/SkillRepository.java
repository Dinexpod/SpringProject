package mate.academy.springdemo.repository;

import mate.academy.springdemo.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
