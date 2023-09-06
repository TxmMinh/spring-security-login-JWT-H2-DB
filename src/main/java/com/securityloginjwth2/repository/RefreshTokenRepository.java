package com.securityloginjwth2.repository;

import java.util.Optional;

import com.securityloginjwth2.entity.RefreshToken;
import com.securityloginjwth2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String token);

    @Modifying
    int deleteByUser(User user);
}