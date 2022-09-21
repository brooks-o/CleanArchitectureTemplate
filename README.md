# CleanArchitectureTemplate

# Directory Tree
```bash
├── app
│   └── src
│       ├── main
│            ├── AndroidManifest.xml
│            ├── kotlin
│               └── com
│                   └── example
│                       └── cleanarchitecturetemplate
│                           ├── MyApplication.kt
│                           └── di
│                               ├── ApiModule.kt
│                               ├── DataSourceModule.kt
│                               ├── NetworkModule.kt
│                               ├── RepositoryModule.kt
│                               ├── RoomDatabaseModule.kt
│                               └── UseCaseModule.kt
├── base
│   └── src
│       ├── main
│           └── kotlin
│               └── com
│                   └── example
│                       └── base
│                           ├── extensions
│                           │   ├── MutableLiveDataExt.kt
│                           │   ├── NonNullLiveDataExt.kt
│                           │   ├── RecyclerViewExt.kt
│                           │   ├── RxKotlinExt.kt
│                           │   └── ViewExt.kt
│                           ├── network
│                           │   ├── BaseApolloApi.kt
│                           │   └── BaseNetworkState.kt
│                           ├── ui
│                           │   ├── BaseActivity.kt
│                           │   ├── BaseAdapter.kt
│                           │   ├── BaseDialog.kt
│                           │   ├── BaseFragment.kt
│                           │   ├── BaseUIFunction.kt
│                           │   └── BaseViewHolder.kt
│                           └── viewmodel
│                               └── BaseViewModel.kt
├── buildSrc
│   ├── build.gradle.kts
│   └── src
│       └── main
│           └── kotlin
│               └── com
│                   └── example
│                       └── buildSrc
│                           ├── Configuration.kt
│                           └── Dependencies.kt
├── data
│   └── src
│       ├── main
│           └── kotlin
│               └── com
│                   └── example
│                       └── data
│                           ├── api
│                           │   └── PokemonApi.kt
│                           ├── datasource
│                           │   ├── PokemonDataSource.kt
│                           │   └── remote
│                           │       └── PokemonDataSourceImpl.kt
│                           └── repository
│                               └── PokemonRepositoryImpl.kt
├── domain
│   └── src
│       ├── main
│       │   ├── graphql
│       │   │   └── query
│       │   │       ├── Pokemon_v2_pokemon.graphql
│       │   │       └── schema.json
│       │   └── kotlin
│       │       └── com
│       │           └── example
│       │               └── domain
│       │                   ├── repository
│       │                   │   └── PokemonRepository.kt
│       │                   └── usecase
│       │                       ├── GetPokemonListByCoroutineUseCase.kt
│       │                       └── GetPokemonListUseCase.kt
├── presentation
│   └── src
│       ├── main
│           ├── graphql
│           ├── kotlin
│           │   └── com
│           │       └── example
│           │           └── presentation
│           │               ├── model
│           │               │   ├── PokemonListModel.kt
│           │               │   └── PokemonModel.kt
│           │               ├── view
│           │               │   ├── MainActivity.kt
│           │               │   ├── MainAdapter.kt
│           │               │   └── MainViewHolder.kt
│           │               └── viewmodel
│           │                   └── PokemonViewModel.kt
│           └── res
│               └── layout
│                   ├── activity_main.xml
│                   └── item_pokemon.xml
├── schema.graphql
└── settings.gradle
```
