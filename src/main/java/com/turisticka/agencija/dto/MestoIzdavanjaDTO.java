package com.turisticka.agencija.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class MestoIzdavanjaDTO implements MyDTO{
    private static final long serialVersionUID = 1L;
    @Max(5)
    private int idMestaIzdavanja;
    @Max(30)
    @NotNull
    private String nazivMestaIzdavanja;

    public MestoIzdavanjaDTO(int idMestaIzdavanja, String nazivMestaIzdavanja) {
        this.idMestaIzdavanja = idMestaIzdavanja;
        this.nazivMestaIzdavanja = nazivMestaIzdavanja;
    }

    public MestoIzdavanjaDTO() {
    }

    public int getIdMestaIzdavanja() {
        return idMestaIzdavanja;
    }

    public void setIdMestaIzdavanja(int idMestaIzdavanja) {
        this.idMestaIzdavanja = idMestaIzdavanja;
    }

    public String getNazivMestaIzdavanja() {
        return nazivMestaIzdavanja;
    }

    public void setNazivMestaIzdavanja(String nazivMestaIzdavanja) {
        this.nazivMestaIzdavanja = nazivMestaIzdavanja;
    }

    @Override
    public String toString() {
        return "MestoIzdavanja{" +
                "idMestaIzdavanja=" + idMestaIzdavanja +
                ", nazivMestaIzdavanja='" + nazivMestaIzdavanja + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MestoIzdavanjaDTO that = (MestoIzdavanjaDTO) o;
        return idMestaIzdavanja == that.idMestaIzdavanja && Objects.equals(nazivMestaIzdavanja, that.nazivMestaIzdavanja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMestaIzdavanja, nazivMestaIzdavanja);
    }
}
