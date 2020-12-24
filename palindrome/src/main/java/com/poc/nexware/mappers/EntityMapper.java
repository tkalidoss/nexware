package com.poc.nexware.mappers;

public interface EntityMapper<I, O> {
    O map(I input) throws Exception;
}
