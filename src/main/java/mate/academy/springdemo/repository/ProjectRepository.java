package mate.academy.springdemo.repository;

import mate.academy.springdemo.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    Double getAllSalaryFromProject(Project project);

    void getAllDevelopersFromProject(Project project);

    int showSomeDevs();
}
