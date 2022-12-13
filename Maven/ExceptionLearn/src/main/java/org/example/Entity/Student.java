package org.example.Entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
//@Data
public class Student {
    private String name;

    private int age;

    private String address;
}
