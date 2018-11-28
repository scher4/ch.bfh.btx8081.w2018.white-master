# Sprint Backlog

|   ID | Sprint | Name                       | Description                                          | Components                   | Owner | Reviewer | Priority | Effort Plan Original [h] | Effort Plan Updated [h] | Effort Actual [h] | Status      |
|-----:|-------:|:---------------------------|:-----------------------------------------------------|:-----------------------------|:------|:---------|:---------|-------------------------:|------------------------:|------------------:|:------------|
| 1.01 |      1 | GUI Design MainView        | Spezifiziert Design                                  | View                         | F     | R        | high     |                        2 |                       1 |                 1 | ready      |
| 2.01 |      1 | GUI Design Diary           |                                                      | View                         | F     | R        | high     |                        1 |                       1 |               1   | ready       |
| 2.02 |      1 | GUI Design Entry erstellen |                                                      | View                         | F     | R        | high     |                        1 |                      0.5|               0.5 | ready       |
| 2.03 |      1 | GUI Design New Entry       | GUI Element zum Erstellen eines neuen Diary Entrys   | View                         | M     | D        | high     |                        4 |                         |                   |             |
| 0.01 |      1 | Laufzeitumgebung           | Server auf dem Applikation läuft. Datenbankserver    | System                       | M     | V        | high     |                        3 |                         |               5.0 | deployed    |
| 0.02 |      1 | Grundgerüst Datenbank      |                                                      | System                       | M     | V        | high     |                        2 |                         |              0.75 | db ready    |
| 2.03 |      1 | Klasse Entry               | Umsetzung anhand Domain Model                        | Model -> Tagebuch            | R     | M        |          |                        4 |                         |                 2 |             |
| 2.05 |      1 | Klasse Diary               | Umsetzung anhand Domain Model                        | Model -> Tagebuch            | R     | M        | high     |                        4 |                         |                 3 |             |
| 2.07 |      1 | Implementierung GUI Entry  | Presenter + View                                     | Presenter + View -> Tagebuch | V     | D        |          |                        9 |                      15 |              13.5 | in progress |
| 2.08 |      1 | Implementierung GUI Diary  | Presenter + View                                     | Presenter + View -> Tagebuch | D     | V        |          |                        9 |                      13 |              10.5 | persistence fehlt noch (momentan Testdaten) |
| 2.09 |      1 | Implementierung New Entry  | GUI Element zum Erstellen eines neuen Diary Entrys   | View                         | M     | D        | high     |                        4 |                         |                 3 |  Slider fehlt noch        |
| 2.10 |      1 | Persistenz Diary           | Diary inkl seiner Entries speichern und laden können | Model -> Tagebuch            | F     | M        |          |                        8 |                         |                 11| in progress |
| 2.12 |      1 | Integration Test Diary     | Eintrag erstellen, Tagebuch einträge anzeigen lassen | Integration                  | M     | F        |          |                        2 |                         |                   |             |




| ID | Sprint | Name                         | Description                            | Components | Owner | Reviewer | Priority | Effort Plan Original [h] | Effort Plan Updated [h] | Effort Actual [h] | Status |
|---:|-------:|:-----------------------------|:---------------------------------------|:-----------|:------|:---------|:---------|-------------------------:|------------------------:|------------------:|:-------|
|    |      2 | GUI Design TaskList          |                                        |            |       |          |          |                          |                         |                   |        |
|    |      2 | GUI Design Task erstellen    |                                        |            |       |          |          |                          |                         |                   |        |
|    |      2 | Klasse Task                  | Umsetzung anhand Domain Model          |            |       |          |          |                          |                         |                   |        |
|    |      2 | Unit-Test Task               | Methoden der Klasse testen             |            |       |          |          |                          |                         |                   |        |
|    |      2 | Klasse TaskList              | Umsetzung anhand Domain Model          |            |       |          |          |                          |                         |                   |        |
|    |      2 | Unit-Test TaskList           | Methoden der Klasse testen             |            |       |          |          |                          |                         |                   |        |
|    |      2 | Implementierung GUI Task     | Presenter + View                       |            |       |          |          |                          |                         |                   |        |
|    |      2 | Unit-Test GUI Task           | Methoden der Klasse testen             |            |       |          |          |                          |                         |                   |        |
|    |      2 | Implementierung GUI TaskList | Presenter + View                       |            |       |          |          |                          |                         |                   |        |
|    |      2 | Unit-Test  GUI TaskList      | Methoden der Klasse testen             |            |       |          |          |                          |                         |                   |        |
|    |      2 | Persistenz Task              | Task speichern und laden können        |            |       |          |          |                          |                         |                   |        |
|    |      2 | Unit-Test Task               | Methoden der Klasse testen             |            |       |          |          |                          |                         |                   |        |
|    |      2 | Integration Test TaskList    | Tasks erstellen, Tasks anzeigen lassen |            |       |          |          |                          |                         |                   |        |
