package com.turisticka.agencija.dto;

import com.turisticka.agencija.entity.RacunSaBrutoCenom;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class StavkaRacunaDTO implements MyDTO{
    private static final long serialVersionUID = 1L;
    @Max(5)
    private int rBr;
    @Max(30)
    @NotNull
    private String nazivStavke;
    @Max(5)
    private double netoCena;
    @Max(5)
    private double marza;
    @Max(5)
    private double brutoCena;
    private RacunSaBrutoCenom racunSaBrutoCenom;

    public StavkaRacunaDTO(int rBr, String nazivStavke, double netoCena, double marza, double brutoCena, RacunSaBrutoCenom racunSaBrutoCenom) {
        this.rBr = rBr;
        this.nazivStavke = nazivStavke;
        this.netoCena = netoCena;
        this.marza = marza;
        this.brutoCena = brutoCena;
        this.racunSaBrutoCenom = racunSaBrutoCenom;
    }

    public StavkaRacunaDTO() {
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
        return "StavkaRacunaDTO{" +
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
        StavkaRacunaDTO that = (StavkaRacunaDTO) o;
        return rBr == that.rBr && Double.compare(that.netoCena, netoCena) == 0 && Double.compare(that.marza, marza) == 0 && Double.compare(that.brutoCena, brutoCena) == 0 && Objects.equals(nazivStavke, that.nazivStavke) && Objects.equals(racunSaBrutoCenom, that.racunSaBrutoCenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rBr, nazivStavke, netoCena, marza, brutoCena, racunSaBrutoCenom);
    }
}
