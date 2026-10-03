QUESTAO 1:

É considerado uma boa prática utilizar getters e setters em vez de tornar os atributos públicos porque eles permitem controlar o acesso e a alteração dos dados de um objeto. Mantendo os atributos como private, a classe consegue controlar como esses dados serão acessados ou modificados. Isso ajuda a evitar valores inválidos e mantém a integridade dos dados do objeto.

Por exemplo, podemos criar um setter para o preço de um produto que não permita valores negativos, nesse caso, se alguém tentar colocar um preço negativo, o valor não será alterado. Dessa forma, o setter permite controlar melhor os dados do objeto.

QUESTAO 2:

a) Título, Autor, ISBN, Editora, Ano de publicação, Gênero, Número de páginas,Quantidade disponível.

b) Podemos dizer que a classe Livro seria uma abstração porque ela representa, dentro do programa, as principais características e comportamentos de um livro do mundo real. A classe não precisa representar todos os detalhes de um livro físico. Ela apresenta apenas as informações que são importantes para o sistema, como título, autor, ISBN e quantidade disponível.

c) 
emprestar()
devolver()
exibirInfo()
estaDisponivel()

