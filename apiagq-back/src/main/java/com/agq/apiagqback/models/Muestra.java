import java.util.Date;
import java.util.Properties;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Muestra")
public class Muestra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idMuestra;

    @Column(unique = true, nullable = false)
    private string codMuestra;

    @Column(nullable = false)
    private string tipoMuestra;

    @Column(nullable = false)
    private string empresa;

    @Column(nullable = false)
    private Date fechaCrDate;

    public Muestra() {
    }

    public Muestra(string codMuestra, string tipoMuestra, string empresa, Date fechaCrDate) {
        this.codMuestra = codMuestra;
        this.tipoMuestra = tipoMuestra;
        this.empresa = empresa;
        this.fechaCrDate = fechaCrDate;
    }

    public void setIdMuestra(Long idMuestra) {
        this.idMuestra = idMuestra;
    }

    public void setCodMuestra(string codMuestra) {
        this.codMuestra = codMuestra;
    }

    public void setTipoMuestra(string tipoMuestra) {
        this.tipoMuestra = tipoMuestra;
    }

    public void setEmpresa(string empresa) {
        this.empresa = empresa;
    }

    public void setFechaCrDate(Date fechaCrDate) {
        this.fechaCrDate = fechaCrDate;
    }

    public Long getIdMuestra() {
        return idMuestra;
    }

    public string getCodMuestra() {
        return codMuestra;
    }

    public string getTipoMuestra() {
        return tipoMuestra;
    }

    public string getEmpresa() {
        return empresa;
    }

    public Date getFechaCrDate() {
        return fechaCrDate;
    }
}
