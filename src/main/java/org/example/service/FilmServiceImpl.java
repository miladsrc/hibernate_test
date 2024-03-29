package org.example.service;

import org.example.model.Film;
import org.example.repository.FilmRepositoryImpl;

public class FilmServiceImpl {
    FilmRepositoryImpl filmRepository = new FilmRepositoryImpl ();


    public Film save(Film film) {
        return filmRepository.save ( film );
    }

    public Film findById(Integer id) {
        return filmRepository.findById ( id );
    }

    public void removeById(Integer id) {

        Film film = new Film ( id );
        filmRepository.delete ( film );
    }

    public void update(Film film) {
//        Film byId = findById ( film.getId () );
        filmRepository.update ( film );
    }
}
