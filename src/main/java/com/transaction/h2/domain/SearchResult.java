package com.transaction.h2.domain;


import com.apicall.naver.Practice;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class SearchResult {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String pincodeRegex;
    private String bloggername;
    private String items;


}
