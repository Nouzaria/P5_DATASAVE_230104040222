# 🛡️ Keva (Keep-Value Data Saver)

**Keva** adalah aplikasi percontohan persistensi data Android modern yang dirancang untuk mendemonstrasikan implementasi penyimpanan ringan. Aplikasi ini dibangun dengan **Jetpack Compose** dan **Material 3** untuk memberikan pengalaman pengguna yang responsif.

---

## 📖 Table of Contents
- [Overview](#-overview)
- [Key Features](#-key-features)
- [Project Structure Tree](#-project-structure-tree)
- [UI & Design System](#-ui--design-system)
- [Tech Stack](#-tech-stack)
- [Installation](#-installation)

---

## 🚀 Overview
  
Dalam pengembangan aplikasi seluler, memilih strategi penyimpanan yang tepat sangat penting. **Keva** mengimplementasikan dua metode utama untuk efisiensi data:
  
1. 🔑 **SharedPreferences Hub:** Digunakan untuk mengelola data primitif kecil seperti Nama, NIM, dan preferensi tema.
2. 📄 **Internal Note Manager:** Menangani data teks kompleks di penyimpanan internal (`filesDir/keva_notes`) dengan operasi CRUD lengkap.
  
Aplikasi ini menggunakan arsitektur **Repository Pattern** dan **ViewModel** untuk memisahkan layer UI dengan data.
  
---
  
## ✨ Key Features

### 1. 📂 SharedPreferences Engine (Key-Value)
* **Identity Saving:** Menyimpan Nama dan NIM secara persisten.
* **State Management:** Mengelola status "Remember Me" dan sinkronisasi preferensi Dark Mode.
* **Live Preview:** Menampilkan hasil data yang tersimpan secara interaktif.
  
### 2. 📝 Advanced File Handling (Internal Storage)
* **CRUD Notes:** Membuat, membaca, memperbarui, dan menghapus catatan teks di direktori internal.
* **Smart Indexing:** Menggunakan file JSON (`_index.json`) untuk manajemen metadata file agar akses lebih cepat.
* **File Picker:** Antarmuka dialog untuk memilih file secara aman sebelum diproses.
  
---

## 🌲 Project Structure Tree

```text
app/
  ├── build.gradle.kts                # Konfigurasi dependensi & Compose
  └── src/main/
      ├── AndroidManifest.xml         # Definisi ikon, label & Activity
      ├── java/id/antasari/p5datasave_nimanda/
      │   ├── MainActivity.kt         # Scaffold utama, TopAppBar & BottomBar
      │   ├── navigation/             # Sistem navigasi aplikasi
      │   │   ├── Destinations.kt     # Definisi route & ikon tab
      │   │   ├── NavGraph.kt         # Mapping rute ke layar (NavHost)
      │   │   └── NavExt.kt           # Helper navigasi SingleTop
      │   ├── data/                   # Layer akses data
      │   │   ├── prefs/              # Pengelolaan SharedPreferences
      │   │   │   ├── Prefs.kt        # Data class model preferensi
      │   │   │   └── PreferencesRepository.kt # Logika Save/Load/Clear
      │   │   └── files/              # Pengelolaan File Internal
      │   │       ├── NoteMeta.kt     # Model metadata catatan 
      │   │       └── FilesRepository.kt # Operasi I/O File & JSON Index 
      │   └── ui/                     # Layer antarmuka pengguna 
      │       ├── screens/            # Layar fungsional utama
      │       │   ├── HomeScreen.kt   # Dashboard dengan kartu navigasi
      │       │   ├── SharedPrefsScreen.kt # Form input & preview key-value
      │       │   ├── FilesScreen.kt  # Editor catatan & manajemen file 
      │       │   └── AboutScreen.kt  # Informasi versi & tips aplikasi
      │       ├── components/         # Komponen UI yang dapat digunakan kembali
      │       │   ├── Chip.kt         # Label pil kustom (KevaChip)
      │       │   ├── GradientCard.kt # Kartu hero dengan gradasi warna
      │       │   └── InfoBanner.kt   # Banner informasi & tips kecil 
      │       └── theme/              # Design tokens & tema Material 3
      │           ├── Color.kt        # Definisi palet warna brand Keva
      │           ├── Theme.kt        # Konfigurasi Light/Dark color scheme 
      │           ├── Typography.kt   # Pengaturan font & gaya teks 
      │           └── Shapes.kt       # Definisi radius sudut komponen 
      └── res/                        # Resource non-kode
          ├── values/strings.xml      # Resource teks & nama aplikasi 
          └── drawable/               # Ikon & logo foreground
```
---

## 🎨 UI & Design System

Keva menggunakan identitas visual unik berbasis Material 3:

* **Gradient Cards:** Kartu hero dengan gradasi warna KevaGreen ($0xFF108981$) dan KevaBlue ($0xFF3682F6$).
* **Responsive Layout:** Menggunakan FlowRow untuk chip label yang otomatis menyesuaikan ukuran layar.
* **Adaptive Icons:** Ikon peluncur adaptif dengan latar warna brand Keva yang konsisten.

---

## 🛠 Tech Stack

* **Language:** Kotlin
* **UI Toolkit:** Jetpack Compose (Material 3)
* **Architecture:** Repository Pattern + ViewModel
* **Serialization:** JSON (via org.json)

---

## 📦 Installation

### 1. Clone the repository
```Bash
git clone [https://github.com/Nouzaria/P5_DATASAVE_230104040222.git](https://github.com/Nouzaria/P5_DATASAVE_230104040222.git)
```
### 2. Open in Android Studio
* Gunakan versi Narwhal | 2025.1.110.
### 3. Run on Device
* Minimum SDK: **API 24 (Android 7.0).**

---

<p align="center">
  Created by <b>Nouzaria</b>
</p>
