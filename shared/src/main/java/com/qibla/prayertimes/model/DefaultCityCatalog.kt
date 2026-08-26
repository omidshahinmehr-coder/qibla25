package com.qibla.prayertimes.model

/**
 * One catalog entry with names in all three languages the phone app supports, plus
 * coordinates. This is pure data with no Android Context/locale dependency, so it can be
 * shared as-is by both the phone app (which picks a name using the user's in-app language
 * choice — see the app module's own model/CityCatalog.kt) and the watch app (which picks a name
 * using the device's system language, since the watch has no language setting of its own).
 */
data class CityCatalogEntry(
    val nameFa: String,
    val nameEn: String,
    val nameAr: String,
    val lat: Double,
    val lon: Double
) {
    fun nameFor(language: String): String = when (language) {
        "fa" -> nameFa
        "ar" -> nameAr
        else -> nameEn
    }
}

/** The full default-city list — Iran, the shrine cities, and major world cities. */
val DEFAULT_CITY_CATALOG: List<CityCatalogEntry> = listOf(
    // --- حرمین شریفین / The Two Holy Mosques ---
    CityCatalogEntry("مکه مکرمه", "Mecca", "مكة المكرمة", 21.4225, 39.8262),
    CityCatalogEntry("مدینه منوره", "Medina", "المدينة المنورة", 24.5247, 39.5692),

    // --- شهرهای زیارتی عراق / Iraqi pilgrimage cities ---
    CityCatalogEntry("کربلا", "Karbala", "كربلاء", 32.6149, 44.0246),
    CityCatalogEntry("نجف", "Najaf", "النجف", 31.9986, 44.3325),
    CityCatalogEntry("کاظمین (بغداد)", "Kadhimiya (Baghdad)", "الكاظمية (بغداد)", 33.3785, 44.3405),
    CityCatalogEntry("سامرا", "Samarra", "سامراء", 34.1959, 43.8742),
    CityCatalogEntry("بغداد", "Baghdad", "بغداد", 33.3152, 44.3661),
    CityCatalogEntry("بصره", "Basra", "البصرة", 30.5085, 47.7835),

    // --- شام و منطقه / Levant ---
    CityCatalogEntry("دمشق", "Damascus", "دمشق", 33.5138, 36.2765),
    CityCatalogEntry("بیروت", "Beirut", "بيروت", 33.8938, 35.5018),
    CityCatalogEntry("قدس (بیت‌المقدس)", "Jerusalem", "القدس", 31.7683, 35.2137),

    // --- استان‌های مرکز ایران / Central Iran ---
    CityCatalogEntry("تهران", "Tehran", "طهران", 35.6892, 51.3890),
    CityCatalogEntry("قم", "Qom", "قم", 34.6401, 50.8764),
    CityCatalogEntry("کرج", "Karaj", "كرج", 35.8400, 50.9391),
    CityCatalogEntry("اراک", "Arak", "أراك", 34.0954, 49.6900),
    CityCatalogEntry("قزوین", "Qazvin", "قزوين", 36.2688, 50.0041),
    CityCatalogEntry("سمنان", "Semnan", "سمنان", 35.5769, 53.3971),

    // --- خراسان / Khorasan ---
    CityCatalogEntry("مشهد", "Mashhad", "مشهد", 36.2605, 59.6168),
    CityCatalogEntry("نیشابور", "Nishapur", "نيسابور", 36.2133, 58.7958),
    CityCatalogEntry("بیرجند", "Birjand", "بيرجند", 32.8663, 59.2211),
    CityCatalogEntry("بجنورد", "Bojnord", "بجنورد", 37.4747, 57.3291),
    CityCatalogEntry("سبزوار", "Sabzevar", "سبزوار", 36.2126, 57.6788),

    // --- فارس و جنوب / Fars & the south ---
    CityCatalogEntry("شیراز", "Shiraz", "شيراز", 29.5918, 52.5837),
    CityCatalogEntry("بندرعباس", "Bandar Abbas", "بندر عباس", 27.1865, 56.2808),
    CityCatalogEntry("بوشهر", "Bushehr", "بوشهر", 28.9684, 50.8385),
    CityCatalogEntry("یاسوج", "Yasuj", "ياسوج", 30.6682, 51.5880),
    CityCatalogEntry("بندر لنگه", "Bandar Lengeh", "بندر لنگه", 26.5578, 54.8807),
    CityCatalogEntry("کیش", "Kish Island", "جزيرة كيش", 26.5578, 53.9773),
    CityCatalogEntry("قشم", "Qeshm", "قشم", 26.9581, 56.2719),

    // --- اصفهان و مرکز / Isfahan & central plateau ---
    CityCatalogEntry("اصفهان", "Isfahan", "أصفهان", 32.6546, 51.6680),
    CityCatalogEntry("کاشان", "Kashan", "كاشان", 33.9850, 51.4100),
    CityCatalogEntry("یزد", "Yazd", "يزد", 31.8974, 54.3569),
    CityCatalogEntry("کرمان", "Kerman", "كرمان", 30.2839, 57.0834),
    CityCatalogEntry("زاهدان", "Zahedan", "زاهدان", 29.4963, 60.8629),
    CityCatalogEntry("رفسنجان", "Rafsanjan", "رفسنجان", 30.4067, 55.9938),

    // --- غرب و شمال‌غرب / West & northwest ---
    CityCatalogEntry("تبریز", "Tabriz", "تبريز", 38.0800, 46.2919),
    CityCatalogEntry("ارومیه", "Urmia", "أرومية", 37.5527, 45.0761),
    CityCatalogEntry("اردبیل", "Ardabil", "أردبيل", 38.2498, 48.2933),
    CityCatalogEntry("زنجان", "Zanjan", "زنجان", 36.6736, 48.4787),
    CityCatalogEntry("همدان", "Hamadan", "همدان", 34.7992, 48.5146),
    CityCatalogEntry("کرمانشاه", "Kermanshah", "كرمانشاه", 34.3142, 47.0650),
    CityCatalogEntry("سنندج", "Sanandaj", "سنندج", 35.3145, 46.9923),
    CityCatalogEntry("ایلام", "Ilam", "إيلام", 33.6374, 46.4227),
    CityCatalogEntry("خرم‌آباد", "Khorramabad", "خرم آباد", 33.4870, 48.3557),

    // --- شمال و دریای خزر / North & the Caspian coast ---
    CityCatalogEntry("رشت", "Rasht", "رشت", 37.2809, 49.5832),
    CityCatalogEntry("ساری", "Sari", "ساري", 36.5633, 53.0601),
    CityCatalogEntry("گرگان", "Gorgan", "جرجان", 36.8386, 54.4341),
    CityCatalogEntry("بابل", "Babol", "بابل الإيرانية", 36.5513, 52.6789),
    CityCatalogEntry("آمل", "Amol", "آمل", 36.4696, 52.3512),
    CityCatalogEntry("چالوس", "Chalus", "جالوس", 36.6550, 51.4200),
    CityCatalogEntry("بندر انزلی", "Bandar-e Anzali", "بندر أنزلي", 37.4646, 49.4599),

    // --- خوزستان و جنوب‌غرب / Khuzestan & southwest ---
    CityCatalogEntry("اهواز", "Ahvaz", "الأهواز", 31.3183, 48.6706),
    CityCatalogEntry("آبادان", "Abadan", "عبادان", 30.3392, 48.3043),
    CityCatalogEntry("دزفول", "Dezful", "دزفول", 32.3814, 48.4058),
    CityCatalogEntry("شوشتر", "Shushtar", "شوشتر", 32.0447, 48.8558),

    // --- شهرهای مهم جهان / Major world cities ---
    CityCatalogEntry("استانبول", "Istanbul", "إسطنبول", 41.0082, 28.9784),
    CityCatalogEntry("آنکارا", "Ankara", "أنقرة", 39.9334, 32.8597),
    CityCatalogEntry("قاهره", "Cairo", "القاهرة", 30.0444, 31.2357),
    CityCatalogEntry("کراچی", "Karachi", "كراتشي", 24.8607, 67.0011),
    CityCatalogEntry("لاهور", "Lahore", "لاهور", 31.5497, 74.3436),
    CityCatalogEntry("اسلام‌آباد", "Islamabad", "إسلام آباد", 33.6844, 73.0479),
    CityCatalogEntry("کابل", "Kabul", "كابل", 34.5553, 69.2075),
    CityCatalogEntry("دبی", "Dubai", "دبي", 25.2048, 55.2708),
    CityCatalogEntry("ابوظبی", "Abu Dhabi", "أبوظبي", 24.4539, 54.3773),
    CityCatalogEntry("دوحه", "Doha", "الدوحة", 25.2854, 51.5310),
    CityCatalogEntry("منامه", "Manama", "المنامة", 26.2285, 50.5860),
    CityCatalogEntry("کویت", "Kuwait City", "مدينة الكويت", 29.3759, 47.9774),
    CityCatalogEntry("مسقط", "Muscat", "مسقط", 23.5880, 58.3829),
    CityCatalogEntry("ریاض", "Riyadh", "الرياض", 24.7136, 46.6753),
    CityCatalogEntry("جده", "Jeddah", "جدة", 21.4858, 39.1925),
    CityCatalogEntry("عمان (اردن)", "Amman", "عمّان", 31.9454, 35.9284),
    CityCatalogEntry("صنعا", "Sanaa", "صنعاء", 15.3694, 44.1910),
    CityCatalogEntry("خارطوم", "Khartoum", "الخرطوم", 15.5007, 32.5599),
    CityCatalogEntry("جاکارتا", "Jakarta", "جاكرتا", -6.2088, 106.8456),
    CityCatalogEntry("کوالالامپور", "Kuala Lumpur", "كوالالمبور", 3.1390, 101.6869),
    CityCatalogEntry("داکا", "Dhaka", "دكا", 23.8103, 90.4125),
    CityCatalogEntry("دهلی نو", "New Delhi", "نيودلهي", 28.6139, 77.2090),
    CityCatalogEntry("لندن", "London", "لندن", 51.5074, -0.1278),
    CityCatalogEntry("پاریس", "Paris", "باريس", 48.8566, 2.3522),
    CityCatalogEntry("برلین", "Berlin", "برلين", 52.5200, 13.4050),
    CityCatalogEntry("مسکو", "Moscow", "موسكو", 55.7558, 37.6173),
    CityCatalogEntry("نیویورک", "New York", "نيويورك", 40.7128, -74.0060),
    CityCatalogEntry("تورنتو", "Toronto", "تورونتو", 43.6532, -79.3832),
    CityCatalogEntry("سیدنی", "Sydney", "سيدني", -33.8688, 151.2093)
)
