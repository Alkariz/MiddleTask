package dao;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="Persons")
public class Person {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    int id;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "JobTitle")
    private String jobTitle;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
