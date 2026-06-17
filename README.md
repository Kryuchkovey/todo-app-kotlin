# To-Do List Application 📝

Полнофункциональное приложение для управления задачами на **Kotlin** с использованием **Jetpack Compose** и локальным хранилищем **Room**.

## 🎯 Возможности

✅ **Управление задачами**
- ➕ Создание новых задач
- ✏️ Редактирование задач  
- 🗑️ Удаление задач
- ✓ Отметить как выполненную

✅ **Фильтрация и поиск**
- 🔍 Поиск по названию задачи
- 📋 Фильтр по статусу (Все, Активные, Выполненные)

✅ **Приоритеты**
- 🔴 High (Высокий) - красный
- 🟦 Normal (Обычный) - голубой  
- 🟩 Low (Низкий) - зелёный

✅ **Локальное хранилище**
- 💾 Все данные сохраняются локально в Room БД
- 🔄 Автоматическое сохранение

## 🏗️ Архитектура MVVM

```
User Interaction (UI)
    ↓
TodoScreen (View/Composable)
    ↓
TodoViewModel (ViewModel)
    ↓
TodoRepository (Repository)
    ↓
TodoDao (DAO)
    ↓
TodoDatabase (Room DB)
```

## 📦 Используемые технологии

- **Kotlin** - язык программирования
- **Jetpack Compose** - UI фреймворк
- **Room** - локальное хранилище (ORM)
- **LiveData** - реактивное обновление данных
- **Coroutines** - асинхронное программирование
- **Material3** - Material Design компоненты
- **Gradle** - система сборки

## 🚀 Установка и запуск

### Требования
- Android Studio (последняя версия)
- Android SDK 24+ (API Level 24: Android 7.0)
- Kotlin 1.9+
- Java 8+

### Шаги установки

1. **Клонируй репозиторий:**
```bash
git clone https://github.com/Kryuchkovey/todo-app-kotlin.git
cd todo-app-kotlin
```

2. **Открой в Android Studio:**
   - File → Open
   - Выбери папку `todo-app-kotlin`
   - Нажми OK

3. **Синхронизируй Gradle:**
   - Android Studio автоматически синхронизирует
   - Или нажми **Sync Now** если появится уведомление
   - Жди завершения синхронизации (может занять 1-3 минуты)

4. **Запусти приложение:**
   - Подключи Android устройство или запусти эмулятор
   - Нажми зелёную кнопку **Run** ▶ (Shift + F10)
   - Выбери устройство для запуска

## 📱 Как пользоваться приложением

### Добавить задачу
1. Нажми кнопку **+** (Floating Action Button)
2. Введи название задачи
3. Добавь описание (опционально)
4. Выбери приоритет (High, Normal, Low)
5. Нажми **Add**

### Отметить выполненной
- Нажми на задачу или на чекбокс ☑️
- Задача переместится в раздел "Completed"

### Удалить задачу
- Нажми на иконку корзины 🗑️
- Задача будет удалена

### Искать задачу
- Используй поле поиска вверху
- Введи часть названия задачи
- Результаты будут отфильтрованы автоматически

### Фильтровать задачи
- Нажми на кнопку фильтра:
  - **All** - показывает все задачи
  - **Active** - показывает только невыполненные
  - **Completed** - показывает только выполненные

## 🎨 Дизайн и интерфейс

- ✨ Минимальный и интуитивный интерфейс
- 🌓 Dark Mode поддержка (автоматическая смена)
- 🎨 Material Design 3 стиль
- ⚡ Smooth анимации переходов
- 📱 Адаптивный дизайн (работает на всех размерах экранов)

## 📂 Структура проекта

```
todo-app-kotlin/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/todoapp/
│   │   │   │   ├── MainActivity.kt          # Entry point
│   │   │   │   ├── data/
│   │   │   │   │   ├── TodoEntity.kt        # Room Entity
│   │   │   │   │   ├── TodoDao.kt           # Database DAO
│   │   │   │   │   ├── TodoDatabase.kt      # Room Database
│   │   │   │   │   └── TodoRepository.kt    # Repository паттерн
│   │   │   │   └── ui/
│   │   │   │       ├── TodoViewModel.kt     # ViewModel
│   │   │   │       ├── TodoScreen.kt        # Compose UI
│   │   │   │       └── theme/
│   │   │   │           └── Theme.kt         # Material Theme
│   │   │   ├── res/
│   │   │   │   ├── values/
│   │   │   │   │   ├── strings.xml
│   │   │   │   │   └── themes.xml
│   │   │   │   ├── mipmap/
│   │   │   │   └── drawable/
│   │   │   └── AndroidManifest.xml          # App manifest
│   │   └── test/
│   ├── build.gradle.kts                      # App dependencies
│   └── proguard-rules.pro
├── build.gradle.kts                          # Project build config
├── settings.gradle.kts                       # Project settings
├── gradle.properties                         # Gradle properties
├── .gitignore                               # Git ignore rules
└── README.md                                # This file
```

## 🔧 Решение распространённых проблем

### Ошибка: "Failed to sync Gradle"
**Решение:**
1. File → Invalidate Caches / Restart
2. Выбери "Invalidate and Restart"
3. File → Sync Project with Gradle Files

### Ошибка: "Compilation failed"
**Решение:**
1. Очистить кэш: Build → Clean Project
2. Пересобрать: Build → Rebuild Project
3. Проверить версию Kotlin (должна быть 1.9+)

### Приложение не запускается на эмуляторе
**Решение:**
1. Перезапусти эмулятор
2. Проверь что минимальная SDK версия = 24
3. Убедись что у эмулятора достаточно памяти

### Room Database ошибка
**Решение:**
1. Убедись что kapt плагин подключен в build.gradle.kts
2. Пересинхронизируй Gradle
3. Очистить проект и пересобрать

## 🚀 Возможные улучшения

- [ ] 🔐 Синхронизация с облаком (Firebase)
- [ ] ⏰ Напоминания о задачах (NotificationManager)
- [ ] 📊 Статистика выполненных задач
- [ ] 🏷️ Категории/теги для задач
- [ ] 🗣️ Голосовой ввод задач (Speech Recognition)
- [ ] 📤 Экспорт в CSV/PDF
- [ ] 🌍 Мультиязычная поддержка
- [ ] 📱 Виджет для главного экрана

## 📚 Полезные ссылки

- [Android Developer Documentation](https://developer.android.com/docs)
- [Jetpack Compose Guide](https://developer.android.com/jetpack/compose)
- [Room Database Documentation](https://developer.android.com/training/data-storage/room)
- [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html)

## 🤝 Вклад в проект

Если ты нашёл баг или хочешь добавить функцию:

1. Fork репозиторий
2. Создай свою ветку (`git checkout -b feature/AmazingFeature`)
3. Commit изменения (`git commit -m 'Add some AmazingFeature'`)
4. Push в ветку (`git push origin feature/AmazingFeature`)
5. Открой Pull Request

## 📝 Лицензия

MIT License - свободно используй в своих проектах!

See the LICENSE file for details.

## 💬 Вопросы и поддержка

Если у тебя есть вопросы или тебе нужна помощь:
- Создай [Issue](https://github.com/Kryuchkovey/todo-app-kotlin/issues) 📋
- Напиши в обсуждениях [Discussions](https://github.com/Kryuchkovey/todo-app-kotlin/discussions) 💬

---

**Создано с ❤️ на Kotlin + Compose + Room**

Получай удовольствие от разработки! 🚀
