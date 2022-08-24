package dao.repo;

import dao.TaskDAO;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<TaskDAO, Integer> {
}
