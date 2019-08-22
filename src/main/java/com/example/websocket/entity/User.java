package com.example.websocket.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Administrator
 */
@Data
//jpa下的注解
@Entity
@Table(name="user")
public class User implements Serializable{

    private static final long serialVersionUID = -6503710493488425450L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;



}