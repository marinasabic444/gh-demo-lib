package com.ag04.utils;

/**
 * @author marina
 */
public interface DummyService {
    
    DummyDTO get(Long id);

    DummyDTO save(DummyDTO testDto);
}
