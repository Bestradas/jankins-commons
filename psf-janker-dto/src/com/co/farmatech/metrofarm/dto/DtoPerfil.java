package com.co.farmatech.metrofarm.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Perfil")
public class DtoPerfil {

    String Perfil;
    Long Codperfil,Estado;
    boolean GuardarUsuariao, BuscarUsuario, ModificarUsuario, EliminarUsuario, GuardarPerfil, BuscarPerfil, ModificarPerfil, EliminarPerfil,
            GuardarEquipo,BuscarEquipo,ModificarEquipo,EliminarEquipo,NotificaEquipos,
            GuardarMantenimiento,BuscarMantenimiento,ModificarMantenimiento,EliminarMantenimiento,Notificaciones_mant_mes,Notificaciones_man_ven_mes,
            GuardarCalificacion,BuscarCalificacion,ModificarCalificacion,EliminarCalificacion,Notificaciones_calif_mes,Notificaciones_calif_ven_mes,
            GuardarCalibracion,BuscarCalibracion,ModificarCalibracion,EliminarCalibracion,Notificaciones_calib_mes,Notificaciones_calib_ven,
            GuardarMantGen,BuscarMantGen,ModificarMantGen,EliminarMantGen,NotificacionesMantgenmes,NotificacionesMantgenvenc;

    public Long getCodperfil() {
        return Codperfil;
    }
    @XmlElement(name="CodigoPerfil")
    public void setCodperfil(Long Codperfil) {
        this.Codperfil = Codperfil;
    }

    public String getPerfil() {
        return Perfil;
    }
    @XmlElement(name="NombrePerfil")
    public void setPerfil(String Perfil) {
        this.Perfil = Perfil;
    }

    public Long getEstado() {
        return Estado;
    }
    @XmlElement(name="IdEstado")
    public void setEstado(Long Estado) {
        this.Estado = Estado;
    }

    public boolean isGuardarUsuariao() {
        return GuardarUsuariao;
    }
    @XmlElement
    public void setGuardarUsuariao(boolean GuardarUsuariao) {
        this.GuardarUsuariao = GuardarUsuariao;
    }

    public boolean isBuscarUsuario() {
        return BuscarUsuario;
    }
    @XmlElement
    public void setBuscarUsuario(boolean BuscarUsuario) {
        this.BuscarUsuario = BuscarUsuario;
    }

    public boolean isModificarUsuario() {
        return ModificarUsuario;
    }
    @XmlElement
    public void setModificarUsuario(boolean ModificarUsuario) {
        this.ModificarUsuario = ModificarUsuario;
    }

    public boolean isEliminarUsuario() {
        return EliminarUsuario;
    }
    @XmlElement
    public void setEliminarUsuario(boolean EliminarUsuario) {
        this.EliminarUsuario = EliminarUsuario;
    }

    public boolean isGuardarPerfil() {
        return GuardarPerfil;
    }
    @XmlElement
    public void setGuardarPerfil(boolean GuardarPerfil) {
        this.GuardarPerfil = GuardarPerfil;
    }

    public boolean isBuscarPerfil() {
        return BuscarPerfil;
    }
    @XmlElement
    public void setBuscarPerfil(boolean BuscarPerfil) {
        this.BuscarPerfil = BuscarPerfil;
    }

    public boolean isModificarPerfil() {
        return ModificarPerfil;
    }
    @XmlElement
    public void setModificarPerfil(boolean ModificarPerfil) {
        this.ModificarPerfil = ModificarPerfil;
    }

    public boolean isEliminarPerfil() {
        return EliminarPerfil;
    }
    @XmlElement
    public void setEliminarPerfil(boolean EliminarPerfil) {
        this.EliminarPerfil = EliminarPerfil;
    }

    public boolean isGuardarEquipo() {
        return GuardarEquipo;
    }
    @XmlElement
    public void setGuardarEquipo(boolean GuardarEquipo) {
        this.GuardarEquipo = GuardarEquipo;
    }

    public boolean isBuscarEquipo() {
        return BuscarEquipo;
    }
    @XmlElement
    public void setBuscarEquipo(boolean BuscarEquipo) {
        this.BuscarEquipo = BuscarEquipo;
    }

    public boolean isModificarEquipo() {
        return ModificarEquipo;
    }
    @XmlElement
    public void setModificarEquipo(boolean ModificarEquipo) {
        this.ModificarEquipo = ModificarEquipo;
    }

    public boolean isEliminarEquipo() {
        return EliminarEquipo;
    }
    @XmlElement
    public void setEliminarEquipo(boolean EliminarEquipo) {
        this.EliminarEquipo = EliminarEquipo;
    }

