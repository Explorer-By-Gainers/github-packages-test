package com.explorer.test.entity;

import com.explorer.test.dto.UserInfo;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
@Table(name = "`user`")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public static User from(String name) {
        return User.builder()
                .name(name)
                .build();
    }

}
