# Markdown Cheat Sheet (Example File)

This is a **generic Markdown template** showcasing essential formatting features.

---

## 1. Headers
# H1 (Largest)
## H2
### H3
#### H4
##### H5
###### H6 (Smallest)

---

## 2. Text Formatting
- **Bold** (`**text**` or `__text__`)
- *Italic* (`*text*` or `_text_`)
- ~~Strikethrough~~ (`~~text~~`)
- `Inline Code` (`` `code` ``)
- > Blockquote (prefix with `>`)

---

Produto p1 = new Produto();
var p2 = new Produto();//instanciando por inferência

construtores não são herdados. Mas construtores da superclasse está disponível para ser chamado pelas subclasses.
De fato, Java exige que a primeira tarefa em qualquer construtor numa subclasse é chamar o construtor da superclasse diretamente 
ou indiretamente(o default).

não desegnar modificadores de acesso antes de classes, atributos ou métodos faz com que Java atribua o seu padrão que é
acesso de pacote, package-private.
Package-private: significa que o membro ou classe será visível apenas por outras classes dentro do mesmo pacote.

Modificador,  Dentro da própria classe,  Classes no mesmo pacote,  Subclasses em pacotes diferentes, Qualquer classe (outros pacotes)
public,                Sim,                    Sim,                             Sim,                             Sim
protected,             Sim,                    Sim,                             Sim,                             Não 
Padrão (nenhum),       Sim,                    Sim,                             Não,                             Não
private,               Sim,                    Não,                             Não,                             Não

static é um modificador de comportamento, ele define a quem o código pertence
Sem static (membro de instância): pertencem ao objeto criado com new. Cada produto terá seu próprio
Com static (membro de classe): pretencem à classe em si. Existe apenas uma cópia compartilhada por todos os objetos. 
Modificador + Tipo, Dentro da própria classe,   Classes no mesmo pacote,    Subclasses em pacotes diferentes,   Qualquer classe (outros pacotes),   Como é feito o acesso externo?
public static,              Sim,                        Sim,                                Sim,                            Sim,                     NomeDaClasse.membro (Sem new)
public (Instância),         Sim,                        Sim,                                Sim,                            Sim,                    objeto.membro (Precisa de new)
protected static,           Sim,                        Sim,                                Sim,                            Não,                    NomeDaClasse.membro (Apenas herança/pacote)
protected (Instância),      Sim,                        Sim,                                Sim,                            Não,                    objeto.membro (Apenas herança/pacote)
Padrão static (nenhum),     Sim,                        Sim,                                Não,                            Não,                    NomeDaClasse.membro (Apenas no mesmo pacote)
Padrão (Instância),         Sim,                        Sim,                                Não,                            Não,                    objeto.membro (Apenas no mesmo pacote)
private static,             Sim,                        Não,                                Não,                            Não,                    Proibido fora da classe
private (Instância),        Sim,                        Não,                                Não,                            Não,                    Proibido fora da classe









## 3. Lists
### Unordered List
- Item 1
- Item 2
  - Nested Item (indent with 2 spaces)

### Ordered List
1. First item
2. Second item
   1. Nested item (indent with 3 spaces)

### Task List
- [x] Completed task
- [ ] Pending task (`[ ]`)

---

## 4. Links
- [Hyperlink](https://example.com) (`[text](url)`)

---

## 5. Code Blocks
```java
# Syntax-highlighted block (java)
class HelloWorld {
    public static main(String... args) {
        System.out.println("Hello markdown");
    }
}
