package services;

import dominio.Celular;

import java.util.List;

public interface CelularService {
        List<Celular> findAll();
        Celular findById(Integer id);
        Celular create(Celular celular);
        Celular update(Integer Id,Celular celular);
        void delete(Integer Id);
}
