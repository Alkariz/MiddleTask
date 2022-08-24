package dao;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="tasks")
public class TaskDAO {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    int id;

    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name = "project_id")
    private ProjectDAO project;

    @Column(name = "task_name")
    private String taskName;

    public TaskDAO(){
        // Нужен для БД
    }

    public TaskDAO(ProjectDAO project) {
        this.project=project;
    }

    public ProjectDAO getProject() {
        return project;
    }

    public void setProject(ProjectDAO project) {
        this.project = project;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
