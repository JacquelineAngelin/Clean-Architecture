package school.domain.indication;

import school.domain.studant.Studant;

import java.time.LocalDateTime;

public class Indication {

    private Studant indicated;
    private Studant indicator;
    private LocalDateTime dataIndicacao;

    public Indication(Studant indicated, Studant indicator) {
        this.indicated = indicated;
        this.indicator = indicator;
        this.dataIndicacao = LocalDateTime.now();
    }

    public Studant getIndicated() {
        return indicated;
    }

    public Studant getIndicator() {
        return indicator;
    }

    public LocalDateTime getDataIndicacao() {
        return dataIndicacao;
    }
}
