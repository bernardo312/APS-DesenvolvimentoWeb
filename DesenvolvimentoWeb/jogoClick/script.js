 //variaveis para os botões de compra de uprgrades do jogador
 var mais_1 = 0;
 var mais_8= 0;
 var mais_16 = 0;
 // variaveis para o contador aumentar o valor conforme a pessoa clica nos upgrades
 var cont1 = 0;
 var cont8 = 0;
 var cont16 = 0;
 
 // contador de upgrades do jogador
 var contadorUpgrade1 = 0;
 var contadorUpgrade8 = 0;
 var contadorUpgrade16 = 0;

 var contador = 0;// variavel dos pontos do jogador
 function acrescentar() { // botão para aumentar os pontos do jogador clique a clique
     var p = 1 + cont1 + cont8 + cont16;
     contador = contador + p;
     console.log(contador);
     document.getElementById('ponto').innerHTML = contador;
     document.getElementById('pontoporclickatual').innerHTML = p;

     // Para mudar o fundo do botão de upgrade
     var Pt1 = window.document.querySelector('h2#pt1')
     var Pt8 = window.document.querySelector('h2#pt8')
     var Pt16 = window.document.querySelector('h2#pt16')

         if(contador < 10){//botão1
             Pt1.style.backgroundColor='green'
             
         }
         if(contador >= 10){
             Pt1.style.backgroundColor='orange'
         }
         if(contador < 50){//botão2
             Pt8.style.backgroundColor='green'
         } 
         if(contador >= 50){
             Pt8.style.backgroundColor='orange'
         } 
         if(contador < 100){//botão3
             Pt16.style.backgroundColor='green'
         }
         if(contador >= 100){//botão3
             Pt16.style.backgroundColor='orange'
         } 
         if(contador >= 1000){// finalizar o jogo
             window.alert('você terminou o jogo com a pontuação total de '+ contador +" pontos e com "+p+" pontos por click")
             mais_1 = 0;
             mais_8 = 0;
             mais_16 = 0;
             cont1 = 0;
             cont8 = 0;
             cont16 = 0;
             contador = 0;
             contadorUpgrade1 = 0;
             contadorUpgrade8 = 0;
             contadorUpgrade16 = 0;
         } 
}
 function comprar1(){ //botão para comprar 1
     if(contador >= 10){
         mais_1 = 1;
     }
     if(contador >= 10 && mais_1==1 ){
     contador = contador - 10;
     mais_1 = 0;
     contadorUpgrade1++
     document.getElementById('upgrade1').innerHTML = contadorUpgrade1;
     cont1 = cont1 + 1;
     console.log(contador);
     document.getElementById('ponto').innerHTML = contador;
     }
    
 }
 function comprar8(){//botão para comprar 8
     if(contador >= 50){
         mais_8 = 1;
     }
     if(contador >= 50 && mais_8==1 ){
     contador = contador - 50;
     mais_8 = 0;
     contadorUpgrade8++
     document.getElementById('upgrade8').innerHTML = contadorUpgrade8;
     cont8 = cont8 + 8;
     console.log(contador);
     document.getElementById('ponto').innerHTML = contador;
     }
    
 }
 function comprar16(){//botão para comprar 16
     if(contador >= 100){
         mais_16 = 1;
     }
     if(contador >= 100 && mais_16==1 ){
     contador = contador - 100;
     mais_16 = 0;
     contadorUpgrade16++
     document.getElementById('upgrade16').innerHTML = contadorUpgrade16;
     cont16 = cont16 + 16;
     console.log(contador);
     document.getElementById('ponto').innerHTML = contador;
     }
    
 }
