package com.yuepai.api.util;

import javax.servlet.http.HttpServletRequest;

import com.yuepai.api.constant.Constant;
import com.yuepai.api.model.SysUser;

public class LoginUserUtil {

    public static SysUser getLoginUser(HttpServletRequest request) {
        Object logins = request.getSession().getAttribute(Constant.LOGIN_USER_SESSION_KEY);
        if (logins == null) {
            return null;
        }
        return (SysUser) logins;
    }

}
