package com.turisticka.agencija.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "obavestenje_o_svim_izvrsenim_uplatama")
public class ObavestenjeOSvimIzvrsenimUplatama {
    @Id
    @Column(length = 5,name="id_obavestenja")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idObavestenja;
    @Column(length = 100)
    @NotNull
    private String svrhaObavestenja;
    private LocalDate datum;
    @ManyToOne
    @JoinColumn(name = "korisnik_jmbg", referencedColumnName = "jmbg")
    private Korisnik korisnik;
    @ManyToOne
    @JoinColumn(name = "sifra_radnika", referencedColumnName = "sifra_radnika")
    private Radnik radnik;
    @OneToOne
    private ObavestenjeOIzvrsenojUplatiHotela obavestenjeOIzvrsenojUplatiHotela;
    @OneToOne
    private ObavestenjeOIzvrsenojUplatiPrevoza obavestenjeOIzvrsenojUplatiPrevoza;
    @OneToOne
    private ObavestenjeOIzvrsenojUplatiOsiguranja obavestenjeOIzvrsenojUplatiOsiguranja;

    public ObavestenjeOSvimIzvrsenimUplatama(int idObavestenja, String svrhaObavestenja, LocalDate datum, Korisnik korisnik, Radnik radnik, ObavestenjeOIzvrsenojUplatiHotela obavestenjeOIzvrsenojUplatiHotela, ObavestenjeOIzvrsenojUplatiPrevoza obavestenjeOIzvrsenojUplatiPrevoza, ObavestenjeOIzvrsenojUplatiOsiguranja obavestenjeOIzvrsenojUplatiOsiguranja) {
        this.idObavestenja = idObavestenja;
        this.svrhaObavestenja = svrhaObavestenja;
        this.datum = datum;
        this.korisnik = korisnik;
        this.radnik = radnik;
        this.obavestenjeOIzvrsenojUplatiHotela = obavestenjeOIzvrsenojUplatiHotela;
        this.obavestenjeOIzvrsenojUplatiPrevoza = obavestenjeOIzvrsenojUplatiPrevoza;
        this.obavestenjeOIzvrsenojUplatiOsiguranja = obavestenjeOIzvrsenojUplatiOsiguranja;
    }

    public ObavestenjeOSvimIzvrsenimUplatama() {
    }

    public int getIdObavestenja() {
        return idObavestenja;
    }

    public void setIdObavestenja(int idObavestenja) {
        this.idObavestenja = idObavestenja;
    }

    public String getSvrhaObavestenja() {
        return svrhaObavestenja;
    }

    public void setSvrhaObavestenja(String svrhaObavestenja) {
        this.svrhaObavestenja = svrhaObavestenja;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    public ObavestenjeOIzvrsenojUplatiHotela getObavestenjeOIzvrsenojUplatiHotela() {
        return obavestenjeOIzvrsenojUplatiHotela;
    }

    public void setObavestenjeOIzvrsenojUplatiHotela(ObavestenjeOIzvrsenojUplatiHotela obavestenjeOIzvrsenojUplatiHotela) {
        this.obavestenjeOIzvrsenojUplatiHotela = obavestenjeOIzvrsenojUplatiHotela;
    }

    public ObavestenjeOIzvrsenojUplatiPrevoza getObavestenjeOIzvrsenojUplatiPrevoza() {
        return obavestenjeOIzvrsenojUplatiPrevoza;
    }

    public void setObavestenjeOIzvrsenojUplatiPrevoza(ObavestenjeOIzvrsenojUplatiPrevoza obavestenjeOIzvrsenojUplatiPrevoza) {
        this.obavestenjeOIzvrsenojUplatiPrevoza = obavestenjeOIzvrsenojUplatiPrevoza;
    }

    public ObavestenjeOIzvrsenojUplatiOsiguranja getObavestenjeOIzvrsenojUplatiOsiguranja() {
        return obavestenjeOIzvrsenojUplatiOsiguranja;
    }

    public void setObavestenjeOIzvrsenojUplatiOsiguranja(ObavestenjeOIzvrsenojUplatiOsiguranja obavestenjeOIzvrsenojUplatiOsiguranja) {
        this.obavestenjeOIzvrsenojUplatiOsiguranja = obavestenjeOIzvrsenojUplatiOsiguranja;
    }

    @Override
    public String toString() {
        return "ObavestenjeOSvimIzvrsenimUplatama{" +
                "idObavestenja=" + idObavestenja +
                ", svrhaObavestenja='" + svrhaObavestenja + '\'' +
                ", datum=" + datum +
                ", korisnik=" + korisnik +
                ", radnik=" + radnik +
                ", obavestenjeOIzvrsenojUplatiHotela=" + obavestenjeOIzvrsenojUplatiHotela +
                ", obavestenjeOIzvrsenojUplatiPrevoza=" + obavestenjeOIzvrsenojUplatiPrevoza +
                ", obavestenjeOIzvrsenojUplatiOsiguranja=" + obavestenjeOIzvrsenojUplatiOsiguranja +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObavestenjeOSvimIzvrsenimUplatama that = (ObavestenjeOSvimIzvrsenimUplatama) o;
        return idObavestenja == that.idObavestenja && Objects.equals(svrhaObavestenja, that.svrhaObavestenja) && Objects.equals(datum, that.datum) && Objects.equals(korisnik, that.korisnik) && Objects.equals(radnik, that.radnik) && Objects.equals(obavestenjeOIzvrsenojUplatiHotela, that.obavestenjeOIzvrsenojUplatiHotela) && Objects.equals(obavestenjeOIzvrsenojUplatiPrevoza, that.obavestenjeOIzvrsenojUplatiPrevoza) && Objects.equals(obavestenjeOIzvrsenojUplatiOsiguranja, that.obavestenjeOIzvrsenojUplatiOsiguranja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObavestenja, svrhaObavestenja, datum, korisnik, radnik, obavestenjeOIzvrsenojUplatiHotela, obavestenjeOIzvrsenojUplatiPrevoza, obavestenjeOIzvrsenojUplatiOsiguranja);
    }
}
