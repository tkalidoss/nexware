package com.poc.nexware.controller;

import com.poc.nexware.entity.Palindrome;
import com.poc.nexware.json.PalindromeResDto;

import java.util.ArrayList;
import java.util.List;

public class BaseController {

    protected PalindromeResDto mapper(Palindrome palindrome) {
        PalindromeResDto dto = new PalindromeResDto();
        dto.setId(palindrome.getId());
        dto.setList(palindrome.getList());
        return dto;
    }

    protected List<PalindromeResDto> mapperPalindromes(List<Palindrome> palindromes) {
        List<PalindromeResDto> resDtos = new ArrayList<>();
        palindromes.forEach(palindrome -> {
            PalindromeResDto dto = mapper(palindrome);
            resDtos.add(dto);
        });
        return resDtos;
    }

}
