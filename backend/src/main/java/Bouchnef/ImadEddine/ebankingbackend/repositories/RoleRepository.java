package Bouchnef.ImadEddine.ebankingbackend.repositories;

import Bouchnef.ImadEddine.ebankingbackend.entities.ERole;
import Bouchnef.ImadEddine.ebankingbackend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
