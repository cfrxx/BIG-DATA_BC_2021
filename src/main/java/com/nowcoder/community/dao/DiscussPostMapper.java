package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    //查询帖子列表
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);
    //查询帖子行数
    //@Param用于给参数加别名
    //如果只有一个参数，并且在动态SQL<if>里使用，则必须加别名
    int selectDiscussPostsRows(@Param("userId") int userId);

}
