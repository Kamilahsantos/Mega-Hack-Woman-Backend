package com.megahack.apoiame.repository;

import com.megahack.apoiame.model.Network;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkRepository extends JpaRepository<Network, Long> {
}
