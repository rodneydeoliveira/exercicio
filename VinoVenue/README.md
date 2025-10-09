# 🍷 Vino & Venue - iOS App

Um aplicativo iOS para avaliação de vinhos e restaurantes, desenvolvido em SwiftUI.

## 📱 Funcionalidades

- **Home Screen** com 4 abas principais:
  - 🍷 **Top Vinhos** - Ranking dos melhores vinhos
  - 🍽️ **Top Restaurantes** - Ranking dos melhores restaurantes  
  - 👥 **Top Avaliadores** - Ranking dos melhores usuários
  - 📝 **Avaliações Recentes** - Últimas avaliações do app

- **Sistema de Pontuação**:
  - 6 pontos por foto do rótulo do vinho
  - 6 pontos por foto do prato/ambiente
  - 2 pontos por avaliação sem foto

- **Dados Mock**:
  - Carregamento automático dos dados do arquivo JSON
  - Estrutura completa de usuários, vinhos, restaurantes e avaliações

## 🚀 Como Executar

### Pré-requisitos
- Xcode 15.0 ou superior
- iOS 17.0 ou superior
- macOS 14.0 ou superior

### Passos
1. Abra o arquivo `VinoVenue.xcodeproj` no Xcode
2. Selecione um simulador iOS ou dispositivo físico
3. Pressione `Cmd + R` para executar o app

## 📁 Estrutura do Projeto

```
VinoVenue/
├── Models/                 # Modelos de dados
│   ├── User.swift         # Usuários
│   ├── Restaurant.swift   # Restaurantes
│   ├── Wine.swift         # Vinhos
│   ├── Review.swift       # Avaliações
│   ├── Tag.swift          # Tags
│   ├── Ranking.swift      # Rankings
│   └── AppData.swift      # Estrutura principal
├── Views/                 # Telas do app
│   └── HomeView.swift     # Tela principal
├── Services/              # Serviços
│   └── DataService.swift  # Carregamento de dados
├── Resources/             # Recursos
│   └── wine-place-data-structure.json  # Dados mock
└── VinoVenueApp.swift     # App principal
```

## 🎨 Design

- **Interface moderna** com SwiftUI
- **Cards elegantes** para cada item
- **Sistema de tabs** para navegação
- **Cores temáticas** (azul para vinhos, verde para restaurantes)
- **Tipografia clara** e hierarquia visual

## 📊 Dados

O app consome dados do arquivo `wine-place-data-structure.json` que contém:
- 2 usuários de exemplo
- 2 restaurantes de exemplo  
- 3 vinhos de exemplo
- 3 avaliações de exemplo
- Sistema completo de rankings e tags

## 🔄 Próximos Passos

- [ ] Implementar sistema de tags pré-determinadas
- [ ] Adicionar busca/sugestão de restaurantes
- [ ] Implementar geocoding automático
- [ ] Criar logo do app
- [ ] Sistema de ranking mensal com prêmios
- [ ] Estratégias de monetização

## 🛠️ Tecnologias

- **SwiftUI** - Interface do usuário
- **Combine** - Gerenciamento de estado
- **Foundation** - Funcionalidades básicas
- **JSON** - Carregamento de dados mock

---

*Desenvolvido para a plataforma iOS com foco em usuários de classe média e alta.*