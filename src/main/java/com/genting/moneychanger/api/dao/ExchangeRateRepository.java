package com.genting.moneychanger.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.genting.moneychanger.api.model.ExchangeRate;

@Component
public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, String> {
}