package co.com.farmatech.metrofarm.dao.changeregister;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import co.com.farmatech.metrofarm.mapper.ChangeRegisterMapper;
import co.com.farmatech.metrofarm.properties.AccessMetroFarmProperties;
import co.jankins.psf.common.exception.JankinsMarshallException;

import com.co.farmatech.metrofarm.dto.DtoEquipo;
import com.co.farmatech.metrofarm.dto.DtoRegistroCambios;

public class ChangeRegisterDaoImpl implements ChangeRegisterDaoService{

	private Properties sqlProperties = AccessMetroFarmProperties.getInstance().getSQLProperties();
	ChangeRegisterMapper mapper=new ChangeRegisterMapper();
	
	@Override
	public DtoRegistroCambios findChangeRegister(DtoRegistroCambios registroCambio,
			Connection con) {
		// TODO Auto-generated method stub
		PreparedStatement p = null;
		ResultSet r;
		
		String querySql=sqlProperties.getProperty("changeRegister.find");
		
		try {
			p = con.prepareStatement(querySql);
			p.setString(1,registroCambio.getCodigo());
			r = p.executeQuery();
			return mapper.findChangeRegister(r);
		} catch (SQLException e) {
			throw new JankinsMarshallException(e);
		}finally{
			try {
				p.close();
				if(!con.isClosed()){
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	@Override
	public DtoRegistroCambios createChangeRegister(
			DtoRegistroCambios registroCambio, Connection con) {
		// TODO Auto-generated method stub
		PreparedStatement p = null;
		ResultSet r;
		String querySql=sqlProperties.getProperty("changeRegister.save");
		try {
			p = con.prepareStatement(querySql);
			p.setString(1,registroCambio.getEquipoRegistro().getCodigoInv());
			p.setString(2,registroCambio.getAplicado());
			p.setString(3,registroCambio.getCual());
			p.setString(4,registroCambio.getSolicitado());
			p.setString(5,registroCambio.getArea());
			p.setString(6,registroCambio.getPrioridad());
			p.setString(7,registroCambio.getTipodoc());
			p.setString(8,registroCambio.getOtro());
			p.setString(9,registroCambio.getSituactual());
			p.setString(10,registroCambio.getSitupropuesta());
			p.setString(11,registroCambio.getRazoncambio());
			p.setString(12,registroCambio.getClasifcambio());
			p.setString(13,registroCambio.getTipocambio());
			p.setString(14,registroCambio.getLote());
			p.setString(15,registroCambio.getOp());
			p.setString(16,registroCambio.getTamno());
			p.setString(17,registroCambio.getJustificacion());
			p.setString(18,registroCambio.getCodigo());
			int rowAfect = p.executeUpdate();
			if(rowAfect>0){
				return registroCambio;
			}else{
				throw new JankinsMarshallException("No se pudo crear el registro de cambios");
			}
		} catch (SQLException e) {
			throw new JankinsMarshallException(e);
		}finally{
			try {
				p.close();
				if(!con.isClosed()){
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	@Override
	public ArrayList<DtoRegistroCambios> listChangeRegister(
			DtoRegistroCambios registroCambio, Connection con) {
		// TODO Auto-generated method stub
		PreparedStatement p = null;
		ResultSet r;
		
		String querySql=sqlProperties.getProperty("changeRegister.list");
		
		try {
			p = con.prepareStatement(querySql);
			r = p.executeQuery();
			return mapper.listChangeRegister(r);
		} catch (SQLException e) {
			throw new JankinsMarshallException(e);
		}finally{
			try {
				p.close();
				if(!con.isClosed()){
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}