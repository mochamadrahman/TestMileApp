# TestMileApp

# Test Invitation For The Position Of Software Quality Assurance

## QA
### 1. Sebutkan 3 Kesalahan besar yang paling sering dilakukan oleh QA lalu berikan solusi agar tidak terjadi atau terulang kembali ?
   
   ***Jawaban*** :
   
   Tiga kesalahan tersebut adalah :
   
   1. Memperburuk kerusakan ketika melakukan perbaikan bug.
   
      Penguji software atau aplikasi sering kali berusaha memperbaiki bug yang ditemukan oleh testing tool selama tahapan pengujian tanpa benar-benar memiliki kemampuan untuk itu sehingga menyebabkan bug itu merubah menjadi kesalahan besar yang membutuhkan lebih banyak waktu dan perhatian untuk memperbaikinya.
          
   2. Berpiir kalau semua bisa dikerjakan secara bersamaan.
   
      Melakukan sebuah pekerjaan banyak dengan cepat mungkin akan menjadi nilai sendiri bagi seorang karyawan, namun hasil dari pekerjaan itulah  yang jauh lebih penting dan tidak semua orang bisa melakukan multitasking. Namun, tidak semua penguji software menyadari akan hal itu, sehingga mereka melakukan pengujian secara bersamaan. 
      
   3. Takut untuk bertanya.
   
      Seorang penguji software tentu sudah paham mengenai tahapan pengujian. Lalu bagaimana dengan tujuan pengembangan software atau aplikasi? Belum tentu mereka paham. Padahal dengan mengetahui tujuan dan ruang lingkup dari software atau aplikasi yang sedang dikembangkan sangat penting agar hasil dari pengujian sesuai dengan apa yang dibutuhkan.
          
      
   Solusi yang bisa dilakukan :
   
   1. Dibiasakan untuk mengidentifikasi dan menganalisa bug secara baik, yaitu dengan cara mengambil dan mengkoleksi gejala dari bug tersebut sebagai bahan analisa bagi orang yang mempunyai kemampuan untuk memperbaiki bug. Bug harus di laporkan dengan tertulis sehingga akan mudah dan terukur dalam pembuatan koreksi dan pelacakan apabila bug tersebut terulang kembali di kemudian hari.
   
   2. Jika menggunakan automation testing tool bisa saja melakukan beberapa pengujian secara bersamaan tetapi hal ini tidak disarankan karena bagaimanapun tahapan ini membutuhkan ketelitian ekstra agar hasilnya sesuai dengan yang diharapkan.
   
   3. Seorang penguji software tidak boleh takut untuk bertanya terutama mengenai tujuan dilakukannya pengujian dan ruang lingkup software atau aplikasi yang sedang diujikan.
    
