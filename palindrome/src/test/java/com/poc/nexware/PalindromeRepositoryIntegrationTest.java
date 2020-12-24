package com.poc.nexware;

import com.poc.nexware.entity.Palindrome;
import com.poc.nexware.repository.PalindromeRepository;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@SpringBootTest
public class PalindromeRepositoryIntegrationTest {

    @Autowired
    private PalindromeRepository palindromeRepository;

    @Test
    public void addPalindrome(){
        Palindrome palindrome = new Palindrome();
        palindrome.setList("Kalidoss");
        assertThat(palindrome.getId()).isNull();
        palindrome = palindromeRepository.save(palindrome);
        assertThat(palindrome.getId()).isNotNull();
    }

    @Test
    @Tag("fast")
    public void getAllPalindromes(){

        Palindrome palindrome = new Palindrome();
        palindrome.setList("Kalidoss");
        assertThat(palindrome.getId()).isNull();
        palindrome = palindromeRepository.save(palindrome);
        assertThat(palindrome.getId()).isNotNull();

        Palindrome palindrome1 = new Palindrome();
        palindrome1.setList("Kumar");
        assertThat(palindrome1.getId()).isNull();
        palindrome1 = palindromeRepository.save(palindrome1);
        assertThat(palindrome1.getId()).isNotNull();

        List<Palindrome> list =  palindromeRepository.getAllPalindromes();
        assertThat(list.size()).isEqualTo(2);

        for(Palindrome pdrme : list){
            if(pdrme.getId() == palindrome.getId()){
                assertThat(pdrme.getId()).isNotNull();
                assertThat(pdrme.getId()).isEqualTo(palindrome.getId());

            }else{
                assertThat(pdrme.getId()).isNotNull();
                assertThat(pdrme.getId()).isEqualTo(palindrome1.getId());

            }
        }
    }


}
