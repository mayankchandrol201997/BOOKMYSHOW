package dev.mayank.BOOKMYSHOW.dto;

import dev.mayank.BOOKMYSHOW.constant.AuditoriumFeatures;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AuditoriumRequestDTO {
    private String name;
    private Integer capacity;
    private Integer theatreId;
}
