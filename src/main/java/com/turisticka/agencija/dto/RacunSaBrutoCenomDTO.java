package com.turisticka.agencija.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class RacunSaBrutoCenomDTO implements MyDTO{
    private static final long serialVersionUID = 1L;
    @Max(5)
    private int brRacuna;
    @Max(30)
    @NotNull
    private String osnova;
    private NacinPlacanjaDTO nacinPlacanja;
    @Max(30)
    @NotNull
    private String rokPlacanja;
    private MestoIzdavanjaDTO mestoIzdavanja;
    private LocalDate datumIzdavanja;
    private List<StavkaRacunaDTO> stavkeRacuna;
    @Max(5)
    private double ukupnaBrutoCena;
    private RadnikDTO radnik;

    public RacunSaBrutoCenomDTO(int brRacuna, String osnova, NacinPlacanjaDTO nacinPlacanja, String rokPlacanja, MestoIzdavanjaDTO mestoIzdavanja, LocalDate datumIzdavanja, List<StavkaRacunaDTO> stavkeRacuna, double ukupnaBrutoCena, RadnikDTO radnik) {
        this.brRacuna = brRacuna;
        this.osnova = osnova;
        this.nacinPlacanja = nacinPlacanja;
        this.rokPlacanja = rokPlacanja;
        this.mestoIzdavanja = mestoIzdavanja;
        this.datumIzdavanja = datumIzdavanja;
        this.stavkeRacuna = stavkeRacuna;
        this.ukupnaBrutoCena = ukupnaBrutoCena;
        this.radnik = radnik;
    }

    public RacunSaBrutoCenomDTO() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getBrRacuna() {
        return brRacuna;
    }

    public void setBrRacuna(int brRacuna) {
        this.brRacuna = brRacuna;
    }

    public String getOsnova() {
        return osnova;
    }

    public void setOsnova(String osnova) {
        this.osnova = osnova;
    }

    public NacinPlacanjaDTO getNacinPlacanja() {
        return nacinPlacanja;
    }

    public void setNacinPlacanja(NacinPlacanjaDTO nacinPlacanja) {
        this.nacinPlacanja = nacinPlacanja;
    }

    public String getRokPlacanja() {
        return rokPlacanja;
    }

    public void setRokPlacanja(String rokPlacanja) {
        this.rokPlacanja = rokPlacanja;
    }

    public MestoIzdavanjaDTO getMestoIzdavanja() {
        return mestoIzdavanja;
    }

    public void setMestoIzdavanja(MestoIzdavanjaDTO mestoIzdavanja) {
        this.mestoIzdavanja = mestoIzdavanja;
    }

    public LocalDate getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(LocalDate datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    public List<StavkaRacunaDTO> getStavkeRacuna() {
        return stavkeRacuna;
    }

    public void setStavkeRacuna(List<StavkaRacunaDTO> stavkeRacuna) {
        this.stavkeRacuna = stavkeRacuna;
    }

    public double getUkupnaBrutoCena() {
        return ukupnaBrutoCena;
    }

    public void setUkupnaBrutoCena(double ukupnaBrutoCena) {
        this.ukupnaBrutoCena = ukupnaBrutoCena;
    }

    public RadnikDTO getRadnik() {
        return radnik;
    }

    public void setRadnik(RadnikDTO radnik) {
        this.radnik = radnik;
    }

    @Override
    public String toString() {
        return "RacunSaBrutoCenomDTO{" +
                "brRacuna=" + brRacuna +
                ", osnova='" + osnova + '\'' +
                ", nacinPlacanja=" + nacinPlacanja +
                ", rokPlacanja='" + rokPlacanja + '\'' +
                ", mestoIzdavanja=" + mestoIzdavanja +
                ", datumIzdavanja=" + datumIzdavanja +
                ", stavkeRacuna=" + stavkeRacuna +
                ", ukupnaBrutoCena=" + ukupnaBrutoCena +
                ", radnik=" + radnik +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacunSaBrutoCenomDTO that = (RacunSaBrutoCenomDTO) o;
        return brRacuna == that.brRacuna && Double.compare(that.ukupnaBrutoCena, ukupnaBrutoCena) == 0 && Objects.equals(osnova, that.osnova) && Objects.equals(nacinPlacanja, that.nacinPlacanja) && Objects.equals(rokPlacanja, that.rokPlacanja) && Objects.equals(mestoIzdavanja, that.mestoIzdavanja) && Objects.equals(datumIzdavanja, that.datumIzdavanja) && Objects.equals(stavkeRacuna, that.stavkeRacuna) && Objects.equals(radnik, that.radnik);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brRacuna, osnova, nacinPlacanja, rokPlacanja, mestoIzdavanja, datumIzdavanja, stavkeRacuna, ukupnaBrutoCena, radnik);
    }
}
