package roem.example.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import roem.example.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
