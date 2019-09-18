package cn.bdqn.exam.dao;

import cn.bdqn.exam.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 角色管理
 */
@MapperScan
@Repository
public interface roleMapper {
    /**
     * 角色管理查询
     * @return
     */
    List<Role> finaByRole();

    /**
     * 根据id进行角色管理删除操作
     * @param rid
     * @return
     */
    int delByRoleId(@Param("rid") int rid);

    /**
     * 根据Id进行角色管理修改操作
     * @param rname
     * @return
     */
    int updByRoleName(@Param("rname")String rname);
}
