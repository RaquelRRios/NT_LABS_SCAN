
public class Main {
    public static void main(String[] args) {
        ScanTutorial scan = new ScanTutorial();

        Integer indice = selectedItem(scan);
        Double valor = coletarValor(scan, indice);

        Double troco = valorTroco(indice, valor);
        System.out.println(troco);


        System.out.println(indice);
        System.out.println(valor);

        Double cedulas = retornaCedulas(troco);
        System.out.println(cedulas);

    }

    private static Integer selectedItem(ScanTutorial scan) {
        boolean optionSelected = false;
        Integer indice = 0;
        do {
            System.out.println(Constants.MENSAGENS.INICIO);
            System.out.println(Constants.MENSAGENS.ITENS);

            indice = scan.coletarInteiro();

            if (indice > 0 && indice < 5) {
                optionSelected = true;
            } else {
                System.out.println(Constants.ERROS.OPCAO_INVALIDA);
            }

        } while (optionSelected == false);

        return indice;
    }

    private static Double coletarValor(ScanTutorial scan, Integer indice) {
        Double valor = 0.0;
        boolean optionSelected = false;
        do {
            System.out.println(Constants.MENSAGENS.PAGAMENTO);
            valor = scan.coletarDouble();

            switch (indice) {
                case 1:
                    if (valor >= 3.50) {
                        optionSelected = true;
                    }
                    break;
                case 2:
                    if (valor >= 3.55) {
                        optionSelected = true;
                    }
                    break;
                case 3:
                    if (valor >= 3.25) {
                        optionSelected = true;
                    }
                    break;
                case 4:
                    if (valor >= 3.75) {
                        optionSelected = true;
                    }
                    break;
            }

            if (optionSelected == false) {
                System.out.println(Constants.ERROS.VALOR_INVALIDO);
            }
        } while (optionSelected == false);

        return valor;
    }

    private static Double valorTroco(Integer indice, Double valor) {
        Double troco = 0.0;
        boolean optionSelected = false;
        Double capuccino = 3.50;
        Double vanilla = 3.55;
        Double carioca = 2.25;
        Double mocaccino = 3.75;

        do {
            System.out.println(Constants.MENSAGENS.TROCO);


            switch (indice) {
                case 1:
                    if (valor >= 3.50) {
                        optionSelected = true;
                        troco = valor - capuccino;
                    }
                    break;
                case 2:
                    if (valor >= 3.55) {
                        optionSelected = true;
                        troco = valor - vanilla;

                    }
                    break;
                case 3:
                    if (valor >= 3.25) {
                        optionSelected = true;
                        troco = valor - carioca;

                    }
                    break;
                case 4:
                    if (valor >= 3.75) {
                        optionSelected = true;
                        troco = valor - mocaccino;
                    }
                    break;
            }

            if (optionSelected == false) {
                System.out.println(Constants.ERROS.VALOR_INVALIDO);
            }
        } while (optionSelected == false);

        return troco;
    }

    public static Double retornaCedulas(Double troco) {
        do {
            if (troco >= 200) {
                int cedulas = (int) (troco / 200);
                System.out.println("Cedulas de 200: " + cedulas);
                troco = troco - 200 * cedulas;
            } else if (troco >= 100) {
                int cedulas = (int) (troco / 100);
                System.out.println("Cedulas de 100: " + cedulas);
                troco = troco - 100 * cedulas;
            } else if (troco >= 50) {
                int cedulas = (int) (troco / 50);
                System.out.println("Cedulas de 50: " + cedulas);
                troco = troco - 50 * cedulas;
            } else if (troco >= 20) {
                int cedulas = (int) (troco / 20);
                System.out.println("Cedulas de 20: " + cedulas);
                troco = troco - 20 * cedulas;
            } else if (troco >= 10) {
                int cedulas = (int) (troco / 10);
                System.out.println("Cedulas de 10: " + cedulas);
                troco = troco - 10 * cedulas;
            } else if (troco >= 5) {
                int cedulas = (int) (troco / 5);
                System.out.println("Cedulas de 5: " + cedulas);
                troco = troco - 5 * cedulas;
            } else if (troco >= 2) {
                int cedulas = (int) (troco / 2);
                System.out.println("Cedulas de 2: " + cedulas);
                troco = troco - 2 * cedulas;
            } else if (troco >= 1.0) {
                int moedas = (int) (troco / 1.0);
                System.out.println("Moedas de 1,00: " + moedas);
                troco = troco - 1.0 * moedas;
            } else if (troco >= 0.5) {
                int moedas = (int) (troco / 0.5);
                System.out.println("Moedas de 0,50: " + moedas);
                troco = troco - 0.5 * moedas;
            } else if (troco >= 0.25) {
                int moedas = (int) (troco / 0.25);
                System.out.println("Moedas de 0,25: " + moedas);
                troco = troco - 0.25 * moedas;
            } else if (troco >= 0.10) {
                int moedas = (int) (troco / 0.10);
                System.out.println("Moedas de 0,10: " + moedas);
                troco = troco - 0.10 * moedas;
            } else if (troco >= 0.05) {
                int moedas = (int) (troco / 0.05);
                System.out.println("Moedas de 0,05: " + moedas);
                troco = troco - 0.05 * moedas;
            } else if (troco >= 0.01) {
                int moedas = (int) (troco / 0.01);
                System.out.println("Moedas de 0,01: " + moedas);
                troco = troco - 0.01 * moedas;
            }
        } while (troco > 0.0);

        return troco;
    }
}
