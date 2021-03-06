package com.infosys.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infosys.user.entity.Cart;
import com.infosys.user.entity.Wishlist;

@Repository
@Transactional
public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {

	Optional<Wishlist> findByBuyeridAndProdid(String buyerid, String prodid);
	void deleteByBuyeridAndProdid(String buyerid, String prodid);
}
