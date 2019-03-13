package ir.ssatari.taskthree.dal.repository;

import ir.ssatari.taskthree.dal.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}