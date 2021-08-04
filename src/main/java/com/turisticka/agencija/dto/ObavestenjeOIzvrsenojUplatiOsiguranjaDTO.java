package com.turisticka.agencija.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

public class ObavestenjeOIzvrsenojUplatiOsiguranjaDTO implements MyDTO{
    private static final long serialVersionUID = 1L;
    @Max(5)
    private int idObavestenjaOsiguranja;
    private LocalDate datumO;
    @Max(100)
    @NotNull
    private String svrhaObavestenjaO;

    public ObavestenjeOIzvrsenojUplatiOsiguranjaDTO(int idObavestenjaOsiguranja, LocalDate datumO, String svrhaObavestenjaO) {
        this.idObavestenjaOsiguranja = idObavestenjaOsiguranja;
        this.datumO = datumO;
        this.svrhaObavestenjaO = svrhaObavestenjaO;
    }

    public ObavestenjeOIzvrsenojUplatiOsiguranjaDTO() {
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
        ObavestenjeOIzvrsenojUplatiOsiguranjaDTO that = (ObavestenjeOIzvrsenojUplatiOsiguranjaDTO) o;
        return idObavestenjaOsiguranja == that.idObavestenjaOsiguranja && Objects.equals(datumO, that.datumO) && Objects.equals(svrhaObavestenjaO, that.svrhaObavestenjaO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObavestenjaOsiguranja, datumO, svrhaObavestenjaO);
    }
}
