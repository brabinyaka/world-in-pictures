package com.friendlybear.worldinpictures.domain.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * This class shows detailed information about the user
 * <p>
 * Created by Tsvetoslav Tsvetanov - Delta Source Bulgaria on 6/25/17.
 */
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails implements Serializable {

    @Getter
    private String firstName;

    @Getter
    private String lastName;

    @Getter
    private String eMail;

    @Getter
    private String dateOfBirth;
}
