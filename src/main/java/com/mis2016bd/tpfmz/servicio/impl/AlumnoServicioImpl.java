/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis2016bd.tpfmz.servicio.impl;

import com.mis2016bd.tpfmz.modelo.Alumno;
import com.mis2016bd.tpfmz.repositorio.AlumnoRepositorio;
import com.mis2016bd.tpfmz.servicio.AlumnoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author malky
 */
@Service
public class AlumnoServicioImpl implements AlumnoServicio{

    @Autowired
    AlumnoRepositorio repo;
    
    @Override
    public List<Alumno> obtenerTodosLosAlumnos() {
       return repo.obtenerTodosLosAlumnos();
    }
    
}
