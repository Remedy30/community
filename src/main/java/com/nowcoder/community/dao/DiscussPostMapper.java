package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.catalina.LifecycleState;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);


    //  @paran注解用于参数取别名
    //  若果只有一个参数，并且再<if>里使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
