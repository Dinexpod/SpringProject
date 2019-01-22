package mate.academy.springdemo.service;

import mate.academy.springdemo.model.Developer;

import java.util.List;

public interface DeveloperService {
    Developer create(Developer developer);

    Developer get(Long id);

    List<Developer> getDevelopersWithSalary(Integer salary);
}
