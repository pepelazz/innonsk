package models;

import play.db.jpa.GenericModel;

import javax.persistence.*;

@Entity
public class Company extends GenericModel {
    @Id
    @SequenceGenerator(name = "article_seq", sequenceName = "article_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_seq")
    public long id;

    public String name;
    public String companyName;
    public String industry;
    public String industryTag;

}
