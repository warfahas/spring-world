package org.launchcode.springworld.models.data;

import org.launchcode.springworld.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mkabd on 11/10/2018.
 */
public interface UserDao extends CrudRepository<User, Long> {

    public User findByEmail(String email);
}
