package controllers;

import models.Article;
import play.*;
import play.db.jpa.JPA;
import play.exceptions.TemplateNotFoundException;
import play.mvc.*;

import javax.persistence.TypedQuery;
import java.util.List;

public class Application extends Controller {

    public static void index() {
        List<Article> articles = Article.findAll();
        render(articles);
    }

    public static void article (String name) {
        final TypedQuery<Article> q = JPA.em().createQuery(
                "SELECT a FROM Article a WHERE a.name = :name",
                Article.class);
        q.setParameter("name", name);
        Article article = q.getSingleResult();
        render(article);
    }

//    public static void article (String name) {
//
//        System.out.println("name = " + name);
//
//        Logger.debug("Requested: '%s.html'", name);
//        try {
//            render("articles/" + name + ".html");
//        } catch (TemplateNotFoundException e) {
//            Logger.error("Missing file: '%s.html'", name);
//            notFound();
//        }
//    }

}