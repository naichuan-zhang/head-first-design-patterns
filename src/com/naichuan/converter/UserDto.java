package com.naichuan.converter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
public class UserDto {

    private final String firstName;
    private final String lastName;
    private final boolean active;
    private final String email;
}
