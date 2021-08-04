package com.turisticka.agencija.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

public class ObavestenjeOIzvrsenojUplatiHotelaDTO implements MyDTO {
    private static final long serialVersionUID = 1L;
    @Max(5)
    private int idObavestenjaHotela;
    private LocalDate datumH;
    @Max(100)
    @NotNull
    private String svrhaObavestenjaH;

    public ObavestenjeOIzvrsenojUplatiHotelaDTO(int idObavestenjaHotela, LocalDate datumH, String svrhaObavestenjaH) {
        this.idObavestenjaHotela = idObavestenjaHotela;
        this.datumH = datumH;
        this.svrhaObavestenjaH = svrhaObavestenjaH;
    }

    public ObavestenjeOIzvrsenojUplatiHotelaDTO() {
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
        ObavestenjeOIzvrsenojUplatiHotelaDTO that = (ObavestenjeOIzvrsenojUplatiHotelaDTO) o;
        return idObavestenjaHotela == that.idObavestenjaHotela && Objects.equals(datumH, that.datumH) && Objects.equals(svrhaObavestenjaH, that.svrhaObavestenjaH);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObavestenjaHotela, datumH, svrhaObavestenjaH);
    }
}
