package com.example.kafkaexample.Config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Domain {
    private String id;
    private String name;
    private  int age;
}
