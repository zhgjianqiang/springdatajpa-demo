package com.fybdp.jpademo.repository;

import com.fybdp.jpademo.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface UserRepository extends JpaRepository<User, String>, JpaSpecificationExecutor<User> {

    List<User> findByStatusIsFalse();

    List<User> findByNameLike(String nameLike);

    List<User> findByNameLikeAndStatusIsFalse(String nameLike);

    List<User> findByAddressInfoIs(String info);

    @Query(value = "select u.name, u.status from users u", nativeQuery = true)
    List<Map<String, Object>> getQuery();
}
