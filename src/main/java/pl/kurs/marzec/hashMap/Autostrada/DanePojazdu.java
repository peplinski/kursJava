package pl.kurs.marzec.hashMap.Autostrada;



import java.time.LocalDateTime;


public class DanePojazdu {
    private LocalDateTime czasWjazdu;
    private LocalDateTime czasWyjazdu;
    private String numerRejestracyjny;

    public DanePojazdu(LocalDateTime czasWjazdu, String numerRejestracyjny) {
        this.czasWjazdu = czasWjazdu;
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public LocalDateTime getCzasWjazdu() {
        return czasWjazdu;
    }

    public void setCzasWjazdu(LocalDateTime czasWjazdu) {
        this.czasWjazdu = czasWjazdu;
    }

    public LocalDateTime getCzasWyjazdu() {
        return czasWyjazdu;
    }

    public void setCzasWyjazdu(LocalDateTime czasWyjazdu) {
        this.czasWyjazdu = czasWyjazdu;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    public void setNumerRejestracyjny(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }

    @Override
    public String toString() {
        return "DanePojazdu{" +
                "czasWjazdu=" + czasWjazdu +
                ", czasWyjazdu=" + czasWyjazdu +
                ", numerRejestracyjny='" + numerRejestracyjny + '\'' +
                '}';
    }
}
