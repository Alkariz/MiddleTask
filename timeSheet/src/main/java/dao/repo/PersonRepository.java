package dao.repo;

import dao.PersonDAO;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonDAO, Integer> {
}
