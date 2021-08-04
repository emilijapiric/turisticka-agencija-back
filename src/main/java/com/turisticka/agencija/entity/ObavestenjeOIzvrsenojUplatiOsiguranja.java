package com.turisticka.agencija.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="obavestenje_o_izvrsenoj_uplati_osiguranja")
public class ObavestenjeOIzvrsenojUplatiOsiguranja {
    @Id
    @Column(length = 5)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idObavestenjaOsiguranja;
    private LocalDate datumO;
    @Column(length = 100)
    @NotNull
    private String svrhaObavestenjaO;

    public ObavestenjeOIzvrsenojUplatiOsiguranja(int idObavestenjaOsiguranja, LocalDate datumO, String svrhaObavestenjaO) {
        this.idObavestenjaOsiguranja = idObavestenjaOsiguranja;
        this.datumO = datumO;
        this.svrhaObavestenjaO = svrhaObavestenjaO;
    }

    public ObavestenjeOIzvrsenojUplatiOsiguranja() {
    }

    public int getIdObavestenjaHotela() {
        return idObavestenjaOsiguranja;
    }

    public void setIdObavestenjaHotela(int idObavestenjaOsiguranja) {
        this.idObavestenjaOsiguranja = idObavestenjaOsiguranja;
    }

    public LocalDate getDatumH() {
        return datumO;
    }

    public void setDatumH(LocalDate datumO) {
        this.datumO = datumO;
    }

    public String getSvrhaObavestenjaH() {
        return svrhaObavestenjaO;
    }

    public void setSvrhaObavestenjaH(String svrhaObavestenjaO) {
        this.svrhaObavestenjaO = svrhaObavestenjaO;
    }

    @Override
    public String toString() {
        return "ObavestenjeOIzvrsenojUplatiOsiguranja{" +
                "idObavestenjaOsiguranja=" + idObavestenjaOsiguranja +
                ", datumO=" + datumO +
                ", svrhaObavestenjaO='" + svrhaObavestenjaO + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObavestenjeOIzvrsenojUplatiOsiguranja that = (ObavestenjeOIzvrsenojUplatiOsiguranja) o;
        return idObavestenjaOsiguranja == that.idObavestenjaOsiguranja && Objects.equals(datumO, that.datumO) && Objects.equals(svrhaObavestenjaO, that.svrhaObavestenjaO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObavestenjaOsiguranja, datumO, svrhaObavestenjaO);
    }
}
