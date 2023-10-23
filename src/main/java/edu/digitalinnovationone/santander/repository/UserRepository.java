package edu.digitalinnovationone.santander.repository;

import edu.digitalinnovationone.santander.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


    boolean existsByAccountNumber(String accountNumber);
}
