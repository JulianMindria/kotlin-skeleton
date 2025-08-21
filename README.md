# ⚙️ Settings Skeleton – Kotlin (Jetpack Compose)

A lightweight **skeleton project** for quickly building a **settings screen** in Android using **Kotlin**, **Jetpack Compose**, and **MVVM architecture**.
This boilerplate provides a clean and extensible structure to add toggles, lists, navigation, and custom settings with minimal setup.

---

## 🚀 Features

* 📱 Built with **Jetpack Compose**
* 🏗️ Organized using **MVVM + Clean Architecture**
* ⚡ Integrated with **Hilt (Dependency Injection)**
* 🗂️ Uses **Navigation Component** for screen routing
* 🎨 Material 3 UI out of the box
* 🔧 Predefined settings components:

  * Switch (on/off)
  * Dropdown selector
  * Navigation row
  * Section headers

---

## 📂 Project Structure

```
com.julianmindria.skeleton
│── data/              # Data sources, repositories
│── di/                # Hilt modules
│── ui/                # UI screens (Jetpack Compose)
│   └── settings/      # Settings screen + components
│── viewmodel/         # State handling
│── MainActivity.kt    # App entry
```

---

## ⚡ Getting Started

### Prerequisites

* Android Studio Ladybug or newer
* Kotlin 1.9+
* Gradle 8+
* Min SDK 24, Target SDK 35+

### Installation

Clone the repo:

```bash
git clone https://github.com/yourusername/settings-skeleton-kotlin.git
cd settings-skeleton-kotlin
```

Open in **Android Studio** and run on an emulator or device.

---

## 🛠️ Usage

1. Add your own settings items inside `SettingsScreen.kt`:

```kotlin
SettingItem.Switch(
    title = "Dark Mode",
    checked = state.isDarkMode,
    onCheckedChange = { viewModel.toggleDarkMode() }
)
```

2. Extend the `SettingsViewModel` to handle state.

3. Customize themes in `Theme.kt`.

---

## 📸 Screenshots

*Add screenshots here once UI is finalized.*

---

## 🔮 Roadmap

* [ ] Add persistence with DataStore
* [ ] Support dynamic theming
* [ ] Add multi-language support
* [ ] Example of nested settings screens

---

## 🤝 Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you’d like to change.

---

## 📄 License

MIT License. Free to use and modify.

---

Do you want me to make this README **more like a Play Store–ready description** (user-focused) or keep it **developer-oriented boilerplate** (for GitHub)?
