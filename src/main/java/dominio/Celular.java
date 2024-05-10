package dominio;

import net.bytebuddy.description.modifier.ParameterManifestation;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity (name = "celular")
public class Celular implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String marca;
    private Integer ram;
    private Integer armazenamento;

    public Celular(){

    }

    public Celular(Integer id, String marca, Integer ram, Integer armazenamento) {
        this.id = id;
        this.marca = marca;
        this.ram = ram;
        this.armazenamento = armazenamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(Integer armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", ram=" + ram +
                ", armazenamento=" + armazenamento +
                '}';
    }
}
