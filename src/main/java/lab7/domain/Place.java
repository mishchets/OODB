package lab7.domain;

import lab7.annotation.Column;
import lab7.annotation.Entity;
import lab7.annotation.Id;

@Entity
public class Place {
    @Id
    private Long id;
    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
