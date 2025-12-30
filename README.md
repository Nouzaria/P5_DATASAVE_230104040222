# 🛡️ Keva (Keep-Value Data Saver)

**Keva** adalah aplikasi percontohan persistensi data Android modern yang dirancang untuk mendemonstrasikan implementasi penyimpanan ringan. [cite_start]Aplikasi ini dibangun dengan **Jetpack Compose** dan **Material 3** untuk memberikan pengalaman pengguna yang responsif[cite: 577, 596].

---

## 📖 Table of Contents
  
  - [Overview](#-overview)
  - [Key Features](#-key-features)
  - [Project Structure Tree](#-project-structure-tree)
  - [UI & Design System](#-ui--design-system)
  - [Tech Stack](#-tech-stack)
  - [Installation](#-installation)
  - [Screenshots](#-screenshots)

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
