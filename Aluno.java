public class Aluno {

    private Estado estado = Estado.MATRICULADO;

    private enum Estado {
        MATRICULADO, TRANCADO, FORMADO
    }

    public void trancar() {
        if (estado == Estado.MATRICULADO) {
            estado = Estado.TRANCADO;
        }
    }

    public void formar() {
        if (estado == Estado.MATRICULADO) {
            estado = Estado.FORMADO;
        }
    }

    public void reativar() {
        if (estado == Estado.TRANCADO) {
            estado = Estado.MATRICULADO;
        }
    }

    public String getEstado() {
        return estado.name();
    }
}
