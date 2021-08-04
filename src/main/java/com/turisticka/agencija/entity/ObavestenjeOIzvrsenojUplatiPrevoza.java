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
@Table(name="obavestenje_o_izvrsenoj_uplati_prevoza")
public class ObavestenjeOIzvrsenojUplatiPrevoza {
    @Id
    @Column(length = 5,name="id_obavestenja_prevoza")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idObavestenjaPrevoza;
    private LocalDate datumP;
    @Column(length = 100)
    @NotNull
    private String svrhaObavestenjaP;

    public ObavestenjeOIzvrsenojUplatiPrevoza(int idObavestenjaPrevoza, LocalDate datumP, String svrhaObavestenjaP) {
        this.idObavestenjaPrevoza = idObavestenjaPrevoza;
        this.datumP = datumP;
        this.svrhaObavestenjaP = svrhaObavestenjaP;
    }

    public ObavestenjeOIzvrsenojUplatiPrevoza() {
    }

    public int getIdObavestenjaHotela() {
        return idObavestenjaPrevoza;
    }

    public void setIdObavestenjaHotela(int idObavestenjaPrevoza) {
        this.idObavestenjaPrevoza = idObavestenjaPrevoza;
    }

    public LocalDate getDatumH() {
        return datumP;
    }

    public void setDatumH(LocalDate datumP) {
        this.datumP = datumP;
    }

    public String getSvrhaObavestenjaH() {
        return svrhaObavestenjaP;
    }

    public void setSvrhaObavestenjaH(String svrhaObavestenjaP) {
        this.svrhaObavestenjaP = svrhaObavestenjaP;
    }

    @Override
    public String toString() {
        return "ObavestenjeOIzvrsenojUplatiPrevoza{" +
                "idObavestenjaPrevoza=" + idObavestenjaPrevoza +
                ", datumP=" + datumP +
                ", svrhaObavestenjaP='" + svrhaObavestenjaP + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObavestenjeOIzvrsenojUplatiPrevoza that = (ObavestenjeOIzvrsenojUplatiPrevoza) o;
        return idObavestenjaPrevoza == that.idObavestenjaPrevoza && Objects.equals(datumP, that.datumP) && Objects.equals(svrhaObavestenjaP, that.svrhaObavestenjaP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObavestenjaPrevoza, datumP, svrhaObavestenjaP);
    }
}
