package userbank.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import userbank.demo.model.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
}
