package com.example.doctorblues.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorblues.R
import com.example.doctorblues.adapter.RvAdapterIllness
import com.example.doctorblues.data.model.DataText
import com.example.doctorblues.databinding.FragmentIllBinding

class IllFragment: Fragment(){

        private lateinit var binding: FragmentIllBinding
        private lateinit var rvIllness: RecyclerView
        private lateinit var adapterIllness: RvAdapterIllness
        private lateinit var contentIllness: MutableList<DataText>
        private lateinit var layoutManagerIllness: LinearLayoutManager

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_ill,
                container, false

            )
            return binding.root
        }

    private fun initRecyclerView() {
        rvIllness = binding.rvIllness
        adapterIllness = RvAdapterIllness(contentIllness)
        rvIllness.layoutManager = layoutManagerIllness
        rvIllness.adapter = adapterIllness
        rvIllness.addItemDecoration(DividerItemDecoration(rvIllness.context,layoutManagerIllness.orientation))
    }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            fun initContent() {

            }

            contentIllness = mutableListOf<DataText>()
            contentIllness.add(
                DataText(
                    contentIllness.size+1,
                    "Krankheitsbilder",
                    "Die Gemütszustände, in die eine Mutter rund um die Geburt des Kindes geraten kann, gliedern sich vorrangig in drei verschiedene Kategorien: \n" +
                            "\n" +
                            "das postpartale Stimmungstief (Baby-Blues), \n" +
                            "die peripartale Depression, Angst- und Zwangsstörung und \n" +
                            "die peripartale Psychose. \n" +
                            "\n" +
                            "Diese Gruppen stehen nicht isoliert nebeneinander, sondern gehen oft fließend ineinander über.",

                )
            )

            contentIllness.add(
                DataText(
                    contentIllness.size+1,
                    "Ursachen",
                    "Ursachen für diese peripartalen Reaktionsformen sind individuell verschieden, da zahlreiche körperliche, hormonelle, biochemische, psychische, soziale und gesellschaftliche Faktoren ineinander fließen. Meist führt das Zusammenwirken mehrerer Ursachefaktoren zu einer psychischen Überlastungsreaktion. Anzahl und Intensität der einzelnen Belastungsfaktoren bestimmen das Ausmaß der Erkrankung. Das hat zur Folge, dass bei jeder Frau eine unterschiedliche Gewichtung der an der Erkrankung beteiligten Faktoren zu berücksichtigen ist.\n" +
                            "\n" +
                            "Physische Faktoren\n" +
                            "Gravierende hormonelle Veränderungen nach der Entbindung\n" +
                            "Schilddrüsendysfunktion\n" +
                            "biochemische Veränderungen durch die schlaflosen Nächte\n" +
                            "psychische Vorerkrankung\n" +
                            "genetische Veranlagung\n" +
                            "\n" +
                            "Peripartale Faktoren\n" +
                            "langes Warten auf eine Schwangerschaft\n" +
                            "vorhergehende Fehlgeburt\n" +
                            "ungeplante oder unerwünschte Schwangerschaft\n" +
                            "Schwangerschafts-Komplikationen\n" +
                            "Verunsicherung im Rahmen der Schwangerschaftsvorsorge\n" +
                            "Schwangerschafts-Depression\n" +
                            "traumatisches, sehr schmerzhaftes und/oder langwieriges Entbindungserlebnis\n" +
                            "Notkaiserschnitt; unruhige oder unsensible Entbindungsumgebung\n" +
                            "Frühgeburt; krankes oder totes Kind\n" +
                            "Schwierigkeiten beim Stillen\n" +
                            "abruptes und/oder ungewolltes Abstillen\n" +
                            "Einnahme bestimmter Abstill-Präparate\n" +
                            "\n" +
                            "Psychische Faktoren\n" +
                            "Abschied von der Schwangerschaft\n" +
                            "Abschied vom „Traum-Baby“\n" +
                            "Abschied von der eigenen Kindheit\n" +
                            "persönliche Einschränkungen\n" +
                            "Identitätskrise\n" +
                            "Verlust der Selbstständigkeit\n" +
                            "Verlust der Freiheit und Selbstbestimmung\n" +
                            "Perfektionismus\n" +
                            "Kontrollverlust\n" +
                            "traumatische Erlebnisse im zeitlichen Umfeld der Schwangerschaft und Entbindung\n" +
                            "belastende Umstände wie Ortswechsel, finanzielle und/oder soziale Probleme\n" +
                            "Beziehungsprobleme\n" +
                            "traumatische Erlebnisse in der Kindheit\n" +
                            "durch die Geburt reaktivierte unverarbeitete Erfahrungen aus der eigenen Lebensgeschichte\n" +
                            "\n" +
                            "Soziale Faktoren\n" +
                            "Idealisiertes Mutterbild in Literatur und Werbung\n" +
                            "in der Pflege anspruchsvolle Kinder\n" +
                            "Neufindung in die Rolle als Mutter\n" +
                            "mangelnde Unterstützung durch den Partner und das soziale Umfeld\n" +
                            "veränderte Beziehung zum Partner\n" +
                            "veränderte Beziehung zu den bereits vorhandenen Kindern\n" +
                            "veränderte Beziehung zu den Eltern und Schwiegereltern\n" +
                            "Abbruch der alten freundschaftlichen Beziehungen (zu Nicht-Eltern)\n" +
                            "Wegfall der Großfamilien und ihrer Unterstützung\n" +
                            "patriarchale Gesellschaftsform mit geringerer sozialer und materieller Sicherheit für Mütter",

                    )
            )

            contentIllness.add(
                DataText(
                    contentIllness.size+1,
                    "Aufklärung",
                    "Im Bereich der Aufklärung kommt besonders den Hebammen und Geburtsvorbereiterinnen eine tragende Rolle zu. Im Rahmen der Geburtsvorbereitung bietet sich die Chance, auf das Krankheitsbild der peripartalen psychischen Erkrankungen hinzuweisen, damit betroffene Frauen ihren Zustand schneller einordnen und sich Hilfe suchen können. Außerdem kann bei der Geburtsvorbereitung der Entstehung der postpartalen Depression entgegengewirkt werden. Zusätzlich ist es sehr wichtig, dass die Hebamme oder Geburtsvorbereiterin ihre Bereitschaft signalisiert, als Ansprechpartnerin zur Verfügung zu stehen, falls Seelennöte auftauchen. Ein solch offen ausgesprochenes Angebot erleichtert es Frauen, gegebenenfalls darauf zurückzugreifen. Neben diesem mündlichen Angebot ist es weiterhin angebracht, schriftliches Informationsmaterial zu verteilen, das im Bedarfsfall zur Verfügung steht. Alle Frauen sollten im Geburtsvorbereitungskurs ein Informationsblatt erhalten, welches in geraffter Form über peripartale Krankheitsbilder aufklärt, Ursachen und Hilfsquellen benennt. Dazu stehen Handzettel des Vereins zur Verfügung (Bestellung s. Kontakt).\n" +
                            "Eine verstärkte Berücksichtigung der emotionalen Seite der Mutterschaft bereits mit der Ankunft des Babys trägt entscheidend zum Wohlbefinden der frisch entbundenen Frau bei. Denn als ein wesentlicher Faktor der postpartalen Seelenkrise gilt ein traumatisches Geburtserlebnis. Die betreuende Hebamme sollte sich in der postpartalen Nachsorge die Zeit dafür nehmen, dies oft verschwiegene Thema anzuschneiden und somit der Frau die Gelegenheit geben, eventuelle Unglücksgefühle auszusprechen. Da die Hebamme die Mutter häufig schon während der Schwangerschaft kennt, mag ihr eine Veränderung im Verhalten nach der Entbindung deutlicher auffallen. Eine frühe Diagnose wirkt einer Chronifizierung der Depression entgegen. Die Aufgabe der Hebamme besteht in diesem Zusammenhang in ihrer diagnostischen Kompetenz, frühzeitig Symptome zu erkennen, einzuordnen, die betroffene Frau darauf anzusprechen, behutsam aufzuklären und gegebenenfalls an einen Therapeuten weiterzuleiten.\n" +
                            "Ein gutes Instrumentarium, um Frauen mit einer Depression rechtzeitig ausfindig zu machen, stellt die Edinburgh-Postnatal-Depression-Scale (EPDS) von Cox dar (s. Edinburgh-Postnatal-Depression-Scale). Es ist sinnvoll, diesen Fragebogen mit allen betreuten Müttern durchzugehen, wie es beispielsweise in England praktiziert wird, um möglicherweise betroffene Frauen früh zu erkennen. Dazu bedarf es auch dringend einer Verlängerung der ärztlichen postpartalen Nachsorge bei der Gynäkologin / dem Gynäkologen. Nachuntersuchungen in bestimmten Abständen sollten darauf abzielen, Frauen mit PPD auszumachen und entsprechende Hilfsmaßnahmen einzuleiten, bevor sich die Depression chronifiziert. Durch eine routinemäßige Anwendung der EPDS während der ersten Monate nach der Geburt könnten viele Mütter, die der Hilfe bedürfen, ausfindig gemacht und Verschlimmerungen des Zustands vorgebeugt werden.",

                    )
            )
            contentIllness.add(
                DataText(
                    contentIllness.size+1,
                    "Prävention",
                    "Grundsätzlich gilt, dass Frauen, die bereits zu verschiedenen Zeitpunkten ihres Lebens unter depressiven Verstimmungen gelitten haben, oder die schon einmal eine postpartale Depression oder Psychose durchlebt haben, mit einem erhöhten Risiko ausgestattet sind, postpartale Probleme zu entwickeln. In diesen Fällen sollte unbedingt auf Maßnahmen der Prävention zurückgegriffen werden. Zur Vorsorge gehört vor allem die Vorab-Information für die behandelnden Gynäkologen und Hebammen wie auch die frühzeitige Bereitstellung psychologischer Hilfe. Die gleiche Herangehensweise gilt für Frauen, die in der Schwangerschaft mit Depressionen zu kämpfen haben. Die Entwicklung der weiteren psychischen Verfassung sollte hier im Auge behalten werden.\n" +
                            "Im Bereich der Prävention haben zuerst rein pragmatische Erwägungen hinsichtlich des Lebens nach der Geburt einen nicht zu unterschätzenden Stellenwert. Diesbezügliche Fragen und Überlegungen betreffen folgende Punkte: Nichts Größeres planen (Umzüge usw.), Organisation des Alltags mit einem Säugling durchdenken, Formen der Unterstützung organisieren, geeignete Betreuungsmöglichkeiten finden etc.. Familienangehörige, Freundinnen, Familien-, Mütterpflegerin und/oder Haushaltshilfe sollten rechtzeitig vorbereitet sein.\n" +
                            "Die Entscheidung zu einer Haus- oder Geburtshausentbindung kann das Risiko senken, da eine solche Entbindung selbstbestimmter erlebt wird.\n" +
                            "Außerdem sollte bei der Wahl der Gynäkologin / des Gynäkologen und der Hebamme darauf geachtet werden, dass diese positiv unterstützend und nicht verunsichernd arbeiten und auch nach der Entbindung zu längeren Gesprächen und zu Hausbesuchen zur Verfügung stehen.\n" +
                            "Strikte Ruhe nach der Entbindung und in den ersten Wochen p.p. kann das Erkrankungsrisiko senken helfen. Dazu gehört vor allem die Vermeidung von zu viel Besuch, und ausreichender Nachtschlaf (nächtliche Versorgung des Babys durch Klinikpersonal / Familienmitglieder) ist wichtig.\n" +
                            "Bezüglich des drastischen Hormonabfalles nach der Entbindung stehen einige Prophylaxe-Methoden zur Verfügung.\n\n" +
                            "Plazenta-Prophylaxe:\n" +
                            "Die natürlichste, den früheren Hebammen vertraute Prophylaxe stellt die mit Hilfe der Plazenta dar. Dazu sollte der Mutterkuchen nach der Entbindung bei max. 45 ° C über etwa 36 Stunden getrocknet, danach pulverisiert und nach Bedarf eingenommen werden. Trocken aufbewahren, nie zu stark erhitzen.\n" +
                            "Herstellung einer homöopathischen Reihe aus der Plazenta.\n\n" +
                            "Progesteron-Prophylaxe:\n" +
                            "Es besteht auch die Möglichkeit einer vorbeugenden Behandlung durch das natürliche Progesteron (nicht das synthetische!) in Form einer Creme. Die Behandlung sollte sofort mit der Entbindung einsetzen.\n" +
                            "Alle Prophylaxen beziehen sich besonders auf Frauen, die schon einmal an einer postpartalen Depression oder Psychose gelitten haben, auf jene Frauen, deren Schwester oder Mutter von einer PPD oder PPP betroffen waren, auf Frauen, die eine Sterilisation zum Zeitpunkt der Entbindung oder kurz danach planen und schließlich auf jene Frauen, die besonders stark unter dem prämenstruellen Syndrom leiden.\n\n\n\n\n\n",

                    )
            )


            val rvAdapterIllness = RvAdapterIllness(contentIllness)
            binding.rvIllness.adapter=rvAdapterIllness

            //TODO: CODE
        }
    }
