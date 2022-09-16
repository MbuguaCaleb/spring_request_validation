package com.codewithcaleb.requestvalidation.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.UniqueConstraint;
import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "Username should not be null")
    private String name;

    @Email(message = "invalid email address")
    private String email;

    @NotNull
    @Pattern(regexp = "^\\d{10}$", message = "invalid mobile number entered")
    private String mobile;
    private String gender;

    @Min(18)
    @Max(60)
    private String age;

    @NotBlank
    private String nationality;
}
