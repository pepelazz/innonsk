package models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Article extends GenericModel {
    @Id
    @SequenceGenerator(name = "article_seq", sequenceName = "article_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_seq")
    public long id;

    public String name;
    public String title;
    public String author;
    public String annotation;
    public String image;
    public String type;

//    @ElementCollection
//    public List<String> companies;

}
