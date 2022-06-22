package group.rookie.api.service;

import group.rookie.api.entity.Article;

import java.util.Collection;
import java.util.List;

/**
 * @ClassName ArticleService
 * @Description TODO
 * @Author wzg
 * @Date 2022/5/18 21:12
 * @Version 1.0
 **/
public interface ArticleService {

    Article getArticleById(int articleId);

    void saveArticle(Article article);

    void updateArticle(Article article);

    void deleteArticleById(int articleId);

    List<Article> getArticlesByPage(int pageNo, int pageSize);

    List<Article> getArticlesByIds(Collection<Integer> articleIds, int pageNo, int pageSize);
}
