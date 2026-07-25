nas collections é possível acrescentar elementos em runtime
aceitam elementos de classes diferentes mas a boa prática dita que sejam de um tipo só.
só tipos de referência, não aceitam tipos primitimos. Se precisar usar com tipos primitivos, usar os wrappers

collections
Set
    não ordenado por default, mas pode ser oredenado usando o sorted set.
    não indexado
    não aceita repetição. não gera erro, só ignora e não acrescenta.
List
    mais parecido com array
    é indexado
    aceita repetições
Map
    chave/valor
    chave não aceita repetição
    valor aceita repetição
Queue
    implementa fila
    first in/first out(Fifo)
Stack
    implementa pilha(stack)
    last in/first out(LIFO)

Set
    pode ser heterogêneo mas não é o recomendado
    pode ser homogêneo, que é o recomendado
    não aceita objetos duplicados
    pode ser ordenado
    não é indexado
    -
    HashSet um dos tipos de termos conjuntos(set) dentro do java. Set em si é uma interface que tem várias classes diferentes que a implementam.
    
List
    pode ser heterogêneo também não é recomendado aqui
    pode ser homogêneo
    aceita objetos duplicados
    é ordenada naturalmente, pela ordem de inclusão
    é indexado



FILA, Queue
    Queue<String> fila = new LinkedList<>();

pilha, stack
    Deque<String> livros = new ArrayDeque<String>();


    

Map<Integer, String> usuarios = new HashMap<>();







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
