package com.turisticka.agencija.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class NacinPlacanjaDTO implements MyDTO{
    private static final long serialVersionUID = 1L;
    @Max(5)
    private int idNacinaPlacanja;
    @Max(50)
    @NotNull
    private String opisNacinaPlacanja;

    public NacinPlacanjaDTO(int idNacinaPlacanja, String opisNacinaPlacanja) {
        this.idNacinaPlacanja = idNacinaPlacanja;
        this.opisNacinaPlacanja = opisNacinaPlacanja;
    }

    public NacinPlacanjaDTO() {
    }

    public int getIdNacinaPlacanja() {
        return idNacinaPlacanja;
    }

    public void setIdNacinaPlacanja(int idNacinaPlacanja) {
        this.idNacinaPlacanja = idNacinaPlacanja;
    }

    public String getOpisNacinaPlacanja() {
        return opisNacinaPlacanja;
    }

    public void setOpisNacinaPlacanja(String opisNacinaPlacanja) {
        this.opisNacinaPlacanja = opisNacinaPlacanja;
    }

    @Override
    public String toString() {
        return "NacinPlacanja{" +
                "idNacinaPlacanja=" + idNacinaPlacanja +
                ", opisNacinaPlacanja='" + opisNacinaPlacanja + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NacinPlacanjaDTO that = (NacinPlacanjaDTO) o;
        return idNacinaPlacanja == that.idNacinaPlacanja && Objects.equals(opisNacinaPlacanja, that.opisNacinaPlacanja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNacinaPlacanja, opisNacinaPlacanja);
    }
}
