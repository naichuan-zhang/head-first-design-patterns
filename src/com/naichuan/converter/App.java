package com.naichuan.converter;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        Converter<UserDto, User> userConverter = new UserConverter();
        UserDto dtoUser = new UserDto("John", "Doe", true, "whatever[at]wherever.com");
        User user = userConverter.convertFromDto(dtoUser);
        log.info("Entity converted from DTO: {}", user);

        List<User> users = Arrays.asList(new User("Camile", "Tough", false, "123sad"),
                new User("Marti", "Luther", true, "42309fd"),
                new User("Kate", "Smith", true, "if0243"));
        log.info("Domain entities: ");
        users.stream().map(User::toString).forEach(log::info);
        log.info("DTO entities converted from domain: ");
        List<UserDto> dtos = userConverter.createFromEntities(users);
        dtos.stream().map(UserDto::toString).forEach(log::info);
    }
}
