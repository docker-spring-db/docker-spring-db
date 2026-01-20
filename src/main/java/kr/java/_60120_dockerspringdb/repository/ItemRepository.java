package kr.java._60120_dockerspringdb.repository;

import kr.java._60120_dockerspringdb.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
