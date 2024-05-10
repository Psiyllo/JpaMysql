package services;
import Dao.CelularDao;
import dominio.Celular;
import java.util.List;
public class CelularServiceIMPL implements  CelularService{
    CelularDao dao = new CelularDao();

    @Override
    public Celular create(Celular celular) {
        return dao.create(celular);
    }

    @Override
    public List<Celular> findAll() {
        return dao.listAll();
    }

    @Override
    public Celular findById(Integer id) {
        return null;
    }

    @Override
    public Celular update(Integer Id, Celular celular) {
        return null;
    }

    @Override
    public void delete(Integer Id) {

    }
}
