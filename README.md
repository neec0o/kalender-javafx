
# JavaFX Kalender Anwendung


### Features (MVP)

* Login & Benutzerverwaltung (lokal, mit Passwort-Hashing)
* Tages-, Monats- und Jahresansicht
* Wochenenden und Feiertage werden hervorgehoben
* Termine erstellen, bearbeiten und löschen (mit Start-/Endzeit oder ganztägig)
* Mehrtägige Termine werden korrekt dargestellt
* Kategorien für Termine (bestehend wählen oder neu erstellen, inkl. Farben)
* Erinnerungsfunktion (In-App / System Tray Notification)
* Persistente Datenspeicherung via **SQLite**

### Tech-Stack

* **Java 17+** (oder neuer)
* **JavaFX** für GUI
* **SQLite** (`org.xerial:sqlite-jdbc`)
* **BCrypt** für Passwort-Hashing
* **ScheduledExecutorService** für Erinnerungen
* **Maven** als Build-System

### Projektstruktur

```
/calendar-app
 ├─ src/main/java/app/MainApp.java   # Einstiegspunkt
 ├─ src/main/java/model/             # Datenmodelle (User, Event, Category...)
 ├─ src/main/java/ui/                # JavaFX Controller & Views
 ├─ src/main/java/service/           # Services (Auth, Event, Reminder, Holiday)
 ├─ src/main/java/persistence/       # SQLite Repositories
 └─ resources/                       # FXML, CSS, Assets
```

### Starten der Anwendung

1. Repo klonen:

   ```bash
   git clone <repo-url>
   cd calendar-app
   ```
2. Mit Maven bauen:

   ```bash
   mvn clean install
   ```
3. Anwendung starten:

   ```bash
   mvn javafx:run
   ```
4. SQLite-DB (`data/calendar.db`) wird automatisch erstellt.

### Packaging

* Mit **jpackage** oder **jlink** kann ein Installer (Windows .msi, macOS .dmg, Linux .deb/.rpm) erstellt werden.

### Status

* Projekt ist **im Aufbau**
* Geplante Dauer: **7 Tage (MVP)**

---
