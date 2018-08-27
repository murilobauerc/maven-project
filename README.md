# Maven project :shipit:

### O que é?
> O Maven é uma ferramenta de integração de projetos. É responsável por gerenciar dependências, controlar versão de artefatos, gerar relatórios de produtividade, garantir execução de testes, manter nível de qualidade do código dentre outras.

> Será criado uma aplicação java simples utilizando o plugin maven-archetype-quickstart.

## Pré-requisitos básicos:

1. [Oracle JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
2. [Maven](http://maven.apache.org/)

## Para executar no terminal, devemos ter:

1. **Java** e **Maven** ao PATH do Windows:
```
export JAVA_HOME=/C/Program/ Files/Java/jdk1.8.0_171
export PATH=${JAVA_HOME}/bin:$PATH
export PATH="C:\Program Files\apache-maven-3.5.4\bin":$PATH

```

2. Iniciando um projeto maven:
```
mvn archetype:generate
```

3. Compilando um projeto:
```
mvn compile
```

4. Gerando um pacote da sua aplicação dentro do diretório target
```
mvn package
Maven irá criar um arquivo jar “nomeProjeto-1.0-SNAPSHOT.jar”  
```

5. Instalando as dependências
```
mvn install
```



- *Referências*
[O que é maven?](http://www.dclick.com.br/2010/09/15/o-que-e-o-maven-e-seus-primeiros-passos-com-a-ferramenta/)

