package controllers;

import models.Article;
import models.Company;
import play.*;
import play.db.jpa.JPA;
import play.exceptions.TemplateNotFoundException;
import play.mvc.*;

import javax.persistence.TypedQuery;
import java.util.List;

public class Application extends Controller {

    public static void index() {
        List<Company> companies = Company.findAll();
        render(companies);
    }

    public static void company (String name) {
        final TypedQuery<Company> q = JPA.em().createQuery(
                "SELECT c FROM Company c WHERE c.name = :name",
                Company.class);
        q.setParameter("name", name);
        Company company = q.getSingleResult();
        render(company);
    }

    public static void companies (String name) {
        List<Company> companies = Company.findAll();
        render(companies);
    }

    public static void articles (String name) {
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


}