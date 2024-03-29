package org.example;
import org.example.model.Film;
import org.example.repository.FilmRepositoryImpl;
import org.example.service.FilmServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class Main {


    public static void main(String[] args) {

        FilmServiceImpl filmService = new FilmServiceImpl();

        FilmRepositoryImpl filmRepository = new FilmRepositoryImpl ();

        Film film = new Film(5,"movie","conjuring2",1D,"Persian",2,"Film");




//        todo => for saving film object
//        filmService.save ( film );

//        todo =>to find film by id
//        System.out.println ( filmService.findById ( 2 ));

//        todo => update film object in db
//        filmService.update ( film );








    }

}
