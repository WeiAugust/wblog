package group.rookie.api.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @ClassName Article
 * @Description TODO
 * @Author wzg
 * @Date 2022/5/18 21:11
 * @Version 1.0
 **/
@Builder
@Data
public class Article {

    private long articleId;

    private String articleTitle;

    private String articleSubTitle;

    private String articleAbstract;

    private int authorId;

    private List<Integer> tags;

    private int category;
}
