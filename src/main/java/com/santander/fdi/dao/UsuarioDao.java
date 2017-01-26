package com.santander.fdi.dao;



import java.util.List;

import com.santander.commons.exceptions.DAOException;
import com.santander.fdi.bean.UsuarioBean;

public interface UsuarioDao {
	
	public UsuarioBean getUsuario(String mail) throws DAOException;
	
}
