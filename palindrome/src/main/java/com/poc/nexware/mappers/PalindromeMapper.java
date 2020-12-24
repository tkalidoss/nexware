package com.poc.nexware.mappers;

import com.poc.nexware.entity.Palindrome;
import com.poc.nexware.json.PalindromeReqDto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class PalindromeMapper implements EntityMapper<PalindromeReqDto, Palindrome>{

    private final Logger LOG = LogManager.getLogger(PalindromeMapper.class);

    @Override
    public Palindrome map(PalindromeReqDto reqDto) {

        Palindrome palindrome = new Palindrome();
        palindrome.setList(reqDto.getList());

        LOG.debug(palindrome.toString());
        return palindrome;
    }
}
