public class App {

    // Polimorfismo = diferentes formas
    // os metodos com os mesmos nomes: desenhar()
    // fizeram acoes diferentes.
    // o do Quadrado, desenhou um quadrado
    // o do Circulo, desenhou um circulo 
    // Isso aconteceu porque Quadrado e Circulo herdaram a funcao do Poligono e customizam suas acoes. 
    public static void main(String[] args) throws Exception {
     Quadrado q1 = new Quadrado(); // instanciar um Quadrado
        q1.desenhar();

        Circulo c1 = new Circulo(); // instranciar um Circulo
        c1.desenhar();
        
    }
}
