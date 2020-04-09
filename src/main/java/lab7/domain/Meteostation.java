package lab7.domain;

import lab7.annotation.Column;
import lab7.annotation.Entity;
import lab7.annotation.Id;
import lab7.annotation.ManyToOne;

@Entity
public class Meteostation {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private int coordination_x;
    @Column
    private int coordination_y;
    @Column
    @ManyToOne
    private Forecast forecast;

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

    public int getCoordination_x() {
        return coordination_x;
    }

    public void setCoordination_x(int coordination_x) {
        this.coordination_x = coordination_x;
    }

    public int getCoordination_y() {
        return coordination_y;
    }

    public void setCoordination_y(int coordination_y) {
        this.coordination_y = coordination_y;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }
}
