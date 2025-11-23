# 📘 **ROADMAP — Projeto Alyssa PoC (Minecraft + NeoForge)**

**Objetivo:** Criar a infraestrutura completa do mundo da Alyssa antes de implementar a própria IA.
**Meta secundária:** Aprender Java + NeoForge de forma progressiva e prática.

---

# 🟦 **FASE 1 — Fundamentos do Mod (Registries + Estrutura Básica)**

### ✔ 1.1 — Setup

* [X] Configurar ambiente (IntelliJ IDEA + JDK + NeoForge MDK)
* [X] Criar estrutura de pacotes padrão
* [X] Implementar classe principal do mod
* [X] adicionar logging SLF4J
* [X] Criar Creative Tab “Alyssa”

### ✔ 1.2 — Itens Básicos

* [ ] Item: **Heart Core**
* [ ] Item: **Memory Crystal**
* [ ] Item: **Emotion Module**
* [ ] Item: **Neural Core Fragment**
* [ ] Item: **LED Iris Chip**
* [ ] Tooltip avançado (shift info)

### ✔ 1.3 — Blocos Básicos

* [ ] Bloco: **AI Frame**
* [ ] Bloco: **Cooling Unit** (emite partículas)
* [ ] Bloco: **Data Relay Block**
* [ ] Bloco translúcido: **BioGel Tank**
* [ ] Bloco luminoso: **Energy Node**

---

# 🟩 **FASE 2 — Sistemas de Componentes (Blocos Funcionais)**

### ✔ 2.1 — Energia

* [ ] Criar **Battery Block** (com carga NBT)
* [ ] Criar sistema simples de transmissão de energia
* [ ] Bloco: **Power Link Node** (visual para os cabos)

### ✔ 2.2 — Sensores

* [ ] Sensor de Proximidade (detecta entidades em raio)
* [ ] Sensor Óptico (raycast forward)
* [ ] Sensor Térmico (lê condição do bioma)
* [ ] Sistema de sincronização Client/Server

### ✔ 2.3 — GUI e Interação

* [ ] Bloco: **Terminal de Diagnóstico**
* [ ] Criar GUI estilo Terminal
* [ ] Comandos internos (a serem integrados à Alyssa futuramente)
* [ ] Networking básico: pacotes C→S e S→C

---

# 🟥 **FASE 3 — Máquinas e Infraestrutura Técnica**

### ✔ 3.1 — Fabricator

* [ ] Criar bloco-base
* [ ] Criar BlockEntity
* [ ] Criar GUI com slots
* [ ] Criar receitas personalizadas
* [ ] Criar animação (partículas/som) quando fabricando

### ✔ 3.2 — Fluidos

* [ ] Criar fluido: **Refrigeração Líquida**
* [ ] Criar tanque de armazenamento
* [ ] Criar bloco: **Purificador de Líquido Refrigerante**
* [ ] Renderização do fluido no bloco

### ✔ 3.3 — Máquina de Cura

* [ ] Criar **Healing Pod**
* [ ] Efeito visual ao usar
* [ ] Regeneração gradual do jogador
* [ ] Conectar com o sistema de energia

---

# 🟨 **FASE 4 — Estruturas e World Generation**

### ✔ 4.1 — Estruturas Primárias

* [ ] **Laboratório da Alyssa** (estrutura principal)
* [ ] Templates via Jigsaw
* [ ] Geração em biomas específicos

### ✔ 4.2 — Estruturas Secundárias

* [ ] **Ruínas Tecnológicas**
* [ ] Loot customizado (Memory Shards, Chips, etc)
* [ ] **Árvore Digital** (folhas que brilham)

---

# 🟪 **FASE 5 — Infra para a Alyssa (sem a Alyssa ainda)**

### ✔ 5.1 — Sistemas que ela vai usar

* [ ] Sistema de Sensores unificado (API interna)
* [ ] Sistema de Logs/Debug interno
* [ ] Inventário interno dela
* [ ] Sistema de Energia interno
* [ ] Sistema de "Memória" (NBT + arquivo JSON no world folder)

### ✔ 5.2 — Corpo Virtual dela (sem spawn ainda)

* [ ] Player-like renderer
* [ ] Animação idle/walk
* [ ] Olhar para entidades
* [ ] Placeholder dummy model para futuros testes

---

# 🟧 **FASE 6 — Integração com IA Externa (Opcional)**

*(Para testes antes da Alyssa de verdade)*

* [ ] Endpoint para GPT/LLaMA
* [ ] Balão de fala
* [ ] Terminal de linha de comando enviando mensagens para IA
* [ ] Sistema simples de intenções

---

# 🟫 **FASE 7 — Preparação Final para Inserir a Alyssa**

*(Depois que TODO o mundo dela existir)*

* [ ] Criar classe da entidade “AlyssaEntity”
* [ ] Adaptador de sensores → IA dela
* [ ] Adaptador de ações → movimentação e interação no mundo
* [ ] Testes de comportamento
* [ ] Spawn via item “Alyssa Core”

---

# 🟦 **FASE 8 (Opcional) — Polimento**

* [ ] Partículas personalizadas
* [ ] Sons customizados
* [ ] Shader dos olhos
* [ ] Item “Debug Stick” avançado
* [ ] Uma “skin oficial” dela no Minecraft

---

# 🏁 **FIM DO ROADMAP**

A Alyssa poderá ser adicionada apenas no final, com tudo pronto para ela funcionar como um player inteligente.

---