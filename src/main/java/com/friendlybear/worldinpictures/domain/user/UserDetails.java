package com.friendlybear.worldinpictures.domain.user;

import com.friendlybear.worldinpictures.validate.ValidEmail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
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
    @NotNull
    @NotEmpty
    @ValidEmail
    private String eMail;

    @Getter
    private String dateOfBirth;
}
