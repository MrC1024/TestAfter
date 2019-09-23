package cn.bdqn.exam.server;


import cn.bdqn.exam.entity.testpaper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestPagesService {

    List<testpaper> getPages(@Param("num1") Integer num1, @Param("num2") Integer num2);

    int counts();   //获取总条数
}
