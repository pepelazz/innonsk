package controllers;

import play.*;
import play.db.jpa.JPA;
import play.libs.Codec;
import play.mvc.*;

import java.util.*;

import models.*;

import javax.persistence.TypedQuery;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void article(Long id) {
        Article article = Article.findById(id);
        render();
    }

}