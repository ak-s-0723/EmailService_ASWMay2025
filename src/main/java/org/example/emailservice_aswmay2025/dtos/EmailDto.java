package org.example.emailservice_aswmay2025.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmailDto {
    private String to;
    private String from;
    private String subject;
    private String body;
}
