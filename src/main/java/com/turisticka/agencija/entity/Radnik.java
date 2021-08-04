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
@Table(name="radnik")
public class Radnik {
    @Id
    @Column(length = 5)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sifraRadnika;
    @Column(length = 30)
    @NotNull
    private String imePrezimeR;

    public Radnik(int sifraRadnika, String imePrezimeR) {
        sifraRadnika = sifraRadnika;
        this.imePrezimeR = imePrezimeR;
    }

    public Radnik() {
    }

    public int getSifraRadnika() {
        return sifraRadnika;
    }

    public void setSifraRadnika(int sifraRadnika) {
        sifraRadnika = sifraRadnika;
    }

    public String getImePrezimeR() {
        return imePrezimeR;
    }

    public void setImePrezimeR(String imePrezimeR) {
        this.imePrezimeR = imePrezimeR;
    }

    @Override
    public String toString() {
        return "Radnik{" +
                "sifraRadnika=" + sifraRadnika +
                ", imePrezimeR='" + imePrezimeR + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Radnik radnik = (Radnik) o;
        return sifraRadnika == radnik.sifraRadnika && Objects.equals(imePrezimeR, radnik.imePrezimeR);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sifraRadnika, imePrezimeR);
    }
}
