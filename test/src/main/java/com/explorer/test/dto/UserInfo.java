package com.explorer.test.dto;

import com.explorer.test.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class UserInfo {

    private Long id;
    private String name;

    public static UserInfo of(User user) {
        return UserInfo.builder()
                .id(user.getId())
                .name(user.getName())
                .build();
    }

}
