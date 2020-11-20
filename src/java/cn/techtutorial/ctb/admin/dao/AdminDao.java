
package cn.techtutorial.ctb.admin.dao;
import cn.techtutorial.ctb.admin.model.Admin;
import cn.techtutorial.ctb.admin.services.AdminService;
import java.sql.*;
public class AdminDao implements AdminService{
    private final Connection con;
    private String query;
    private PreparedStatement pst;
    private ResultSet rs;

    public AdminDao(Connection con) {
        this.con = con;
    }
    
    @Override
    public Admin logAdmin(String email, String password){
        Admin admin =  null;
        try{
        query = "select * from admin where email=? and password=?";
        pst=  this.con.prepareStatement(query);
        pst.setString(1, email);
        pst.setString(2, password);
        rs = pst.executeQuery();
        if(rs.next()){
            admin = new Admin();
            admin.setId(rs.getInt("id"));
            admin.setName(rs.getString("name"));
            admin.setEmail(rs.getString("email"));
            admin.setDob(rs.getString("dob"));
            admin.setRole(rs.getString("role"));
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return admin;
    }
}
