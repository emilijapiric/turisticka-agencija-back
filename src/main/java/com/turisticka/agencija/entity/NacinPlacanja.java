package com.turisticka.agencija.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name="nacin_placanja")
public class NacinPlacanja {
    @Id
    @Column(length = 5)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNacinaPlacanja;
    @Column(length = 50)
    @NotNull
    private String opisNacinaPlacanja;

    public NacinPlacanja(int idNacinaPlacanja, String opisNacinaPlacanja) {
        this.idNacinaPlacanja = idNacinaPlacanja;
        this.opisNacinaPlacanja = opisNacinaPlacanja;
    }

    public NacinPlacanja() {
    }

    public int getIdNacinaPlacanja() {
        return idNacinaPlacanja;
    }

    public void setIdNacinaPlacanja(int idNacinaPlacanja) {
        this.idNacinaPlacanja = idNacinaPlacanja;
    }

    public String getOpisNacinaPlacanja() {
        return opisNacinaPlacanja;
    }

    public void setOpisNacinaPlacanja(String opisNacinaPlacanja) {
        this.opisNacinaPlacanja = opisNacinaPlacanja;
    }

    @Override
    public String toString() {
        return "NacinPlacanja{" +
                "idNacinaPlacanja=" + idNacinaPlacanja +
                ", opisNacinaPlacanja='" + opisNacinaPlacanja + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NacinPlacanja that = (NacinPlacanja) o;
        return idNacinaPlacanja == that.idNacinaPlacanja && Objects.equals(opisNacinaPlacanja, that.opisNacinaPlacanja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNacinaPlacanja, opisNacinaPlacanja);
    }
}
