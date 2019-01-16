package com.transaction.h2.domain;


import com.apicall.naver.Practice;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class SearchResult {
    @Id
    private String result;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String pincodeRegex;
    private List<Practice> practiceList;


}