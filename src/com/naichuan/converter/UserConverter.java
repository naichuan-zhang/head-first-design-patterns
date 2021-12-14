package com.naichuan.converter;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
public class UserConverter extends Converter<UserDto, User> {

    public UserConverter() {
        super(UserConverter::convertToUser, UserConverter::convertToDto);
    }

    private static UserDto convertToDto(User user) {
        return new UserDto(user.getFirstName(), user.getLastName(), user.isActive(), user.getUserId());
    }

    private static User convertToUser(UserDto dto) {
        return new User(dto.getFirstName(), dto.getLastName(), dto.isActive(), dto.getEmail());
    }
}
