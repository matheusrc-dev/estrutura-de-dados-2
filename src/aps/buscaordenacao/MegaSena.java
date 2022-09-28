package aps.buscaordenacao;

public class MegaSena {
    private int[] cartaoMegaSena;
    private int[] dezenaPremiada;
    private int TAM;
    public MegaSena() {

        this.TAM = 6;
        this.cartaoMegaSena = new int[]{22, 28, 33, 38, 55, 58};
        this.dezenaPremiada = this.gerarDezenaPremiada();

        System.out.println("Cartão Mega Sena: " + Utils.printList(this.cartaoMegaSena));
        System.out.println("Dezena Premiada: " + Utils.printList(this.dezenaPremiada));

        System.out.println(this.classificarPremio(this.cartaoMegaSena, this.dezenaPremiada));
    }

    public int[] gerarDezenaPremiada() {
        int[] list = new int[this.TAM];
        for(int i = 0; i < this.TAM; i++) {
            list[i] = (int) Math.round(Math.random() * 60);
        }

        return list;
    }

    public String classificarPremio(int[] cartaoMegaSena, int[] dezenaPremiada) {
        int numerosAcertados = 0;
        for(int i = 0; i < this.TAM; i++) {
            if(cartaoMegaSena[i] == dezenaPremiada[i]) {
                numerosAcertados++;
            }
        }

        if(numerosAcertados == 4)
            return "Cartão premiado! [QUADRA]";
        if(numerosAcertados == 5)
            return "Cartão premiado! [QUINA]";
        if(numerosAcertados == 6)
            return "Cartão premiado! [SENA]";
        else
            return "Cartão não premiado :(";
    }
}
