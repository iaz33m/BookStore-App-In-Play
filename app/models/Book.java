package models;

import java.util.HashSet;
import java.util.Set;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;

/**
 * Created by azeem on 4/30/2017.
 */

@Entity
public class Book extends Model{

    @Id
    @Constraints.Required
    public Integer id;
    @Constraints.MaxLength(255)
    @Constraints.MinLength(5)
    @Constraints.Required
    public String title;
    @Constraints.Required
    @Constraints.Min(5)
    @Constraints.Max(100)
    public Integer price;
    @Constraints.Required
    public String author;

    public static Finder<Integer,Book> find = new Finder<>(Book.class);
}
