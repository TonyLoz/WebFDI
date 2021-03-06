/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santander.fdi.service;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santander.commons.exceptions.DAOException;
import com.santander.commons.exceptions.ServiceException;
import com.santander.fdi.bean.UsuarioBean;
import com.santander.fdi.dao.UsuarioDao;

/**
 *
 * @version 0.0.1 01/06/2016
 * @author OMartinez
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

	private static Logger log = Logger.getLogger(UsuarioServiceImpl.class);

	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public UsuarioBean getUsuario(String email) throws ServiceException{
		
		UsuarioBean usr1 = null;
		try {
			usr1  = usuarioDao.getUsuario(email);
			
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage());
			throw new ServiceException(e.getMessage());
		}
		return usr1;
		
	}
	
	
	
}
