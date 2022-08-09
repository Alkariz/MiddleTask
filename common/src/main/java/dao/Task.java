package dao;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    int id;

    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name = "project_id")
    private Project project;

    @Column(name = "task_name")
    private String taskName;

    public Task(){
        //
    }

    public Task(Project aProject) {
        this.project=aProject;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
