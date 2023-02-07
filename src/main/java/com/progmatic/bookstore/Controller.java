package com.progmatic.bookstore;

import com.progmatic.bookstore.model.Book;
import com.progmatic.bookstore.model.Author;
import com.progmatic.bookstore.model.Store;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Controller implements AutoCloseable {

    private HibernateContext model = new HibernateContext();

    public void initBooksStoresAuthors (){
        Session s = model.getSession();
        Transaction tx = s.beginTransaction();

        try {

            Book b1 = new Book();
            b1.setIsbn("ISBN123456");
            b1.setAuthor("Robin Cook");
            b1.setTitle("Genezis");
            s.persist(b1);

            Book b2 = new Book();
            b2.setIsbn("ISBN234567");
            b2.setAuthor("Ken Kesey");
            b2.setTitle("Száll a kakukk a fészkére");
            s.persist(b2);

            Book b3 = new Book();
            b3.setIsbn("ISBN345678");
            b3.setAuthor("Jack Kerouac");
            b3.setTitle("Úton");
            s.persist(b3);

            Author a1 = new Author();
            a1.setAuthorName("Robin Cook");
            s.persist(a1);

            Author a2 = new Author();
            a2.setAuthorName("Ken Kesey");
            s.persist(a2);

            Author a3 = new Author();
            a3.setAuthorName("Jack Kerouac");
            s.persist(a3);

            Store s1 = new Store();
            s1.setStoreName("Libri");
            s.persist(s1);

            Store s2 = new Store();
            s2.setStoreName("Alexandra");
            s.persist(s2);

            tx.commit();
        } catch (Exception e) {
            System.out.println(e);
            tx.rollback();
        }

    }

    public void addBook(String isbn, String author, String title) {

        Book b1 = new Book();
        

        Session session = model.getSession();

        Transaction tx = session.beginTransaction();

        session.persist(b1);

        session.flush();

        session.getTransaction().commit();
    }


    @Override
    public void close() throws Exception {

    }
}
