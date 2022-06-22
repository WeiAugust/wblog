package group.rookie.service.impl;

import group.rookie.dao.ArticleRepository;
import group.rookie.entity.Article;
import group.rookie.service.ArticleService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName ArticleServiceImpl
 * @Description TODO
 * @Author wzg
 * @Date 2022/5/18 21:13
 * @Version 1.0
 **/

@DubboService
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;
    @Override
    public Article getArticleById(long articleId) {
        return articleRepository.findById(articleId).orElse(Article.builder().build());
    }

    @Override
    public void saveArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public void updateArticle(Article article) {
        articleRepository.save(article);
    }
    @Override
    public void deleteArticleById(long articleId) {
        articleRepository.deleteById(articleId);
    }



}
