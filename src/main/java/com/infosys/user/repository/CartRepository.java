package com.infosys.user.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.user.entity.Buyer;
import com.infosys.user.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, String> {

	Optional<Cart> findByBuyeridAndProdid(String buyerid, String prodid);

	List<Cart> findAllByBuyerid(String buyerid);

}
