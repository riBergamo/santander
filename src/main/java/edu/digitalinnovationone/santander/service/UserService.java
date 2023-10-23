package edu.digitalinnovationone.santander.service;

import edu.digitalinnovationone.santander.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