### 2. Jelaskan point - point terpenting yang harus diperhatikan Dalam menganalisa dan membuat Skenario Test ?

  ***Jawaban*** :
    
   1. Pengguna akhir adalah kunci.
   
      Siapa yang akan melakukan testing ? Apakah test tersebut akan menjadi bagian dari paket regressi ? Apakah test tersebut akan digunakan untuk keperluan lain (contoh : training manual) ?Pertanyaan tersebut di atas menjadi dasar dalam memulai proses pembuatan skenario test. Intinya, seseorang yang menulis test tidak selalu yang melakukan test. Dengan demikian, skenario test perlu di tulis sehingga setiap orang di tiap tingkatan dapat membaca, mengerti dan melakukan test tersebut. Tujuan nya adalah apapun tingkatan dari seseorang yang melakukan test tersebut, hasil nya akan sama sperti yang diharapkan.
    
   2. Unik, terukur, spesifik.
   
      Setiap test case harus Unik, Terukur dan Spesifik.
      - Unik, seharusnya hanya ada satu skenario test dengan objek tertentu dalam skenario test yang kita buat.
      - Terukur, harus bisa menentukan di akhir pelaksanaan test apakah test ini berhasil atau gagal. Objektifitas nya harus jelas dan setiap masukan dan hasil yang di harapkan harus terpadu.
      - Spesifik, setiap skenario test harus di tuilis untuk melakukan test sebuah fungsi dan aksi tertentu. Skenario test yang baik biasa nya singkat dan jelas.
    
   3. Data.
   
      Dimasukannya data dalam langkah pelaksanaan test sangat bermanffat. Ini akan menghemat waktu dan tenaga dalam mencari sumber untuk test data. Hal ini akan membuat pelaksanaan test lebih efisien.
    
   4. Tes Case Layout.
   
      Hal-hal berikut ini harus dimasukan ke dalam sebuah test case layout :
      - Identifikasi test case spesifikasi
      - Spesifikasi masukan
      - Spesifikasi hasil
      - Kebutuhan prosedure khusus
      - Ketergantungan antar kasus
        
 ## Skenario Test
 ### UI Test
 
   ***1. UI Test Positive Scenario*** :
   
   - **Request Demo Succes** : Skenario Test berisi langkah langkah untuk melakukan sebuah Request Demo, dengan hasil yang diharapkan adalah Request Demo nya berhasil dengan memvalidasi beberapa element yang ada di Halaman Utama dari URL: https://dev.mile.app/landing.
    
   ***2. UI Test Negative Scenario*** :
      
   - **Full name Notification FieldTab Verification** : Skenario Test berisi langkah langkah untuk memvalidasi ketika pengguna tidak memasukan nama di kolom bagian Full name maka akan muncul peringatan bahwa kolom tersebut harus di isi.
   - **Email Notification FieldTab Verification** : Skenario Test berisi langkah langkah untuk memvalidasi ketika pengguna tidak memasukan alamat email dengan benar di kolom Email maka akan muncul peringatan bahwa kolom tersebut harus di isi dengan alamt email yang benar.
   - **Phone Number Notification FieldTab Verification** : Skenario Test berisi langkah langkah untuk memvalidasi ketika pengguna tidak memasukan nomor telepon di kolom Phone Number maka akan muncul peringatan bahwa kolom tersebut harus di isi.
   - **Company Name Notification FieldTab Verification** : Skenario Test berisi langkah langkah untuk memvalidasi ketika pengguna tidak memasukan tulisan atau karakter di kolom Company Name maka akan muncul peringatan bahwa kolom tersebut harus di isi.

### API Test

  - **API Unsuccessful Request Demo** : Skenario Test berisi langkah langkah untuk memvalidasi Response dari API Request, dimana validasi nya meliputi status code dan element property value dari Response.  
  
  ***Note***: dikarenakan tidak cukup tersedia nya informasi menyangkut API yaitu **JSON object as the request body**, maka hanya 1 satu skenario test yang bisa dibangun.


### Automation Test

Silahkan duplikat/clone dari repository ini, selanjut nya bisa melakukan testing dengan cara yaitu :

   ### Melakukan test dari Katalon Studio Tools (setelah menduplikasi repsitory) dengan langkah seperti berikut ini :
   
      - Menjalankan test dari file **UI Test** di bawah folder Test Suites, yang berisi kumpulan skenario test yang berhubungan dengan UI Test.
      - Menjalankan test dari file **API Test** di bawah folder Test Suites, yang berisi skenario test yang berhubungan dengan API Test.
      - Menjalankan test secara sendiri sendiri dari file test case yang berada di folder Test Cases pada path utama dari project.
      - Menjalankan test dengan command line dengan meng klik tombol **Build CMD** dari menu utama dan ikuti langkah langkah yang tampil. Setelah muncul command line, duplikat command line tersebut. Beralih ke cmd dan masuk ke path dimana Katalon Studio terinstall, lalu paste command line tersebut dan tekan Enter. Test suite akan di jalankan dengan tampil nya log execution dari Test suite bersangkutan.  
    

        
    
