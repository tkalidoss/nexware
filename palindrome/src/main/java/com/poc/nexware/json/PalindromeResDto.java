package com.poc.nexware.json;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PalindromeResDto {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @JsonIgnore
    private Long id;

    private String list;

}
