import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Sistema implements FuncionalidadesIF {

  // Falta restringir o cadastro para verificar se está sendo passado dados
  // permitidos
  public Usuario cadastraUsuario(String nome, String email, String senha) throws Exception {
      Usuario usuario = new Usuario(nome,email,senha);
      if (usuario.sucessoNaCriacaoDeUsuario()) {
        return usuario;
      } else {
        throw new Exception("Erro ao cadastrar usuário");
      }
  }

  public String calculaFuncaoSegundoGrau(double a, double b, double c) throws Exception {
    try {
      Raizes raizes = new Raizes(a,b,c);
      return (raizes.getRaizes());
    } catch (Exception ex) {
      return ex.getMessage();
    }
  }

  public boolean ehTriangulo(double angulo1, double angulo2, double angulo3) {
    double somaDosAngulos = angulo1 + angulo2 + angulo3;
    if (somaDosAngulos != 180)
      return false;
    return true;
  }

  public boolean ehTrianguloRetangulo(double lado1, double lado2, double lado3) {

    if ((Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2))
        || (Math.pow(lado3, 2) + Math.pow(lado2, 2) == Math.pow(lado1, 2))
        || (Math.pow(lado1, 2) + Math.pow(lado3, 2) == Math.pow(lado2, 2)))
      return true;
    return false;
  }

  public boolean ehRetangulo(double lado1, double lado2, double lado3, double lado4) {
    List<Double> lados = new ArrayList<>();
    lados.add(lado1);
    lados.add(lado2);
    lados.add(lado3);
    lados.add(lado4);
    double var = lados.get(2);
    int contador = 0, contadorRepeticoes = 0;

    while (true) {
      if (lados.size() == 0)
        break;
      for (int i = 1; i < lados.size(); i++) {
        if (lados.get(0).equals(0) || lados.get(i).equals(0))
          return false;
        if (lados.get(0).equals(lados.get(i))) {
          lados.remove(i);
          lados.remove(0);
          contador++;
          break;
        }
        contadorRepeticoes++;
      }
      if (contadorRepeticoes > 4)
        break;
    }
    if (contador == 2)
      return true;
    return false;
  }

  public String classificaTriangulo(double angulo1, double angulo2, double angulo3) {
    if (ehTriangulo(angulo1, angulo2, angulo3)) {
      if (ehTrianguloRetangulo(angulo1, angulo2, angulo3))
        return "É um Triângulo Retângulo";
      if ((angulo1 > 90) || (angulo2 > 90) || (angulo3 > 90))
        return "É um Triângulo Obtusângulo";
      else
        return "É um Triângulo Acutângulo";
    } else
      return "Os Ângulos informados, não formam um triângulo!";
  }

  public double perimetroRetangulo(double lado1, double lado2, double lado3, double lado4) {
    if (ehRetangulo(lado1, lado2, lado3, lado4)) {
      double perimetro = lado1 + lado2 + lado3 + lado4;
      return perimetro;
    }
    return 0;
  }

  public double areaRetangulo(double lado1, double lado2, double lado3, double lado4) {
    if (ehRetangulo(lado1, lado2, lado3, lado4)) {
      double[] arrayLados = { lado1, lado2, lado3, lado4 };
      double area = 0;
      for (int i = 1; i < 4; i++) {
        if (lado1 != arrayLados[i]) {
          area = lado1 * arrayLados[i];
          break;
        }
      }
      return area;
    }
    return 0;
  }

  // FALTA FAZER CALCULADORA ---------------------------------
  public double calculadora(String expressao) {
    return 0;
  }

  public double areaCirculo(double raio) {
    double pi = 3.14;
    double area = pi * Math.pow(raio, 2);
    return area;
  }

  public double areaPerimetro(double raio) {
    double pi = 3.14;
    double perimetro = 2 * pi * raio;
    return perimetro;
  }

  public double distanciaEntreDoisPontos(double x1, double y1, double x2, double y2) {
    double diferençaX = Math.pow((x2 - x1), 2);
    double diferençaY = Math.pow((y2 - y1), 2);
    double distancia = Math.sqrt(diferençaX + diferençaY);
    return distancia;
  }

}