    public boolean isNotificaEquipos() {
        return NotificaEquipos;
    }
    @XmlElement
    public void setNotificaEquipos(boolean NotificaEquipos) {
        this.NotificaEquipos = NotificaEquipos;
    }

    public boolean isGuardarMantenimiento() {
        return GuardarMantenimiento;
    }
    @XmlElement
    public void setGuardarMantenimiento(boolean GuardarMantenimiento) {
        this.GuardarMantenimiento = GuardarMantenimiento;
    }

    public boolean isBuscarMantenimiento() {
        return BuscarMantenimiento;
    }
    @XmlElement
    public void setBuscarMantenimiento(boolean BuscarMantenimiento) {
        this.BuscarMantenimiento = BuscarMantenimiento;
    }

    public boolean isModificarMantenimiento() {
        return ModificarMantenimiento;
    }
    @XmlElement
    public void setModificarMantenimiento(boolean ModificarMantenimiento) {
        this.ModificarMantenimiento = ModificarMantenimiento;
    }

    public boolean isEliminarMantenimiento() {
        return EliminarMantenimiento;
    }
    @XmlElement
    public void setEliminarMantenimiento(boolean EliminarMantenimiento) {
        this.EliminarMantenimiento = EliminarMantenimiento;
    }

    public boolean isNotificaciones_mant_mes() {
        return Notificaciones_mant_mes;
    }
    @XmlElement
    public void setNotificaciones_mant_mes(boolean Notificaciones_mant_mes) {
        this.Notificaciones_mant_mes = Notificaciones_mant_mes;
    }

    public boolean isNotificaciones_man_ven_mes() {
        return Notificaciones_man_ven_mes;
    }
    @XmlElement
    public void setNotificaciones_man_ven_mes(boolean Notificaciones_man_ven_mes) {
        this.Notificaciones_man_ven_mes = Notificaciones_man_ven_mes;
    }

    public boolean isGuardarCalificacion() {
        return GuardarCalificacion;
    }
    @XmlElement
    public void setGuardarCalificacion(boolean GuardarCalificacion) {
        this.GuardarCalificacion = GuardarCalificacion;
    }

    public boolean isBuscarCalificacion() {
        return BuscarCalificacion;
    }
    @XmlElement
    public void setBuscarCalificacion(boolean BuscarCalificacion) {
        this.BuscarCalificacion = BuscarCalificacion;
    }

    public boolean isModificarCalificacion() {
        return ModificarCalificacion;
    }
    @XmlElement
    public void setModificarCalificacion(boolean ModificarCalificacion) {
        this.ModificarCalificacion = ModificarCalificacion;
    }

    public boolean isEliminarCalificacion() {
        return EliminarCalificacion;
    }
    @XmlElement
    public void setEliminarCalificacion(boolean EliminarCalificacion) {
        this.EliminarCalificacion = EliminarCalificacion;
    }

    public boolean isNotificaciones_calif_mes() {
        return Notificaciones_calif_mes;
    }
    @XmlElement
    public void setNotificaciones_calif_mes(boolean Notificaciones_calif_mes) {
        this.Notificaciones_calif_mes = Notificaciones_calif_mes;
    }

    public boolean isNotificaciones_calif_ven_mes() {
        return Notificaciones_calif_ven_mes;
    }
    @XmlElement
    public void setNotificaciones_calif_ven_mes(boolean Notificaciones_calif_ven_mes) {
        this.Notificaciones_calif_ven_mes = Notificaciones_calif_ven_mes;
    }

    public boolean isGuardarCalibracion() {
        return GuardarCalibracion;
    }
    @XmlElement
    public void setGuardarCalibracion(boolean GuardarCalibracion) {
        this.GuardarCalibracion = GuardarCalibracion;
    }

    public boolean isBuscarCalibracion() {
        return BuscarCalibracion;
    }
    @XmlElement
    public void setBuscarCalibracion(boolean BuscarCalibracion) {
        this.BuscarCalibracion = BuscarCalibracion;
    }

    public boolean isModificarCalibracion() {
        return ModificarCalibracion;
    }
    @XmlElement
    public void setModificarCalibracion(boolean ModificarCalibracion) {
        this.ModificarCalibracion = ModificarCalibracion;
    }

    public boolean isEliminarCalibracion() {
        return EliminarCalibracion;
    }
    @XmlElement
    public void setEliminarCalibracion(boolean EliminarCalibracion) {
        this.EliminarCalibracion = EliminarCalibracion;
    }

