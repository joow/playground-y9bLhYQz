package musician

import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule

class Chapter08MusicianTest {
    @Rule @JvmField val systemOutRule: SystemOutRule = SystemOutRule().enableLog()

    @Before fun clearLog() {
        systemOutRule.clearLog()
    }

    @Test fun birth() {
        main(emptyArray())
        assertThat(systemOutRule.log).isEqualToIgnoringWhitespace("""
            |Allemagne
            |Pologne
            |République Tchèque
            |Italie
            |Autriche
            |Russie
            |France
            """.trimMargin())
    }

    @Test fun lastNames() {
        main(emptyArray())
        assertThat(systemOutRule.log).startsWith("Bach, Brahms, Chopin, Debussy, Dvořák, Haendel, Haydn, Liszt, " +
                "Mendelssohn, Mozart, Rossini, Salieri, Schubert, Schumann, Strauss, Strauss, Tchaïkovski, " +
                "Van Beethoven, Verdi, Vivaldi, Wagner")
    }

    @Test fun countB() {
        main(emptyArray())
        assertThat(systemOutRule.log).startsWith("5")
    }

    @Test fun countD() {
        main(emptyArray())
        assertThat(systemOutRule.log).contains("Royaume-Uni=1")
        assertThat(systemOutRule.log).contains("Autriche=8")
        assertThat(systemOutRule.log).contains("France=3")
        assertThat(systemOutRule.log).contains("République Tchèque=1")
        assertThat(systemOutRule.log).contains("Allemagne=5")
        assertThat(systemOutRule.log).contains("Russie=1")
        assertThat(systemOutRule.log).contains("Italie=2")
    }

    @Test fun age() {
        main(emptyArray())
        assertThat(systemOutRule.log).isEqualToIgnoringWhitespace("""
            |Franz Schubert - 31
            |Wolfgang Mozart - 35
            |Félix Mendelssohn - 38
            |Frédéric Chopin - 39
            |Robert Schumann - 46
            |Piotr Tchaïkovski - 53
            |Claude Debussy - 56
            |Ludwig Van Beethoven - 57
            |Antonin Dvořák - 63
            |Antonio Vivaldi - 63
            |Johannes Brahms - 64
            |Jean-Sébastien Bach - 65
            |Richard Wagner - 70
            |Georg Haendel - 74
            |Johann Strauss - 74
            |Franz Liszt - 75
            |Antonio Salieri - 75
            |Gioachino Rossini - 76
            |Joseph Haydn - 77
            |Richard Strauss - 85
            |Giuseppe Verdi - 88
            """.trimMargin())
    }
}