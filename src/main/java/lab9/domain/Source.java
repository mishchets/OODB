package lab9.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Source {
    @Id
    private Long id;
    @Column
    private String name;
}
