package cn.bdqn.exam.server;


import cn.bdqn.exam.entity.testpaper;
import cn.bdqn.exam.entity.testpaperstep;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestPaperService {

    List<testpaper> getAll1();

    int testAdd(testpaper test);

    List<testpaperstep> getStepAll();

    int testDel(@Param("tid") int tid);

    testpaper testUpdId(@Param("tid") Integer tid);

    int testUpd(testpaper test);

    List<testpaper> mohucha(@Param("tName") String tName);


}
