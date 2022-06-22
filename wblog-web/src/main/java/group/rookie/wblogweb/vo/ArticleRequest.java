package group.rookie.wblogweb.vo;

import lombok.Data;

/**
 * @ClassName ArticleRequest
 * @Description TODO
 * @Author wzg
 * @Date 2022/6/22 16:51
 * @Version 1.0
 **/

@Data
public class ArticleRequest {

    private int pageNo;
    private int pageSize;
    private int category;
    private int tag;
}
