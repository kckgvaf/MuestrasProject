package Models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Muestra")
public class Muestra {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idMuestra;

    @Column(unique = true, nullable = false)
    private String codMuestra;

    @Column(nullable = false)
    private String tipoMuestra;

    @Column(nullable = false)
    private String empresa;

    @Column(nullable = false)
    private Date fechaCrDate;

    public Muestra() {
    }

    public Muestra(String codMuestra, String tipoMuestra, String empresa) {
        this.codMuestra = codMuestra;
        this.tipoMuestra = tipoMuestra;
        this.empresa = empresa;
    }

    public void setIdMuestra(Long idMuestra) {
        this.idMuestra = idMuestra;
    }

    public void setCodMuestra(String codMuestra) {
        this.codMuestra = codMuestra;
    }

    public void setTipoMuestra(String tipoMuestra) {
        this.tipoMuestra = tipoMuestra;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setFechaCrDate(Date fechaCrDate) {
        this.fechaCrDate = fechaCrDate;
    }

    public Long getIdMuestra() {
        return idMuestra;
    }

    public String getCodMuestra() {
        return codMuestra;
    }

    public String getTipoMuestra() {
        return tipoMuestra;
    }

    public String getEmpresa() {
        return empresa;
    }

    public Date getFechaCrDate() {
        return fechaCrDate;
    }


}
