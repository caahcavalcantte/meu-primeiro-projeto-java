public class MinhaClasse {
  /** Esta é a classe Minha Classe.
   * Ela faz coisas incríveis.
   */
 public static void main(String[] args) {
  /** Este é o método principal (main) do programa
   * É o ponto de entrada do programa
   */

   // Imprime a mensagem de boas-vindas no console
    System.out.print("Olá turma, sejam bem-vindo!");
    //Declaração da variável 'primeiroNome' e atribuição de valor a ela
    String primeiroNome = "Cássia";
     //Declaração da variável 'segundoNomeNome' e atribuição de valor a ela
    String segundoNome = "Cavalcante";
    // Declaração de variável para armazenar o nome completo
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    // Imprime nome completo no console
    System.out.println(nomeCompleto);
 }
 // Esta é uma função que recebe dois nomes (primeiroNome e segundoNome) como entrada
 // e retorna o nome completo formado pela concanetação desses nome com espaço entre eles.
 public static String nomeCompleto (String primeiroNome, String segundoNome ) {
    return primeiroNome.concat(" ").concat(segundoNome);
 }
}
