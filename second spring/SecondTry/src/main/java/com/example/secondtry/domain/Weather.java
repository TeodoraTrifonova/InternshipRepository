package com.example.secondtry.domain;

public class Weather {
PrognozaZaVreme prognozaZaVreme;
PrognozaKoordinati prognozaKoordinati;

    public Weather(PrognozaZaVreme prognozaZaVreme, PrognozaKoordinati prognozaKoordinati) {
        this.prognozaZaVreme = prognozaZaVreme;
        this.prognozaKoordinati = prognozaKoordinati;
    }

    public PrognozaZaVreme getPrognozaZaVreme() {
        return prognozaZaVreme;
    }

    public void setPrognozaZaVreme(PrognozaZaVreme prognozaZaVreme) {
        this.prognozaZaVreme = prognozaZaVreme;
    }

    public PrognozaKoordinati getPrognozaKoordinati() {
        return prognozaKoordinati;
    }

    public void setPrognozaKoordinati(PrognozaKoordinati prognozaKoordinati) {
        this.prognozaKoordinati = prognozaKoordinati;
    }
}

