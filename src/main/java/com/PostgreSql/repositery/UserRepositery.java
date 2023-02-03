package com.PostgreSql.repositery;
import com.PostgreSql.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepositery extends JpaRepository<User,String> {
}
