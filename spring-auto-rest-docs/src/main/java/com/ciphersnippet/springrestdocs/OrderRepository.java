package com.ciphersnippet.springrestdocs;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
