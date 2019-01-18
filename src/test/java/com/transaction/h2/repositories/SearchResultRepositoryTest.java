package com.transaction.h2.repositories;

import com.transaction.h2.domain.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class SearchResultRepositoryTest {

    @Autowired
    private SearchResultRepository searchResultRepository;


    @Test
    public void name() {
        SearchResult searchResult = new SearchResult();
        SearchResult searchResult1 = searchResultRepository.save(searchResult);
    };

}