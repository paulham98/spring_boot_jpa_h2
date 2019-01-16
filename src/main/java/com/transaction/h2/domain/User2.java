package com.transaction.h2.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name= "searchResult")
public class User2 {

    @Id
    private long id;
    private String name;
    private String password;



}
