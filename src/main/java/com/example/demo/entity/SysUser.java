package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

/**
 * SysUser Entity Class
 *
 * @author mqxu
 * 2018.10.21
 * DO
 */
@Entity
@Data
@Builder
@Table(name = "sys")
public class SysUser {
    @Id
    @GeneratedValue
    private Integer userId;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private String nickname;
    private String avatar;
    private String description;
    private Integer wordsCount;
    private Integer likeCount;

}
