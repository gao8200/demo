package referesh.test.demo.dao;
 

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import referesh.test.demo.bo.Person;


@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends MongoRepository<Person, String> { 

} 