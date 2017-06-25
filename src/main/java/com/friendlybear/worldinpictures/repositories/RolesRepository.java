package com.friendlybear.worldinpictures.repositories;

import com.friendlybear.worldinpictures.domain.user.Roles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring REST Repository for authority roles
 * <p>
 * Created by Tsvetoslav Tsvetanov - Delta Source Bulgaria on 6/25/17.
 */
@Repository
public interface RolesRepository extends CrudRepository<Roles, Long> {

    Roles findByAuthority(String authority);
}
