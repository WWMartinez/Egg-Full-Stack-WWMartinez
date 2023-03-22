package Entity;

public class Armadura {

    String colorPrim;
    String colorSecun;
    int propulsorIzq;
    int propulsorDer;
    int repulsorIzq;
    int repulsorDer;
    int tipoResistencia;
    int resistencia;
    int saludArmadura;
    int bateria;

    public Armadura() {
    }

    public Armadura(String colorPrim, String colorSecun, int propulsorIzq, int propulsorDer, int repulsorIzq, int repulsorDer, int tipoResistencia, int resistencia, int saludArmadura, int bateria) {
        this.colorPrim = colorPrim;
        this.colorSecun = colorSecun;
        this.propulsorIzq = propulsorIzq;
        this.propulsorDer = propulsorDer;
        this.repulsorIzq = repulsorIzq;
        this.repulsorDer = repulsorDer;
        this.tipoResistencia = tipoResistencia;
        this.resistencia = resistencia;
        this.saludArmadura = saludArmadura;
        this.bateria = bateria;
    }

    public String getColorPrim() {
        return colorPrim;
    }

    public void setColorPrim(String colorPrim) {
        this.colorPrim = colorPrim;
    }

    public String getColorSecun() {
        return colorSecun;
    }

    public void setColorSecun(String colorSecun) {
        this.colorSecun = colorSecun;
    }

    public int getPropulsorIzq() {
        return propulsorIzq;
    }

    public void setPropulsorIzq(int propulsorIzq) {
        this.propulsorIzq = propulsorIzq;
    }

    public int getPropulsorDer() {
        return propulsorDer;
    }

    public void setPropulsorDer(int propulsorDer) {
        this.propulsorDer = propulsorDer;
    }

    public int getRepulsorIzq() {
        return repulsorIzq;
    }

    public void setRepulsorIzq(int repulsorIzq) {
        this.repulsorIzq = repulsorIzq;
    }

    public int getRepulsorDer() {
        return repulsorDer;
    }

    public void setRepulsorDer(int repulsorDer) {
        this.repulsorDer = repulsorDer;
    }

    public int getTipoResistencia() {
        return tipoResistencia;
    }

    public void setTipoResistencia(int tipoResistencia) {
        this.tipoResistencia = tipoResistencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getSaludArmadura() {
        return saludArmadura;
    }

    public void setSaludArmadura(int saludArmadura) {
        this.saludArmadura = saludArmadura;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorPrim=" + colorPrim + ", colorSecun=" + colorSecun + ", propulsorIzq=" + propulsorIzq + ", propulsorDer=" + propulsorDer + ", repulsorIzq=" + repulsorIzq + ", repulsorDer=" + repulsorDer + ", tipoResistencia=" + tipoResistencia + ", resistencia=" + resistencia + ", saludArmadura=" + saludArmadura + ", bateria=" + bateria + '}';
    }

}
