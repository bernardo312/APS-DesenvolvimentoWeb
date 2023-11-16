import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {

    String input;
    int array[],i, j, maiorMedia = 0, somaNum = 0, media = 0, menor, fatorial, posImpar = 0,SomaImpar = 0, mediaImpar= 0, Impar = 0, repetidos=0;
    array = new int[6];

    for(i = 0; i<array.length; i++){
      input = JOptionPane.showInputDialog("Informe o "+(i+1)+"º número");
      array[i] = Integer.parseInt(input);
      somaNum += array[i];
    }
     media = somaNum/array.length;
    menor = array[0];
    for(i = 0; i<array.length; i++){
      if(array[i]>media){
        maiorMedia++;
      }
      if(array[i]<menor){
        menor = array[i];
      }
      if(i%2!=0){
        posImpar += array[i];
      }
      if(array[i]%2 != 0 && array[i]!=0){
        Impar += array[i];
        SomaImpar++;
      }
      for(j = 0; j<array.length; j++){
        if(array[i]==array[j] && i!=j){
          repetidos++;
      }
    }
    }
    fatorial = 1;
    for(i=menor;i>=1;i--){
      fatorial *= i;
    }

      mediaImpar = Impar/SomaImpar;
    System.out.println("=========================\n");
    System.out.println("Temos o total de "+maiorMedia +" números informados acima da media");
    System.out.println("O menor númer informado é "+menor+" e o fatorial deste número é"+fatorial);
    System.out.println("O somatorio dos números que ocupam a posição Impar é "+posImpar);
    System.out.println("A media dos números impares do array é "+mediaImpar);
    if(repetidos>0){
    System.out.println("á um total de "+repetidos+" números repetidos no array");
    }
    else{
      System.out.println("Não á números repetidos dentro do array");
    }
}
}
