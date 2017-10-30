package com.yuepai.api.dao;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.yuepai.api.model.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    PageList<SysUser> querySysUserByEntity(SysUser sysUser, PageBounds pageBounds);
}