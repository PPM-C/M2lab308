package com.nurses.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;
    private String  name;

    @Enumerated(EnumType.STRING)
    private GuestStatus status;
}
