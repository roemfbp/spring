package roem.example.spring5webapp.repositories;


import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import roem.example.spring5webapp.model.Author;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
