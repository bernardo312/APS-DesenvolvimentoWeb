import javax.swing.JOptionPane;

public class APS2 {
    public static void main(String[] args) {
        int idade[], matricula[], aux1, aux2, opcao, auxIdade, auxMatricula, inicio, fim, matriculaVerifica,
                posicaoVerifica;
        boolean controle;
        idade = new int[3];
        matricula = new int[3];
        String entra;

        for (aux1 = 0; aux1 < 3; aux1++) {// 'FOR' SE MANTEM USADO EM TODAS PARTES DO CODIGO PARA PERCORRER AMBOS ARRAYS 
            entra = JOptionPane.showInputDialog("Informe a idade do funcionario número " + (aux1 + 1));
            idade[aux1] = Integer.parseInt(entra);
            entra = JOptionPane.showInputDialog("Informe a matricula do funcionario número " + (aux1 + 1));
            matricula[aux1] = Integer.parseInt(entra);
        }
        do { // MENU PRECISA ESTAR DENTRO DE UM 'DO WHILE' PARA CASO USUARIO DIGITE 99 O MENU PARE DE REPETIR
            entra = JOptionPane.showInputDialog(
                    "Menu de opções \n 1.Mostrar \n 2.Ordenar crescente por matricula \n 3.Ordernar Decrescente por idade \n 4.Inverter \n 5.Procurar Idade \n 6.Procurar Matricula \n 7.Repete \n 99.Vazar");
            opcao = Integer.parseInt(entra); // MENU
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção MOSTRAR");
                    for (aux1 = 0; aux1 < idade.length; aux1++) {
                        System.out.println(
                                "O funcionario da matricula " + matricula[aux1] + " tem a idade " + idade[aux1]); // MOSTRA A MATRICULA E IDADE DE TODOS FUNCIONARIOS
                        System.out.println("==================================");
                    }
                    break;
                case 2:
                    System.out.println(
                            "Você escolheu a opção ORDENAR CRESCENTE POR MATRICULA ESCOLHA MOSTRAR PARA VERIFICAR ALTERAÇÃO");
                    System.out.println("================================== \n");
                    for (aux1 = 0; aux1 < matricula.length; aux1++) {
                        controle = true;
                        for (aux2 = 0; aux2 < (matricula.length - 1); aux2++) {//METODO BUBBLE PARA COMPARAR VALORES DO ARRAY E TROCA CASO O PRIMEIRO SEJA MAIOR QUE O SEGUINTE, É NECESSARIO O USO DE UM AUXILIAR
                            if (matricula[aux2] > matricula[aux2 + 1]) {
                                auxMatricula = matricula[aux2];
                                matricula[aux2] = matricula[aux2 + 1];
                                matricula[aux2 + 1] = auxMatricula;
                                auxIdade = idade[aux2];
                                idade[aux2] = idade[aux2 + 1];
                                idade[aux2 + 1] = auxIdade;
                                controle = false;
                            }
                        }
                        if (controle) {// CONTROLE É USADO PARA NÃO PERCORRER O CODIGO TODO CASO NÃO SEJA NECESSÁRIO
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println(
                            "Você escolheu a opção ORDENAR DESCRESCENTE POR IDADE ESCOLHA MOSTRAR PARA VERIFICAR ALTERAÇÃO");
                    System.out.println("================================== \n");
                    for (aux1 = 0; aux1 < idade.length; aux1++) {//METODO BUBBLE PARA COMPARAR VALORES DO ARRAY E TROCA CASO O PRIMEIRO SEJA MENOR QUE O SEGUINTE, É NECESSARIO O USO DE UM AUXILIAR, NESTE BUBBLE USAMOS UM '<' AO INVES DE '>' dentro do IF para deixar o vetor decrecente
                        controle = true;
                        for (aux2 = 0; aux2 < (idade.length - 1); aux2++) {
                            if (idade[aux2] < idade[aux2 + 1]) {
                                auxIdade = idade[aux2];
                                idade[aux2] = idade[aux2 + 1];
                                idade[aux2 + 1] = auxIdade;
                                auxMatricula = matricula[aux2];
                                matricula[aux2] = matricula[aux2 + 1];
                                matricula[aux2 + 1] = auxMatricula;
                                controle = false;
                            }
                        }
                        if (controle) {
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Você escolheu a opção INVERTER ESCOLHA MOSTRAR PARA VERIFICAR ALTERAÇÃO");
                    System.out.println("================================== \n");
                    inicio = 0;
                    fim = idade.length - 1;
                    while (inicio < fim) {// PARA INVERTER VAMOS SUBSTITUINDOS OS VALORES INCIAIS DOS FINAIS COM AJUDA DE UM AUXILIAR
                        auxIdade = idade[inicio];
                        idade[inicio] = idade[fim];
                        idade[fim] = auxIdade;
                        auxMatricula = matricula[inicio];
                        matricula[inicio] = matricula[fim];
                        matricula[fim] = auxMatricula;
                        inicio++;// É NECESSÁRIO AUMENTAR O INICIO E DIMINUIR O FIM PARA ELE PERCORRER TODOS VALORES DENTRO DO ARRAY 
                        fim--;
                    }
                    break;
                case 5:
                    System.out.println("Você escolheu a opção PROCURAR IDADE");
                    System.out.println("================================== \n");
                    entra = JOptionPane.showInputDialog(
                            "Informe o número de matricula para adquirir a idade do funcionario correspondente");
                    matriculaVerifica = Integer.parseInt(entra);
                    int quant = 0;// UTILIZADO PARA PODER INFORMAR CASO NÃO AJA MATRICULAS CORRESPONDENTES 
                    for (aux1 = 0; aux1 < matricula.length; aux1++) {
                        if (matriculaVerifica == matricula[aux1]) {//COMPARA A MATRICULA INFORMADA COM TODAS MATRICULAS DO ARRAY
                            System.out.println("A idade do funcionario coorespondente a matricula " + matriculaVerifica
                                    + " eh :" + idade[aux1]);
                            quant++;
                        }
                    }
                    if (quant == 0) {
                        System.out.println("Não á nenhum funcionario com esta matricula");
                    }
                    break;
                case 6:
                    System.out.println("Você escolheu a opção PROCURAR MATRICULA");
                    System.out.println("================================== \n");
                    entra = JOptionPane.showInputDialog(
                            "Informe o número de matriculara para adquirir a possição em que se encontra no Array");
                    posicaoVerifica = Integer.parseInt(entra);
                    quant = 0;
                    for (aux1 = 0; aux1 < matricula.length; aux1++) {
                        if (posicaoVerifica == matricula[aux1]) {//COMPARA A MATRICULA INFORMADA COM TODAS DO ARRAY
                            System.out.println(
                                    " A matricula " + posicaoVerifica + " esta na posição " + aux1 + " do seu Array");
                            System.out.println("================================== \n");
                            quant++;
                        }
                    }
                    if (quant == 0) {
                        System.out.println("Não á nenhum funcionario com esta matricula");
                    }
                    break;

                case 7:
                    System.out.println("Você escolheu a opção REFETE");
                    System.out.println("================================== \n");
                    auxMatricula = 0;
                    for (aux1 = 0; aux1 < matricula.length; aux1++) {// UTILIZAMOS DOIS 'FOR' PARA PODER COMPARAR TODOS VALORES DO ARRAY MATRICULA UM COM OS OUTROS
                        for (aux2 = 0; aux2 < matricula.length; aux2++) {
                            if (matricula[aux1] == matricula[aux2] && aux1 != aux2) {// É NECESSARIO O 'aux1' SER DIFERENTE DO  'aux2' POIS SE NÃO O IF IRA COMPARAR OS VALORES NA MESMA POSIÇÃO EM DETERMINADO MOMENTO
                                auxMatricula++;
                            }
                        }
                    }
                    if (auxMatricula > 0) {
                        System.out.println("á matriculas repetidas dentro do array");
                        System.out.println("================================== \n");
                    } else {
                        System.out.println("Não á matriculas repetidas dentro do array");
                        System.out.println("================================== \n");
                    }
                    break;
            }
        } while (opcao != 99);// FINALIZA O MENU ASSIM QUE O USUARIO DIGITA 99
    }

}