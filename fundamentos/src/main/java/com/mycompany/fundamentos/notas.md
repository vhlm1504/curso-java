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
Inferência (a partir do java 10)
var b = 4.5; 
jvm infere pelo valor que a variável b é do tipo b, neste caso, double.
o que não pode ser feito com inferência é mudar a variável depois que o java já a identificou como String por exemplo. Agora 
não é possível tentar salvar um valor 5.6, double. Java é fortemente tipada.
com var a variável tem que ser inicializada junto com a declaração

Tipos primirivos
inteiros
byte   1 único byte  -128 até 127
short  3 bytes       
int    4 bytes
long   8 bytes
pontos flutuantes
float  4 bytes
double 8 bytes

char   1 byte? '' aspas simples
boolean só aceita false ou true

1 byte = 8 bits
primeiro bit da esquerda sinaliza se é um número positivo ou negativo. 

pode usar _ em ints ou flutuantes grandes para facilitar a leitura

float tem o F ao final do valor
long tem o L ao final do valor
long v = 3_134_854_223L
float f = 11_445.44F

--
String
String s = "Bom dia";        
        System.out.println(s);
        
        s = s.toUpperCase();
        System.out.println(s);
        
        s = "HENRIQUE VEIO ME VER".toLowerCase();
        System.out.println(s);
    A classe String tem alguns superpoderes e comportamentos especiais que a diferenciam de classes normais.
    s.toUpperCase() não é um método static é um método de instância. Para ser static ele precisaria tranformar qualquer texto sem 
precisar de um objeto específico e sendo chamado da forma String.toUpperCase()
    Mas a assinatura dele e public String toUpperString(). 
    A declaração da variável, neste caso, é exatamente como instanciar um objeto.
    Uma String, em Java, é sempre um objeto. 
    A única diferença é que java nos permite criar objetos String de duas formas
    String s = "gato"; (facilidades como essa é que chama de açúcar sintático)
    ou 
    String s = new String("gato"); 
    
    vários métodos podem serchamados ao mesmo tempo
    String y = "Bom dia X".replace("X", "Cissa").toUpperCase().concat("!");
    contanto que o retorno do método seja uma String também

Tipos primitivos não tem métodos, não tem .

Import

String
"Olá pessoal".charAt(2) retorna o caracter na posição 2
Strings são objetos imutáveis. por isso quando chamamos um método de instância, o resultado tem que ser salvo numa variável.
s.startsWith("Boa"); é case sensitive
s.endsWith("dia")
s.length() quantos caracteres tem uma string
s.equals("boa tarde"); comparação de strings. true ou false
s.equalsIgnoreCase("boa tarde"); o equals só que não case sensitive

Scanner
ao ulitizar o Scanner, ao final é preciso fechá-lo. input.close();

ele tem o mesmo problema do scanf, deixa o nul para tras
então temos que consumir o \0 que fica perdido no buffer de entrada
o nextInt e o nextDouble tem esse problema.
System.out.println("Qual sua idade?")?
int idade = teclado.nextInt();
teclado.nextInt();
System.out.println("Qual seu sobrenome?");
String sobrenome = teclado.nextLine();
teclado.nextLine();
teclado.close();

Objeto vs primitivo
Wrappers
Tipos primitivos são apenas o valor, não tem comportamentos, métodos, que permitem manipulação como os objetos.
Caso seja necessário ter métodos em tipos primitivos, usar Wrappers
Wrappers, cada tipo primitivo tem um wrapper associado. Os wrappers são a versão objeto dos tipos primitivos.

são oito tipos primitivos
    byte
    short
    int
    long  L
    float F
    double
    char
    boolean

---

BigDecimal para trabalhos onde a precisão é necessária nas operações matemáticas

----
 String salario2 = input.nextLine().replace(",", ".");
Double.parseDouble(salario1) 

    








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
