package edu.niit.luan.shop_ban_giay.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name="full_name")
    private String fullname;

    @Column(name="pwd")
    private String password;
}
