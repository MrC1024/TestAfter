package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.roleMapper;
import cn.bdqn.exam.entity.Role;
import cn.bdqn.exam.server.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("RoleSerivce")
public class RoleSerivceImpl implements RoleService {

    @Autowired
    roleMapper roleMapper;
    /**
     * 查询全部
     * @return
     */
    public List<Role> finaByRole() {
        return roleMapper.finaByRole();
    }

    /**
     * 根据id操作删除角色
     * @param rid
     * @return
     */
    public int delByRoleId(int rid) {
        return roleMapper.delByRoleId(rid);
    }

    /**
     * 根据id进行操作更改角色
     * @param rname
     * @return
     */
    public int updByRoleName(String rname) {
        return roleMapper.updByRoleName(rname);
    }
}
