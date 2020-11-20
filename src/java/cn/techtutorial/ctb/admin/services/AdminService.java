
package cn.techtutorial.ctb.admin.services;

import cn.techtutorial.ctb.admin.model.Admin;


public interface AdminService {
    public Admin logAdmin(String email, String password);
}
