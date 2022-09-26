#autora: Kethilyn Leal
#language: pt

@Executa
Funcionalidade: Cadastro Cliente
  Eu como usuario desejo realizar os teste no backoffice

  Contexto: Acessar o site do backoffice
    Dado que eu acesse o site

  @Executa
  Cenario: CT01 - Login
    Quando insiro e-mail e senha
    Entao clico em entrar

  @nExecuta
  Cenario: CT02 - Editar perfil
    Quando clico em controle de acesso
    E clico em perfil de acesso
    E busco um perfil para edicao
    E clico em editar perfil
    E seleciono as funcionalidades do usuario
    Entao clico em editar

  @nExecuta
  Cenario: CT03 - Excluir perfil
    Quando clico em controle de acesso
    E clico em perfil de acesso
    E busco um perfil para exclusao
    E seleciono a opcao de excluir
    Entao confirmo a exclusao

  @nExecuta
  Cenario: CT04 - Cadastrar perfil
    Quando clico em controle de acesso
    E clico em perfil de acesso
    E clico em cadastrar perfil
    E insiro um nome
    E escolho as funcionalidades do usuario
    Entao cadastro o perfil

  @nExecuta
  Cenario: CT07 - Consultar perfis de acesso
    Quando clico em controle de acesso
    E clico em perfil de acesso
    E busco um usuario
    E clico em visualizar
    E seleciono campos para visualizacao
    Entao clico em voltar

  @nExecuta
  Cenario: CT05 - Consultar usuario
    Quando clico em controle de acesso
    E clico em usuarios
    E busco um usuario
    Entao clico em visualizar usuario

  @nExecuta
  Cenario: CT06 - Cadastrar usuario
    Quando clico em controle de acesso
    E clico em usuarios
    E clico em cadastrar usuario
    E insiro dados para cadastro
    E escolho o perfil ativou ou inativo
    E clico em salvar
    Entao clico em cadastrar

  @nExecuta
  Cenario: CT06 - Editar usuario
    Quando clico em controle de acesso
    E clico em usuarios
    E busco um usuario
    E clico em editar usuario
    E edito campos para alteracao
    E clico em salvar
    Entao clico em editar

  @nExecuta
  Cenario: CT08 - Esqueci minha senha
    Quando clico em esqueci minha senha
    E insiro email
    E clico em solicitar redefinicao
    Entao volto para login

  @nExecuta
  Cenario: CT09 - Sair
    Quando eu estiver logada no site
    E clico em sair
    Entao confirmo no sim

    

  