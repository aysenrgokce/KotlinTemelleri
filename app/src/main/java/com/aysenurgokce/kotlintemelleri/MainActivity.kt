package com.aysenurgokce.kotlintemelleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {//ilk çalışacak fonksiyon
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 1- Değişken Oluşturma
        //var ile tanımlanan değişkenler değiştirilebilir
        var degiskenVar= "merhaba"
        degiskenVar="yeni değer atadım"

        //val ile tanımlanan değişken değiştirilemez
        val degiskenVal = 44
        //degiskenVal = 45 ---> hata alırım değiştiremem


        //2- Veri Tipleri
        val tamSayı : Int = 10
        val ondalıkSayi : Double = 10.4
        val karakter : Char ='K'
        val metin: String = "Kotlin"
        val myFloat = 3.14f
        val mantıksal:Boolean = true //true-false

        //veri tipleri üzerinde çeşitli matematiksel işlemler yapabiliriz
        val sayi1: Int = 15
        val sayi2: Int = 4
        val toplama: Int = sayi1 + sayi2 // Toplama

        val ondalik1: Double = 5.5
        val ondalik2: Double = 2.2
        val ondalikCikarma: Double = ondalik1 - ondalik2


        val karakter1: Char = 'A'
        val karakter2: Char = 'B'
        val karakterToplam: Int = karakter1.code + karakter2.code // ASCII değerlerini topladık

        val metin1: String = "Merhaba"
        val metin2: String = "Dünya"
        val birlesikMetin: String = metin1 + " " + metin2 // String birleştirme

        // Mantıksal işlemler
        val durum1: Boolean = true
        val durum2: Boolean = false
        val mantikVe: Boolean = durum1 && durum2 // AND işlemi
        val mantikVeya: Boolean = durum1 || durum2 // OR işlemi
        val mantikDegil: Boolean = !durum1 // NOT işlemi

        //yaptığımız işlemleri konsolda yazdıralım
        println("Toplama: $toplama")
        println("Ondalık Toplama: $ondalikCikarma")
        println("Karakter Toplam (ASCII): $karakterToplam")
        println("Birleşik Metin: $birlesikMetin")
        println("Mantıksal VE: $mantikVe")
        println("Mantıksal VEYA: $mantikVeya")
        println("Mantıksal DEĞİL: $mantikDegil")


        //3Veri Tipleri Arasında Dönüştürme
        // 3.1. String->Int
        val stringSayi = "123"
        val cevrilenSayi: Int = stringSayi.toInt()
        println("String'den Int'e dönüştürülen sayı: $cevrilenSayi")

        // 3.2. Int->Double
        val sayiDouble: Double = cevrilenSayi.toDouble()
        println("Int'ten Double'a dönüştürülen sayı: $sayiDouble")

        // 3.3. String->Double
        val stringOndalik = "45.67"
        val cevrilenOndalik: Double = stringOndalik.toDouble()
        println("String'den Double'a dönüştürülen sayı: $cevrilenOndalik")


        //4.Koleksiyonlar
       // 4.1 Arraylar->aynı türden birden fazla veriyi saklamak için kullanılan yapılardır.
        val myArray = arrayOf("Ayşenur","Aybars","Fikret")
        println(myArray.size)//dizi boyut
        println(myArray[0])//erişim
        myArray[0]="Akkız"//güncelleme
        myArray.set(2,"Esra")
        val karisik = arrayOf(1, "Merhaba", true)
        val ondalikliSayilar = doubleArrayOf(1.1, 2.2, 3.3)//tipi biz belirleyebiliriz

        //4.2 List-ArrayList: Listeler iki türde bulunur;değiştirilebilir (mutableListOf() kullanılarak oluşturulur.)ve değiştirilemez( listOf() kullanılarak oluşturulur.)
       val mydiller = arrayListOf<String >("Kotlin", "Java", "Python")
        //Immutable Listeler (Değiştirilemez)-listOf() kullanacağız
        val diller = listOf("Kotlin", "Java", "Python")
        println(diller[0])
        println(diller.size)
    // diller.add("C#") // Hata: Immutable listeler değiştirilemez

        //Mutable Listeler (Değiştirilebilir) mutableListOf()
        val diller2 = mutableListOf("Kotlin", "Java", "Python")
        diller2.add("C#") // Listeye eleman ekler
        println(diller2)

        diller2.remove("Java") // Elemanı kaldırır
        println(diller2)

        diller2[1] = "Swift" // Elemanı değiştirir
        println(diller2) // [Kotlin, Swift, C#]
//Arraylerde ben boyutu belirledikten sonra eleman ekleyemiyorum fakat Arraylistlerde eleman ekleyebilirim

        //4.3 Set(küme)-bir eleman sadece 1 defa yer alır
        val mySet = setOf<String>("Ayşenur","Nazlı","Ahmet")
        println(mySet.size)

        val myIntSet = HashSet<Int>()
        myIntSet.add(3)

        //4.4 Map, anahtar(key)-değer(value) çiftlerini saklamak için kullanılan bir veri yapısıdır.
        val studentGrades = hashMapOf<String, Int>()

        studentGrades["Ali"] = 85
        studentGrades["Ayşe"] = 90
        studentGrades["Mehmet"] = 78

        // HashMap içeriğini yazdırma
        println(studentGrades)
        // Belirli bir öğrencinin notunu alma
        println("Ali'nin notu: ${studentGrades["Ali"]}")  // Ali'nin notu: 85

        // Notu güncelleme
        studentGrades["Ali"] = 95
        println("Güncellenmiş Ali'nin notu: ${studentGrades["Ali"]}")

        // Bir öğrenciyi kaldırma
        studentGrades.remove("Mehmet")
        println(studentGrades)

        // Öğrenci sayısını yazdırma
        println("Öğrenci sayısı: ${studentGrades.size}")

        //diğer yöntem
        val studentGrades2 = hashMapOf<String ,Int>(
            "Ali" to 90,
            "Ayşe" to 85,
            "Mehmet" to 78
        )
        println(studentGrades2["Ayşe"])


        //Operatörler
        val a = 10
        val b = 3
        println(a + b)  // 13
        println(a % b)  // 1
        println(a > b)  // true
        println(a <= b) // false
        println(a > 5 && b < 5)  // true
        println(a < 5 || b < 5)  // true
        println(!(a > 5))        // false


        var c = 5
        println(++c)  // 6 (Önce artır, sonra kullan)
        println(c--)  // 6 (Önce kullan, sonra azalt)
        println(c)    // 5

        val x = 5
        println(x in 1..10)  // true
        println(x !in 1..4)  // true

        //if kontrol
        /*1-if (koşul) {
            // Koşul doğruysa çalıştırılacak kod
        }*/
        val number = 10

        if (number > 5) {
            println("Sayı 5'ten büyüktür.")
        }
        //2-if-else Kullanımı
        /*if (koşul) {
             // Koşul doğruysa çalıştırılacak kod
       } else {
             // Koşul yanlışsa çalıştırılacak kod
        }*/
        val number2 = 3

        if (number2 > 5) {
            println("Sayı 5'ten büyüktür.")
        } else {
            println("Sayı 5'ten küçük veya eşittir.")
        }

        // if-else if Kullanımı
        /*
        if (koşul1) {
           Koşul1 doğruysa çalıştırılacak kod
       }else if (koşul2) {
           Koşul2 doğruysa çalıştırılacak kod
       } else {
           Hiçbiri doğru değilse çalıştırılacak kod
       } */
        val number3 = 7

        if (number3 < 0) {
            println("Negatif bir sayı.")
        } else if (number3 == 0) {
            println("Sayı sıfır.")
        } else {
            println("Pozitif bir sayı.")
        }

        //switch when kullanımı
        /*when (değer) {
          durum1 -> // durum1 gerçekleştiğinde yapılacak işlem
          durum2 -> // durum2 gerçekleştiğinde yapılacak işlem
          else ->  // Hiçbir durum eşleşmezse yapılacak işlem}*/

        val day = 3

        when (day) {
            1 -> println("Pazartesi")
            2 -> println("Salı")
            3 -> println("Çarşamba")
            else -> println("Geçersiz gün")
        }
        // else İfadesi ->else, hiçbir durumun eşleşmediği durumlarda çalıştırılır. Zorunludur, aksi takdirde when eksik kalabilir.
        val color = "blue"

        when (color) {
            "red" -> println("Kırmızı")
            "green" -> println("Yeşil")
            else -> println("Bilinmeyen renk")
        }
        //çoklu kontrol
        val number4 = 5

        when (number4) {
            1, 2, 3 -> println("1 ile 3 arasında")
            4, 5 -> println("4 veya 5")
            else -> println("Başka bir sayı")
        }

        //4 Koşul Olarak when
        val number5 = 15

        when {
            number5 < 0 -> println("Negatif bir sayı")
            number5 in 1..10 -> println("1 ile 10 arasında")
            number5 > 10 -> println("10'dan büyük")
        }

        //for döngüsü
        /*
        for (eleman in koleksiyon) {
             Her bir eleman için çalıştırılacak kod
        }*/
        val names = listOf("Ali", "Ayşe", "Ahmet")

        for (name in names) {
            println(name)
        }

        //2. Aralık (Range) Kullanımı ->for döngüsü, sayıları belirli bir aralıkta tekrarlamak için kullanılabilir. Kotlin'de aralıklar .. operatörüyle tanımlanı
        for (i in 1..5) {
            println(i)
        }
        for (i in 1..10 step 2) {//Belirli Adımlarla Döngü (Step)
            println(i)
        }
        for (i in 10 downTo 1) {//Azalan Sıralama (DownTo)
            println(i)
        }

        val fruits = listOf("Elma", "Armut", "Muz")

        for ((index, fruit) in fruits.withIndex()) {//Koleksiyonun İndeksleriyle Çalışmak  Bir koleksiyonun hem indekslerine hem de elemanlarına erişmek için withIndex() kullanılır.
            println("$index: $fruit")
        }

        val numbers = listOf(10, 20, 30)

        for (i in numbers.indices) {//İndeks Tabanlı Döngü
            println("Index $i: ${numbers[i]}")
        }

        //forEach-> koleksiyondaki her bir öğeyi sırayla dolaşır ve verilen lambda fonksiyonunu uygular
        /*koleksiyon.forEach { eleman ->
           Her bir eleman için yapılacak işlem
        } */
        val names2 = listOf("Ali", "Ayşe", "Ahmet")

        names.forEach { name ->
            println(name)
        }
        val num  = listOf(1, 2, 3, 4, 5)

        num.forEach {
            println(it)
        }

        val fruits2 = listOf("Elma", "Armut", "Muz")

        fruits2.forEachIndexed { index, fruit ->//hem elemanları hem de indekslerini kullanmanızı sağlar
            println("$index: $fruit")
        }

        val num2 = listOf(1, 2, 3, 4, 5)

        num2.forEach { number ->//Döngüyü tamamen sonlandırmak için return@forEach kullanılabilir:
            if (number == 3) return@forEach // 3'e geldiğinde döngünün o adımını atla
            println(number)
        }

        run {
            num2.forEach {
                if (it == 3) return@run // Döngüyü tamamen bitir
                println(it)
            }
        }

        //While- do-while ->Kotlin'de while ve do-while döngüleri, belirli bir koşul sağlandığı sürece kodun tekrar tekrar çalıştırılması için kullanılır.
       // Bu döngüler, döngü sayısının önceden bilinmediği durumlarda kullanışlıdır.

        /*while (koşul) { true olduğu sürece çalışır
            Koşul doğru olduğu sürece bu kod bloğu çalışır
         }*/

        var i = 1
        while (i <= 5) {
            println("i = $i")
            i++ // i değerini her seferinde 1 artır
        }

        /*do-while Döngüsü

        do {
             Kod bloğu en az bir kez çalışır
        } while (koşul) */
        var j = 6
        do {
            println("j = $j")
            j++
        } while (j <= 5)

        //break ve continue Kullanımı
        /*break: Döngüyü tamamen sonlandırır.
        continue: Döngünün mevcut adımını atlar ve bir sonraki adıma geçer.*/

        //ÖRNEKLER

        //Kullanıcı Girişi ile Örnek
        var password: String
        do {
            println("Lütfen şifrenizi girin:")
            password = readLine() ?: ""
        } while (password != "12345")

        println("Şifre doğru! Hoş geldiniz.")






























    }
}