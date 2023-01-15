package services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import models.UsuarioModel;
import repositories.UsuarioRepository;


@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuariorepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){

        return ArrayList<UsuarioModel> usuariorepository.findAll();

    }
    public void grabarUsuario(UsuarioModel usuario){
        usuariorepository.save(usuario);
        
    }
}
