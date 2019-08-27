package roem.example.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import roem.example.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
