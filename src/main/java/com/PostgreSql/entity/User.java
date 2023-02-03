package com.PostgreSql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "Employee")
public class User {

    @Id
    private String id;
    private String userName;
    private String userEmail;
    private String userAge;
}
