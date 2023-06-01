package arraylist;
import java.util.ArrayList;

public class ExemploArrayList {

    
    public static void main(String[] args) {
        
        //Criando a lista do tipo pessoa:
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        
        //Cria um objeto de "Pessoa" para podermos adicioná-lo a lista
        Pessoa pessoaLocal = new Pessoa();
        pessoaLocal.nome = "Sonic";
        pessoaLocal.idade = 200;
        pessoaLocal.email = "sonic@uninove.edu.br";
        
        //Adiciona a pessoa a lista
        listaPessoas.add(pessoaLocal);
        
        //Já que a pessoa criada já foi acrescentada à lista, podemos reaproveitar a variável local para acrescentar outra pessoa:
        pessoaLocal = new Pessoa ();  //"reseta a variável para poder ser utilizada
        pessoaLocal.nome = "Lara Croft";
        pessoaLocal.idade = 21;
        pessoaLocal.email = "laracroftJava@uninove.edu.br";
        
        //Acrescenta:
        listaPessoas.add(pessoaLocal);
        
        //Mais uma pessoa
        pessoaLocal = new Pessoa(); //"reseta" a variável para poder ser reutilizada
        pessoaLocal.nome = "Mario Bross";
        pessoaLocal.idade = 180;
        pessoaLocal.email = "donkeykongnaomepega@uninove.edu.br";
        
        //acrescenta:
        listaPessoas.add(pessoaLocal);
 
        //Só mais uma pessoa
        pessoaLocal.nome = "Jaspion";
        pessoaLocal.idade = 89;
        pessoaLocal.email = "jaspionJava@uninove.edu.br";
        listaPessoas.add(pessoaLocal);
        
        //Percorrendo a lista com um laço e acessando seus ítens
        for (int i = 0; i <= listaPessoas.size() -1; i++){
            System.out.println("Imprimindo dados da posição: " + i);
            System.out.println("\t- Nome: " + listaPessoas.get(i).nome);
            System.out.println("\t- Idade: " + listaPessoas.get(i).idade);
            System.out.println("\t- E-mail: " + listaPessoas.get(i).email);
            System.out.println("-------------------");
        }
        
        
        //Vamos procurar a pessoa que chama-se "Jaspion" e remove-la da lista
        //Para isso, é preciso percorrer a lista, procurando o nome e,
        //quando for encontrado, guardar o índice que a pessoa está.
        int posicaoRemovida = -999; //Variável auxiliar para remoção; um número qualquer
        for (int j = 0; j < listaPessoas.size(); j++){
            if (listaPessoas.get(j).nome.equals("Jaspion")){ //se encontrar...
                posicaoRemovida = j; //Atribui a variável o valor Indice
                break; //se já encontrou o loop pode parar
            }
    }
        //Verifica se a variável auxiliar foi alterada. Se sim, remove
        if(posicaoRemovida != -999){
            listaPessoas.remove(posicaoRemovida);  //Remove na posição encontrada
            System.out.println(" >> O Jaspion estava na posição " + posicaoRemovida);
        }
        
        //Para ter certeza da remoção, vamos percorrer e imprimir a lista novamente, mas só os nomes agora:
        System.out.println("Imprimindo os nomes da lista, após a remoção do Jaspion: ");
        for (int k = 0; k < listaPessoas.size(); k++){
            System.out.println("\t" + k + " - " + listaPessoas.get(k).nome);
        }
    }
    
}
