package group.rookie.dao;

import group.rookie.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @ClassName MongoDao
 * @Description TODO
 * @Author wzg
 * @Date 2022/5/18 21:07
 * @Version 1.0
 **/

@Repository
public interface ArticleRepository extends MongoRepository<Article, Long> {

}
