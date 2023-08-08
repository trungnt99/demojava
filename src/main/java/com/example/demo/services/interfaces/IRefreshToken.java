package com.example.demo.services.interfaces;

import com.example.demo.entities.RefreshToken;

import java.util.Optional;

public interface IRefreshToken {
    public Optional<RefreshToken> findByToken(String token);
    public RefreshToken createRefreshToken(Long userId);
    public RefreshToken verifyExpiration(RefreshToken token);
    public int deleteByUserId(Long userId);
}
