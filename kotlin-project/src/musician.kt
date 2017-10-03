package musician

data class Musician(val lastName: String, val firstName: String,
                    val birthDate: String, val birthCity: String, val birthCountry: String,
                    val deathDate: String, val deathCity: String, val deathCountry: String)

val musicians = listOf(
        Musician("Haendel", "Georg", "1685-02-23", "Halle", "Allemagne", "1759-04-14", "Londres", "Royaume-Uni"),
        Musician("Brahms", "Johannes", "1833-05-07", "Hambourg", "Allemagne", "1897-04-03", "Vienne", "Autriche"),
        Musician("Chopin", "Frédéric", "1810-03-01", "Żelazowa Wola", "Pologne", "1849-10-17", "Paris", "France"),
        Musician("Mozart", "Wolfgang", "1756-01-27", "Salzbourg", "Allemagne", "1791-12-05", "Vienne", "Autriche"),
        Musician("Dvořák", "Antonin", "1841-09-08", "Prague", "République Tchèque", "1904-05-01", "Prague", "République Tchèque"),
        Musician("Rossini", "Gioachino", "1792-02-29", "Pesaro", "Italie", "1868-11-13", "Paris", "France"),
        Musician("Haydn", "Joseph", "1732-03-31", "Rohrau", "Autriche", "1809-05-31", "Vienne", "Autriche"),
        Musician("Mendelssohn", "Félix", "1809-02-03", "Hambourg", "Allemagne", "1847-11-04", "Leipzig", "Allemagne"),
        Musician("Tchaïkovski", "Piotr", "1840-05-07", "Votkinsk", "Russie", "1893-11-06", "Saint-Pétersbourg", "Russie"),
        Musician("Liszt", "Franz", "1811-10-22", "Raiding", "Autriche", "1886-07-31", "Bayreuth", "Allemagne"),
        Musician("Salieri", "Antonio", "1750-08-18", "Vérone", "Italie", "1825-05-07", "Vienne", "Autriche"),
        Musician("Schumann", "Robert", "1810-06-08", "Zwickau", "Allemagne", "1856-07-29", "Bonn", "Allemagne"),
        Musician("Schubert", "Franz", "1797-01-31", "Vienne", "Autriche", "1828-11-19", "Vienne", "Autriche"),
        Musician("Debussy", "Claude", "1862-08-22", "Saint-Germain-en-Laye", "France", "1918-03-25", "Paris", "France"),
        Musician("Wagner", "Richard", "1813-05-22", "Leipzig", "Allemagne", "1883-02-13", "Venise", "Italie"),
        Musician("Van Beethoven", "Ludwig", "1770-12-16", "Bonn", "Allemagne", "1827-03-29", "Vienne", "Autriche"),
        Musician("Strauss", "Richard", "1864-06-11", "Munich", "Allemagne", "1949-09-08", "Garmisch-Partenkirchen", "Allemagne"),
        Musician("Strauss", "Johann", "1825-10-25", "Vienne", "Autriche", "1899-06-03", "Vienne", "Autriche"),
        Musician("Vivaldi", "Antonio", "1678-03-04", "Venise", "Italie", "1741-07-28", "Vienne", "Autriche"),
        Musician("Verdi", "Giuseppe", "1813-10-10", "Roncole", "Italie", "1901-01-27", "Milan", "Italie"),
        Musician("Bach", "Jean-Sébastien", "1685-03-31", "Eisenach", "Allemagne", "1750-07-28", "Leipzig", "Allemagne"))

fun main(args: Array<String>) {
    TODO()
}