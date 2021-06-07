package kr.co.directdeal.saleservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.directdeal.saleservice.domain.FavoriteItem;

@Repository
public interface FavoriteItemRepository extends JpaRepository<FavoriteItem, String> {
    public Optional<FavoriteItem> findByUserIdAndItemId(String userId, String itemId);
    public List<FavoriteItem> findAllByUserId(String userId);
    public void deleteByUserIdAndItemId(String userId, String itemId);
}
