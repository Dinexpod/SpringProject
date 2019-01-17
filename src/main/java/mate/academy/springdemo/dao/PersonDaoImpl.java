package mate.academy.springdemo.dao;

import mate.academy.springdemo.model.Person;
import mate.academy.springdemo.model.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Repository
public class PersonDaoImpl implements PersonDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public Person getById(Integer id) {
        String sqlFindById = "select * from persons where id = ?";
        return jdbcTemplate.queryForObject(sqlFindById, new Object[] {id}, new PersonMapper());
    }
}
