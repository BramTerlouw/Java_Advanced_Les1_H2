package nl.inholland.INF2aLes1H2.repository;

import nl.inholland.INF2aLes1H2.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
