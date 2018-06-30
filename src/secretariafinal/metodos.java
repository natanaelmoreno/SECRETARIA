/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretariafinal;

import secretariafinal.conexion;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author NATANAEL MORENO
 */
public class metodos {

    conexion cn = new conexion();

    public void insertarAlumno(String carne, String name, String direccio, int telefon, String lutra, int tetra) {
        cn.UID("INSERT INTO datosalumno(carnet,nombre,direccion,telefono,lugartrabajo,numtrabajo) VALUES('" + carne + "','" + name + "','" + direccio + "','" + telefon + "','" + lutra + "','" + tetra + "')");
    }

    public void insertarCarrera(String carrera, int descripcion, int plan) {
        cn.UID("INSERT INTO carrera(codcarrera,descarrera,planestudios) VALUES ('" + carrera + "','" + descripcion + "','" + plan + "')");
    }

    public void insertarTema(int codtema, String temaa, Date realizacion) {
        cn.UID("INSERT INTO procesogrado(idtema,tema,tiempoderealizacion) VALUES ('" + codtema + "','" + temaa + "','" + realizacion + "')");
    }

    public void insertarInscripcion(int codinscripcion, int anio, int ciclo, String unidadvalorativa, int ingreso, int egreso, String nombre, String director, String codcarrera, String tema, String fechainicio, String fechafinal, int iddocente, int iddirector, String carnet) {
        cn.UID("INSERT INTO datosinscripcion(codinscripcion,anio,ciclo,unidadvalorativa,ingreso,egreso,nombrealumno,director,codcarrera,tema,fechainicio,fechafinal,iddocente,iddirector,carnet) VALUES ('" + codinscripcion + "','" + anio + "','" + ciclo + "','" + unidadvalorativa + "','" + ingreso + "','" + egreso + "','" + nombre + "','" + director + "','" + codcarrera + "','" + tema + "','" + fechainicio + "','" + fechafinal + "','" + iddocente + "','" + iddirector + "','" + carnet + "')");
    }

    public void insertarDocente(int codigo, String docente) {
        cn.UID("INSERT INTO docente(iddocente,docentedirector) VALUES ('" + codigo + "','" + docente + "')");
    }

    public void insertarGeneral(int codigo, String director) {
        cn.UID("INSERT INTO director(iddirector,directorgeneral) VALUES ('" + codigo + "','" + director + "')");
    }

    public ResultSet contarRegistros3() {
        return (cn.getValores("SELECT COUNT(iddirector) FROM director"));
    }

    public ResultSet mayorRegistro3() {
        return (cn.getValores("SELECT MAX(iddirector) FROM director"));
    }

    public ResultSet contarRegistros4() {
        return (cn.getValores("SELECT COUNT(iddocente) FROM docente"));
    }

    public ResultSet mayorRegistro4() {
        return (cn.getValores("SELECT MAX(iddocente) FROM docente"));
    }

    public ResultSet contarRegistros5() {
        return (cn.getValores("SELECT COUNT(codinscripcion) FROM datosinscripcion"));
    }

    public ResultSet mayorRegistro5() {
        return (cn.getValores("SELECT MAX(codinscripcion) FROM datosinscripcion"));
    }

    public ResultSet llenarAsesor() {
        return (cn.getValores("SELECT directorgeneral FROM director"));
    }

    public ResultSet llenarDirector() {
        return (cn.getValores("SELECT docentedirector FROM docente"));
    }

    public ResultSet llenarCarrera() {
        return (cn.getValores("SELECT descarrera FROM carrera"));
    }

    public ResultSet llenarTema() {
        return (cn.getValores("SELECT  DISTINCT tema FROM datosinscripcion"));
    }

    public ResultSet traerTema(String tema) {
        return (cn.getValores("SELECT carnet FROM datosinscripcion WHERE tema='" + tema + "'"));

    }

    public ResultSet traerNombre(String carnet) {
        return (cn.getValores("SELECT nombre FROM datosalumno WHERE carnet='" + carnet + "'"));

    }

    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT codarticulo,desarticulo,codmaterial,codmarca,codtalla,codpais,existencias FROM inventario"));
    }

    public ResultSet llenarTabla1() {
        return (cn.getValores("SELECT carnet,tema,fechainicio,fechafinal,iddirector FROM datosinscripcion"));
    }

    public ResultSet traerDatos(String tema) {
        return (cn.getValores("SELECT carnet,nombrealumno,tema,fechainicio,fechafinal,director FROM datosinscripcion WHERE tema='" + tema + "'"));

    }

    public void modificarasesor(int codigo, String asesor) {
        cn.UID("UPDATE docente SET docentedirector='" + asesor + "' WHERE iddocente=" + codigo);
    }

    public void modificargeneral(int codigo, String director) {
        cn.UID("UPDATE director SET directorgeneral='" + director + "' WHERE iddirector=" + codigo);
    }

    public ResultSet buscarasesor(String codigo) {
        return (cn.getValores("SELECT * FROM docente WHERE iddocente='" + codigo + "'"));
    }

    public ResultSet buscargeneral(String codigo) {
        return (cn.getValores("SELECT * FROM director WHERE iddirector='" + codigo + "'"));
    }

    public void eliminarasesor(String codigo) {
        cn.UID("DELETE FROM  docente WHERE iddocente='" + codigo + "'");
    }

    public void eliminargeneral(String codigo) {
        cn.UID("DELETE FROM  director WHERE iddirector='" + codigo + "'");
    }

    public ResultSet traerciclo(String tema) {
        return (cn.getValores("SELECT ciclo,anio FROM datosinscripcion WHERE tema='" + tema + "'"));

    }

    public ResultSet traerCarrera(String tema) {
        return (cn.getValores("SELECT codcarrera FROM datosinscripcion WHERE tema='" + tema + "'"));

    }

    public ResultSet traercoordinador(String tema) {
        return (cn.getValores("SELECT iddirector FROM datosinscripcion WHERE tema='" + tema + "'"));

    }

    public ResultSet traernombreC(String id) {
        return (cn.getValores("SELECT directorgeneral FROM director WHERE iddirector='" + id + "'"));

    }

    public ResultSet traercodigo(String carrera) {
        return (cn.getValores("SELECT codcarrera FROM  carrera WHERE descarrera='" + carrera + "'"));

    }

    public ResultSet traerplan(String plan) {
        return (cn.getValores("SELECT planestudios FROM  carrera WHERE descarrera='" + plan + "'"));

    }

}
