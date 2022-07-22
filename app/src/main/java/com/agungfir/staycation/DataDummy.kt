package com.agungfir.staycation

class DataDummy {

    companion object {
        fun getHotels(): List<Hotel> = listOf(
            Hotel(
                "The Oberoi Lombok",
                "Lombok, Mataram",
                1_200_000,
                4.5,
                "https://ik.imagekit.io/tvlk/blog/2020/01/hotel-termewah-di-Indonesia-1.2-Traveloka.jpg",
                true
            ),
            Hotel(
                "Intercontinental Bali Resort",
                "Uluwatu, Bali",
                1_600_000,
                4.7,
                "https://ik.imagekit.io/tvlk/blog/2020/01/hotel-termewah-di-Indonesia-2-Traveloka.jpg",
                false
            ),
            Hotel(
                "Four Seasons Resort Bali at Jimbaran Bay",
                "Jimbaran, Bali",
                900_000,
                4.3,
                "https://ik.imagekit.io/tvlk/blog/2020/01/hotel-termewah-di-Indonesia-3.2-Traveloka.jpg",
                false
            ),
            Hotel(
                "Amanjiwo",
                "Majaksingi, Magelang",
                1_700_000,
                4.0,
                "https://ik.imagekit.io/tvlk/blog/2020/01/hotel-termewah-di-Indonesia-4.2-Traveloka.jpg",
                false
            ),
            Hotel(
                "Alila Purnama",
                "Raja Ampat, Ambon",
                1_900_000,
                4.0,
                "https://ik.imagekit.io/tvlk/blog/2020/01/hotel-termewah-di-Indonesia-5-Alila-Hotels.jpg",
                false
            ),
            Hotel(
                "Bawah Reserve",
                "Pulau Bawah, Anambas",
                2_900_000,
                4.0,
                "https://ik.imagekit.io/tvlk/blog/2020/01/hotel-termewah-di-Indonesia-6.2-Traveloka.jpg",
                false
            ),
        )
    }
}