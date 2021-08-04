package com.turisticka.agencija.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

public class ObavestenjeOSvimIzvrsenimUplatamaDTO implements MyDTO{
    private static final long serialVersionUID = 1L;
    @Max(5)
    private int idObavestenja;
    @Max(100)
    @NotNull
    private String svrhaObavestenja;
    private LocalDate datum;
    private KorisnikDTO korisnik;
    private RadnikDTO radnik;
    private ObavestenjeOIzvrsenojUplatiHotelaDTO obavestenjeOIzvrsenojUplatiHotela;
    private ObavestenjeOIzvrsenojUplatiPrevozaDTO obavestenjeOIzvrsenojUplatiPrevoza;
    private ObavestenjeOIzvrsenojUplatiOsiguranjaDTO obavestenjeOIzvrsenojUplatiOsiguranja;

    public ObavestenjeOSvimIzvrsenimUplatamaDTO(int idObavestenja, String svrhaObavestenja, LocalDate datum, KorisnikDTO korisnik, RadnikDTO radnik, ObavestenjeOIzvrsenojUplatiHotelaDTO obavestenjeOIzvrsenojUplatiHotela, ObavestenjeOIzvrsenojUplatiPrevozaDTO obavestenjeOIzvrsenojUplatiPrevoza, ObavestenjeOIzvrsenojUplatiOsiguranjaDTO obavestenjeOIzvrsenojUplatiOsiguranja) {
        this.idObavestenja = idObavestenja;
        this.svrhaObavestenja = svrhaObavestenja;
        this.datum = datum;
        this.korisnik = korisnik;
        this.radnik = radnik;
        this.obavestenjeOIzvrsenojUplatiHotela = obavestenjeOIzvrsenojUplatiHotela;
        this.obavestenjeOIzvrsenojUplatiPrevoza = obavestenjeOIzvrsenojUplatiPrevoza;
        this.obavestenjeOIzvrsenojUplatiOsiguranja = obavestenjeOIzvrsenojUplatiOsiguranja;
    }

    public ObavestenjeOSvimIzvrsenimUplatamaDTO() {
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

    public KorisnikDTO getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(KorisnikDTO korisnik) {
        this.korisnik = korisnik;
    }

    public RadnikDTO getRadnik() {
        return radnik;
    }

    public void setRadnik(RadnikDTO radnik) {
        this.radnik = radnik;
    }

    public ObavestenjeOIzvrsenojUplatiHotelaDTO getObavestenjeOIzvrsenojUplatiHotela() {
        return obavestenjeOIzvrsenojUplatiHotela;
    }

    public void setObavestenjeOIzvrsenojUplatiHotela(ObavestenjeOIzvrsenojUplatiHotelaDTO obavestenjeOIzvrsenojUplatiHotela) {
        this.obavestenjeOIzvrsenojUplatiHotela = obavestenjeOIzvrsenojUplatiHotela;
    }

    public ObavestenjeOIzvrsenojUplatiPrevozaDTO getObavestenjeOIzvrsenojUplatiPrevoza() {
        return obavestenjeOIzvrsenojUplatiPrevoza;
    }

    public void setObavestenjeOIzvrsenojUplatiPrevoza(ObavestenjeOIzvrsenojUplatiPrevozaDTO obavestenjeOIzvrsenojUplatiPrevoza) {
        this.obavestenjeOIzvrsenojUplatiPrevoza = obavestenjeOIzvrsenojUplatiPrevoza;
    }

    public ObavestenjeOIzvrsenojUplatiOsiguranjaDTO getObavestenjeOIzvrsenojUplatiOsiguranja() {
        return obavestenjeOIzvrsenojUplatiOsiguranja;
    }

    public void setObavestenjeOIzvrsenojUplatiOsiguranja(ObavestenjeOIzvrsenojUplatiOsiguranjaDTO obavestenjeOIzvrsenojUplatiOsiguranja) {
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
        ObavestenjeOSvimIzvrsenimUplatamaDTO that = (ObavestenjeOSvimIzvrsenimUplatamaDTO) o;
        return idObavestenja == that.idObavestenja && Objects.equals(svrhaObavestenja, that.svrhaObavestenja) && Objects.equals(datum, that.datum) && Objects.equals(korisnik, that.korisnik) && Objects.equals(radnik, that.radnik) && Objects.equals(obavestenjeOIzvrsenojUplatiHotela, that.obavestenjeOIzvrsenojUplatiHotela) && Objects.equals(obavestenjeOIzvrsenojUplatiPrevoza, that.obavestenjeOIzvrsenojUplatiPrevoza) && Objects.equals(obavestenjeOIzvrsenojUplatiOsiguranja, that.obavestenjeOIzvrsenojUplatiOsiguranja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObavestenja, svrhaObavestenja, datum, korisnik, radnik, obavestenjeOIzvrsenojUplatiHotela, obavestenjeOIzvrsenojUplatiPrevoza, obavestenjeOIzvrsenojUplatiOsiguranja);
    }
}
