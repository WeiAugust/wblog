package group.rookie.service;

import group.rookie.entity.Article;

/**
 * @ClassName ArticleService
 * @Description TODO
 * @Author wzg
 * @Date 2022/5/18 21:12
 * @Version 1.0
 **/
public interface ArticleService {

    Article getArticleById(long articleId);

    void saveArticle(Article article);

    void updateArticle(Article article);

    void deleteArticleById(long articleId);
}
