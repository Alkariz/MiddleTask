package dao;

import javax.persistence.*;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="projects")
public class ProjectDAO {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    int id;

    @Column(name = "project_name")
    private String projectName;

    @OneToMany(mappedBy="project")
    private Set<TaskDAO> tasks;

    public Set<TaskDAO> getTasks() {
        return tasks;
    }

    public void setTasks(Set<TaskDAO> tasks) {
        this.tasks = tasks;
    }

    public int getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
