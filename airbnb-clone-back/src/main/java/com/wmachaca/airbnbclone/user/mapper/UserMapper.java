package com.wmachaca.airbnbclone.user.mapper;

import com.wmachaca.airbnbclone.user.application.dto.ReadUserDTO;
import com.wmachaca.airbnbclone.user.domain.Authority;
import com.wmachaca.airbnbclone.user.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }
}
