package ug.co.mtn.demoap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ug.co.mtn.demoap.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
