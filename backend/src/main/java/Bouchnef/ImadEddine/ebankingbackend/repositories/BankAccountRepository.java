package Bouchnef.ImadEddine.ebankingbackend.repositories;

import Bouchnef.ImadEddine.ebankingbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
