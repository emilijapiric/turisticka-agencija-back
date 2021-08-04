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
@Table(name="mesto_izdavanja")
public class MestoIzdavanja {
    @Id
    @Column(length = 5, name="id_mesta_izdavanja")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMestaIzdavanja;
    @Column(length = 30)
    @NotNull
    private String nazivMestaIzdavanja;

    public MestoIzdavanja(int idMestaIzdavanja, String nazivMestaIzdavanja) {
        this.idMestaIzdavanja = idMestaIzdavanja;
        this.nazivMestaIzdavanja = nazivMestaIzdavanja;
    }

    public MestoIzdavanja() {
    }

    public int getIdMestaIzdavanja() {
        return idMestaIzdavanja;
    }

    public void setIdMestaIzdavanja(int idMestaIzdavanja) {
        this.idMestaIzdavanja = idMestaIzdavanja;
    }

    public String getNazivMestaIzdavanja() {
        return nazivMestaIzdavanja;
    }

    public void setNazivMestaIzdavanja(String nazivMestaIzdavanja) {
        this.nazivMestaIzdavanja = nazivMestaIzdavanja;
    }

    @Override
    public String toString() {
        return "MestoIzdavanja{" +
                "idMestaIzdavanja=" + idMestaIzdavanja +
                ", nazivMestaIzdavanja='" + nazivMestaIzdavanja + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MestoIzdavanja that = (MestoIzdavanja) o;
        return idMestaIzdavanja == that.idMestaIzdavanja && Objects.equals(nazivMestaIzdavanja, that.nazivMestaIzdavanja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMestaIzdavanja, nazivMestaIzdavanja);
    }
}
