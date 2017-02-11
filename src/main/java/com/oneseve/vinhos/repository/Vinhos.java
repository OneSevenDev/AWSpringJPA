package com.oneseve.vinhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneseve.vinhos.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long> {

}
