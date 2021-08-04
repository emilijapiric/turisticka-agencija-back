package com.turisticka.agencija.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

public class KorisnikDTO implements MyDTO {
    private static final long serialVersionUID = 1L;
    @Max(10)
    private int jmbg;
    @Max(30)
    @NotNull
    private String imePrezimeK;
    @Max(5)
    private int brPasosa;
    private LocalDate datumRodj;
    @Max(15)
    @NotNull
    private String brTelefona;

    public KorisnikDTO(int jmbg, String imePrezimeK, int brPasosa, LocalDate datumRodj, String brTelefona) {
        this.jmbg = jmbg;
        this.imePrezimeK = imePrezimeK;
        this.brPasosa = brPasosa;
        this.datumRodj = datumRodj;
        this.brTelefona = brTelefona;
    }

    public KorisnikDTO() {
    }

    public int getJmbg() {
        return jmbg;
    }

    public void setJmbg(int jmbg) {
        this.jmbg = jmbg;
    }

    public String getImePrezime() {
        return imePrezimeK;
    }

    public void setImePrezime(String imePrezimeK) {
        this.imePrezimeK = imePrezimeK;
    }

    public int getBrPasosa() {
        return brPasosa;
    }

    public void setBrPasosa(int brPasosa) {
        this.brPasosa = brPasosa;
    }

    public LocalDate getDatumRodj() {
        return datumRodj;
    }

    public void setDatumRodj(LocalDate datumRodj) {
        this.datumRodj = datumRodj;
    }

    public String getBrTelefona() {
        return brTelefona;
    }

    public void setBrTelefona(String brTelefona) {
        this.brTelefona = brTelefona;
    }

    @Override
    public String toString() {
        return "Korisnik{" +
                "jmbg=" + jmbg +
                ", imePrezimeK='" + imePrezimeK + '\'' +
                ", brPasosa=" + brPasosa +
                ", datumRodj=" + datumRodj +
                ", brTelefona='" + brTelefona + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KorisnikDTO korisnik = (KorisnikDTO) o;
        return jmbg == korisnik.jmbg && brPasosa == korisnik.brPasosa && Objects.equals(imePrezimeK, korisnik.imePrezimeK) && Objects.equals(datumRodj, korisnik.datumRodj) && Objects.equals(brTelefona, korisnik.brTelefona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jmbg, imePrezimeK, brPasosa, datumRodj, brTelefona);
    }
}
