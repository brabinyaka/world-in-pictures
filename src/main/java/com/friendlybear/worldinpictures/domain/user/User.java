package com.friendlybear.worldinpictures.domain.user;

import com.friendlybear.worldinpictures.domain.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * This class represents User entity
 * <p>
 * Created by Tsvetoslav Tsvetanov - Delta Source Bulgaria on 6/25/17.
 */
@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@ToString
public class User extends BaseEntity {

    @Getter
    private String username;

    @Getter
    private String password;

    @Getter
    private UserDetails userDetails;

    @Getter
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Roles> roles = new HashSet<>();

    public User(String username, String password, UserDetails userDetails, Roles role) {
        this.username = username;
        this.password = password;
        this.userDetails = userDetails;
        this.roles.add(role);
    }
}
