import org.junit.Assert;
import org.junit.Test;
import java.*;
public class FuncionalidadesTest {
    @Test
    public void novoUsuarioTest() throws Exception {
        Usuario jvt = new Usuario("Juvito","jvsdf@dale.com","Abcdef@1");
        Usuario joao = new Usuario("joao","joao@com","Abcdef@1");
        Usuario isaac = new Usuario("isaac","joao@teste.com","senhainvalida");

        Assert.assertTrue(jvt.sucessoNaCriacaoDeUsuario());
        Assert.assertFalse(joao.sucessoNaCriacaoDeUsuario());
        Assert.assertFalse(isaac.sucessoNaCriacaoDeUsuario());
    }

    //falta testar
    @Test
    public void cadastroTest() throws Exception {
        Sistema cadastro =  new Sistema();
        cadastro.cadastraUsuario("Juvito","jvsdf@dale.com","Abcdef@1");
    }

    //ta testado meio errado, pq ta retornando a memoria
    @Test
    public void testarRaizesTest() throws Exception {
        Sistema sistema = new Sistema();
        sistema.calculaFuncaoSegundoGrau(-2,1,6);
        sistema.calculaFuncaoSegundoGrau(2,2,2);
    }



    @Test
    public void trianguloTest(){
        Sistema sistema = new Sistema();
        Assert.assertTrue(sistema.ehTriangulo(20,90,70));
        Assert.assertFalse(sistema.ehTriangulo(20,80,70));
        Assert.assertFalse(sistema.ehTriangulo(20,100,70));
    }

    @Test
    public void trianguloRetanguloTest(){
        Sistema sistema = new Sistema();
        Assert.assertTrue(sistema.ehTriangulo(20,90,70));
        Assert.assertTrue(sistema.ehTriangulo(90,45,45));
        Assert.assertFalse(sistema.ehTriangulo(90,40,45));
        Assert.assertFalse(sistema.ehTriangulo(20,100,70));
    }

    @Test
    public void ehRetanguloTest(){
        Sistema sistema = new Sistema();
        Assert.assertTrue(sistema.ehRetangulo(10,20,20,10));
        Assert.assertTrue(sistema.ehRetangulo(1,5,5,1));
        Assert.assertFalse(sistema.ehRetangulo(4,5,7,4));
    }

    @Test
    public void classificaTrianguloTest(){
        Sistema sistema = new Sistema();
        Assert.assertEquals("É um Triângulo Retângulo",sistema.classificaTriangulo(90,45,45));
        Assert.assertEquals("É um Triângulo Obtusângulo",sistema.classificaTriangulo(100,40,40));
        Assert.assertEquals("É um Triângulo Acutângulo",sistema.classificaTriangulo(60,60,60));
        Assert.assertEquals("Os Ângulos informados, não formam um triângulo!",sistema.classificaTriangulo(50,40,40));
    }

    @Test
    public void perimetroRetanguloTest(){
        Sistema sistema = new Sistema();
        Assert.assertEquals(18,sistema.perimetroRetangulo(5,4,4,5),0);
        Assert.assertEquals(0,sistema.perimetroRetangulo(0,4,3,5),0);
        Assert.assertEquals(32,sistema.perimetroRetangulo(10,6,6,10),0);
    }

    @Test
    public void areaRetanguloTest(){
        Sistema sistema = new Sistema();
        Assert.assertEquals(20,sistema.areaRetangulo(5,4,4,5),0);
        Assert.assertEquals(0,sistema.areaRetangulo(0,4,3,5),0);
        Assert.assertEquals(60,sistema.areaRetangulo(10,6,6,10),0);
    }

    @Test
    public void areaCirculoTest(){
        Sistema sistema = new Sistema();
        Assert.assertEquals(78.5,sistema.areaCirculo(5),0.5);
        Assert.assertEquals(50.24,sistema.areaCirculo(4),0.01);
        Assert.assertEquals(0,sistema.areaCirculo(0),0.01);
    }

    @Test
    public void perimetroCirculoTest(){
        Sistema sistema = new Sistema();
        Assert.assertEquals(31.4,sistema.areaPerimetro(5),0.5);
        Assert.assertEquals(25.12,sistema.areaPerimetro(4),0.01);
        Assert.assertEquals(0,sistema.areaPerimetro(0),0.01);
    }


    @Test
    public void distanciaEntrePontosTest(){
        Sistema sistema = new Sistema();
        Assert.assertEquals(8.24,sistema.distanciaEntreDoisPontos(2,-3,4,5),0.5);
        Assert.assertEquals(12.36,sistema.distanciaEntreDoisPontos(-2,3,-5,-9),0.5);

    }



}
