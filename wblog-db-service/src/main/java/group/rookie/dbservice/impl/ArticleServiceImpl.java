package group.rookie.dbservice.impl;

import group.rookie.api.service.ArticleService;
import group.rookie.dbservice.dao.ArticleMapper;
import group.rookie.api.entity.Article;
import group.rookie.dbservice.entity.ArticleExample;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;

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
    private ArticleMapper articleMapper;

    @Override
    public Article getArticleById(int articleId) {
        return articleMapper.selectByPrimaryKey(articleId);
    }

    @Override
    public void saveArticle(Article article) {
        articleMapper.insert(article);
    }

    @Override
    public void updateArticle(Article article) {
        articleMapper.updateByPrimaryKey(article);
    }

    @Override
    public void deleteArticleById(int articleId) {
        articleMapper.deleteByPrimaryKey(articleId);
    }

    @Override
    public List<Article> getArticlesByPage(int pageNo, int pageSize) {
        ArticleExample example = new ArticleExample();
        example.setOrderByClause("create_time");
        int offset = (pageNo - 1) * pageSize;
        int limit = pageSize;
        RowBounds rowBounds = new RowBounds(offset, limit);
        return articleMapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    @Override
    public List<Article> getArticlesByIds(Collection<Integer> articleIds, int pageNo, int pageSize) {
        return null;
    }
}
