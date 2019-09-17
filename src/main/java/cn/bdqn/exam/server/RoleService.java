package cn.bdqn.exam.server;

import cn.bdqn.exam.entity.Role;

import java.util.List;

/**
 * 角色管理
 */
public interface RoleService {
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
    int delByRoleId( int rid);

    /**
     * 根据Id进行角色管理修改操作
     * @param rname
     * @return
     */
    int updByRoleName(String rname);
}
