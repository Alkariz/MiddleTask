package dao.repo;

import dao.ProjectDAO;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<ProjectDAO, Integer> {
}
