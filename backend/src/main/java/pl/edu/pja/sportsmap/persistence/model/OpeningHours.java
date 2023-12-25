package pl.edu.pja.sportsmap.persistence.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.time.DayOfWeek;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class OpeningHours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Time openingTime;

    @Column
    private Time closingTime;

    @Column
    @Enumerated
    private DayOfWeek dayOfWeek;

    @ManyToOne
    private SportComplex sportComplex;
}
