package com.friendlybear.worldinpictures.domain.user;

import com.friendlybear.worldinpictures.domain.BaseEntity;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Tsvetoslav Tsvetanov - Delta Source Bulgaria on 6/25/17.
 */
@Entity
@Table(name = "user_role")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@ToString
public class Roles extends BaseEntity implements GrantedAuthority {

    @Getter
    private String authority;
}
