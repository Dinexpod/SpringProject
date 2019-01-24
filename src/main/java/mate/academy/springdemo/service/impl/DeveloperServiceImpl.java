package mate.academy.springdemo.service.impl;

import mate.academy.springdemo.model.Developer;
import mate.academy.springdemo.repository.DeveloperRepository;
import mate.academy.springdemo.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperServiceImpl implements DeveloperService {
    private final DeveloperRepository developerRepository;

    @Autowired
    public DeveloperServiceImpl(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    @Override
    public Developer create(Developer developer) {
        return developerRepository.save(developer);
    }

    @Override
    public Developer get(Long id) {
        return developerRepository.getOne(id);
    }

    @Override
    public List<Developer> getDevelopersWithSalary(Integer salary) {
        return developerRepository.findAllBySalaryGreaterThan(salary);
    }
}