    public boolean isNotificaciones_calib_mes() {
        return Notificaciones_calib_mes;
    }
    @XmlElement
    public void setNotificaciones_calib_mes(boolean Notificaciones_calib_mes) {
        this.Notificaciones_calib_mes = Notificaciones_calib_mes;
    }

    public boolean isNotificaciones_calib_ven() {
        return Notificaciones_calib_ven;
    }
    @XmlElement
    public void setNotificaciones_calib_ven(boolean Notificaciones_calib_ven) {
        this.Notificaciones_calib_ven = Notificaciones_calib_ven;
    }

    public boolean isGuardarMantGen() {
        return GuardarMantGen;
    }
    @XmlElement
    public void setGuardarMantGen(boolean GuardarMantGen) {
        this.GuardarMantGen = GuardarMantGen;
    }

    public boolean isBuscarMantGen() {
        return BuscarMantGen;
    }
    @XmlElement
    public void setBuscarMantGen(boolean BuscarMantGen) {
        this.BuscarMantGen = BuscarMantGen;
    }

    public boolean isModificarMantGen() {
        return ModificarMantGen;
    }
    @XmlElement
    public void setModificarMantGen(boolean ModificarMantGen) {
        this.ModificarMantGen = ModificarMantGen;
    }

    public boolean isEliminarMantGen() {
        return EliminarMantGen;
    }
    @XmlElement
    public void setEliminarMantGen(boolean EliminarMantGen) {
        this.EliminarMantGen = EliminarMantGen;
    }

    public boolean isNotificacionesMantgenmes() {
        return NotificacionesMantgenmes;
    }
    @XmlElement
    public void setNotificacionesMantgenmes(boolean NotificacionesMantgenmes) {
        this.NotificacionesMantgenmes = NotificacionesMantgenmes;
    }

    public boolean isNotificacionesMantgenvenc() {
        return NotificacionesMantgenvenc;
    }
    @XmlElement
    public void setNotificacionesMantgenvenc(boolean NotificacionesMantgenvenc) {
        this.NotificacionesMantgenvenc = NotificacionesMantgenvenc;
    }

	@Override
	public String toString() {
		return "DtoPerfil [Perfil=" + Perfil + ", Codperfil=" + Codperfil + ", Estado="
				+ Estado +", GuardarUsuariao=" + GuardarUsuariao + ", BuscarUsuario=" + BuscarUsuario + ", ModificarUsuario="
				+ ModificarUsuario + ", EliminarUsuario=" + EliminarUsuario + ", GuardarPerfil="+ GuardarPerfil +", BuscarPerfil=" 
				+ BuscarPerfil + ", ModificarPerfil=" + ModificarPerfil + ", EliminarPerfil=" + EliminarPerfil +", GuardarEquipo=" + GuardarEquipo
				+ ", BuscarEquipo=" + BuscarEquipo + ", ModificarEquipo="+ ModificarEquipo + ", EliminarEquipo=" + EliminarEquipo + ", NotificaEquipos="+ NotificaEquipos +", GuardarMantenimiento=" 
				+ GuardarMantenimiento + ", BuscarMantenimiento=" + BuscarMantenimiento + ", ModificarMantenimiento=" + ModificarMantenimiento +", EliminarMantenimiento=" + EliminarMantenimiento + ", Notificaciones_mant_mes=" + Notificaciones_mant_mes + ", Notificaciones_man_ven_mes="
				+ Notificaciones_man_ven_mes + ", GuardarCalificacion=" + GuardarCalificacion + ", BuscarCalificacion="+ BuscarCalificacion +", ModificarCalificacion=" 
				+ ModificarCalificacion + ", EliminarCalificacion=" + EliminarCalificacion + ", Notificaciones_calif_mes=" + Notificaciones_calif_mes +", Notificaciones_calif_ven_mes=" + Notificaciones_calif_ven_mes
				+ ", GuardarCalibracion=" + GuardarCalibracion + ", BuscarCalibracion="+ BuscarCalibracion + ", ModificarCalibracion=" + ModificarCalibracion + ", EliminarCalibracion="+ EliminarCalibracion +", Notificaciones_calib_mes=" 
				+ Notificaciones_calib_mes + ", Notificaciones_calib_ven=" + Notificaciones_calib_ven + ", GuardarMantGen="
				+ GuardarMantGen +", BuscarMantGen=" + BuscarMantGen + ", ModificarMantGen=" + ModificarMantGen + ", EliminarMantGen="
				+ EliminarMantGen + ", NotificacionesMantgenmes=" + NotificacionesMantgenmes + ", NotificacionesMantgenvenc="+ NotificacionesMantgenvenc  +"]";
	}
            
    
}
