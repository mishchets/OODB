package lab7.domain;

import lab7.annotation.Column;
import lab7.annotation.Entity;
import lab7.annotation.Id;

@Entity
public class Source {
    @Id
    private Long id;
    @Column
    private String name;
}
