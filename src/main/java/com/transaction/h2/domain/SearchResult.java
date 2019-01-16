package com.transaction.h2.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class SearchResult {

    @Id
    private String search_result;




}
