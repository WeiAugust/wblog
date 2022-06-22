package group.rookie.wblogweb.controller;

import group.rookie.api.entity.Article;
import group.rookie.api.service.ArticleService;
import group.rookie.wblogweb.vo.ArticleRequest;
import group.rookie.wblogweb.vo.ResultVo;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * @ClassName ArticleController
 * @Description TODO
 * @Author wzg
 * @Date 2022/6/22 14:24
 * @Version 1.0
 **/

@RestControllerAdvice
public class ArticleController {

    @DubboReference
    private ArticleService articleService;

    public ResultVo getArticles(@RequestBody ArticleRequest articleRequest) {
        List<Article> articleList = articleService.getArticlesByPage(articleRequest.getPageNo(), articleRequest.getPageSize());
        return ResultVo.SuccessResultVo(articleList);
    }
}
