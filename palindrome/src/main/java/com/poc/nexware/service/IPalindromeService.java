package com.poc.nexware.service;

import com.poc.nexware.entity.Palindrome;
import com.poc.nexware.json.PalindromeReqDto;

import java.util.List;
import java.util.UUID;

public interface IPalindromeService {

    Palindrome savePalindrome(final Palindrome palindrome);

    List<Palindrome> getAllPalindromes();

}
