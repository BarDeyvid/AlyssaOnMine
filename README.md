# 🧠 Alyssa PoC — Minecraft Mod (NeoForge)

**Alyssa PoC** é um mod experimental criado para servir como **prova de conceito** da arquitetura da IA Alyssa dentro do Minecraft.  
Antes de introduzir a IA em si, o mod constrói **todo o ecossistema tecnológico**, incluindo:

- Itens avançados  
- Estruturas tecnológicas  
- Sistemas de sensores  
- Máquinas funcionais  
- Terminais e interfaces  
- Blocos energizados  
- Infraestrutura de mundo  

O objetivo principal é aprender **Java + NeoForge** enquanto cria a base completa que a Alyssa usará mais tarde.

---

## 📘 Roadmap

O planejamento completo (todas as fases e milestones) está disponível aqui:

➡️ **[ROADMAP.md](./ROADMAP.md)**

---

## 🧩 Estrutura do Mod

O mod é organizado em módulos para facilitar manutenção e expansão:

```

src/main/java/
modid/
AlyssaMod.java
registry/
Blocks.java
Items.java
BlockEntities.java
CreativeTabs.java
content/
blocks/
items/
machines/
world/
systems/
energy/
sensors/
memory/
client/
render/
screens/

````

Essa organização permite:

- separar lógica do jogo de lógica visual  
- escalar o mod conforme ele cresce  
- facilitar a futura integração da IA  
- usar padrões semelhantes ao código NeoForge moderno  

---

## 🧪 Objetivo Técnico

O mod serve para dominar:

- Syntax de Java (OOP, interfaces, abstrações)
- APIs do NeoForge
- Registries (Items, Blocks, BlockEntities, Menus)
- Threading leve
- Network packets (C ↔ S)
- Worldgen (estruturas customizadas)
- DataGen (tags, receitas, modelos)
- Renderização no cliente
- GUIs e comunicação com blocos

E então, só após tudo isso estar estável:

> Integrar a Alyssa real através de adaptadores de sensores e executores de ação.

---

## 🧠 Filosofia do Projeto

A Alyssa deve ser a **mesma IA** em todos os ambientes — real, virtual ou Minecraft.  
A única coisa que muda é **a fonte das informações dos sensores**.

🔹 No mundo real → sensores do corpo  
🔹 No Minecraft → posição, blocos, mobs, luz, bioma, etc  

Essa separação permite testar:

- comportamento  
- intenção  
- cognição  
- tomada de decisão  

…sem depender de hardware físico.

---

## 🛠 Como Compilar

Requisitos:

- JDK 17+  
- IntelliJ IDEA (recomendado)  
- NeoForge MDK  
- Gradle (wrapper incluso)

Passos:

```bash
./gradlew build
````

O .jar aparecerá em:

```
build/libs/
```

---

## 🧪 Ambiente de Desenvolvimento (IntelliJ IDEA)

1. Abra o projeto pela **pasta raiz** (não pelo build.gradle isolado)
2. Aguarde o Gradle sincronizar
3. Use a configuração gerada automaticamente para rodar o jogo

Se não aparecer, vá em:

```
Gradle → Tasks → application → runClient
```

---

## 🤝 Contribuindo

Esse repositório é principalmente para aprendizado, mas PRs, ideias ou sugestões são bem-vindas.

---

## 📜 Licença

A definir.

---

## 👤 Autor

Projeto pessoal de **Deyvid**, entusiasta de robótica, engenharia e dados.
O mod é parte do desenvolvimento da versão completa da IA Alyssa.