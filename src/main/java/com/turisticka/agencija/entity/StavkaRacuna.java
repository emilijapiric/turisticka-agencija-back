package com.turisticka.agencija.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name="stavka_racuna")
public class StavkaRacuna {
    @Id
    @Column(length = 5,name="r_br")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rBr;
    @Column(length = 30)
    @NotNull
    private String nazivStavke;
    @Column(length = 5)
    private double netoCena;
    @Column(length = 5)
    private double marza;
    @Column(length = 5)
    private double brutoCena;
    @ManyToOne
    @JoinColumn(name = "br_racuna")
    private RacunSaBrutoCenom racunSaBrutoCenom;

    public StavkaRacuna(int rBr, String nazivStavke, double netoCena, double marza, double brutoCena, RacunSaBrutoCenom racunSaBrutoCenom) {
        this.rBr = rBr;
        this.nazivStavke = nazivStavke;
        this.netoCena = netoCena;
        this.marza = marza;
        this.brutoCena = brutoCena;
        this.racunSaBrutoCenom = racunSaBrutoCenom;
    }

    public StavkaRacuna() {
    }

    public int getrBr() {
        return rBr;
    }

    public void setrBr(int rBr) {
        this.rBr = rBr;
    }

    public String getNazivStavke() {
        return nazivStavke;
    }

    public void setNazivStavke(String nazivStavke) {
        this.nazivStavke = nazivStavke;
    }

    public double getNetoCena() {
        return netoCena;
    }

    public void setNetoCena(double netoCena) {
        this.netoCena = netoCena;
    }

    public double getMarza() {
        return marza;
    }

    public void setMarza(double marza) {
        this.marza = marza;
    }

    public double getBrutoCena() {
        return brutoCena;
    }

    public void setBrutoCena(double brutoCena) {
        this.brutoCena = brutoCena;
    }

    public RacunSaBrutoCenom getRacunSaBrutoCenom() {
        return racunSaBrutoCenom;
    }

    public void setRacunSaBrutoCenom(RacunSaBrutoCenom racunSaBrutoCenom) {
        this.racunSaBrutoCenom = racunSaBrutoCenom;
    }

    @Override
    public String toString() {
        return "StavkaRacuna{" +
                "rBr=" + rBr +
                ", nazivStavke='" + nazivStavke + '\'' +
                ", netoCena=" + netoCena +
                ", marza=" + marza +
                ", brutoCena=" + brutoCena +
                ", racunSaBrutoCenom=" + racunSaBrutoCenom +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StavkaRacuna that = (StavkaRacuna) o;
        return rBr == that.rBr && Double.compare(that.netoCena, netoCena) == 0 && Double.compare(that.marza, marza) == 0 && Double.compare(that.brutoCena, brutoCena) == 0 && Objects.equals(nazivStavke, that.nazivStavke) && Objects.equals(racunSaBrutoCenom, that.racunSaBrutoCenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rBr, nazivStavke, netoCena, marza, brutoCena, racunSaBrutoCenom);
    }
}
