package org.example.repository;
import org.example.connection.SessionFactorySingleton;
import org.example.model.Film;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class FilmRepositoryImpl {




    public Film save(Film film) {
        Session session = getInstance ().openSession ();
        session.beginTransaction ();
        Film merge = session.merge ( film );
        session.close ();
        return merge;
    }

    public void update(Film film){
        Session session = getInstance ().openSession ();
        Transaction transaction = session.beginTransaction ();
        session.merge ( film );
        transaction.commit ();
        session.close ();
    }

    public Film findById(Integer id){
        Session session = getInstance ().openSession ();
        //        session.close ();
        return session.find ( Film.class, id );
    }


    public void delete(Film film){
        Session session = getInstance ().openSession ();
        Transaction transaction = session.beginTransaction ();
        session.remove ( film );
        transaction.commit ();
        session.close ();
    }

    public SessionFactory getInstance(){
        return SessionFactorySingleton.getInstance ();
    }


//    public Film findByName(String title) {
//        Session session = getInstance ().openSession ();
//        var q= session.createQuery ( "FROM Film as f WHERE f.title =: title" ,Film.class );
//        q.setParameter ("title", title);
//        return q.uniqueResult ();
//
//    }

//    public List<Film> findAll(){
//        //hql todo for next
//
//        Session session = getInstance ().openSession ();
//        session.close ();
//        return film;
//    }




}
