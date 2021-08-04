package com.turisticka.agencija.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

public class ObavestenjeOIzvrsenojUplatiPrevozaDTO implements MyDTO{
    private static final long serialVersionUID = 1L;
    @Max(5)
    private int idObavestenjaPrevoza;
    private LocalDate datumP;
    @Max(100)
    @NotNull
    private String svrhaObavestenjaP;

    public ObavestenjeOIzvrsenojUplatiPrevozaDTO(int idObavestenjaPrevoza, LocalDate datumP, String svrhaObavestenjaP) {
        this.idObavestenjaPrevoza = idObavestenjaPrevoza;
        this.datumP = datumP;
        this.svrhaObavestenjaP = svrhaObavestenjaP;
    }

    public ObavestenjeOIzvrsenojUplatiPrevozaDTO() {
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
        ObavestenjeOIzvrsenojUplatiPrevozaDTO that = (ObavestenjeOIzvrsenojUplatiPrevozaDTO) o;
        return idObavestenjaPrevoza == that.idObavestenjaPrevoza && Objects.equals(datumP, that.datumP) && Objects.equals(svrhaObavestenjaP, that.svrhaObavestenjaP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObavestenjaPrevoza, datumP, svrhaObavestenjaP);
    }
}
