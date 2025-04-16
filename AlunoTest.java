import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void alunoIniciaMatriculado() {
        Aluno aluno = new Aluno();
        assertEquals("MATRICULADO", aluno.getEstado());
    }

    @Test
    void podeTrancarSeEstiverMatriculado() {
        Aluno aluno = new Aluno();
        aluno.trancar();
        assertEquals("TRANCADO", aluno.getEstado());
    }

    @Test
    void naoTrancaSeNaoEstiverMatriculado() {
        Aluno aluno = new Aluno();
        aluno.trancar();
        aluno.trancar();
        assertEquals("TRANCADO", aluno.getEstado());
    }

    @Test
    void podeReativarSeEstiverTrancado() {
        Aluno aluno = new Aluno();
        aluno.trancar();
        aluno.reativar();
        assertEquals("MATRICULADO", aluno.getEstado());
    }

    @Test
    void naoReativaSeNaoEstiverTrancado() {
        Aluno aluno = new Aluno();
        aluno.reativar();
        assertEquals("MATRICULADO", aluno.getEstado());
    }

    @Test
    void podeFormarSeEstiverMatriculado() {
        Aluno aluno = new Aluno();
        aluno.formar();
        assertEquals("FORMADO", aluno.getEstado());
    }

    @Test
    void naoFormarSeEstiverTrancado() {
        Aluno aluno = new Aluno();
        aluno.trancar();
        aluno.formar();
        assertEquals("TRANCADO", aluno.getEstado());
    }

    @Test
    void estadoFormadoNaoPermiteMudancas() {
        Aluno aluno = new Aluno();
        aluno.formar();
        aluno.trancar();
        aluno.reativar();
        aluno.formar();
        assertEquals("FORMADO", aluno.getEstado());
    }
}
