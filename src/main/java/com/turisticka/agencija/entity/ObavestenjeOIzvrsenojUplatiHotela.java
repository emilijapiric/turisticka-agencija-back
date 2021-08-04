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
@Table(name="obavestenje_o_izvrsenoj_uplati_hotela")
public class ObavestenjeOIzvrsenojUplatiHotela {
    @Id
    @Column(length = 5,name="id_obavestenja_hotela")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idObavestenjaHotela;
    private LocalDate datumH;
    @Column(length = 100)
    @NotNull
    private String svrhaObavestenjaH;

    public ObavestenjeOIzvrsenojUplatiHotela(int idObavestenjaHotela, LocalDate datumH, String svrhaObavestenjaH) {
        this.idObavestenjaHotela = idObavestenjaHotela;
        this.datumH = datumH;
        this.svrhaObavestenjaH = svrhaObavestenjaH;
    }

    public ObavestenjeOIzvrsenojUplatiHotela() {
    }

    public int getIdObavestenjaHotela() {
        return idObavestenjaHotela;
    }

    public void setIdObavestenjaHotela(int idObavestenjaHotela) {
        this.idObavestenjaHotela = idObavestenjaHotela;
    }

    public LocalDate getDatumH() {
        return datumH;
    }

    public void setDatumH(LocalDate datumH) {
        this.datumH = datumH;
    }

    public String getSvrhaObavestenjaH() {
        return svrhaObavestenjaH;
    }

    public void setSvrhaObavestenjaH(String svrhaObavestenjaH) {
        this.svrhaObavestenjaH = svrhaObavestenjaH;
    }

    @Override
    public String toString() {
        return "ObavestenjeOIzvrsenojUplatiHotela{" +
                "idObavestenjaHotela=" + idObavestenjaHotela +
                ", datumH=" + datumH +
                ", svrhaObavestenjaH='" + svrhaObavestenjaH + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObavestenjeOIzvrsenojUplatiHotela that = (ObavestenjeOIzvrsenojUplatiHotela) o;
        return idObavestenjaHotela == that.idObavestenjaHotela && Objects.equals(datumH, that.datumH) && Objects.equals(svrhaObavestenjaH, that.svrhaObavestenjaH);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObavestenjaHotela, datumH, svrhaObavestenjaH);
    }
}
