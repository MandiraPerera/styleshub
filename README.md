# Styles Hub

This is the Styles Hub Java web application (a small e-commerce/demo app). It was developed as a Java web project (NetBeans/Ant style) and uses a MySQL / MariaDB database.

Contents
- brief project overview
- quick setup and run instructions (Windows / PowerShell)
- database import and configuration notes
- where important files live

---

## Project overview

This repository contains a Java servlet/JSP web application. Key parts:
- `web/` – JSP pages, static assets, and `WEB-INF` descriptors
- `src/java/` – Java source code for servlets and classes (package `app.*`)
- `rad_new.sql` – SQL dump for the application's database
- `build.xml` / `nbproject/` – NetBeans/Ant project metadata and build script

The app expects a MySQL-compatible database named `rad_new` (see `rad_new.sql`). A connector jar (`mysql-connector-java-5.1.23-bin.jar`) is already present in `web/WEB-INF/lib`.

## Prerequisites
- Java 8+ (JDK)
- Apache Ant (optional if using NetBeans)
- Apache Tomcat or GlassFish (or use the NetBeans integrated server)
- MySQL or MariaDB server
- PowerShell (Windows) — instructions below use PowerShell examples

## Quick setup (Windows / PowerShell)

1. Clone the repo (already done if you're working locally):

	Open PowerShell in the project folder:

	cd "C:\Path\To\styles-hub"  # adjust path

2. Create the database and import seed data (run in a shell where `mysql` client is available):

	mysql -u root -p
	CREATE DATABASE rad_new CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
	exit
	mysql -u root -p rad_new < rad_new.sql

	Note: Replace `root` and the password with your DB user. The SQL dump `rad_new.sql` is in the repo root.

3. Configure database credentials

	Edit `src/java/app/classes/DbConnector.java` and update the `dbuser` and `dbpw` (and optionally `host` and `dbname`) to match your local database credentials.

	Example fields to check:

	- host: `localhost`
	- dbname: `rad_new`
	- dbuser: `root` (change if needed)
	- dbpw: `""` (empty) — set a real password for production

4. Build & run

	Recommended: open the project in NetBeans and run (NetBeans will handle compile and deploy to the configured server):

	- File → Open Project → select this project folder
	- Right-click project → Clean and Build
	- Run (it will deploy to the server configured in NetBeans)

	Alternative (Ant / manual):

	- Use NetBeans’ generated Ant targets or run Ant from the project root. NetBeans manages the required properties and classpath, so using NetBeans provides the smoothest path.
	- After a successful NetBeans Clean and Build, a WAR usually appears in the `dist/` directory — copy that WAR to Tomcat's `webapps/` folder and start Tomcat.

5. Visit the app

	- By default the app runs at: http://localhost:8080/<context-path>
	- The exact context path depends on your server/WAR name. If deployed as `styles-hub.war`, the path will be `/styles-hub/`.

## Important files & locations
- `rad_new.sql` — database schema + seed data
- `src/java/app/classes/DbConnector.java` — DB connection settings
- `web/WEB-INF/web.xml` — servlet mappings
- `web/WEB-INF/lib/` — bundled libraries (includes `mysql-connector-java-5.1.23-bin.jar`)

## Notes and recommendations
- Add a secure DB user for the app instead of using `root`.
- Consider removing the MySQL connector from source control and using a dependency manager or documenting why it's included.
- Add a `.gitignore` to keep build artifacts and IDE-private files out of the repo (a `.gitignore` has been added to this repo).

## Troubleshooting
- If you see JDBC driver errors, verify the connector jar is present in `web/WEB-INF/lib` or that your server has the driver on its classpath.
- If pages fail with 500 errors, check server logs (Tomcat logs or NetBeans output window) and the stack trace printed by the app; likely causes are DB connection issues or missing resources.

## Next steps I can help with
- Improve the README with screenshots or API details
- Add a proper `.gitignore` tailored to NetBeans/Ant (I added one)
- Externalize DB config to a properties file or environment variables
- Create a tiny script to import `rad_new.sql` automatically

---

If you'd like, I can also add a short CONTRIBUTING.md, a license file, or wire up a simple PowerShell script to set up the DB automatically—tell me which you'd prefer next.

