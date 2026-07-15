
public record Produto(String nome, double preco) {}

// No método main:
Produto p = new Produto("Teclado Mecânico", 249.90);
System.out.println(p); 
// Saída automática: Produto[nome=Teclado Mecânico, preco=249.9]


equals e hashcode
sempre que se usa == para comparação de variáveis de referência, estamos comparando endereço de memória.
para comparar essas variáveis de referência, usar o método equals presente em toda classe. Mas o equals precisa ser implementado na classe. caso contrário vai retornar false, mesmo que usando ==.

o equals vem junto de um outro método, o hashcode.
O Java tem uma estrutura que representa um conjunto, hashset, que usa o conceito de hashcode. Importante para encontrar um elemento dentro de um conjunto de outros elementos.
Hashcode é uma função um valor inteiro. Equals é uma função que retorna um valor boolean.
O hashcode é usado para separa o que realmente tem chance de ser o objeto procurado no conjunto. Definindo o aributo nome como hashcode num conjunto de objetos Pessoa
Definindo o hashcode nome com tamanho 4, o hashcode fará uma varredura no conjunto separando somente os objetos com nome de tamnaho 4 para então aplicar o equals, que é um médoto mais demorado, reduzindo assim drasticamente o tempo de pesquisa

























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
