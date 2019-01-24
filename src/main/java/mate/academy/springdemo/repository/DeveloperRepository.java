package mate.academy.springdemo.repository;

import mate.academy.springdemo.model.Developer;
import mate.academy.springdemo.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {
    List<Developer> findAllBySalaryGreaterThan(Integer salary);

    List<Developer> getAllDevelopersBySkillName(Skill skill);

    List<Developer> getAllDevelopersBySkillDegree(Skill skill);
}
