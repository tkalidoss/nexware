package com.poc.nexware.json;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PalindromeReqDto {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    private String list;

}
