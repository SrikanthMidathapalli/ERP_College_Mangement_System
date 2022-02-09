package com.erp.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.entity.AdminLogin;
import com.erp.entity.FacultyData;
import com.erp.entity.StudentData;

@Repository
public interface AdminDAOInterface extends JpaRepository<AdminLogin, String>{

    @Query("from  AdminLogin a where a.email=:em and a.password=:pw") 
	public AdminLogin logindao(@Param("em") String tmp_EmailId,@Param("pw") String tmp_Pass);



}
