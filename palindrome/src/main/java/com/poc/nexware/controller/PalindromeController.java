package com.poc.nexware.controller;

import com.poc.nexware.entity.Palindrome;
import com.poc.nexware.json.PalindromeReqDto;
import com.poc.nexware.json.PalindromeResDto;
import com.poc.nexware.mappers.PalindromeMapper;
import com.poc.nexware.service.PalindromeService;
import com.poc.nexware.util.Validation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PalindromeController extends BaseController {

    private final Logger LOG = LogManager.getLogger(PalindromeController.class);

    @Autowired
    private PalindromeService palindromeService;

    @Autowired
    @Qualifier("palindromeMapper")
    private PalindromeMapper palindromeMapper;


    @GetMapping(value = "/getAll")
    public ResponseEntity<List<PalindromeResDto>> getPalindromeList() {
        List<PalindromeResDto> palindromeResDtoList = new ArrayList<>();
        palindromeResDtoList.addAll(getListOfPaindromes());
        return new ResponseEntity<>(palindromeResDtoList, HttpStatus.OK);
    }


    private List<PalindromeResDto> getListOfPaindromes() {
        List<Palindrome> palindromes = palindromeService.getAllPalindromes();
        return mapperPalindromes(palindromes);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<PalindromeResDto> savePalindromee(@RequestBody PalindromeReqDto palindromeReqDto) {
        Palindrome palindromeObj = palindromeMapper.map(palindromeReqDto);
        try{
            Validation.isValid(palindromeObj);
            Palindrome palindrome = palindromeService.savePalindrome(palindromeObj);
            PalindromeResDto dto = mapper(palindrome);
            return new ResponseEntity<>(dto, HttpStatus.OK);
        }
        catch (Exception e){
            LOG.debug(e.getStackTrace());
            return new ResponseEntity(e.getMessage(), HttpStatus.OK);
        }
    }
}