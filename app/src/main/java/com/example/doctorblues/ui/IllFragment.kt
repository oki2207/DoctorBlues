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
                    "Die Gem??tszust??nde, in die eine Mutter rund um die Geburt des Kindes geraten kann, gliedern sich vorrangig in drei verschiedene Kategorien: \n" +
                            "\n" +
                            "das postpartale Stimmungstief (Baby-Blues), \n" +
                            "die peripartale Depression, Angst- und Zwangsst??rung und \n" +
                            "die peripartale Psychose. \n" +
                            "\n" +
                            "Diese Gruppen stehen nicht isoliert nebeneinander, sondern gehen oft flie??end ineinander ??ber.",

                )
            )

            contentIllness.add(
                DataText(
                    contentIllness.size+1,
                    "Ursachen",
                    "Ursachen f??r diese peripartalen Reaktionsformen sind individuell verschieden, da zahlreiche k??rperliche, hormonelle, biochemische, psychische, soziale und gesellschaftliche Faktoren ineinander flie??en. Meist f??hrt das Zusammenwirken mehrerer Ursachefaktoren zu einer psychischen ??berlastungsreaktion. Anzahl und Intensit??t der einzelnen Belastungsfaktoren bestimmen das Ausma?? der Erkrankung. Das hat zur Folge, dass bei jeder Frau eine unterschiedliche Gewichtung der an der Erkrankung beteiligten Faktoren zu ber??cksichtigen ist.\n" +
                            "\n" +
                            "Physische Faktoren\n" +
                            "Gravierende hormonelle Ver??nderungen nach der Entbindung\n" +
                            "Schilddr??sendysfunktion\n" +
                            "biochemische Ver??nderungen durch die schlaflosen N??chte\n" +
                            "psychische Vorerkrankung\n" +
                            "genetische Veranlagung\n" +
                            "\n" +
                            "Peripartale Faktoren\n" +
                            "langes Warten auf eine Schwangerschaft\n" +
                            "vorhergehende Fehlgeburt\n" +
                            "ungeplante oder unerw??nschte Schwangerschaft\n" +
                            "Schwangerschafts-Komplikationen\n" +
                            "Verunsicherung im Rahmen der Schwangerschaftsvorsorge\n" +
                            "Schwangerschafts-Depression\n" +
                            "traumatisches, sehr schmerzhaftes und/oder langwieriges Entbindungserlebnis\n" +
                            "Notkaiserschnitt; unruhige oder unsensible Entbindungsumgebung\n" +
                            "Fr??hgeburt; krankes oder totes Kind\n" +
                            "Schwierigkeiten beim Stillen\n" +
                            "abruptes und/oder ungewolltes Abstillen\n" +
                            "Einnahme bestimmter Abstill-Pr??parate\n" +
                            "\n" +
                            "Psychische Faktoren\n" +
                            "Abschied von der Schwangerschaft\n" +
                            "Abschied vom ???Traum-Baby???\n" +
                            "Abschied von der eigenen Kindheit\n" +
                            "pers??nliche Einschr??nkungen\n" +
                            "Identit??tskrise\n" +
                            "Verlust der Selbstst??ndigkeit\n" +
                            "Verlust der Freiheit und Selbstbestimmung\n" +
                            "Perfektionismus\n" +
                            "Kontrollverlust\n" +
                            "traumatische Erlebnisse im zeitlichen Umfeld der Schwangerschaft und Entbindung\n" +
                            "belastende Umst??nde wie Ortswechsel, finanzielle und/oder soziale Probleme\n" +
                            "Beziehungsprobleme\n" +
                            "traumatische Erlebnisse in der Kindheit\n" +
                            "durch die Geburt reaktivierte unverarbeitete Erfahrungen aus der eigenen Lebensgeschichte\n" +
                            "\n" +
                            "Soziale Faktoren\n" +
                            "Idealisiertes Mutterbild in Literatur und Werbung\n" +
                            "in der Pflege anspruchsvolle Kinder\n" +
                            "Neufindung in die Rolle als Mutter\n" +
                            "mangelnde Unterst??tzung durch den Partner und das soziale Umfeld\n" +
                            "ver??nderte Beziehung zum Partner\n" +
                            "ver??nderte Beziehung zu den bereits vorhandenen Kindern\n" +
                            "ver??nderte Beziehung zu den Eltern und Schwiegereltern\n" +
                            "Abbruch der alten freundschaftlichen Beziehungen (zu Nicht-Eltern)\n" +
                            "Wegfall der Gro??familien und ihrer Unterst??tzung\n" +
                            "patriarchale Gesellschaftsform mit geringerer sozialer und materieller Sicherheit f??r M??tter",

                    )
            )

            contentIllness.add(
                DataText(
                    contentIllness.size+1,
                    "Aufkl??rung",
                    "Im Bereich der Aufkl??rung kommt besonders den Hebammen und Geburtsvorbereiterinnen eine tragende Rolle zu. Im Rahmen der Geburtsvorbereitung bietet sich die Chance, auf das Krankheitsbild der peripartalen psychischen Erkrankungen hinzuweisen, damit betroffene Frauen ihren Zustand schneller einordnen und sich Hilfe suchen k??nnen. Au??erdem kann bei der Geburtsvorbereitung der Entstehung der postpartalen Depression entgegengewirkt werden. Zus??tzlich ist es sehr wichtig, dass die Hebamme oder Geburtsvorbereiterin ihre Bereitschaft signalisiert, als Ansprechpartnerin zur Verf??gung zu stehen, falls Seelenn??te auftauchen. Ein solch offen ausgesprochenes Angebot erleichtert es Frauen, gegebenenfalls darauf zur??ckzugreifen. Neben diesem m??ndlichen Angebot ist es weiterhin angebracht, schriftliches Informationsmaterial zu verteilen, das im Bedarfsfall zur Verf??gung steht. Alle Frauen sollten im Geburtsvorbereitungskurs ein Informationsblatt erhalten, welches in geraffter Form ??ber peripartale Krankheitsbilder aufkl??rt, Ursachen und Hilfsquellen benennt. Dazu stehen Handzettel des Vereins zur Verf??gung (Bestellung s. Kontakt).\n" +
                            "Eine verst??rkte Ber??cksichtigung der emotionalen Seite der Mutterschaft bereits mit der Ankunft des Babys tr??gt entscheidend zum Wohlbefinden der frisch entbundenen Frau bei. Denn als ein wesentlicher Faktor der postpartalen Seelenkrise gilt ein traumatisches Geburtserlebnis. Die betreuende Hebamme sollte sich in der postpartalen Nachsorge die Zeit daf??r nehmen, dies oft verschwiegene Thema anzuschneiden und somit der Frau die Gelegenheit geben, eventuelle Ungl??cksgef??hle auszusprechen. Da die Hebamme die Mutter h??ufig schon w??hrend der Schwangerschaft kennt, mag ihr eine Ver??nderung im Verhalten nach der Entbindung deutlicher auffallen. Eine fr??he Diagnose wirkt einer Chronifizierung der Depression entgegen. Die Aufgabe der Hebamme besteht in diesem Zusammenhang in ihrer diagnostischen Kompetenz, fr??hzeitig Symptome zu erkennen, einzuordnen, die betroffene Frau darauf anzusprechen, behutsam aufzukl??ren und gegebenenfalls an einen Therapeuten weiterzuleiten.\n" +
                            "Ein gutes Instrumentarium, um Frauen mit einer Depression rechtzeitig ausfindig zu machen, stellt die Edinburgh-Postnatal-Depression-Scale (EPDS) von Cox dar (s. Edinburgh-Postnatal-Depression-Scale). Es ist sinnvoll, diesen Fragebogen mit allen betreuten M??ttern durchzugehen, wie es beispielsweise in England praktiziert wird, um m??glicherweise betroffene Frauen fr??h zu erkennen. Dazu bedarf es auch dringend einer Verl??ngerung der ??rztlichen postpartalen Nachsorge bei der Gyn??kologin / dem Gyn??kologen. Nachuntersuchungen in bestimmten Abst??nden sollten darauf abzielen, Frauen mit PPD auszumachen und entsprechende Hilfsma??nahmen einzuleiten, bevor sich die Depression chronifiziert. Durch eine routinem????ige Anwendung der EPDS w??hrend der ersten Monate nach der Geburt k??nnten viele M??tter, die der Hilfe bed??rfen, ausfindig gemacht und Verschlimmerungen des Zustands vorgebeugt werden.",

                    )
            )
            contentIllness.add(
                DataText(
                    contentIllness.size+1,
                    "Pr??vention",
                    "Grunds??tzlich gilt, dass Frauen, die bereits zu verschiedenen Zeitpunkten ihres Lebens unter depressiven Verstimmungen gelitten haben, oder die schon einmal eine postpartale Depression oder Psychose durchlebt haben, mit einem erh??hten Risiko ausgestattet sind, postpartale Probleme zu entwickeln. In diesen F??llen sollte unbedingt auf Ma??nahmen der Pr??vention zur??ckgegriffen werden. Zur Vorsorge geh??rt vor allem die Vorab-Information f??r die behandelnden Gyn??kologen und Hebammen wie auch die fr??hzeitige Bereitstellung psychologischer Hilfe. Die gleiche Herangehensweise gilt f??r Frauen, die in der Schwangerschaft mit Depressionen zu k??mpfen haben. Die Entwicklung der weiteren psychischen Verfassung sollte hier im Auge behalten werden.\n" +
                            "Im Bereich der Pr??vention haben zuerst rein pragmatische Erw??gungen hinsichtlich des Lebens nach der Geburt einen nicht zu untersch??tzenden Stellenwert. Diesbez??gliche Fragen und ??berlegungen betreffen folgende Punkte: Nichts Gr????eres planen (Umz??ge usw.), Organisation des Alltags mit einem S??ugling durchdenken, Formen der Unterst??tzung organisieren, geeignete Betreuungsm??glichkeiten finden etc.. Familienangeh??rige, Freundinnen, Familien-, M??tterpflegerin und/oder Haushaltshilfe sollten rechtzeitig vorbereitet sein.\n" +
                            "Die Entscheidung zu einer Haus- oder Geburtshausentbindung kann das Risiko senken, da eine solche Entbindung selbstbestimmter erlebt wird.\n" +
                            "Au??erdem sollte bei der Wahl der Gyn??kologin / des Gyn??kologen und der Hebamme darauf geachtet werden, dass diese positiv unterst??tzend und nicht verunsichernd arbeiten und auch nach der Entbindung zu l??ngeren Gespr??chen und zu Hausbesuchen zur Verf??gung stehen.\n" +
                            "Strikte Ruhe nach der Entbindung und in den ersten Wochen p.p. kann das Erkrankungsrisiko senken helfen. Dazu geh??rt vor allem die Vermeidung von zu viel Besuch, und ausreichender Nachtschlaf (n??chtliche Versorgung des Babys durch Klinikpersonal / Familienmitglieder) ist wichtig.\n" +
                            "Bez??glich des drastischen Hormonabfalles nach der Entbindung stehen einige Prophylaxe-Methoden zur Verf??gung.\n\n" +
                            "Plazenta-Prophylaxe:\n" +
                            "Die nat??rlichste, den fr??heren Hebammen vertraute Prophylaxe stellt die mit Hilfe der Plazenta dar. Dazu sollte der Mutterkuchen nach der Entbindung bei max. 45 ?? C ??ber etwa 36 Stunden getrocknet, danach pulverisiert und nach Bedarf eingenommen werden. Trocken aufbewahren, nie zu stark erhitzen.\n" +
                            "Herstellung einer hom??opathischen Reihe aus der Plazenta.\n\n" +
                            "Progesteron-Prophylaxe:\n" +
                            "Es besteht auch die M??glichkeit einer vorbeugenden Behandlung durch das nat??rliche Progesteron (nicht das synthetische!) in Form einer Creme. Die Behandlung sollte sofort mit der Entbindung einsetzen.\n" +
                            "Alle Prophylaxen beziehen sich besonders auf Frauen, die schon einmal an einer postpartalen Depression oder Psychose gelitten haben, auf jene Frauen, deren Schwester oder Mutter von einer PPD oder PPP betroffen waren, auf Frauen, die eine Sterilisation zum Zeitpunkt der Entbindung oder kurz danach planen und schlie??lich auf jene Frauen, die besonders stark unter dem pr??menstruellen Syndrom leiden.\n\n\n\n\n\n",

                    )
            )


            val rvAdapterIllness = RvAdapterIllness(contentIllness)
            binding.rvIllness.adapter=rvAdapterIllness

            //TODO: CODE
        }
    }
