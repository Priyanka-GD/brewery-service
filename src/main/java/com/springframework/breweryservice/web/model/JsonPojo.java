package com.springframework.breweryservice.web.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class JsonPojo {
    @JsonProperty("beerId")
    @Null
    private UUID id;
    @NotBlank
    private String beerName;
    @NotBlank
    private String beerStyle;
    @Positive
    private Long upc;
  //  @JsonFormat(pattern="dd/mm/yyyy" ,shape=JsonFormat.Shape.STRING)
    private OffsetDateTime createdDate;
    @JsonSerialize(using =LocalDateSerializer.class)
    @JsonDeserialize(using=LocalDateDeserialize.class)
    private LocalDate myLocalDate;

}
