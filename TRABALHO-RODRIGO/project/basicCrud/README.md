### Autor:
**Nome:** batatinha
**E-mail:** batatinha@gmail.com

### Descrição (classes, atributos, metódos)
**Account.java**
    -String name;
    -int number;
    -double balance;
    -getName();
    -setName(String nome);
    -getNumber();
    -setNumber(int numero);
    -getBalance();
    -deposit(double valor);
    -withdraw(double valor);
    -typeAccount();
    
**SavingsAccount**
    -readjust(double taxa);
    -readjust();
    -accountType();

**SpecialAccount**
    int limit;
    int fine;
    discount(double multa);
    typeAccount();
    
### Operações

-sacar
-depositar
-transferir
-reajustar
-ver saldos
-sair

### Clonando repositório

Faça o download do git no link: https://git-scm.com/download/win

Após download, execute o instalador e dê **next next...* e por último finish.

Crie uma pasta na Área de trabalho e abra, em uma parte "branca" clique com o direito do mouse e vá em GIT bash here.
No GitBash digite:
```sh
$ git clone ( "coloca a url aqui" )
```

### Execução 
**1ª forma de executar**
Após clonar o repositório, dentro da pasta (que criou) siga o diretório: **/Github/Trabalho1/dist/** e execute o arquivo **Trabalho1.jar**.

**2ª forma de executar (compilando)**
Abra o NetBeans, clique em Arquivo/File. 
Selecione Abrir projeto/Open project.
Navegue até a pasta onde clonou o repositório (criada inicialmente).
Selecione **Trabalho1** e cliquem abrir projeto/open project.
Agora no NetBeans (com o projeto aberto) execute o programa clicando no atalho F6.

### Funcionamento
- Ao executar o programa, deve ser preenchido todas as informações de acordo com cada label informativa e a respectiva conta (conta comum, conta poupança e conta especial).
- Após o preenchimento de todas as informações necessárias, será exebido um menu principal com todas as operações possíveis.

- **Saque:**
--  Pode ser efetuado um saque informando o número da conta (preenchido no início), e o valor desejado para saque e depois clicando no botão 'Ok' ou pode voltar ao 'MENU' principal.
- **Depositar:**
-- Pode ser efetuado um deposito informando o número da conta (preenchido no início) no campo respectivo, e o valor para ser depositado.
- **Transferência:**
-- Deve ser informado o número da conta de origem e o valor a ser transferido. Depois deve ser informado o número da conta de destino.
- **Reajustar:**
-- Deve ser informado o número da conta para reajustar a taxa (se poupança), e depois informar a porcentagem (%) da taxa de reajuste, caso nenhuma seja informada, será aplicada a taxa padrão (%10).
- **Ver saldos:**
-- Mostra os tipos de conta (comum, poupança e especial), o número de cada conta e o seus respectivos saldos.
- **Sair:**
-- Finaliza o programa.
