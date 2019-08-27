package roem.example.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import roem.example.spring5webapp.model.Author;
import roem.example.spring5webapp.model.Book;
import roem.example.spring5webapp.model.Publisher;
import roem.example.spring5webapp.repositories.AuthorRepository;
import roem.example.spring5webapp.repositories.BookRepository;
import roem.example.spring5webapp.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;


    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        //Publisher 1
        Publisher hc = new Publisher("Harper Collins", "Chelsea W1");
        publisherRepository.save(hc);
        //Eric
        Author eric =new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123", hc);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        Author marvin =new Author("Marvin", "Gaye");

        marvin.getBooks().add(ddd);

        ddd.getAuthors().add(marvin);

        authorRepository.save(eric);
        authorRepository.save(marvin);
        bookRepository.save(ddd);



        //Publisher 2
        Publisher mack = new Publisher("mack", "east end");
        publisherRepository.save(mack);
        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", mack);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

    }
}
