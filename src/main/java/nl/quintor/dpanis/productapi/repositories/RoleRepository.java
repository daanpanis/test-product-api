package nl.quintor.dpanis.productapi.repositories;

import nl.quintor.dpanis.productapi.entities.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    @Query
    Role findByName(String name);

    @Query
    Collection<Role> defaultRoleTrue();

}
