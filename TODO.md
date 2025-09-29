
## To-Do Liste — Kalender Anwendung (7 Tage MVP)

### Tag 1

* [ ] SQLite-DB Schema anlegen (`users`, `categories`, `events`, `reminders`, `holidays`)
* [ ] Modelle (POJOs) implementieren
* [ ] Erste DAO-Klassen für User & Event
* [ ] Testeinträge in DB speichern & lesen

### Tag 2

* [ ] AuthService: Registrierung + Login (BCrypt)
* [ ] JavaFX Login-Szene (FXML)
* [ ] Hauptfenster Layout mit Navigation (Tag/Monat/Jahr, Sidebar, Placeholder)

### Tag 3

* [ ] Event-Dialog (Create/Edit)
* [ ] EventService CRUD
* [ ] Tagesansicht (Stundenraster, Events als Blöcke anzeigen)

### Tag 4

* [ ] Monatsansicht (Grid, Events im Tagesfeld anzeigen)
* [ ] Jahresansicht (kompaktes Raster, markierte Tage)
* [ ] Kategorienverwaltung (CRUD, Farbwahl)
* [ ] Sidebar: Kategorienfilter

### Tag 5

* [ ] Feiertage laden (lokale Datei oder einfache Logik für DE)
* [ ] Wochenenden hervorheben
* [ ] Mehrtägige Events korrekt darstellen
* [ ] Zeitzonenhandhabung (UTC + user.timezone)

### Tag 6

* [ ] ReminderService mit ScheduledExecutorService
* [ ] Notifications (In-App Toast, optional System Tray)
* [ ] Tests: verpasste Erinnerungen beim App-Start erkennen

### Tag 7

* [ ] Basis-Tests für Services (Auth, Event, Reminder)
* [ ] UI-Politur (CSS, Farben, Icons)
* [ ] Packaging mit jpackage
* [ ] Dokumentation (README, How-To-Run)

---

### Abschluss-MVP Checkliste

* [ ] Registrierung & Login funktioniert
* [ ] Events (Create/Edit/Delete) möglich
* [ ] Tages-, Monats- und Jahresansicht lauffähig
* [ ] Kategorien auswählbar & filterbar
* [ ] Feiertage & Wochenenden sichtbar
* [ ] Erinnerungen funktionieren
* [ ] App als Installer/Executable verfügbar