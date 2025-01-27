package de.kaliburg.morefair.dto;

import de.kaliburg.morefair.ladder.Ladder;
import lombok.Data;

@Data
public class LadderDTO {
    private Integer number;

    public LadderDTO(Ladder ladder) {
        this.number = ladder.getNumber();
    }
}
