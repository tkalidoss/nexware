package com.poc.nexware.service;

import com.poc.nexware.entity.Palindrome;
import com.poc.nexware.json.PalindromeReqDto;
import com.poc.nexware.repository.PalindromeRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class PalindromeService implements IPalindromeService {

    private final Logger LOG = LogManager.getLogger(PalindromeService.class);

    @Autowired
    private PalindromeRepository repository;


    @Override
    public Palindrome savePalindrome(Palindrome palindrome) {
        return repository.save(palindrome);
    }

    @Override
    public List<Palindrome> getAllPalindromes() {
        return repository.getAllPalindromes();
    }
}
