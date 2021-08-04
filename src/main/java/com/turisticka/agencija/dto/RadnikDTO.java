package com.turisticka.agencija.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class RadnikDTO implements MyDTO{
    private static final long serialVersionUID = 1L;
    @Max(5)
    private int sifraRadnika;
    @Max(30)
    @NotNull
    private String imePrezimeR;

    public RadnikDTO(int sifraRadnika, String imePrezimeR) {
        sifraRadnika = sifraRadnika;
        this.imePrezimeR = imePrezimeR;
    }

    public RadnikDTO() {
    }

    public int getSifraRadnika() {
        return sifraRadnika;
    }

    public void setSifraRadnika(int sifraRadnika) {
        sifraRadnika = sifraRadnika;
    }

    public String getImePrezimeR() {
        return imePrezimeR;
    }

    public void setImePrezimeR(String imePrezimeR) {
        this.imePrezimeR = imePrezimeR;
    }

    @Override
    public String toString() {
        return "Radnik{" +
                "sifraRadnika=" + sifraRadnika +
                ", imePrezimeR='" + imePrezimeR + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RadnikDTO radnik = (RadnikDTO) o;
        return sifraRadnika == radnik.sifraRadnika && Objects.equals(imePrezimeR, radnik.imePrezimeR);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sifraRadnika, imePrezimeR);
    }
}
