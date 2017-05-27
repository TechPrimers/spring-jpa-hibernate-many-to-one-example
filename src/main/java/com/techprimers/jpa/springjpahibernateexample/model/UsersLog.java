package com.techprimers.jpa.springjpahibernateexample.model;

import javax.persistence.*;

@Table(name = "users_log", catalog = "test")
@Entity
public class UsersLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "log_id")
    private Integer id;

    private String log;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public UsersLog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}
