package com.turisticka.agencija.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="racun")
public class RacunSaBrutoCenom {
    @Id
    @Column(length = 5)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int brRacuna;
    @Column(length = 30)
    @NotNull
    private String osnova;
    @ManyToOne
    @JoinColumn(name = "id_nacina_placanja")
    private NacinPlacanja nacinPlacanja;
    @Column(length = 30)
    @NotNull
    private String rokPlacanja;
    @ManyToOne
    @JoinColumn(name = "id_mesta_izdavanja")
    private MestoIzdavanja mestoIzdavanja;
    private LocalDate datumIzdavanja;
    @OneToMany(mappedBy = "stavka_racuna", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StavkaRacuna> stavkeRacuna;
    @Column(length = 5)
    private double ukupnaBrutoCena;
    @ManyToOne
    @JoinColumn(name = "sifra_radnika")
    private Radnik radnik;

    public RacunSaBrutoCenom(int brRacuna, String osnova, NacinPlacanja nacinPlacanja, String rokPlacanja, MestoIzdavanja mestoIzdavanja, LocalDate datumIzdavanja, List<StavkaRacuna> stavkeRacuna, double ukupnaBrutoCena, Radnik radnik) {
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

    public RacunSaBrutoCenom() {
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

    public NacinPlacanja getNacinPlacanja() {
        return nacinPlacanja;
    }

    public void setNacinPlacanja(NacinPlacanja nacinPlacanja) {
        this.nacinPlacanja = nacinPlacanja;
    }

    public String getRokPlacanja() {
        return rokPlacanja;
    }

    public void setRokPlacanja(String rokPlacanja) {
        this.rokPlacanja = rokPlacanja;
    }

    public MestoIzdavanja getMestoIzdavanja() {
        return mestoIzdavanja;
    }

    public void setMestoIzdavanja(MestoIzdavanja mestoIzdavanja) {
        this.mestoIzdavanja = mestoIzdavanja;
    }

    public LocalDate getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(LocalDate datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    public List<StavkaRacuna> getStavkeRacuna() {
        return stavkeRacuna;
    }

    public void setStavkeRacuna(List<StavkaRacuna> stavkeRacuna) {
        this.stavkeRacuna = stavkeRacuna;
    }

    public double getUkupnaBrutoCena() {
        return ukupnaBrutoCena;
    }

    public void setUkupnaBrutoCena(double ukupnaBrutoCena) {
        this.ukupnaBrutoCena = ukupnaBrutoCena;
    }

    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    @Override
    public String toString() {
        return "RacunSaBrutoCenom{" +
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
        RacunSaBrutoCenom that = (RacunSaBrutoCenom) o;
        return brRacuna == that.brRacuna && Double.compare(that.ukupnaBrutoCena, ukupnaBrutoCena) == 0 && Objects.equals(osnova, that.osnova) && Objects.equals(nacinPlacanja, that.nacinPlacanja) && Objects.equals(rokPlacanja, that.rokPlacanja) && Objects.equals(mestoIzdavanja, that.mestoIzdavanja) && Objects.equals(datumIzdavanja, that.datumIzdavanja) && Objects.equals(stavkeRacuna, that.stavkeRacuna) && Objects.equals(radnik, that.radnik);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brRacuna, osnova, nacinPlacanja, rokPlacanja, mestoIzdavanja, datumIzdavanja, stavkeRacuna, ukupnaBrutoCena, radnik);
    }
}
