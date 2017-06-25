package com.friendlybear.worldinpictures.repositories;

import com.friendlybear.worldinpictures.domain.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring REST repository for user
 * <p>
 * Created by Tsvetoslav Tsvetanov - Delta Source Bulgaria on 6/25/17.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findUserById(long id);

    User findUserByUsername(String username);
}
